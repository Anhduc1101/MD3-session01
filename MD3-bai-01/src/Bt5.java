import java.util.Scanner;

public class Bt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào điểm toán: ");
        float math = scanner.nextFloat();
        System.out.println("Nhập vào điểm lý: ");
        float phy = scanner.nextFloat();
        System.out.println("Nhập vào điểm hóa: ");
        float bio = scanner.nextFloat();
        System.out.println("Nhập vào điểm văn: ");
        float lit = scanner.nextFloat();
        System.out.println("Nhập vào điểm anh: ");
        float eng = scanner.nextFloat();
        float tb = (math + phy + bio + lit + eng) / 5;
        System.out.println("Điểm trung bình môn là :" +tb);
        String b;
        if (tb >= 0 && tb < 5) {
            b = "Xếp loại Yếu";
        } else if (tb >= 5 && tb < 6.5) {
            b = "Xếp loại Trung Bình";
        } else if (tb >= 6.5 && tb < 8) {
            b = "Xếp loại Khá";
        } else if (tb >= 8 && tb < 9) {
            b = "Xếp loại Giỏi";
        } else {
            b = "Xếp loại Xuất Sắc";
        }
        System.out.println(b);
    }
}
