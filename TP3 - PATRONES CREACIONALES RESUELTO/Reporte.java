import java.time.LocalDate;

public class Reporte {
    // Atributos obligatorios
    private String titulo;
    private String cuerpoPrincipal;

    // Atributos opcionales
    private String encabezado;
    private String pieDePagina;
    private LocalDate fecha;
    private String autor;
    private String orientacion; 

    // Constructor privado: solo el Builder puede usarlo
    private Reporte(ReporteBuilder builder) {
        this.titulo = builder.titulo;
        this.cuerpoPrincipal = builder.cuerpoPrincipal;
        this.encabezado = builder.encabezado;
        this.pieDePagina = builder.pieDePagina;
        this.fecha = builder.fecha;
        this.autor = builder.autor;
        this.orientacion = builder.orientacion;
    }

    public void generar() {
        System.out.println("\n==========================================");
        if(encabezado != null) System.out.println(encabezado.toUpperCase());
        System.out.println("==========================================");
        
        System.out.println("TITULO: " + titulo);
        System.out.println("FECHA: " + (fecha != null ? fecha : "Sin fecha"));
        System.out.println("AUTOR: " + (autor != null ? autor : "Anónimo"));
        System.out.println("ORIENTACION: " + (orientacion != null ? orientacion : "Estándar"));
        
        System.out.println("\n--- CONTENIDO ---");
        System.out.println(cuerpoPrincipal);
        
        System.out.println("\n------------------------------------------");
        if(pieDePagina != null) System.out.println("Pie de página: " + pieDePagina);
        System.out.println("==========================================\n");
    }

    // Clase estática interna Builder
    public static class ReporteBuilder {
        private String titulo;
        private String cuerpoPrincipal;
        private String encabezado;
        private String pieDePagina;
        private LocalDate fecha;
        private String autor;
        private String orientacion;

        // Constructor con obligatorios
        public ReporteBuilder(String titulo, String cuerpoPrincipal) {
            this.titulo = titulo;
            this.cuerpoPrincipal = cuerpoPrincipal;
        }

        // Métodos "Fluent" para opcionales
        public ReporteBuilder setEncabezado(String encabezado) {
            this.encabezado = encabezado;
            return this;
        }

        public ReporteBuilder setPieDePagina(String pieDePagina) {
            this.pieDePagina = pieDePagina;
            return this;
        }

        public ReporteBuilder setFecha(LocalDate fecha) {
            this.fecha = fecha;
            return this;
        }

        public ReporteBuilder setAutor(String autor) {
            this.autor = autor;
            return this;
        }

        public ReporteBuilder setOrientacion(String orientacion) {
            this.orientacion = orientacion;
            return this;
        }

        // Método final para construir
        public Reporte build() {
            return new Reporte(this);
        }
    }
}