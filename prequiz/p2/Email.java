package prequiz.p2;

public class Email implements ToolBox {
    private String emailAddress;
    private String userName;
    private String domainName;

    public Email(String emailAddress) {
        this.emailAddress = emailAddress;

        String[] parts = emailAddress.split("@");
        if (parts.length == 2) {
            this.userName = parts[0];
            this.domainName = parts[1];
        }
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getDomainName() {
        return domainName;
    }

    @Override
    public void getInfo() {
        System.out.println("Email Address: " + emailAddress);
        System.out.println("User Name: " + userName);
        System.out.println("Domain Name: " + domainName);
    }
}