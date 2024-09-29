package pe.edu.cibertec.sw_.asyng_hilo.remote.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class AsyncTaskService {



    @Async
    public CompletableFuture<String> OperacionPagoOnline(){
        try {
            log.info("Inicio de proceso de pago");
            TimeUnit.SECONDS.sleep(4);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        return CompletableFuture.completedFuture("Pago Exitoso")  ;
    }
    @Async
    public CompletableFuture<String> OperacionRegistroVentas(){
        try {
            log.info("inicio de registro de ventas");
            TimeUnit.SECONDS.sleep(10);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        return CompletableFuture.completedFuture("Registro de ventas  Exitoso")  ;
    }
    @Async
    public CompletableFuture<String> OperacionActualizacionCompras(){
        try {
            log.info("Actualizacion de compras");
            TimeUnit.SECONDS.sleep(7);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        return CompletableFuture.completedFuture("Actualizacion de compras Exitoso")  ;
    }
}
