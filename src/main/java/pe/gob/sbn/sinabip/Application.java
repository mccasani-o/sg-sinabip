package pe.gob.sbn.sinabip;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.request.BusquedaAlfanumericaRequest;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.persistence.dao.inf.BusquedaAlfanumericaDao;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final BusquedaAlfanumericaDao dao;

    public Application(BusquedaAlfanumericaDao dao) {
        this.dao = dao;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        BusquedaAlfanumericaRequest request=new BusquedaAlfanumericaRequest();
        request.setCus("12345");
        request.setPagina("1");
        request.setNumeroGagina("100");

        System.out.println("DATA: "+this.dao.obtenerBusquedaPredios(request));
    }
}
