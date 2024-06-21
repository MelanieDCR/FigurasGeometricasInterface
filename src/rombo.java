public class Rombo implements FiguraGeometrica {
    private String nombre;
    private double lado;
    private double diagonalMenor;
    private double diagonalMayor;

    public Rombo(String nombre, double diagonalMenor, double diagonalMayor, double lado) {
        super();
        this.nombre = nombre;
        this.diagonalMenor = diagonalMenor;
        this.diagonalMayor = diagonalMayor;
        this.lado = lado;
    }//Constructor

    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }//calcularArea

    public double calcularPerimetro() {
        return (lado * 4);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }//Get and Set

    @Override
    public String toString() {
        return "Rombo [nombre=" + nombre + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor=" + diagonalMayor
                + ", lado=" + lado + "]";
    }//toString

}//class Rombo
