package pe.gob.sbn.sinabip.core.ubigeo.mapper;

import pe.gob.sbn.sinabip.core.ubigeo.model.Ubigeo;
import pe.gob.sbn.sinabip.core.ubigeo.model.response.UbigeoResponse;
import pe.gob.sbn.sinabip.core.ubigeo.model.resquest.UbigeoRequest;

public class UbigeoMapper {

    private UbigeoMapper() {
    }

    public static UbigeoResponse mapToUbigeoResponse(Ubigeo ubigeo, UbigeoRequest request) {
        UbigeoResponse.UbigeoResponseBuilder responseBuilder = UbigeoResponse.builder()
                .Descripcion(ubigeo.getDescripcion())
                .ubigeoCodigo(ubigeo.getUbigeoCodigo());
        switch (request.getTipo()) {
            case 1 -> responseBuilder.codigoDepartamento(ubigeo.getCodigoDepartamento());
            case 2 -> responseBuilder.codigoProvincia(ubigeo.getCodigoProvincia());
            default -> responseBuilder.codigoDistrito(ubigeo.getCodigoDistrito());
        }

        return responseBuilder.build();
    }
}
