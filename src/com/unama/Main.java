package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double totalVendas;
	    double comissao;

        Scanner sc = new Scanner (System.in);
        System.out.println("Informe o total de vendas");
        totalVendas = sc.nextDouble();
        comissao = totalVendas * 0.10;
        System.out.println("O valor da comissao é igual a" + comissao);
    }
}
