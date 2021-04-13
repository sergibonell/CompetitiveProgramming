import java.util.ArrayList;
import java.util.Scanner;

public class E537 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        while(lector.hasNextLine()){
            int nPunts = lector.nextInt(), nLinies = lector.nextInt();
            ArrayList<Integer> possible = new ArrayList<Integer>();
            possible.add(1);
            ArrayList<Integer> linies = new ArrayList<>();
            for(int i = 0; i<nLinies*2; i++){
                linies.add(lector.nextInt());
            }
            boolean afegit;
            do{
                afegit = false;
                for(int i = 0; i<linies.size(); i+=2){
                    if(possible.contains(linies.get(i)) && !possible.contains(linies.get(i+1))){
                        possible.add(linies.get(i+1));
                        afegit = true;
                    }
                    else if(possible.contains(linies.get(i+1)) && !possible.contains(linies.get(i))){
                        possible.add(linies.get(i));
                        afegit = true;
                    }
                }
            }while (afegit);

            if(nPunts == possible.size())
                System.out.println("BICI");
            else
                System.out.println("A PIE");
        }
    }
}
