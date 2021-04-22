package A2020.Calentamiento;

import java.util.Scanner;

public class E535 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nTrams = lector.nextInt();
        while(nTrams != 0){
            int[] altura = new int[nTrams];
            int res = 0;

            for(int i = 0; i<nTrams; i++)
                altura[i] = lector.nextInt();
            for(int i = 0; i<nTrams-1; i++)
                res += altura[nTrams-1]-altura[i];

            System.out.println(res);
            nTrams = lector.nextInt();
        }
    }
}
