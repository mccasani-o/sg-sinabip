package pe.gob.sbn.sinabip.core.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pe.gob.sbn.sinabip.common.model.ApiResponse;

import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse> handleValidationExceptions(MethodArgumentNotValidException ex) {

        Map<String, String> errores = ex.getBindingResult().getFieldErrors()
                .stream()
                .collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
        log.info("ERROR: {}", ex.getMessage());
        ApiResponse httpResponse = ApiResponse.builder()
                .mensaje("Uno o más campos contienen valores inválidos. Por favor, verifica los datos ingresados.")
                .codigo(HttpStatus.BAD_REQUEST.value())
                .data(errores)
                .build();

        return ResponseEntity.badRequest().body(httpResponse);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse> handleAllExceptions(Exception ex) {
        log.error("Error inesperado no controlado:", ex);

        ApiResponse httpResponse = ApiResponse.builder()
                .mensaje("Ocurrió un error inesperado en el servidor. Por favor, inténtalo más tarde.")
                .codigo(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build();

        return new ResponseEntity<>(httpResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
