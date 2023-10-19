package acceso;

public class trabajo {
    private String privado; // variable privada
    protected String protegido; // variable protegida
    String predeterminado; // variable con acceso predeterminado
    public String publico; // variable pública


    private void metodoPrivado() {
        System.out.println("Método privado");
    }

    protected void metodoProtegido() {
        System.out.println("Método protegido");
    }

    void metodoPredeterminado() {
        System.out.println("Método predeterminado (paquete)");
    }

    public void metodoPublico() {
        System.out.println("Método público");
    }
}
