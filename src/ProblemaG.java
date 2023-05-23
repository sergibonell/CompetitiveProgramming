import java.util.Scanner;

public class ProblemaG {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int availableA, availableV;
        int contsem;
        while(lector.hasNextLine()){
            contsem=availableA=availableV=0;
            for(char ch: lector.nextLine().toCharArray()){
                if(ch=='R'){
                    availableA++;
                }else if(ch=='A'){
                    if(availableA>0){
                        availableV++;
                        availableA--;
                    }
                }else if(ch=='V'){
                    if(availableV>0){
                        availableV--;
                        contsem++;
                    }
                }
            }
            System.out.println(contsem);
        }
    }
}
