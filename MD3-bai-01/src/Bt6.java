import java.util.Scanner;

public class Bt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên bất kì: ");
        int a = scanner.nextInt();
        String b;
        if (a % 3 == 0 && a % 5 == 0) {
            b = "Số " + a + " chia hết cho cả 3 và 5";
        } else if (a % 3 == 0) {
            b = "Số " + a + " chia hết cho 3 và không chia hết cho 5";
        }else if (a % 5 == 0){
            b="Số " + a + " không chia hết cho 3 và chia hết cho 5";
        }else{
            b = "Số " + a + " không chia hết cho cả 3 và 5";
        }
        System.out.println(b);
    }
}
