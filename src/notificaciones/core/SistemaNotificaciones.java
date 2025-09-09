package notificaciones.core;

import notificaciones.interfaces.NotificacionFactory;

import notificaciones.interfaces.Configurador;
import notificaciones.interfaces.Notificador;
import notificaciones.interfaces.Plantilla;

// Cliente principal
public class SistemaNotificaciones {
    private NotificacionFactory factory;
    private Notificador notificador;
    private Configurador configurador;
    private Plantilla plantilla;

    public SistemaNotificaciones(NotificacionFactory factory) {
        this.factory = factory;
    }

    public void inicializar() {
        this.notificador = factory.crearNotificador();
        this.configurador = factory.crearConfigurador();
        this.plantilla = factory.crearPlantilla();
    }

    public void configurarSistema(String[] parametros) {
        configurador.configurar(parametros);
        System.out.println("Configuración: " + configurador.obtenerConfiguracion());
    }

    public void enviarNotificacion(String destinatario, String mensaje) {
        if (notificador.verificarConexion()) {
            String mensajeFormateado = plantilla.aplicarPlantilla(mensaje);
            notificador.enviar(destinatario, mensajeFormateado);
        } else {
            System.out.println("Error: No hay conexión con el proveedor");
        }
    }

    public void probarPlantilla(String mensaje) {
        plantilla.setEstilo("urgente");
        String resultado = plantilla.aplicarPlantilla(mensaje);
        System.out.println("Plantilla aplicada: " + resultado);
    }
}
