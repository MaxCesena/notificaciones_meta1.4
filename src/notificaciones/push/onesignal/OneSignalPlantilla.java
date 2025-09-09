package notificaciones.push.onesignal;

import notificaciones.interfaces.Plantilla;

// OneSignalPlantilla.java
public class OneSignalPlantilla implements Plantilla {
    private String estilo = "normal";

    @Override
    public String aplicarPlantilla(String mensaje) {
        return estilo.equals("urgente") ? "[OS ALERT] " + mensaje : "[OneSignal] " + mensaje;
    }

    @Override
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}