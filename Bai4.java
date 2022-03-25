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
public class Bai4 
{
    public static void main(String[] args) {
        int n, P = 1;
        Scanner sc;
        do 
        {
            System.out.println("Nhap n > 0: ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n <= 0);
        
        for(int i = 2; i <= n; i++)
            P *= P*2;
        System.out.println("P = " + P);
    }
    
}
