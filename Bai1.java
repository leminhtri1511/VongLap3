/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvonglap;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Bai1 
{
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            int S = 0,n;
            do 
            {
                System.out.println("Nhap n > 0: ");
                n = sc.nextInt();
            } while (n < 0);
            for(int i = 0; i <= n; i++)
            S += i*2;
            System.out.println ("Sum = " + S);
    }
}
