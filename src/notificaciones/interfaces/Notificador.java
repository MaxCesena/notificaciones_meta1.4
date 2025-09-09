package notificaciones.interfaces;

public interface Notificador {
    void enviar(String destinatario, String mensaje);
    boolean verificarConexion();
}
