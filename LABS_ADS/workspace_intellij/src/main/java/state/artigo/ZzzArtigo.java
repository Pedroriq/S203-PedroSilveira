package state.artigo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ZzzArtigo {

    private String estado;

    private List<String> logHistorico = new ArrayList<>();

    public ZzzArtigo() {
        this.estado = "RASCUNHO";
    }

    public String getEstado() {
        return estado;
    }

    public List<String> getLogHistorico() {
        return logHistorico;
    }

    public void publicar(){
        GerenteDeSegurança segurança = GerenteDeSegurança.getInstance();

        if ("RASCUNHO".equals(this.estado)){
            if (segurança.ehUsuarioAutor()){
                this.estado = "REVISANDO";
                this.logHistorico.add("Transitado para REVISANDO em " + LocalDate.now());
                return;
            }else{
                throw new RuntimeException("Usuario não tem permissão para publicar");
            }
        }

        if ("REVISANDO".equals(this.estado)){
            if (segurança.ehUsuarioModerador()){
                this.estado = "APROVADO";
                this.logHistorico.add("Transitado para APROVADO em " + LocalDate.now());
                return;
            }else {
                throw new RuntimeException("Usuario não tem permissão para publicar");
            }
        }

        if ("APROVADO".equals(this.estado)){
            return;
        }
    }

    public void reprovar (){
        GerenteDeSegurança segurança = GerenteDeSegurança.getInstance();

        if ("RASCUNHO".equals(this.estado)){
            return;
        }

        if ("REVISANDO".equals(this.estado)){
            if (segurança.ehUsuarioModerador()){
                this.estado = "RASCUNHO";
                logHistorico.add("Transitado para RASCUNHO em" + LocalDate.now() );
                return;
            }else {
                throw new RuntimeException("Usuario não tem permissão para reprovar");
            }
        }

        if ("APROVADO".equals(this.estado)){
            return;
        }
    }
}