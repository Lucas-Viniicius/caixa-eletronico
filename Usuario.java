package caixaEletronico;

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

    public void mostrarDados(){
        System.out.println("\n********** DADOS DO USUÁRIO: **********\n");
        System.out.println("Nome:               "+getNome());
        System.out.println("Tipo da Conta:      "+getTipoConta());
        System.out.println("saldo:              "+getSaldo());
        System.out.println("\n********** DADOS DO USUÁRIO: **********\n");
    }
}

