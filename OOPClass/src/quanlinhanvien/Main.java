package quanlinhanvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        uiManager uimanager = new uiManager();
        int luachon = 0;
        do {
            System.out.println("              **************** ỨNG DỤNG QUẢN LÍ NHÂN VIÊN ******************");
            System.out.println("              *              Vui lòng chọn chức năng                       *");
            System.out.println("              *           1. Thêm nhân viên mới                            *");
            System.out.println("              *           2. Thay đổi thông tin nhân viên                  *");
            System.out.println("              *           3. Xóa nhân viên đã nghỉ làm                     *");
            System.out.println("              *           4. Hiển thị nhân viên là Experience              *");
            System.out.println("              *           5. Hiển thị nhân viên là Fresher                 *");
            System.out.println("              *           6. Hiển thị nhân viên là Intern                  *");
            System.out.println("              *           0. Thoát chương trình                            *");
            System.out.println("              **************************************************************");
            System.out.println("");
            System.out.println("Vui lòng nhập lựa chọn");
            luachon = sc.nextInt();
            sc.nextLine();
            switch (luachon) {
                case 1:
                    System.out.println("Nhập kiểu nhân viên: 0. Experience || 1. Fresher || 2. Intern ");
                    int type = sc.nextInt();
                    uimanager.insert(uimanager.insertType(type));
                    break;
                case 2:
                    System.out.println("Nhập ID nhân viên bạn muốn sửa");
                    String ID = sc.nextLine();
                    uimanager.edit(ID);
                    break;
                case 3:
                    uimanager.showAll();
                    System.out.println("Nhập ID nhân viên muốn xóa");
                    String id = sc.nextLine();
                    uimanager.Del(id);
                    break;
                case 4:
                    uimanager.showExper();
                    break;
                case 5:
                    uimanager.showFresher();
                    break;
                case 6:
                    uimanager.showIntern();
                    break;
            }
        } while (luachon != 0);

    }
}
