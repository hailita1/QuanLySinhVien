import java.util.Scanner;

public class QuanLySinhVien extends SinhVien {
    public static void main(String[] args) {
        String nameSV;
        int yearSV;
        String addressSV;
        float pointSV;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số sinh viên: ");
        int n = scanner.nextInt();
        SinhVien[] sv = new SinhVien[n];
        for (int i = 0; i < sv.length; i++) {
            System.out.println("Nhập vào thông tin sinh viên thứ" + (i + 1));
            System.out.println("Nhập vào tên sinh viên thứ " + (i + 1));
            nameSV.sv[i] = scanner.
        }
        System.out.println("Danh sách sinh viên vừa nhập là: ");
        for (int i = 0; i < sv.length; i++) {
            sv[i].outputIforSV();
        }
    }
}
