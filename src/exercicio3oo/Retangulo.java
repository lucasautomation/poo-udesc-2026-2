package exercicio3oo;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        System.out.println("...");
        this.largura = largura;
        this.altura = altura;
    }
    //getters publicos
    public double getAltura() {return this.altura;}
    public double getLargura() {return this.largura;}

    //setters públicos
    public void setAltura(double altura) {this.altura = altura;}
    public void setLargura(double largura) {this.largura = largura;}

    public void setMedida(double Altura, double Largura){
        if (Altura >=0 && Altura <=1000 || Largura >=0 && Largura <=1000)
            {this.largura = largura;
            this.altura = altura;}
        else{System.out.println("Medida mínima 0, Máxima 1000");}
    }
    //Metodo toString
    @Override
    public String toString () {
        return "Largura = " + this.largura +
                ", Altura = " + this.altura;
    }
}
