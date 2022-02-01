import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotek {


    Bog a = new Bog("Book1", 2001, 12345678);
    Bog b = new Bog("Book2", 2002, 123456789);
    Bog c = new Bog("Book3", 2003, 1234567810);

    ArrayList<Bog> list = new ArrayList<>();

    public void add(){
        list.add(a);
        list.add(b);
        list.add(c);
    }

    public boolean isbn(Bog bog){
        add();
        for (int i = 0; i < list.size(); i++){
            if (bog.getIsbnnummer() == list.get(i).getIsbnnummer()){
                return true;
            }
        }
        return false;
    }






}
