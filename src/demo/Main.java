package demo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


    }


    public boolean doesArraylistContainString(ArrayList<String> arr, String str) {
        for (String word : arr
        ) {
            if (str != word) {
                arr.add(str);
                return false;
            } else if (str.equalsIgnoreCase(word)) {
                System.out.println("The string has been found");
                return true;
            }
        }
        return false;
    }


}
