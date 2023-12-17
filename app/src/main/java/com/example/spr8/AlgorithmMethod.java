package com.example.spr8;

public class AlgorithmMethod {
    //Пошук мінімального елементу масиву позитивних чисел
    public int findMinElement(int[] array ){
        if ( array == null){
            return -1;
        }

        int minElement=Integer.MAX_VALUE ;
        for(int num: array){
            if(num>0 && num < minElement){
                minElement = num ;
            }
        }
        return minElement ;
    }
    //Розрахунок суми елементів масиву, який може складатися лише з від’ємних чисел
    public int calculateSum (int[] array){
        int sum = 0;

        for(int num: array){
            if(num < 0){
                sum+=num ;
            }
            if (num>=0){
                return 0 ;
            }
        }

        return sum ;
    }
    //  Алгоритм розрахунку N-го елементу послідовності Фібоначчі
    public int fibonacci (int n){
        if (n<=1){
            return n ;
        }
        int a = 0 ;
        int b = 1 ;
        for(int i=2 ; i<=n; i++){
            int temp = a+b ;
            a=b;
            b=temp;
        }
        return b ;
    }
    //Алгоритм розрахунку сили струму на ділянці кола
    public double current (double voltage,double resistance){
        if(resistance<=0) {
            System.out.println("Resistance shouldnt be 0 or less");
            return 0 ;
        }
        double current ;
        current = voltage / resistance ;
        return current ;
    }
}