package com.example.repaso1.Logica;

public class Calculos {

    public Long multiplicar(Long a,Long b){
        return a*b;
    }

    public double factorial(double numero){
        if(numero==0){
            return 1;
        }else {
            return numero * factorial(numero-1);
        }


    }
}

