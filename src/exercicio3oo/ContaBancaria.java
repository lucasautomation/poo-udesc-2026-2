package exercicio3oo;
public class ContaBancaria {
    private String numeroconta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroconta, String titular, double saldo){
        System.out.println("...");
        this.numeroconta = numeroconta;
        this.titular = titular;
        setSaldo (saldo);
    }
    //getters públicos
    public double getSaldo() {return this.saldo;}
    public String getNumeroconta() {return this.numeroconta;}
    public String getTitular(){return this.titular;}

    //setters públicos
    public void setNumeroconta(String numeroconta) {this.numeroconta = numeroconta;}
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo negativo");
        }
    }
    public void setTitular(String titular) {this.titular = titular;}

    //Metodo toString

    @Override
    public String toString() {return
            "Número da conta é: " + this.numeroconta +
                    ", Nome do titular: " + this.titular +
                    ", Saldo da conta: " + this.saldo;
    }
}
