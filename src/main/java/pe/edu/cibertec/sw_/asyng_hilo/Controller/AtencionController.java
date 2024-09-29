package pe.edu.cibertec.sw_.asyng_hilo.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.sw_.asyng_hilo.Service.AtencionService;
import pe.edu.cibertec.sw_.asyng_hilo.Service.AtencionesService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RequiredArgsConstructor
@RestController
public class AtencionController {
    private final AtencionService atencionService;
    private final AtencionesService atencionesService;
    @GetMapping("/finalizar-tareas")
    public  String atencionesVenta(){
      return atencionesService.ejecutarTaras();
    }
    @GetMapping("/finalizar-venta")
    public String atencionVenta() throws ExecutionException, InterruptedException {
        CompletableFuture<String> resultado = atencionService.ejecutaTareasAsincronas();
        return  resultado.get();
    }
}
