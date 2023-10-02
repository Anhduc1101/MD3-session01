import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài a:");
        float a = scanner.nextFloat();
        System.out.println("Nhập vào chiều rộng b:");
        float b = scanner.nextFloat();
        if (a > b) {
            float area = (a * b);
            System.out.println("Diện tích là:" + area);
            float perimeter = (a + b) * 2;
            System.out.println("Chu vi là:" + perimeter);

        } else {
            System.out.println("Chiều rộng bạn nhập lớn hơn chiều dài");
        }
    }
}
