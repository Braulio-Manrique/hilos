package pe.edu.cibertec.sw_.asyng_hilo.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.sw_.asyng_hilo.remote.service.AsyncTaskService;

import java.util.concurrent.CompletableFuture;

@RequiredArgsConstructor
@Service
public class AtencionService {

    private final AsyncTaskService asyncTaskService;

    public CompletableFuture<String> ejecutaTareasAsincronas(){
        CompletableFuture<String>tarea1 = asyncTaskService
                .OperacionPagoOnline();
        CompletableFuture<String>tarea2 = asyncTaskService.OperacionRegistroVentas();
        CompletableFuture<String> tarea3 = asyncTaskService.OperacionActualizacionCompras();
        return CompletableFuture.allOf(tarea1,tarea2,tarea3).thenApply(result -> {
            try {
                String valorTarea1 = tarea1.join();
                String valorTarea2 = tarea2.join();
                String valorTarea3 = tarea3.join();
                return "Resultado Final = "+valorTarea1+"-"+valorTarea2+"-"+valorTarea3;
            }catch (Exception ex){
                return  "Error Al Combinar las tareas";
            }
        }).exceptionally(ex -> "Error al ejecutar las tareas");
    }
}
