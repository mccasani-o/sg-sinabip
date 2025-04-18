package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusquedaResponse {
    private Integer total;
    private List<BusquedaAlfanumericaResponse> data;
}
