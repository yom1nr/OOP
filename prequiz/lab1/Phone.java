package prequiz.lab1;

class Phone {
    private String phoneNumber;
    private String password;

    public Phone(String phoneNumber, String password) {
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getMaskedPhoneNumber() {
        return "XXX-XXX-" + phoneNumber.substring(6);
    }
}
