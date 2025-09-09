package notificaciones.sms.twilio;

import notificaciones.interfaces.Configurador;
import notificaciones.interfaces.NotificacionFactory;
import notificaciones.interfaces.Notificador;
import notificaciones.interfaces.Plantilla;

// TwilioFactory.java
public class TwilioFactory implements NotificacionFactory {
    @Override public Notificador crearNotificador() { return (Notificador) new TwilioNotificador(); }
    @Override public Configurador crearConfigurador() { return new TwilioConfigurador(); }
    @Override public Plantilla crearPlantilla() { return (Plantilla) new TwilioPlantilla(); }
}