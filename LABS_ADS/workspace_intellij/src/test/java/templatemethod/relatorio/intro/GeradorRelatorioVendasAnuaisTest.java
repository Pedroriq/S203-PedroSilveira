package templatemethod.relatorio.intro;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeradorRelatorioVendasAnuaisTest {

    @Test
    public void deveGerarRelatorioVendasAnuais(){

        GeradorRelatorioVendasAnuais gerador = new GeradorRelatorioVendasAnuais();

        String pagina = gerador.criarPagina( 2022 );

        System.out.println( pagina );
    }

}