import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên không âm có tối đa 3 chữ số: ");
        int number = scanner.nextInt();
        scanner.close();

        String result = convertToWords(number);
        System.out.println(result);
    }

    public static String convertToWords(int number) {
        String[] unitsArray = {
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String[] tensArray = {
                "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        if (number == 0) {
            return "zero";
        }

        // Xử lý hàng trăm
        String result = "";
        if (number / 100 > 0) {
            result += unitsArray[number / 100] + " hundred and ";
            number %= 100;
        }

        // Xử lý hàng chục và đơn vị
        if (number > 0) {
            if (number < 20) {
                result += unitsArray[number];
            } else {
                result += tensArray[number / 10] + " " + unitsArray[number % 10];
            }
        }

        return result.trim();
    }
}