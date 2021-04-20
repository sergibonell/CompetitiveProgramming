import java.util.Scanner;

public class E523 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nLines = lector.nextInt();

        for(int i = 0; i<nLines; i++){
            int nOld = 0, nNew = 0;
            String matricula = lector.next();
            int nums = Integer.parseInt(matricula.substring(0, 4));
            String lletres = matricula.substring(4);

            String matriculaOther = lector.next();
            while (!matriculaOther.equals("0")){
                String lletresOther = matriculaOther.substring(4);

                if(lletres.compareTo(lletresOther) > 0)
                    nOld++;
                else if(lletres.compareTo(lletresOther) < 0)
                    nNew++;
                else if(nums > Integer.parseInt(matriculaOther.substring(0, 4)))
                    nOld++;
                else
                    nNew++;

                matriculaOther = lector.next();
            }
            System.out.println(nOld + " " + nNew);
        }
    }
}
