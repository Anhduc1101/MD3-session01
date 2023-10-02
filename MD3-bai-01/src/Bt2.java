import java.util.Scanner;
public class Bt2 {
// Bước 1: Tạo dự án mới và khai báo hàm main()
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Bước 2: Khai báo biến tỉ giá (rate) để lưu giá trị tỉ giá giữa VND và USD. Hiện nay, tỉ
        //giá có thể là 23000 VND/USD
        double rate = 23000;
        System.out.println("Tỷ giá hiện nay: 1 USD = " +rate +"VND ");
        // Bước 3: Khai báo biến giá trị USD và cho người dùng nhập vào.
        System.out.println("Nhập giá USD: " );
        float usd = scanner.nextFloat();
        // Bước 4: Tính giá trị VND và hiển thị ra màn hình.
        double vnd = usd * rate;
        System.out.println("Giá tiền VND là: " + vnd);
    }
}
