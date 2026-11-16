package exercicio3oo;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    public Carro(String modelo, String marca, int ano, double velocidade){
        System.out.println("...");
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        setVelocidade(velocidade);
    }
    //setter publicos
    public String getModelo() {return this.modelo;}
    public String getMarca(){return this.marca;}
    public int getAno() {return this.ano;}
    public double getVelocidade() {return this.velocidade;}

    //getters públicos
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setMarca(String marca) {this.marca = marca;}
    public void setAno(int ano) {this.ano = ano;}
    public void setVelocidade(double velocidade) {
        if(velocidade >= 0 && velocidade <=300){
            {this.velocidade = velocidade;}
        }
        else{System.out.println("Fora da faixa de velocidade permitida!");}
        }
    public void acelerar(double incremento) {
        if (incremento <= 0 || (this.velocidade + incremento) > 300) {
            System.out.println("Erro de aceleração - ultrapassa 300 km/h!");
        } else {this.velocidade += incremento;}
    }
    public void frear(double decremento) {
        if (decremento <= 0 || (this.velocidade - decremento) < 0) {
            System.out.println("Erro de freio -velocidade ficaria negativa!");
        } else {this.velocidade -= decremento;}
    }
    @Override
    public String toString(){
        return "Modelo du carro: " + this.modelo +
                ", Marca du carro é " + this.marca +
                ", Ano de fabricação:" + this.ano +
                ", Velocidade máxxima: " + this.velocidade;
    }
}
