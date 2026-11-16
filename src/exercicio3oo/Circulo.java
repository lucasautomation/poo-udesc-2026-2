package exercicio3oo;

public class Circulo {
    private double raio;

    public Circulo(Double raio) {
        System.out.println(".....");
        this.setRaio(raio);
    }

    //getters públicos
    public Double getRaio() {return this.raio;}

    //setters públicos
    public void setRaio() {this.raio = raio;}

    public void setRaio(double raio) {
        if (raio >= 0 && raio <= 1000) {
            this.raio = raio;
        } else {
            System.out.println("Medida fora da faixa permitida!");
        }
    }

        //Metodo toString
        @Override
        public String toString() {
            return "Circulo [raio=" + this.raio + "]";
        }
    }
