public class Kvadrat {


    public void kvadrat(int heltal, char sign){
        String width = "";
        int amount2 = heltal;

        while (amount2> 0){
            if (amount2 != 1){
                width += sign + "  ";
            } else {
                width += sign;
            }
            amount2--;
        }
        while (heltal > 0){
            System.out.println(width);
            heltal--;
        }
    }

    public static void main(String[] args) {
        Kvadrat kv = new Kvadrat();
        kv.kvadrat(5,'a');
    }


}
