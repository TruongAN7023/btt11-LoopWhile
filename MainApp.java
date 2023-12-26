package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * bai tap 11.1
		 */
//		int n = 100;
//        int sum = 0;
//        int i = 1;

//        while (i <= n) {
//            sum += i;
//            i++;
//        }

//        System.out.println("Tong cac so tu 1 den 100: " + sum);
		
		/*
		 * bai tao 11.2
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhap so tu nhien n: ");
//        int n = sc.nextInt();
//
//        int sum = 0;
//        int i = 0;

//        while (i < n) {
//            if (i % 3 == 0) {
//                sum += i;
//            }
//            i++;
//        }

//        System.out.println("Tong cac so nho hon " + n + " va chia het cho 3 la: " + sum);
		
		
		/*
		 * bai tap 11.3
		 */
//		int n = 100;
//        int first = 0, second = 1;
//        int count = 0;

//        System.out.println("100 so Fibonacci dau tien:");

//        while (count < n) {
//            System.out.print(first + " ");

//            int next = first + second;
//            first = second;
//            second = next;

//            count++;
//        }
		
		
		/*
		 * bai tap 11.4
		 */
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Nhap so nguyen n: ");
//        int n = sc.nextInt();

//        int soBanDau = n;
//        int soDaoNguoc = 0;

//        while (n != 0) {
//            int remainder = n % 10;
//            soDaoNguoc = soDaoNguoc * 10 + remainder;
//            n /= 10;
//        }

//        if (soBanDau == soDaoNguoc) {
//            System.out.println(soDaoNguoc + " la so Palindrome.");
//        } else {
//            System.out.println(soDaoNguoc + " khong phai la so Palindrome.");
//        }
		
		/*
		 * bai tap 11.5
		 */
		
		 int n = 100;

	        while (n <= 999) {
	            int temp = n;
	            int sum = 0;

	            while (temp > 0) {
	                sum += temp % 10;
	                temp /= 10;
	            }

	            if (sum % 3 == 0) {
	                System.out.println(n);
	            }

	            n++;
	        }
		

	}

}
