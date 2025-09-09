package notificaciones.push.firebase;

import notificaciones.interfaces.Configurador;
import notificaciones.interfaces.NotificacionFactory;
import notificaciones.interfaces.Notificador;
import notificaciones.interfaces.Plantilla;

// FirebaseFactory.java
public class FirebaseFactory implements NotificacionFactory {
    @Override public Notificador crearNotificador() { return (Notificador) new FirebaseNotificador(); }
    @Override public Configurador crearConfigurador() { return (Configurador) (Configurador) new FirebaseConfigurador(); }
    @Override public Plantilla crearPlantilla() { return new FirebasePlantilla(); }
}