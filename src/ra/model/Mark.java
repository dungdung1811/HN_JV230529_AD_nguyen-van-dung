package ra.model;

import java.util.Scanner;

public class Mark {
    private int markId;
    private Student student;
    private Subject subject;
    private double point ;

    public Mark() {
    }

    public Mark(int markId, Student student, Subject subject, double point) {
        this.markId = markId;
        this.student = student;
        this.subject = subject;
        this.point = point;
    }

    public int getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        this.markId = markId;
    }

    public Student getStudent() {
        return student;
    }



    public Subject getSubject() {
        return subject;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
    public void inputData (Scanner scanner ,Mark[] arrMark,int markCount,int count){

        System.out.println("Nhập vào ten sinh viên");
//        this.student = scanner.nextLine();
        System.out.println("Nhập vào Môn học");
//        this.subject =scanner.nextLine();
        System.out.println("Nhập vào điểm ");
        this.point = Double.parseDouble(scanner.nextLine());


    }
    public  void displayData (){
        System.out.println("______THÔNG TIN STUDENT______");
        System.out.println("MÃ ĐIẺM: "+ this.markId);
        System.out.println("TÊN STUDENT: "+this.student);
        System.out.println("MÔN HỌC: "+this.subject);
        System.out.println("ĐIỂM : "+this.point);

    }
}
