package A2020.Calentamiento;

import java.util.Scanner;

public class E532 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        //millor utilitzar aixo o while(n-- > 0)?
        for(int i = 0; i<n; i++)
            System.out.println((lector.nextInt() - lector.nextInt()) * -1);
    }
}
