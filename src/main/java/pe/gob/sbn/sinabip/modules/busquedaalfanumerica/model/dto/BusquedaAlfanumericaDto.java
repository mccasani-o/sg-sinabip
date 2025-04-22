package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusquedaAlfanumericaDto {


    private int total;
    private String item;
    private String codigoInterno;
    private String numeroSinabip;
    private String codigoLibro;
    private String numeroAciente;
    private String estadoAciento;
    private String estadoDetalle;
    private String estadoCalificacion;
    private String denominacionInmueble;
    private String nmbEntidad;
    private String departamento;
    private String nombreDepartamento;
    private String provincia;
    private String nombreProvincia;
    private String destrito;
    private String nombreDistrito;
    private String direccionInmueble;
    private String areaRegistral;
    private String codigoPredio;
    private String partidaElectronica;
    private String ficha;
    private String tomo;
    private String codigoPartida;
    private String nroPartidaRegistral;
    private String tipoAsiento;
    private String condicion;
}
