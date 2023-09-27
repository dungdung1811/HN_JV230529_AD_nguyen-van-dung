package ra.model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    private int studentId;
    private String StudentName;
    private String birthDay;
    private String address;
    private boolean gender;
    private String phone;

    public Student() {

    }

    public Student(int studentId, String studentName, String birthDay,String address, boolean gender, String phone) {
        this.studentId = studentId;
        StudentName = studentName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void inputData (Scanner scanner, Student [] arrStudent, int count, int studentCount){
        System.out.println("Nhập vào thông tin sinh viên");
        boolean isExit = false;
        do {
            do {
                this.studentId = count+1;
                break;
            }while (true);
            do {
                System.out.println("Nhập vào tên Sinh viên: tên sinh viên không được để trống");
                this.StudentName = scanner.nextLine();
                if (!this.StudentName.isEmpty()) {
                    break;
                } else {
                    System.out.println("Tên sinh viên không  để  trống");
                }
            }
            while (true);
            do {
                System.out.println("Nhập ngày tháng năm sinh");
                this.birthDay = scanner.nextLine();
                if (!validateTime(birthDay)){
                    System.out.println("Thời gian không đúng định dạng");
                } else {
                    System.out.println();
                    break;
                }
            }
            while (true);
            do {
                System.out.println("Nhập vào địa chỉ");
                this.address = scanner.nextLine();
                if (!this.address.isEmpty()) {
                    break;
                } else {
                    System.out.println("Địa chỉ không  để  trống");
                }
            }
            while (true);
            do {
                System.out.println("Nhập vào giới tính: True/NAM hoặc false/ NỮ");
                this.gender = Boolean.parseBoolean(scanner.nextLine());
                break;
            }while (true);

            do {
                System.out.println("Nhập số điện thoại");
               this.phone = scanner.nextLine();
                if (!validatePhoneNumber(phone)){
                    System.out.println("Sai cú pháp phone");
                } else {
                    System.out.println();
                    break;
                }

            } while (true);

        }while (!false);

    }

    public  void displayData (){
        System.out.println("______THÔNG TIN STUDENT______");
        System.out.println("STUDENT ID: "+ this.studentId);
        System.out.println("STUDENT NAME: "+this.StudentName);
        System.out.println("STUDENT BIRTHDAY: "+this.birthDay);
        System.out.println("STUDENT ADDRESS: "+this.address);
        System.out.println("STUDENT GENDER: "+this.gender);
        System.out.println("STUDENT PHONE: "+this.phone);

    }

    public static boolean validateTime (String date){
        String time = "^(0[1-9]|1[0-9]|2[0-9]|3[0-1]|[1-9])/(0[1-9]|1[0-2]|[1-9])/([0-9]{4})$";
        Pattern p = Pattern.compile(time);
        Matcher m = p.matcher(date);
        return m.matches();
    }

    public static boolean validatePhoneNumber (String number) {
        String phonenum = "^(09|01[2|6|8|9])+([0-9]{8})$|^(02|03[2|3|4|5|6|7|8|9])+([0-9]{7})$";
        Pattern p = Pattern.compile(phonenum);
        Matcher m = p.matcher(number);
        return m.matches();
    }

}
