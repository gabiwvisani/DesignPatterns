# DesignPatterns
Projeto Design Patterns em Java
Este projeto tem como objetivo exemplificar diversos padrões de design em Java, utilizando pacotes separados para cada padrão. Atualmente, o padrão implementado é o Strategy.

## Strategy Pattern
O padrão Strategy é um padrão comportamental que permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. Isso permite que o algoritmo varie independentemente dos clientes que o utilizam.

## Estrutura do Código
O padrão Strategy é implementado através das seguintes classes e interfaces:

ImpostoPorEstado: Representa o contexto que utiliza uma estratégia específica de cálculo de impostos com base no estado.
Calculo: Interface que define o contrato para os diferentes algoritmos de cálculo de imposto.
CalculoMG, CalculoRJ, CalculoSP: Implementações concretas da interface Calculo para os estados de Minas Gerais, Rio de Janeiro e São Paulo, respectivamente.
###Exemplo de Uso

public class ImpostoPorEstado {
    public Calculo calculo;
    public ImpostoPorEstado(Calculo calculo) {
        this.calculo = calculo;
    }
    public static void main(String[] args) {
        // Exemplo de cálculo de imposto para São Paulo
        ImpostoPorEstado impostoPorEstado = new ImpostoPorEstado(new CalculoSP());
        double impostoSP = impostoPorEstado.calculo.calcular(1000);
        System.out.println("Imposto para São Paulo: " + impostoSP);
    }
}

Neste exemplo, um objeto ImpostoPorEstado é criado com base na estratégia de cálculo de imposto para o estado de São Paulo (CalculoSP). O método calcular() é então chamado para calcular o imposto com base no valor fornecido.
