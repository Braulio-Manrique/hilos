package pe.edu.cibertec.sw_.asyng_hilo.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.sw_.asyng_hilo.remote.service.TaskService;

@RequiredArgsConstructor
@Service
public class AtencionesService {
    private  final TaskService taskService;
    public String ejecutarTaras(){
        taskService.OperacionPagoOnline();
        taskService.OperacionRegistroVenta();
        taskService.ActualizarCompra();
        return  "tareas ejecutadas correctamente";
    }
}
