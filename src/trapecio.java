public class trapecio implements FiguraGeometrica {
    private String nombre;
    private double lado_1;
    private double lado_2;
    private double lado_3;
    private double lado_4;
    private double base_menor;
    private double base_mayor;
    private double altura;

    public trapecio(String nombre, double lado_1, double lado_2, double lado_3, double lado_4, double base_menor,
            double base_mayor, double altura) {
        super();
        this.nombre = nombre;
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
        this.lado_3 = lado_3;
        this.lado_4 = lado_4;
        this.base_menor = base_menor;
        this.base_mayor = base_mayor;
        this.altura = altura;
    }// Constructor

    public double calcularArea() {
        return (altura * (base_mayor + base_menor)) / 2;
    }// calcularArea

    public double calcularPerimetro() {
        return (lado_1 + lado_2 + lado_3 + lado_4);
    }// calcularPerimetro

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLado_1() {
        return lado_1;
    }

    public void setLado_1(double lado_1) {
        this.lado_1 = lado_1;
    }

    public double getLado_2() {
        return lado_2;
    }

    public void setLado_2(double lado_2) {
        this.lado_2 = lado_2;
    }

    public double getLado_3() {
        return lado_3;
    }

    public void setLado_3(double lado_3) {
        this.lado_3 = lado_3;
    }

    public double getLado_4() {
        return lado_4;
    }

    public void setLado_4(double lado_4) {
        this.lado_4 = lado_4;
    }

    public double getBase_menor() {
        return base_menor;
    }

    public void setBase_menor(double base_menor) {
        this.base_menor = base_menor;
    }

    public double getBase_mayor() {
        return base_mayor;
    }

    public void setBase_mayor(double base_mayor) {
        this.base_mayor = base_mayor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }// Getters and Setters

    @Override
    public String toString() {
        return "trapecio [nombre=" + nombre + ", lado_1=" + lado_1 + ", lado_2=" + lado_2 + ", lado_3=" + lado_3
                + ", lado_4=" + lado_4 + ", base_menor=" + base_menor + ", base_mayor=" + base_mayor + ", altura=" + altura + "]";
    }// toString
}// class trapecio
