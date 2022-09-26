package company.clase1;

public class foorLoop {
    public static void main(String[] args) {
        int count = 0;

        for (int i=1; i < 10; i++){
            System.out.println(i);
        }

        while(count < 10){
            System.out.println("hola");
            if (count == 6){
                break;
                //continue;
            }
            System.out.println("hola mundo" +count);
            count ++;
        }//count ++;
        System.out.println("end");
    }
}
