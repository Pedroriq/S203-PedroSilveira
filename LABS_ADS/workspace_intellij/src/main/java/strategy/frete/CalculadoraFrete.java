package strategy.frete;

import strategy.frete.Fretavel;

public class CalculadoraFrete {

    public double calcular(Fretavel fretavel, double pesoEmKg){
        return fretavel.calcularValor(pesoEmKg);
    }
}
