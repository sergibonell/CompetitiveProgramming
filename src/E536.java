import java.util.Scanner;

public class E536 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        while(lector.hasNextLine()){
            int nTerrenos = lector.nextInt();
            Terreno bestTerreno = new Terreno(lector.nextInt(), lector.nextInt(), lector.nextInt(), lector.nextInt(), lector.nextLine().substring(1));

            for(int i = 1; i<nTerrenos; i++){
                Terreno newTerreno = new Terreno(lector.nextInt(), lector.nextInt(), lector.nextInt(), lector.nextInt(), lector.nextLine().substring(1));
                if(newTerreno.isBetter(bestTerreno))
                    bestTerreno = newTerreno;
            }

            System.out.println(bestTerreno.getNombre());
        }
    }
}

class Terreno{
    int tamaño, abono, agua, distancia;
    String nombre;

    public Terreno(int tamaño, int abono, int agua, int distancia, String nombre) {
        this.tamaño = tamaño;
        this.abono = abono;
        this.agua = agua;
        this.distancia = distancia;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isBetter(Terreno t){
        if(tamaño>t.tamaño || (tamaño == t.tamaño && agua<t.agua) || (tamaño == t.tamaño && agua == t.agua && distancia<t.distancia) || (tamaño == t.tamaño && agua == t.agua && distancia==t.distancia && abono<t.abono))
            return true;
        else
            return false;
    }
}
