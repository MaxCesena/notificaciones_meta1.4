package notificaciones.push.firebase;

import notificaciones.interfaces.Configurador;

// FirebaseConfigurador.java
public class FirebaseConfigurador implements Configurador {
    private String projectId;

    @Override
    public void configurar(String[] parametros) {
        this.projectId = parametros[0];
    }

    @Override
    public String obtenerConfiguracion() {
        return "Firebase - Project ID: " + projectId;
    }
}