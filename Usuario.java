package caixaEletronico;

import java.util.Scanner;

public class Usuario {

    private String nome;
    private String tipoConta;
    private float saldo;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }
    public String getTipoConta(){
        return this.tipoConta;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return this.saldo;
    }

    public String getSaldoFormatado(){
        return String.format("R$ %.2f", saldo);
    }

    public void limpaTela(){
        System.out.print("\033[H\033[2J"); // Limpar a tela
        System.out.flush();
    }

    public void mostrarDados(){
        System.out.println("\n\n********** DADOS DO USUÁRIO ************\n");
        System.out.println("Nome:               "+getNome());
        System.out.println("\nConta:              "+getTipoConta());
        System.out.println("\nSaldo:              "+getSaldoFormatado());
        System.out.println("\n****************************************\n\n");
    }

    public void operacoes(){
        Scanner input = new Scanner(System.in);
        System.out.print("Deseja fazer alguma operação ? ");
        String opcao01 = input.nextLine();
        if(opcao01.equalsIgnoreCase("nao")){
            System.out.println("Encerrando... Obrigado usar nosso caixa eletrônico!");
            return;
        }else{
            System.out.println("\nOlá, Bem-vindo(a) ao menu de operações.");
            while(true){
                System.out.println("Digite 1 para SACAR");
                System.out.println("Digite 2 para DEPOSITAR");
                System.out.println("Digite 3 para VER SEU SALDO");
                System.out.println("Digite 4 para SAIR");
                System.out.print("\nInforme o DIGITO da operação que você deseja realizar: "); 
                int numeroEscolhido = input.nextInt();

                switch(numeroEscolhido){
                    case 1:
                        while(true){
                            limpaTela();

                            System.out.println("\n**************************");
                            System.out.println("      ÁREA DE SAQUE");
                            System.out.println("**************************\n");
                            System.out.print("Informe o valor que você deseja sacar: "); 
                            float valorSacado = input.nextFloat();

                            if(valorSacado > saldo){
                                System.out.println("\nValor não disponível. Tente novamente ");
                            }else{
                                this.saldo = saldo - valorSacado;
                                System.out.println("\nSaque realizado com sucesso! Seu novo saldo é de: R$ " +getSaldoFormatado());
                                break;
                            }
                        }
                        break;
                    case 2:
                        while(true){
                            limpaTela();

                            System.out.println("\n**************************");
                            System.out.println("     ÁREA DE DEPOSITO");
                            System.out.println("**************************\n");
                            System.out.print("Informe o valor que você deseja depositar: ");
                            float valorDeposito = input.nextFloat();

                            input.nextLine();
                            if(valorDeposito <= 0){
                                System.out.println("\nValor inválido. Adicione um valor maior que zero!");
                            }else{
                                this.saldo = saldo + valorDeposito;
                                System.out.println("\nR$ "+valorDeposito+" Depositado com sucesso! Seu novo saldo é de: "+getSaldoFormatado());
                                break;
                            }
                        }
                        break;
                    case 3:
                        limpaTela();

                        System.out.println("*********************************************\n");
                        System.out.println("    Seu saldo atual é de: "+getSaldoFormatado());
                        System.out.println("\n*********************************************");
                        break;

                    case 4:
                        limpaTela();
                        return;

                    default:
                        limpaTela();

                        System.out.println("\nEssa opção não existe! Tente novamente ou digite 4 para sair.");
                }
            }
        }
    }
}

