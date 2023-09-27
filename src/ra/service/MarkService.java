package ra.service;

import ra.model.Mark;
import ra.model.Student;

import java.util.Scanner;

public class MarkService {
    static Scanner scanner = new Scanner(System.in);
    static int count = 0;
    static Mark[] arrMark = new Mark[10];
    static int markCount = 0;
    public static void markManagerment(){

        int choice;
        do {
            System.out.println(" *********************MARK-MANAGEMENT************************");
            System.out.println("1.Thêm mới điểm thi cho 1 sinh viên");
            System.out.println("2.Hiển thị danh sách tất cả điểm thi theo thứ tự điểm tăng dần");
            System.out.println("3.Thay đổi điểm theo mã id");
            System.out.println("4.Xóa điểm theo mã id");
            System.out.print("5:Hiển thị danh sách điểm thi theo mã môn học ");
            System.out.print("6:Hiển thị đánh giá học lực");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;

                case 4:

                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 0);

    }




}
