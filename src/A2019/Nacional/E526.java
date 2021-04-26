package A2019.Nacional;

import java.util.ArrayList;
import java.util.Arrays;

public class E526 {
     private ArrayList<String> aux = new ArrayList<>(Arrays.asList(
            "h", "li", "na", "k", "rb", "cs", "fr",
            "be", "mg", "ca", "sr", "ba", "ra",
            "sc", "y",
            "ti", "zr", "hf", "rf",
            "v", "nb", "ta", "db",
            "cr", "mo", "w", "sg",
            "mn", "tc", "re", "bh",
            "fe", "ru", "os", "hs",
            "co", "rh", "ir", "mt",
            "ni", "pd", "pt", "ds",
            "cu", "ag", "au", "rg",
            "zn", "cd", "hg", "cn",
            "b", "al", "ga", "in", "tl", "nh",
            "c", "si", "ge", "sn", "pb", "fl",
            "n", "p", "as", "sb", "bi", "mc",
            "o", "s", "se", "te", "po", "lv",
            "f", "cl", "br", "i", "at", "ts",
            "he", "ne", "ar", "kr", "xe", "rn", "og",
            "la", "ce", "pr", "nd", "pm", "sm", "eu", "gd", "tb", "dy", "ho", "er", "tm", "yb", "lu",
            "ac", "th", "pa", "u", "np", "pu", "am", "cm", "bk", "cf", "es", "fm", "md", "no", "lr"
    ));

    public static void main(String[] args) {

    }

    public boolean recursiva(String paraula, int pos){
        for(int i = 0; i<aux.size(); i++){
            if(aux.get(i).length() == 1 && String.valueOf(paraula.charAt(pos)) == aux.get(i))
                recursiva(paraula, ++pos);
            else if(aux.get(i).length() == 2 && paraula.substring(i, i+2) == aux.get(i)){
                recursiva(paraula, pos+=2);
            else if(pos >= paraula.length())
                return true;
            else
                return false;
        }
    }
}
