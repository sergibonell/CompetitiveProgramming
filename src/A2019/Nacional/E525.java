package A2019.Nacional;

import java.util.Scanner;

public class E525 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nCasos = lector.nextInt();
        for(int i = 0; i<nCasos; i++){
            int A1 = lector.nextInt(), A2 = lector.nextInt(), B1 = lector.nextInt(), B2 = lector.nextInt();
            if(A1>A2){
                int aux = A1;
                A1 = A2;
                A2 = aux;
            }
            if(B1>B2){
                int aux = B1;
                B1 = B2;
                B2 = aux;
            }

            if((A2 > B1) && (B2 > A1))
                System.out.println("SOLAPADOS");
            else
                System.out.println("SEPARADOS");
        }
    }
}
