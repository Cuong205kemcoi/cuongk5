import java.util.Scanner;
public class Student {
    private String studentCode;
    private String fullName;
    private byte age;
    private String gender;
    private String phoneNumber;
    private String email;

    public Student() {
    }

    public Student(String studentCode, String fullName, byte age, String gender, String phoneNumber, String email) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName() {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        String header = String.format("|%-20s|%-25s|%-5s|%-15s|%-11s|%-25s", "studentCode", "fullName", "age", "gender","phoneNumber", "email");
        String studentInfo = String.format("|%-20s|%-25s|%-5d|%-15s|%-11s|%-25s", studentCode, fullName, age,gender, phoneNumber, email);
        System.out.println(header);
        System.out.println(studentInfo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentCode = sc.nextLine();
        String fullName = sc.nextLine();
        byte age = sc.nextByte();
        sc.nextLine();
        String gender = sc.nextLine();
        String phoneNumber = sc.nextLine();
        String email = sc.nextLine();
        Student st = new Student(studentCode, fullName, age,gender, phoneNumber, email);
        st.display();
        sc.close();
    }
}

