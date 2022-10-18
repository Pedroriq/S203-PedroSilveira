package strategy.frete;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraFreteTest {

    @Test
    void deveCalcularFreteParaDHL() {
        CalculadoraFrete calculadora = new CalculadoraFrete();

        Fretavel servicoFreteDHL = new ServicoFreteDHL();

        double valorEsperado = 100.0;
        double valorRetornado = calculadora.calcular(servicoFreteDHL, 15.0);

        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    void deveCalcularFreteParaSedex(){
        CalculadoraFrete calculadora = new CalculadoraFrete();

        Fretavel servicoFreteSedex = new ServicoFreteSedex();

        double valorEsperado = 50.0;
        double valorRetornado = calculadora.calcular(servicoFreteSedex, 5.0);

        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    void deveCalcularFreteParaJadLog(){
        CalculadoraFrete calculadora = new CalculadoraFrete();

        Fretavel servicoFreteJadLog = new ServicoFreteJadLog();

        double valorEsperado = 0.0;
        double valorRetornado = calculadora.calcular(servicoFreteJadLog, 20.0);

        assertEquals(valorEsperado, valorRetornado);
    }

    void deveCalcularFreteParaFedEx(){
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete();

        Fretavel servicoFreteFedEx = new ServicoFreteFedEx();

        double valorEsperado = 0.0;
        double valorRetornado = calculadoraFrete.calcular(servicoFreteFedEx, 10.0);

        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    void deveLancarExceptionParaServicoDeconhecido(){

    }
}