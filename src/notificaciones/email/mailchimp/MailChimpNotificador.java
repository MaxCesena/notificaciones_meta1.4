package notificaciones.email.mailchimp;

import notificaciones.interfaces.Notificador;

// MailChimpNotificador.java
public class MailChimpNotificador implements Notificador {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[MailChimp] Enviando email a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Email enviado via MailChimp");
    }

    @Override
    public boolean verificarConexion() {
        System.out.println("[MailChimp] Verificando conexión...");
        return Math.random() > 0.3; // 70% chance de éxito
    }
}
