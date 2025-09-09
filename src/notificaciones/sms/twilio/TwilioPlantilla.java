package notificaciones.sms.twilio;

import notificaciones.interfaces.Plantilla;

// TwilioPlantilla.java
public class TwilioPlantilla implements Plantilla {
    private String estilo = "normal";

    @Override
    public String aplicarPlantilla(String mensaje) {
        return estilo.equals("urgente") ? "[URGENTE SMS] " + mensaje : "[SMS] " + mensaje;
    }

    @Override
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}