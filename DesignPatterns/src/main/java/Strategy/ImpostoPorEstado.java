package Strategy;

public class ImpostoPorEstado {

    public Calculo calculo;

    public ImpostoPorEstado(Calculo calculo) {
        this.calculo = calculo;
    }

    public static void main(String[] args) {
        ImpostoPorEstado impostoPorEstado = new ImpostoPorEstado(new CalculoSP());

        double impostoSP = impostoPorEstado.calculo.calcular(1000);
        System.out.println("Imposto para São Paulo: " + impostoSP);


    }
}
