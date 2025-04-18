package pe.gob.sbn.sinabip.common.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Map;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HttpResponse {
    private String mensaje;
    private HttpStatus status;
    private Map<?, ?> data;
}
