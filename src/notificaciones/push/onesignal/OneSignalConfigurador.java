package notificaciones.push.onesignal;

import notificaciones.interfaces.Configurador;

// OneSignalConfigurador.java
public class OneSignalConfigurador implements Configurador {
    private String appId;

    @Override
    public void configurar(String[] parametros) {
        this.appId = parametros[0];
    }

    @Override
    public String obtenerConfiguracion() {
        return "OneSignal - App ID: " + appId;
    }
}
