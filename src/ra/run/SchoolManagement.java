package ra.run;

import ra.model.Mark;
import ra.model.Student;
import ra.model.Subject;
import ra.service.MarkService;
import ra.service.StudentService;
import ra.service.SubjectService;

import java.util.Scanner;

public class SchoolManagement {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("************************SCH0OLL-MANAGEMENT*************************");
            System.out.println("1.Quản lý học sinh)");
            System.out.println("2.Quản lý môn học");
            System.out.println("3.Quản lí điểm thi");
            System.out.println("4.Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống
            switch (choice) {
                case 1:
                    StudentService.studentManagerment();
                    break;
                case 2:
                    SubjectService.subjectSevice();
                    break;
                case 3:
                    MarkService.markManagerment();
                    break;
                case 4:
                        System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 0);

    }

}

