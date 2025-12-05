public class RenderizadorFactory {
    public static Renderizador obtenerRenderizador(String formato) {
        if (formato == null) {
            return null;
        }
        if (formato.equalsIgnoreCase("PDF")) {
            return new RenderizadorPDF();
        } else if (formato.equalsIgnoreCase("EXCEL")) {
            return new RenderizadorExcel();
        } else if (formato.equalsIgnoreCase("CSV")) {
            return new RenderizadorCSV();
        }
        throw new IllegalArgumentException("Formato no soportado: " + formato);
    }
}