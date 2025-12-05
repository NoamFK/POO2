import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Uso del Singleton para configuración
        GestorConfiguracion config = GestorConfiguracion.getInstancia();
        System.out.println("Path de reportes: " + config.getPathReportes());

        // 2. Uso del Builder para crear un reporte complejo
        Reporte reporteFinanzas = new Reporte.ReporteBuilder("Reporte Financiero 2025", "Ganancias netas: $1M")
                .setAutor("Darth Vader") // Personalización ;)
                .setFecha(LocalDate.now())
                .setOrientacion("VERTICAL")
                .build();
        
        reporteFinanzas.generar();

        // 3. Uso del Factory Method para obtener el renderizador
        Renderizador render = RenderizadorFactory.obtenerRenderizador("PDF");
        render.renderizar("Contenido del reporte financiero...");
    }
}