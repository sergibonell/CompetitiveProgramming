import java.util.Scanner;

public class Polisilaba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            String paraula1 = sc.next();
            sc.next();
            String paraula2 = sc.next();

            if(paraula1.compareToIgnoreCase(paraula2) == 0)
                System.out.println("TAUTOLOGIA");
            else
                System.out.println("NO TAUTOLOGIA");
        }
    }
}
