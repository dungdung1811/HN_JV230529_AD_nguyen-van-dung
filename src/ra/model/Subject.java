package ra.model;

import java.util.Scanner;

public class Subject {
    private String subjectId;
    private String subjectName;

    public Subject() {
    }

    public Subject(String subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public void inputData (Scanner scanner, Subject[] arrSubject, int count, int subjectCount){
        System.out.println("Nhập vào thông tin môn học");
        boolean isExit = false;
        do{
            do {
                this.subjectId = String.valueOf(count+1);
                break;
            }while (true);
            do {
                System.out.println("Nhập vào tên môn học");
                this.subjectName = scanner.nextLine();
                if (!this.subjectName.isEmpty()) {
                    break;
                } else {
                    System.out.println("Tên sinh viên không để trống");
                }
            }
            while (true);

        }
        while (!isExit);

    }
    public  void displayData () {
        System.out.println("______THÔNG TIN Môn HỌC______");
        System.out.println("MÃ MÔN HỌC: " + this.subjectId);
        System.out.println("TÊN MÔN HỌC: " + this.subjectName);
    }

}
