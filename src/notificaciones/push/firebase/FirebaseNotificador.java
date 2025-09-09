package notificaciones.push.firebase;

import notificaciones.interfaces.Notificador;

// FirebaseNotificador.java
public class FirebaseNotificador implements Notificador {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[Firebase] Enviando Push a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Push enviado via Firebase");
    }

    @Override
    public boolean verificarConexion() {
        System.out.println("[Firebase] Verificando conexión...");
        return true;
    }
}