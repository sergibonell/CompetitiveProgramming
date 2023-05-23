package A2019.Nacional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

//WRONG ANSWER
public class E524 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner lector = new Scanner(System.in);
        int nProds = lector.nextInt();
        while (nProds != 0){
            long suma = 0;
            int minA = lector.nextInt();
            int minB = lector.nextInt();
            ArrayList<Integer> llistaA = new ArrayList<>();
            for(int i = 0; i<nProds; i++)
                llistaA.add(random.nextInt(1000));
            Collections.sort(llistaA);
            ArrayList<Integer> llistaB = new ArrayList<>();
            for(int i = 0; i<nProds; i++)
                llistaB.add(random.nextInt(1000));
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
