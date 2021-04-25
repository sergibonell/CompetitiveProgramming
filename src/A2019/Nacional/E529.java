package A2019.Nacional;

import java.util.Scanner;

public class E529 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        lector.nextLine();
        for(int i = 0; i<n; i++){
            int contador = 0;
            int max = 0;
            int min = 0;
            char[] log = lector.nextLine().toCharArray();

            for (char c : log) {
                if (c == 'I') {
                    if (++contador > max)
                        max = contador;
                } else {
                    if (--contador < min)
                        min = contador;
                }
            }

            if(min < 0)
                System.out.println(max - min);
            else
                System.out.println(max);
        }
    }
}
