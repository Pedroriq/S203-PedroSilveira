package strategy.frete;

public class ServicoFreteSedex implements Fretavel {

    @Override
    public double calcularValor(double pesoEmKg){
        if (pesoEmKg < 20.00){
            return 100.00;
        }
        else {
            return 120.00;
        }
    }
}
