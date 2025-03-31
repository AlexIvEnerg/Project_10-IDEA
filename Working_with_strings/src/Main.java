public class Main {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        System.out.println(str);
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        str = "I like Java 8!";
        System.out.println(str.endsWith("?!"));   // false
        System.out.println(str.indexOf("Java"));
        str = str.replace('a','o');  // a -> o
        System.out.println(str);
        str = str.toUpperCase();  //  h->H
        System.out.println(str);
        str = str.toLowerCase();  //  H->h
        System.out.println(str);
    }
}