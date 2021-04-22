package A2019.Nacional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//WRONG ANSWER
public class E524 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nProds = lector.nextInt();
        while (nProds != 0){
            int suma = 0;
            int minA = lector.nextInt();
            int minB = lector.nextInt();
            ArrayList<Integer> llistaA = new ArrayList<>();
            for(int i = 0; i<nProds; i++)
                llistaA.add(lector.nextInt());
            Collections.sort(llistaA);
            ArrayList<Integer> llistaB = new ArrayList<>();
            for(int i = 0; i<nProds; i++)
                llistaB.add(lector.nextInt());
            Collections.sort(llistaB);

            for(int i = 0; i<minA; i++)
                suma += llistaA.remove(0);
            for(int i = 0; i<minB; i++)
                suma += llistaB.remove(0);
            nProds -= minA + minB;

            for(int i = 0; i<nProds; i++){
                if(llistaB.get(0) < llistaA.get(0))
                    suma += llistaB.remove(0);
                else
                    suma += llistaA.remove(0);
            }

            System.out.println(suma);
            nProds = lector.nextInt();
        }
    }
}
