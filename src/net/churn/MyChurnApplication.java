package net.churn;

import java.util.*;

public class MyChurnApplication {
    public static String startString = "";

    public static void main(String[] args) {
        setString();
        changeString();
        System.out.print(startString);

    }

    public static void setString() {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter String ");
        startString = key.next() + ".txt";

    }

    public static void changeString() {
        for (int i = 0; i < startString.length(); i++) {
            if (startString.substring(i, i + 1).equals("a")) {
                startString = startString.substring(0, i);
                break;
            }
        }
    }

}
