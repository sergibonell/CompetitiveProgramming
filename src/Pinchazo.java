import java.util.Scanner;

public class Pinchazo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();

        for(int i = 0; i<n; i++){
            int res = lector.nextInt() - lector.nextInt();
            if(res < 0){
                if(res>-180)
                    System.out.println("ASCENDENTE");
                else if(res<-180)
                    System.out.println("DESCENDENTE");
                else
                    System.out.println("DA IGUAL");
            }else if(res > 0){
                if(res>180)
                    System.out.println("ASCENDENTE");
                else if(res<180)
                    System.out.println("DESCENDENTE");
                else
                    System.out.println("DA IGUAL");
            }else
                System.out.println("DA IGUAL");
        }
    }
}
