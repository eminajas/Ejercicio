package company.clase1;

public class polimosfismoMain {
    public static void main(String[] args) {
            Coche coche1 = new Coche();
            cocheELECTRICO coches2 = new cocheELECTRICO(); // creando objetos
            ///polimosfismo

        Coche coche3 = new cocheELECTRICO();
        Coche coche4 = new Coche();


        if (coche4 instanceof cocheELECTRICO){
            System.out.println("es un coche electrico");
        }
        //System.out.println("no es electrico");
        if(coche3 instanceof cocheELECTRICO){
            System.out.println("es un coche electrico2");
        }
        //System.out.println("no es un coche electrico");
    }
}
