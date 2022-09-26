package company.clase1;

public class Coche {
// atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    int velocidad = 0;


    public Coche(){

    }
    //constructores = mismo nombre de la clase con todo y mayusculas

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color=color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo=largo;
        cocheELECTRICO cocheELECTRICO =new cocheELECTRICO();
        cocheELECTRICO.color="rojo";
        cocheELECTRICO.motorElectrico="phillips";
        cocheELECTRICO.fabricante="nissan";

        System.out.println(cocheELECTRICO);
    }

    //comportamiento
    public void acelerar(int cantidad) {
        if (cantidad > 0 && cantidad < 120) {
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
