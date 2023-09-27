package ra.service;

import ra.model.Student;

import java.util.Scanner;

public class StudentService {
    static Scanner scanner = new Scanner(System.in);
    static  Student[]arrStudent = new Student[10];

    static int studentCount = 0;
    static int count = 0;
    public static void studentManagerment(){

        int choice;
        do {
            System.out.println("**********************STUDENT-MANAGEMENT************************");
            System.out.println("1.Thêm mới học sinh)");
            System.out.println("2.Hiển thị danh sách tất cả học sinh đã lưu trữ");
            System.out.println("3.Thay đổi thông tin học sinh theo mã id");
            System.out.println("4.Xóa học sinh theo mã id");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống
            switch (choice) {
                case 1:
                    StudentService.createStudent();
                    break;
                case 2:
                    for (int i = 0; i < studentCount; i++) {
                        arrStudent[i].displayData();
                    }
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Thoát");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 0);

    }
    public static void createStudent() {
        System.out.println("Nhập vào số lượng sinh viên muốn thêm");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            arrStudent[i] = new Student();
            arrStudent[i].inputData(scanner, arrStudent, studentCount,count);
            studentCount++;
        }

    }
    public static void deleteStudent(){
        System.out.println("Nhập mã sinh viên cần xóa");
        int deleteId = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < studentCount; i++) {
            if(arrStudent[i].getStudentId() == deleteId){
                index = i;
                break;
            }
        }
        if(index == -1 ){
            System.out.println("Không tìm thấy sinh viên");
        }else {
            for (int i = 0; i < studentCount; i++) {
                for (int j = deleteId; j < studentCount - 1; j++) {
                    arrStudent[j] = arrStudent[j + 1];
                }
            }

        }
    }

    public static void updateStudent(){
        System.out.println("Nhập mã sinh viên cần sửa");
        int updateId = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < studentCount; i++) {
            if(arrStudent[i].getStudentId() == updateId){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Mã sinh viên cần sửa không tìm thấy");
        }else {

            System.out.println("Đổi sinh viên");
            String newName = scanner.nextLine();
            arrStudent[index].setStudentName(newName);

            System.out.println("Thay đổi ngày tháng năm sinh");
            String newbirthDay= scanner.nextLine();
            arrStudent[index].setBirthDay(newbirthDay);

            System.out.println("Đổi địa chỉ");
            String newAddress = scanner.nextLine();
            arrStudent[index].setAddress(newAddress);

            System.out.println("Đổi giới tính");

            boolean newGender = Boolean.parseBoolean(scanner.nextLine());
            arrStudent[index].setGender(newGender);

            System.out.println("Thay đổi số ddienj thoại");
            double newPhoneNumber = Double.parseDouble(scanner.nextLine());
            arrStudent[index].setPhone(String.valueOf(newPhoneNumber));

            System.out.println(" đổi thành công");
        }

    }
}
