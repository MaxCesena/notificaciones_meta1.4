package notificaciones.sms.nexmo;

import notificaciones.interfaces.Notificador;

// NexmoNotificador.java
public class NexmoNotificador implements Notificador {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[Nexmo] Enviando SMS a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("SMS enviado via Nexmo");
    }

    @Override
    public boolean verificarConexion() {
        System.out.println("[Nexmo] Verificando API...");
        return Math.random() > 0.5;
    }
}