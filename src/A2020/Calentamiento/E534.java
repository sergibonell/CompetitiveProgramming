package A2020.Calentamiento;

import java.util.Arrays;
import java.util.Scanner;

public class E534 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nCubells = lector.nextInt();
        while(nCubells != 0){
            int[] cubells = new int[nCubells];
            for(int i = 0; i<nCubells; i++)
                cubells[i] = lector.nextInt();
            Arrays.sort(cubells);

            int max = Math.abs(cubells[0]-cubells[1]);
            for(int i = 2; i<nCubells-1; i+=2){
                int diff = Math.abs(cubells[i]-cubells[i+1]);
                if(diff>max)
                    max = diff;
            }

            System.out.println(max);
            nCubells = lector.nextInt();
        }
    }
}
