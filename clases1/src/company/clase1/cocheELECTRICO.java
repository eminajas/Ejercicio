package company.clase1;

public class cocheELECTRICO extends Coche{
    String motorElectrico;

    public cocheELECTRICO(){

    }
    //metodo super para convinar dos constructores ya contruidos en clases diferentes
    public cocheELECTRICO(String color, String fabricante, String modelo, Double peso, Double largo,String motorElectrico){
        super(color, fabricante, modelo, peso, largo);//ctrl + click nos llevara a los constructores
        this.motorElectrico = motorElectrico;// se declara por que no conoce a motor electrico
    }
    public cocheELECTRICO(String motorElectrico){

        this.motorElectrico=motorElectrico;
    }

    @Override
    public void acelerar(int cantidad) {
        int cantidadAjustada = cantidad *2;
        super.acelerar(cantidadAjustada);//para accedeer a metodos o comportamientos public.accelerar y aparece
    }

    @Override
    public String toString() {
        return "cocheELECTRICO{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
