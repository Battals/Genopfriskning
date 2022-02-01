import java.util.Scanner;

public class Grass {

    public int grass(int grasslength, int grassmax){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the length of the grass: ");
        grasslength = sc.nextInt();
        System.out.println("Type in how long the grass is allowed to be: ");
        grassmax = sc.nextInt();
        int days;
        if (grasslength < grassmax){
            days = grassmax - grasslength;
            System.out.println(days);
            return days;
        }
        else if (grasslength >= grasslength){
            days = 0;
            System.out.println(days);
            return days;
        }
        return 10;
    }

    public static void main(String[] args) {
        Grass g = new Grass();
        System.out.println(g.grass(0,0));
    }
}
