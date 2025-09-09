package notificaciones.sms.nexmo;

import notificaciones.interfaces.Plantilla;

// NexmoPlantilla.java
public class NexmoPlantilla implements Plantilla {
    private String estilo = "normal";

    @Override
    public String aplicarPlantilla(String mensaje) {
        return estilo.equals("urgente") ? "[NEXMO ALERT] " + mensaje : "[Nexmo] " + mensaje;
    }

    @Override
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}