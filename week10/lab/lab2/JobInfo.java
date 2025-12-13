package week10.lab.lab2;

public class JobInfo {
    private String position;
    private String department;
    private String password;

    public JobInfo(String position, String department, String password) {
        this.position = position;
        this.department = department;
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getPassword() {
        return password;
    }

    public String getMaskedDepartment() {
        String[] parts = department.split(" ");
        StringBuilder masked = new StringBuilder();
        for (String part : parts) {
            masked.append(part.charAt(0)).append(". ");
        }
        return masked.toString().trim();
    }

}
