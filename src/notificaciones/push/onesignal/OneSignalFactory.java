package notificaciones.push.onesignal;

import notificaciones.interfaces.Configurador;
import notificaciones.interfaces.NotificacionFactory;
import notificaciones.interfaces.Notificador;
import notificaciones.interfaces.Plantilla;

// OneSignalFactory.java
public class OneSignalFactory implements NotificacionFactory {
    @Override public Notificador crearNotificador() { return (Notificador) new OneSignalNotificador(); }
    @Override public Configurador crearConfigurador() { return new OneSignalConfigurador(); }
    @Override public Plantilla crearPlantilla() { return new OneSignalPlantilla(); }
}