package Practice;

public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ABC");

        sb.append("DEF");
        System.out.println(sb);

        sb.insert(3, "X");
        System.out.println(sb);

        sb.delete(2, 5);
        System.out.println(sb);

        System.out.println(sb.toString());
    }
}
