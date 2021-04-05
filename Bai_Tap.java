import java.util.Scanner;

public class Bai_Tap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng chọn dịch vụ : ");
        System.out.println("1. Kiểm tra số nguyên tố : ");
        System.out.println("2. Kiểm tra số chẵn lẻ : ");
        System.out.println("3. Kiểm tra số chính phương : ");
        System.out.println("4. Thoát chương trình : ");
        System.out.println("Nhập vào đây : ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                int count = 0;
                System.out.print("Nhập số bạn cần kiểm tra số nguyên tố :");
                int number2 = scanner.nextInt();
                for (int i = 1; i < number2; i++) {
                    if (number % i == 0) {
                        count++;
                    }
                }
                if (count == 1) {
                    System.out.print("Số " + number2 + " là số nguyên tố : ");
                } else {
                    System.out.print("Số " + number2 + " không phải là số nguyên tố : ");
                }
                break;
            case 2:
                System.out.print("Nhập số bạn cần kiểm tra số chẵn or lẻ : ");
                int number3 = scanner.nextInt();
                if (number3 % 2 == 0) {
                    System.out.print("Số " + number3 + " là só chẵn");
                } else {
                    System.out.print("Số " + number3 + " là só lẻ");
                }
                break;
            case 3:
                System.out.print("Nhập số bạn cần kiểm tra chính phương : ");
                int number4 = scanner.nextInt();
                for (int i = 1;; i++) {
                    int a = i * i;
                    if (a == number4) {
                        System.out.print("Số " + number4 + " là số chính phương");
                        break;
                    }
                    if (a>number4){
                        System.out.print("Số " + number4 + " không phải là số chính phương");
                        break;
                    }
                }
            case 4 :
                break;
        }

    }
}
