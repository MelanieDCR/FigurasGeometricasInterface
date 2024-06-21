public class romboide implements FiguraGeometrica {
    private String nombre;
    private double base;
    private double altura;

    public romboide(String nombre, double base, double altura) {
        super();
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }// Constructor

    public double calcularArea() {
        return (base * altura);
    }// calcularArea

    public double calcularPerimetro() {
        return (2 * (base + altura));
    }// calcularPerimetro

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }// Get and Set

    @Override
    public String toString() {
        return "romboide [nombre=" + nombre + ", base=" + base + ", altura=" + altura + "]";
    }// toString
}// class romboide
