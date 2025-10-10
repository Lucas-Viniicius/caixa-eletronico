package caixaEletronico;

import java.util.Scanner;
import java.util.Locale;


public class MenuUsuario {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        Usuario pessoa01 = new Usuario();

        System.out.println("\n************************************");
        System.out.println("  Bem-vindo ao Caixa CESAR SCHOOL");
        System.out.println("************************************\n");

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("\nDigite o tipo da sua conta: ");
        String tipoConta = input.nextLine();
        System.out.print("\nInforme o saldo que você deseja atribuir: ");
        float saldo = input.nextFloat();
        input.nextLine(); // Apenas para consumir o \n 

        pessoa01.setNome(nome);
        pessoa01.setTipoConta(tipoConta);
        pessoa01.setSaldo(saldo);

        pessoa01.mostrarDados();



        
        input.close();
    }
}

