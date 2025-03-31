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

        int n1 = 3; int n2 = 56;
        StringBuilder sb = new StringBuilder(10);
        String s1 = sb.append(n1).append('+').append(n2).append("=59").toString();
        System.out.println(s1);  sb = new StringBuilder(10);
        String s2 = sb.append(n1).append('-').append(n2).append("=-53").toString();
        System.out.println(s2);  sb = new StringBuilder(10);
        String s3 = sb.append(n1).append('*').append(n2).append("=168").toString();
        System.out.println(s3); s1 = s1.replace("=","равно");
        System.out.println(s1); s2 = s2.replace("=","равно");
        System.out.println(s2); s3 = s3.replace("=","равно");
        System.out.println(s3);
    }
}