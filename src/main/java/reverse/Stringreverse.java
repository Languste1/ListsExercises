package reverse;

public class Stringreverse {

    public static void main(String[] args) {
        String str = "Hallo Welt!";

        //Reverse mit char
        reverseWithChar(str);

        //Zeilenumbruch
        System.out.println();

        //Reverse mit Stringbuilder
        reverseWithStringbuilder(str);

    }

    private static void reverseWithChar(String str) {
        char[] charArray = str.toCharArray(); // String in ein char-Array konvertieren

        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }

    private static void reverseWithStringbuilder(String str) {
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse(); // String umkehren

        System.out.println(reversed.toString());
    }

}


