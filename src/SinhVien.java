import java.util.Scanner;

public class SinhVien {
    private String nameSV;
    private int yearSV;
    private String addressSV;
    private float pointSV;

    public SinhVien() {
    }

    public SinhVien(String nameSV, int yearSV, String addressSV, float pointSV) {
        this.nameSV = nameSV;
        this.yearSV = yearSV;
        this.addressSV = addressSV;
        this.pointSV = pointSV;
    }

    public String getNameSV() {
        return nameSV;
    }

    public void setNameSV(String nameSV) {
        this.nameSV = nameSV;
    }

    public int getYearSV() {
        return yearSV;
    }

    public void setYearSV(int yearSV) {
        this.yearSV = yearSV;
    }

    public String getAddressSV() {
        return addressSV;
    }

    public void setAddressSV(String addressSV) {
        this.addressSV = addressSV;
    }

    public float getPointSV() {
        return pointSV;
    }

    public void setPointSV(float pointSV) {
        this.pointSV = pointSV;
    }

    public void inputIforSV() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên sinh viên");
        nameSV = scanner.nextLine();
        System.out.println("Nhập năm sinh của sinh viên");
        yearSV = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập địa chỉ sinh viên");
        addressSV = scanner.nextLine();
        System.out.println("Nhập điểm sinh viên");
        pointSV = scanner.nextFloat();

    }

    public void outputIforSV() {
        System.out.println("Sinh viên: " + this.nameSV + "\tsinh năm: " + this.yearSV + "\tđịa chỉ: " + this.addressSV + "\tđiểm: " + this.pointSV);
    }
}
