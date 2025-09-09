package notificaciones.core;

import notificaciones.email.mailchimp.MailChimpFactory;
import notificaciones.interfaces.NotificacionFactory;

import notificaciones.core.SistemaNotificaciones;
import notificaciones.email.sendgrid.SendGridFactory;
import notificaciones.push.firebase.FirebaseFactory;
import notificaciones.push.onesignal.OneSignalFactory;
import notificaciones.sms.nexmo.NexmoFactory;
import notificaciones.sms.twilio.TwilioFactory;

public class Main {
    public static void main(String[] args) {
        // Configuración desde sistema externo
        String plataforma = "push"; // email, sms, push
        String proveedor = "firebase"; // sendgrid, twilio, firebase

        NotificacionFactory factory = obtenerFactory(plataforma, proveedor);

        SistemaNotificaciones sistema = new SistemaNotificaciones(factory);
        sistema.inicializar();

        // Configurar con parámetros específicos
        String[] configEmail = {"SG-123456", "miempresa.com"};
        sistema.configurarSistema(configEmail);

        System.out.println("\n=== Probando Plantilla ===");
        sistema.probarPlantilla("Su pedido ha sido enviado");

        System.out.println("\n=== Enviando Notificación ===");
        sistema.enviarNotificacion("cliente@email.com", "Su orden #1234 está lista");
    }

    private static NotificacionFactory obtenerFactory(String plataforma, String proveedor) {
        switch (plataforma + "-" + proveedor) {
            case "email-sendgrid":
                return new SendGridFactory();
            case "email-mailchimp":
                return new MailChimpFactory();
            case "sms-twilio":
                return new TwilioFactory();
            case "sms-nexmo":
                return new NexmoFactory();
            case "push-firebase":
                return new FirebaseFactory();
            case "push-onesignal":
                return new OneSignalFactory();
            default:
                throw new IllegalArgumentException("Combinación no soportada");
        }
    }
}
