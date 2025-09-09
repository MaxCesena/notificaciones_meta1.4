package notificaciones.email.sendgrid;

import notificaciones.interfaces.NotificacionFactory;

import notificaciones.interfaces.Configurador;
import notificaciones.interfaces.Notificador;
import notificaciones.interfaces.Plantilla;

// SendGridFactory.java
public class SendGridFactory implements NotificacionFactory {
    @Override public Notificador crearNotificador() { return (Notificador) new SendGridNotificador(); }
    @Override public Configurador crearConfigurador() { return new SendGridConfigurador(); }
    @Override public Plantilla crearPlantilla() { return (Plantilla) new SendGridPlantilla(); }
}