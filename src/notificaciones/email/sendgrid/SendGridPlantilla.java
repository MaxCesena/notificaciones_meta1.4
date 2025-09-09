package notificaciones.email.sendgrid;

import notificaciones.interfaces.Plantilla;

// SendGridPlantilla.java
public class SendGridPlantilla implements Plantilla {
    private String estilo = "normal";

    @Override
    public String aplicarPlantilla(String mensaje) {
        return estilo.equals("urgente") ? "[URGENTE] " + mensaje : "[Email] " + mensaje;
    }

    @Override
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}