package notificaciones.push.onesignal;

import notificaciones.interfaces.Notificador;

// OneSignalNotificador.java
public class OneSignalNotificador implements Notificador {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[OneSignal] Enviando Push a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Push enviado via OneSignal");
    }

    @Override
    public boolean verificarConexion() {
        System.out.println("[OneSignal] Verificando conexión...");
        return Math.random() > 0.2; // 80% éxito
    }
}