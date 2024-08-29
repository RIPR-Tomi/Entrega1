package POO;

public class Poligono extends Figura{
    private int lineas;
    private double longitud;
    public Poligono(int id, String nombre, String color, double area, double perimetro, int lineas, double apotema) {
        super(id, nombre, color, area, perimetro);
        this.lineas = lineas;
        this.longitud = longitud;
    }
    public double calcularPerimetro(){
        double perimetroPoligono = 0;
        for(int i = 0;i <= lineas;){
            perimetroPoligono += longitud;
        }
        return perimetroPoligono;
    }
}
