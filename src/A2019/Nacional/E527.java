package A2019.Nacional;

import java.util.Arrays;
import java.util.Scanner;

//TIME LIMIT
public class E527 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        E527 p = new E527();

        int n = lector.nextInt();
        for(int i = 0; i<n; i++){
            String objectiu = lector.next();
            int multiple = 900;
            while(!p.containsNecessaryDigits(objectiu, String.valueOf(multiple)))
                multiple += 900;
            p.printAscOrder(p.findMissingDigits(objectiu, String.valueOf(multiple)));
        }
    }

    public boolean containsNecessaryDigits(String objectiu, String multiple){
        boolean trobat = true;
        int i = 0;
        while(i<objectiu.length() && trobat)
            if(multiple.indexOf(objectiu.charAt(i)) == -1)
                trobat = false;
            else{
                multiple = multiple.replaceFirst(String.valueOf(objectiu.charAt(i)), "");
                i++;
            }
        return trobat;
    }

    public String findMissingDigits(String objectiu, String multiple){
        for(int i = 0; i<objectiu.length(); i++)
            multiple = multiple.replaceFirst(String.valueOf(objectiu.charAt(i)), "");
        return multiple;
    }

    public void printAscOrder(String result){
        if(result.length() != 0){
            char[] digits = result.toCharArray();
            Arrays.sort(digits);
            System.out.println(String.valueOf(digits));
        }else{
            System.out.println("COMPLETO");
        }

    }
}
