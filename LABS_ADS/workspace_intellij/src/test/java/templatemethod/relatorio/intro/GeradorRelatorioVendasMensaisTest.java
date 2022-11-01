package templatemethod.relatorio.intro;

import org.junit.Test;

import java.sql.SQLOutput;

import static org.junit.Assert.*;

public class GeradorRelatorioVendasMensaisTest {

    @Test
    public void deveGerarRelatorioVendasMensais(){

        GeradorRelatorioVendasMensais gerador = new GeradorRelatorioVendasMensais();

        String pagina = gerador.criarPagina(2022, 10);

        System.out.println( pagina );
    }

}