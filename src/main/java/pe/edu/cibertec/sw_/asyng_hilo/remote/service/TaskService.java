package pe.edu.cibertec.sw_.asyng_hilo.remote.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class TaskService {
    public String OperacionPagoOnline(){
        try {
            log.info("Iniciando Proceso de Pago");
            TimeUnit.SECONDS.sleep(4);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        return "Pago Exitoso";
    }
    public String OperacionRegistroVenta(){
        try {
            log.info("Iniciando Registro de Ventas");
            TimeUnit.SECONDS.sleep(10);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        return "Registro  Exitoso";
    }
    public String ActualizarCompra(){
        try {
            log.info("Actualizando Compra");
            TimeUnit.SECONDS.sleep(7);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        return "Actualizacion Exitoso";
    }
}
