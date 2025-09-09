package notificaciones.sms.nexmo;

import notificaciones.interfaces.Configurador;
import notificaciones.interfaces.NotificacionFactory;
import notificaciones.interfaces.Notificador;
import notificaciones.interfaces.Plantilla;

// NexmoFactory.java
public class NexmoFactory implements NotificacionFactory {
    @Override public Notificador crearNotificador() { return new NexmoNotificador(); }
    @Override public Configurador crearConfigurador() { return (Configurador) new NexmoConfigurador(); }
    @Override public Plantilla crearPlantilla() { return (Plantilla) new NexmoPlantilla(); }
}