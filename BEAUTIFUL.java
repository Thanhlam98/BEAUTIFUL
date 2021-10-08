//BEAUTIFUL Problem
//MSSV: 16020397
import java.io.*;
import java.lang.*;
import java.util.Scanner;

class BEAUTIFUL {
    public static double answer(double n, double k)
    {
        double i = 10;
        double MIN = Math.pow(i, n - 1);
        //answer for the problem
        if (MIN % k == 0)
            return (MIN);
        else
            return ((MIN + k) - ((MIN + k) % k));
    }

    public static void main(String[] args)
    {

        Scanner numbs = new Scanner(System.in);
        System.out.println("Mời nhập vào số chữ số n:");
        double n = numbs.nextDouble();

        Scanner divisior = new Scanner(System.in);
        System.out.println("Mời nhập vào số k:");
        double k = divisior.nextDouble();

        System.out.println((int)answer(n, k));
    }
}

