package notificaciones.email.mailchimp;

import notificaciones.interfaces.Configurador;

public class MailChimpConfigurador implements Configurador {
    private String token;

    @Override
    public void configurar(String[] parametros) {
        this.token = parametros[0];
    }

    @Override
    public String obtenerConfiguracion() {
        return "MailChimp - Token: " + token;
    }
}
