package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập lượng số nguyên tố muốn lấy ra.");
        double numbers = scanner.nextDouble();
        int count   = 0;
        int N       = 2;
        int i;
        boolean check;

        System.out.println("Các số nguyên tố:");
        while (count < numbers) {
            check = true;
            if (N != 2) {
                double cSQRT = Math.ceil(Math.sqrt(N));
                for(i = 2; i <= cSQRT; i++){
                    if(N%i == 0){
                        check = false;
                    }
                }
            }
            if(check){
                count++;
                System.out.println(N);
            }
            N++;
        }
    }
}
