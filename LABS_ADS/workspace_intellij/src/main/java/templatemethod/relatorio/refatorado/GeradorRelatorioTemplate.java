package templatemethod.relatorio.refatorado;

import java.util.List;

public abstract class GeradorRelatorioTemplate {

    public String getCabecalho(){
        String cabecalho = "Empresa My" + '\n'
                + "---------";
        return cabecalho;
    }

    public String getRodape(){
        String rodape = "------------------------------" + '\n'
                + "* Propriedade particular - Uso confidencial";

        return rodape;
    }

    public abstract List<String> getConteudo();

    public String criarPagina (){
        String cabecalho = getCabecalho();
        List<String> conteudo = getConteudo();
        String rodape = getRodape();

        StringBuffer bufferPagina = new StringBuffer();
        bufferPagina.append( cabecalho );

        for (String linha : conteudo){
            bufferPagina.append('\n');
            bufferPagina.append( rodape );
        }

        bufferPagina.append('\n');
        bufferPagina.append( rodape );

        return bufferPagina.toString();
    }
}
