package company.clase1;

public class cocheMain {
    public static void main(String[] args) {
        String coche = "alfa Romeo";
        Coche cocheobj = new Coche();//invocando el metodo constructor
        Coche cocheobj2 = new Coche("rojo", "honda", "civic", 1430.20,5.4);//estamos instanciando un objeto
        cocheobj2.acelerar(50);
        System.out.println("cocheobj2 = " + cocheobj2);

        cocheELECTRICO cocheElectrico = new cocheELECTRICO();

        cocheElectrico.motorElectrico= "General electric";
        cocheElectrico.color= "Rojo";
        cocheElectrico.peso= 200.02;
        cocheElectrico.largo= 3.15;
        cocheElectrico.modelo= "tesla";


        System.out.println(cocheElectrico);

        cocheELECTRICO cocheElectrico2 = new cocheELECTRICO("azul","Ferrari",
                "458 Italia", 1500.23, 3.23,"Honda");


        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);
    }
}
