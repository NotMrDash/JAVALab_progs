/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ST LAB
 */
import java.util.Scanner;
public class Mover {
    void add(int a,int b)
    {
        System.out.println("the addition of two integers ="+(a+b));
    }
    void add(double a, double b)
    {
        System.out.println("the addition of two double values ="+(a+b));
        
    }
    void add(int a, int b, int c)
    {
        System.out.println("the addition of three values ="+(a+b+c));
    }
    public static void main(String[] args) {
        Mover ob=new Mover();
    ob.add(5,10);
    ob.add(534.76,875.423);
    ob.add(12,54,84);
    }
    
}
