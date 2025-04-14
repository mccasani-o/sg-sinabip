package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponse {
    private String codigo;
    private String mensaje;
}
