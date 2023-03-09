package test.project.lesson3;

import java.util.Scanner;

public class ScannerTest {
    static String str = " \"Люблю тебя, Петра творенье, \n" +                "Люблю твой строгий, стройный вид, \n" +
                      "Невы державное теченье, \n" +
            "              Береговой ее гранит\"";



    public static void main(String[] args) {
        Scanner scn = new Scanner(str);
String s = null;
scn.useDelimiter("е");
       while (scn.hasNext()) {
           s = scn.nextLine();
           System.out.println(s);
       }
    }
}