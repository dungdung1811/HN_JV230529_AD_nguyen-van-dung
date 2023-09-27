package ra.service;

import ra.model.Student;
import ra.model.Subject;

import java.util.Scanner;

public class SubjectService {
    static Subject[] arrSubject = new Subject[10];
    static int subjectCount = 0;
    static  int count = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void subjectSevice(){
        int choice;
        do {
            System.out.println("**********************SUBJECT-MANAGEMENT*************************");
            System.out.println("1.Thêm mới môn học)");
            System.out.println("2.Hiển thị danh sách tất cả môn học đã lưu trữ");
            System.out.println("3.Thay đổi thông tin học môn học theo mã id");
            System.out.println("4.Xóa học sinh theo mã id");
            System.out.print("5: thoát ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống
            switch (choice) {
                case 1:
                    SubjectService.createSubject();
                    break;
                case 2:
                    for (int i = 0; i < subjectCount; i++) {
                        arrSubject[i].displayData();
                    }

                    break;
                case 3:

                    break;

                case 4:
                    deleteStudent();

                    break;
                case 5:
                    System.out.println("Thoát");
                    System.exit( 0);

                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 0);
    }


    public static void createSubject() {
        System.out.println("Nhập vào số lượng môn học muốn thêm");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            arrSubject[i] = new Subject();
            arrSubject[i].inputData(scanner, arrSubject, subjectCount,count);
            subjectCount++;
        }

    }

    public static void deleteStudent(){
        System.out.println("Nhập mã sinh viên cần xóa");
        int deleteId = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < subjectCount; i++) {
            if(arrSubject[i].getSubjectId().equals(deleteId)){
                index = i;
                break;
            }
        }
        if(index == -1 ){
            System.out.println("Không tìm thấy sinh viên");
        }else {
            for (int i = 0; i < subjectCount; i++) {
                for (int j = deleteId; j < subjectCount - 1; j++) {
                    arrSubject[j] = arrSubject[j + 1];
                }
            }

        }
    }
    public static void updateSubject(){
        System.out.println("Nhập mã sinh viên cần sửa");
        int updateId = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < subjectCount; i++) {
            if(arrSubject[i].getSubjectId().equals(updateId)) {
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Mã sinh viên cần sửa không tìm thấy");
        }else {

            System.out.println("Đổi tên môn học");
            String newName = scanner.nextLine();
            arrSubject[index].setSubjectName(newName);

        }

    }

}
