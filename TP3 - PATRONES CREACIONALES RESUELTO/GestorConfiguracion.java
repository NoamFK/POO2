public class GestorConfiguracion {
    private static GestorConfiguracion instancia;
    private String urlBd;
    private String userBd;
    private String pathReportes;

    // Constructor privado para evitar instanciación externa
    private GestorConfiguracion() {
        this.urlBd = "jdbc:mysql://localhost:3306/datos";
        this.userBd = "admin";
        this.pathReportes = "/var/www/reportes";
    }

    // Método estático para obtener la única instancia (Thread-safe básico)
    public static synchronized GestorConfiguracion getInstancia() {
        if (instancia == null) {
            instancia = new GestorConfiguracion();
        }
        return instancia;
    }

    public String getPathReportes() {
        return pathReportes;
    }

    // Getters agregados para eliminar advertencias de "unused"
    public String getUrlBd() {
        return urlBd;
    }

    public String getUserBd() {
        return userBd;
    }
}