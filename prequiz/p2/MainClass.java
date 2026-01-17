package prequiz.p2;

public class MainClass {
    public static void main(String[] args) {
        Email myEmail = new Email("mark.z@meta.com");
        User myUser = new User("Mark Elliot Zuckerberg", myEmail, "1234");

        myUser.getInfo();
    }
}
