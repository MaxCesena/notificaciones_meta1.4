package notificaciones.email.mailchimp;

import notificaciones.interfaces.Configurador;
import notificaciones.interfaces.NotificacionFactory;
import notificaciones.interfaces.Notificador;
import notificaciones.interfaces.Plantilla;

// MailChimpFactory.java
public class MailChimpFactory implements NotificacionFactory {
    @Override public Notificador crearNotificador() { return (Notificador) new MailChimpNotificador(); }
    @Override public Configurador crearConfigurador() { return new MailChimpConfigurador(); }
    @Override public Plantilla crearPlantilla() { return (Plantilla) new MailChimpPlantilla(); }
}