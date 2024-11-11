package org.example;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm < parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroUm - parametroDois;
        System.out.println("O contador é: " + contagem);
        for(int i=1; i <= contagem; i++){
            System.out.println("Contagem: " + i);
        }
    }
}
