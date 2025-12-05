// Interfaz común
public interface Renderizador {
    void renderizar(String contenido);
}

// Clases concretas
class RenderizadorPDF implements Renderizador {
    public void renderizar(String contenido) {
        System.out.println("Renderizando reporte en PDF: " + contenido);
    }
}

class RenderizadorExcel implements Renderizador {
    public void renderizar(String contenido) {
        System.out.println("Renderizando reporte en Excel: " + contenido);
    }
}

class RenderizadorCSV implements Renderizador {
    public void renderizar(String contenido) {
        System.out.println("Renderizando reporte en CSV: " + contenido);
    }
}