package notificaciones.sms.nexmo;

import notificaciones.interfaces.Configurador;

// NexmoConfigurador.java
public class NexmoConfigurador implements Configurador {
    private String apiKey;

    @Override
    public void configurar(String[] parametros) {
        this.apiKey = parametros[0];
    }

    @Override
    public String obtenerConfiguracion() {
        return "Nexmo - API Key: " + apiKey;
    }
}