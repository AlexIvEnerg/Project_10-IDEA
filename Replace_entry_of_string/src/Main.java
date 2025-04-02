import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" " +
                "and data rather than logic. Object-oriented programming bla-bla. Object-oriented programming bla.";

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.replace(str.indexOf("Object-oriented programming",50),162,"OOP");
        System.out.println(stringBuilder);

        String str1, str2;   Scanner scan = new Scanner(System.in);
        System.out.print("Введите строки разной длины: ");
        str1 = scan.nextLine(); str2 = scan.nextLine();
        System.out.println(str1 + " " + str2);
        returnOfChar(str1,str2);
    }

    public static void returnOfChar(String... args) {
        for (String str : args) {
            char ch1 = str.charAt(str.length()/2-1);
            char ch2 = str.charAt(str.length()/2);
            char[] arr = {ch1,ch2};
            String repl = new String(arr);
            System.out.println("Средние знаки: "+ repl);
        }
    }
}