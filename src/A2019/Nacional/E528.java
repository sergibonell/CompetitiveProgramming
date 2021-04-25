package A2019.Nacional;

import java.util.Scanner;

public class E528 {
    public static void main(String[] args) {
        E528 p = new E528();
        Scanner lector = new Scanner(System.in);

        int n = lector.nextInt();
        while (n != 0){
            int either0or1 = 0;
            int lt1 = 0;
            int gt1 = 0;
            for(int i = 0; i<n; i++){
                float valor = Float.parseFloat(lector.next());
                if(valor == 0f || valor == 1f)
                    ++either0or1;
                else if(valor<1)
                    ++lt1;
                else
                    ++gt1;
            }
            long sum = p.possiblePairs(lt1) + p.possiblePairs(gt1) + p.possiblePairs(n) - p.possiblePairs(n-either0or1);
            System.out.println(sum);
            n = lector.nextInt();
        }
    }

    public long possiblePairs(int number){
        return (long) number*(number-1)/2;
    }
}
