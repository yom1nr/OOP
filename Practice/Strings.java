package Practice;

public class Strings {
    public static void main(String[] args) {
        String str = "Java Programming";
        StringBuilder sb = new StringBuilder("ABC");

        System.out.println(str.substring(5));
        System.out.println(str.substring(0, 4));

        String[] world = str.split(" ");
        System.out.println(str);
        char ch1 = ' ';
        System.out.println(Character.isSpaceChar(ch1));
    }
}
