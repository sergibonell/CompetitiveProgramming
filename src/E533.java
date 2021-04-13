import java.util.Scanner;

public class E533 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nCasos = lector.nextInt();
        for(int i = 0; i<nCasos; i++){
            int objectiu = lector.nextInt() * 8;
            int comptador = 1;
            boolean reached = false;

            int kilos = lector.nextInt();
            while(kilos!=0 && !reached){
                objectiu -= kilos;
                if(objectiu<=0)
                    reached = true;
                else
                    comptador++;
                kilos = lector.nextInt();
            }

            if(reached){
                System.out.println(comptador);
                lector.nextLine();
            }
            else
                System.out.println("SIGAMOS RECICLANDO");
        }
    }
}
