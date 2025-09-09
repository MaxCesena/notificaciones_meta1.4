package notificaciones.push.firebase;

import notificaciones.interfaces.Plantilla;

// FirebasePlantilla.java
public class FirebasePlantilla implements Plantilla {
    private String estilo = "normal";

    @Override
    public String aplicarPlantilla(String mensaje) {
        return estilo.equals("urgente") ? "[FIREBASE URGENTE] " + mensaje : "[Firebase] " + mensaje;
    }

    @Override
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}