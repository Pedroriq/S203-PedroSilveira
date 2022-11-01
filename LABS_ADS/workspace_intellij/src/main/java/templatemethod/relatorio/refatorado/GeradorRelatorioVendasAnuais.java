package templatemethod.relatorio.refatorado;

import com.sun.jdi.event.StepEvent;
import templatemethod.relatorio.intro.ServicoDeRelatorio;

import java.util.List;

public class GeradorRelatorioVendasAnuais extends GeradorRelatorioTemplate{

    private Integer ano;

    public GeradorRelatorioVendasAnuais(Integer ano){
        this.ano = ano;
    }


    @Override
    public List<String> getConteudo() {
        List <String> vendasAnual = ServicoDeRelatorio.getInstance().getVendasAnual(this.ano);
        return vendasAnual;
    }
}
