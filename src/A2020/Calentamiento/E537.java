package A2020.Calentamiento;

import java.util.ArrayList;
import java.util.Scanner;
//RUNTIME ERROR
public class E537 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        while(lector.hasNextLine()){
            int nPunts = lector.nextInt(), nLinies = lector.nextInt();
            boolean[][] matriu = new boolean[nPunts][nPunts];
            ArrayList<Integer> camins = new ArrayList<>();
            camins.add(1);

            if(nLinies > 0) {
                for (int i = 0; i < nLinies; i++) {
                    int x = lector.nextInt() - 1, y = lector.nextInt() - 1;
                    if(x<nPunts && y<nPunts){
                        matriu[x][y] = true;
                        matriu[y][x] = true;
                    }
                }

                for (int i = 0; i < camins.size(); i++)
                    for (int j = 0; j < nPunts; j++)
                        if (matriu[i][j] && !camins.contains(j + 1))
                            camins.add(j + 1);
            }

            if(nPunts == camins.size())
                System.out.println("BICI");
            else
                System.out.println("A PIE");
        }
    }
}

/*
1 2
1 3
1 4
1 5
1 6
1 7
1 8
1 9
1 10
1 11
1 12
1 13
1 14
1 15
1 16
1 17
1 18
1 19
1 20
1 21
1 22
1 23
1 24
1 25
1 26
1 27
1 28
1 29
1 30
1 31
1 32
1 33
1 34
1 35
1 36
1 37
1 38
1 39
1 40
1 41
1 42
1 43
1 44
1 45
1 46
1 47
1 48
1 49
1 50
 */