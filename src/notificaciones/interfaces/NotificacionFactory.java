package notificaciones.interfaces;

public interface NotificacionFactory {
    Notificador crearNotificador();
    Configurador crearConfigurador();
    Plantilla crearPlantilla();
}
