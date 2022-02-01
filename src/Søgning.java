import java.util.ArrayList;

public class Søgning {

    public int string(ArrayList<String> list,String word){

        for (String streng:list
             ) {
            if (word.equalsIgnoreCase(streng)){
                return list.indexOf(streng);
            }
        }
return -1;
    }
}
