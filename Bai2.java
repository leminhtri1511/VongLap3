/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvonglap;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Bai2 
{
     public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap n > 0: ");
            n = sc.nextInt();
        } while (n < 0);

        for (int i = 0; i <= n; i++) {
            sum += (2 * i + 1);
        }
        System.out.println("Tổng = " + sum);
    }
}
