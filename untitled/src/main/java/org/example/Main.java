package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce el multiplicando (3 cifras):");
        Scanner entrada=new Scanner(System.in);
        int muln=entrada.nextInt();
        System.out.println("Introduce el multiplicador (3 cifras):");
        int mulr=entrada.nextInt();
        int rels=(muln*mulr);
        String numT1=" ";
        String numT2=" ";
        String numT3=" ";
        String numT=Integer.toString(mulr);
        if (mulr >= 0){
            try {
                numT1=numT.substring(0,1);
                numT2=numT.substring(1,2);
                numT3=numT.substring(2,3);
            }catch (StringIndexOutOfBoundsException err){
                numT1="0";
                numT2="0";
                numT3="0";
            }
        }else {
            numT1=numT.substring(1,2);
            numT2=numT.substring(2,3);
            numT3=numT.substring(3,4);
        }
        int num1=Integer.parseInt(numT1);
        int num2=Integer.parseInt(numT2);
        int num3=Integer.parseInt(numT3);
        System.out.println("El producto de la multiplicación es: "+ rels);
        System.out.println("El proceso es:");
        System.out.println("  "+muln);
        System.out.println("x "+mulr);
        System.out.println("________");
        if (num3!=0){
            System.out.println("   "+(num3*muln));
        }
        if (num2!=0){
            System.out.println(" "+(num2*muln)+"x");
        }
        if (num1!=0){
            System.out.println((num1*muln)+"xx");
        }else{
            System.out.println((num1*muln));
        }
        System.out.println("________");
        System.out.println(rels);
    }
}