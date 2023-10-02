import java.util.Scanner;

public class Bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhập số vào đây: ");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("số một");
                    break;
                case 2:
                    System.out.println("số hai");
                    break;
                case 3:
                    System.out.println("số ba");
                    break;
                case 4:
                    System.out.println("số bốn");
                    break;
                case 5:
                    System.out.println("số năm");
                    break;
                case 6:
                    System.out.println("số sáu");
                    break;
                case 7:
                    System.out.println("số bảy");
                    break;
                case 8:
                    System.out.println("số tám");
                    break;
                case 9:
                    System.out.println("số chín");
                    break;
                default:
                    System.out.println("Không được nhập quá 9");
            }
        }
    }
}
