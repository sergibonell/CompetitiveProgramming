package A2019.Nacional;

import java.util.Scanner;

//WRONG ANSWER
public class E522 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        while (lector.hasNext()){
            String paraula1 = lector.next(), paraula2 = lector.next();
            int index = 0;
            boolean max = false;
            while(!max && paraula1.charAt(index) == paraula2.charAt(index)){
                if(index==paraula1.length()-1 || index==paraula2.length()-1)
                    max = true;
                else
                    index++;
            }

            if((index != 0) && (((paraula1.charAt(index) == 'l' && paraula1.charAt(index-1) == 'l')) || (paraula1.charAt(index) == 'h' && paraula1.charAt(index-1) == 'c')))
                    System.out.println(paraula2);
            else if((index != 0) && (((paraula2.charAt(index) == 'l' && paraula2.charAt(index-1) == 'l')) || (paraula2.charAt(index) == 'h' && paraula2.charAt(index-1) == 'c')))
                    System.out.println(paraula1);
            else if(paraula1.compareTo(paraula2) >= 0)
                System.out.println(paraula2);
            else
                System.out.println(paraula1);
        }
    }
}
