package com.itvdn.javaStarter;

public class C07_IncDec_Papildomas {
    public static void main(String[] args) {
//        byte a = 5;
//        System.out.println(a++);
//        System.out.println(++a);

        int a = 6, b = 4;
        a = ++a + b++ + a++;
        int c = --a + b--;
        System.out.println(a + " " + b  +" " + " " + c);

        int d = 5;
//        d = d++ + 3;
        d=d++;
        System.out.println(d);
    }
}
