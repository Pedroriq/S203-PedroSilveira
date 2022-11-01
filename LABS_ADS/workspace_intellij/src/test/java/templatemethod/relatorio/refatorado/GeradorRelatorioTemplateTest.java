package templatemethod.relatorio.refatorado;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeradorRelatorioTemplateTest {

    @Test
    public void deveGerarRelatorioVendasMensaisPeloTemplate(){

        GeradorRelatorioTemplate template = new GeradorRelatorioVendasMensais(2022, 10);

        String pagina = template.criarPagina();

        System.out.println( pagina );
    }

    @Test
    public void deveGerarRelatorioVendasAnuaisPeloTemplate(){

        GeradorRelatorioTemplate template = new GeradorRelatorioVendasAnuais(2022);

        String pagina = template.criarPagina();

        System.out.println( pagina );
    }

}