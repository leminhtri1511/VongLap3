/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvonglap;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
 
 
public class Bai3 
{
    public static void main(String[] args) {
        float sum = 0;
        int n;
        Scanner sc;
        do 
        {
            System.out.println("Nhap n > 0: ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n <= 0);
         
        for(int i = 1; i <= n; i++) 
        {
            sum += 1.0/i;
        }
        System.out.println("Sum = " + sum);
    }
}
