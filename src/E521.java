import java.util.HashSet;
import java.util.Scanner;

public class E521 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        float nPisos = lector.nextInt(), nLetras = lector.nextInt();
        int nPersones = lector.nextInt();

        while(nPisos != 0){
            int minim = (int) Math.ceil(nPisos*nLetras/2);
            HashSet<String> assistents = new HashSet<>();
            for(int i = 0; i<nPersones; i++)
                assistents.add(lector.next() + lector.next());

            if(assistents.size()>=minim)
                System.out.println("EMPEZAMOS");
            else
                System.out.println("ESPERAMOS");

            nPisos = lector.nextInt();
            nLetras = lector.nextInt();
            nPersones = lector.nextInt();
        }
    }
}
