import java.lang.*;

public class Main {
    public static void main(String[] args) {
        String str = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" " +
                "and data rather than logic. Object-oriented programming bla-bla. Object-oriented programming bla.";

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.replace(str.indexOf("Object-oriented programming",50),162,"OOP");

        System.out.println(stringBuilder);
    }
}