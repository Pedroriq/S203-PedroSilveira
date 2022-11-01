package templatemethod.relatorio.refatorado;

import templatemethod.relatorio.intro.ServicoDeRelatorio;

import java.util.List;

public class GeradorRelatorioVendasMensais extends GeradorRelatorioTemplate{

    private Integer ano;
    private Integer mes;

    public GeradorRelatorioVendasMensais(Integer ano, Integer mes){
        this.ano = ano;
        this.mes = mes;
    }

    @Override
    public List<String> getConteudo() {
        List <String> vendasMensal = ServicoDeRelatorio.getInstance().getVendasMensal(ano, mes);
        return vendasMensal;
    }
}
