import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Sorting {

    public void sort(){
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in five words");
        String a = sc.nextLine();
        list.add(a);
        String b = sc.nextLine();
        list.add(b);
        String c = sc.nextLine();
        list.add(c);
        String d = sc.nextLine();
        list.add(d);
        String e = sc.nextLine();
        list.add(e);

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(list);

    }

    public static void main(String[] args) {
        Sorting sort = new Sorting();
        sort.sort();
    }

}
