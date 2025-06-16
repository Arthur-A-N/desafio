package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.example.Main.fibonacciRecursiva;

public class Main {
    private List<Integer> primosRec = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(fibonacci (5));
        System.out.println(chamaFibonacciRecursiva (5));
        System.out.println(primos(12));
        System.out.println(chamaPrimosRecursivai(12));



    }public static List<Integer> chamaPrimosRecursivai(int arg){
        Main m = new Main();
        return m.primosRecursivai(arg+1,false);
    }
    public List<Integer> primosRecursivai(int argi,boolean ehPrimo){
        if(ehPrimo) {
            this.primosRec.add(0, argi);
        }
        argi-=1;
        if(argi>=2) {
            primosRecursivaj(argi,2);
        }
        return this.primosRec;
    }
    public void primosRecursivaj(int argi,int argj){
        if (argi == 2) {
            primosRecursivai(2, true);
            return;
        }
        if(argi%argj == 0 ){
            primosRecursivai(argi,false);
            return;
        }
        if(argj <= Math.sqrt(argi)){
            primosRecursivaj(argi,argj +1);
            return;
        }
        primosRecursivai(argi,true);
    }

    public static List<Integer> primos(int arg){
        boolean ehPrimo = false;
        List<Integer> primos = new ArrayList<>();
        for(int i =2; i <= arg ; i++) {
            ehPrimo =true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j == 0 ){
                    ehPrimo = false;
                    break;
                }
            }
            if(ehPrimo){
                primos.add(i);
            }
        }
        return primos;
    }

    public static int fibonacciRecursiva(int atual, int anterior,int arg){
        if(arg>0){
            atual += anterior;
            anterior = atual-anterior;
            return fibonacciRecursiva(atual,anterior,arg - 1);
        }
        return anterior;
    }

    public static int chamaFibonacciRecursiva(int arg){
        int atual=1;
        int anterior=0;
        return fibonacciRecursiva(atual,anterior,arg);
    }

    public static int fibonacci (int arg){
        int atual =1;
        int anterior =0;
        for (int i = arg; i > 0; i--) {
            atual += anterior;
            anterior = atual-anterior;
        }
        return anterior;
    }
}