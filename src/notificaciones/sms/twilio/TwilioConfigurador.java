package notificaciones.sms.twilio;

import notificaciones.interfaces.Configurador;

// TwilioConfigurador.java
public class TwilioConfigurador implements Configurador {
    private String accountSid;
    private String authToken;

    @Override
    public void configurar(String[] parametros) {
        this.accountSid = parametros[0];
        this.authToken = parametros[1];
    }

    @Override
    public String obtenerConfiguracion() {
        return "Twilio - SID: " + accountSid + ", Token: " + authToken;
    }
}
