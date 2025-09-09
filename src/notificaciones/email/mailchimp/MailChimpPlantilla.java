package notificaciones.email.mailchimp;

import notificaciones.interfaces.Plantilla;

// MailChimpPlantilla.java
public class MailChimpPlantilla implements Plantilla {
    private String estilo = "normal";

    @Override
    public String aplicarPlantilla(String mensaje) {
        return estilo.equals("urgente") ? "[MC ALERT] " + mensaje : "[MC] " + mensaje;
    }

    @Override
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}