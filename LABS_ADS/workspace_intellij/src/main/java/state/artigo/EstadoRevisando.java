package state.artigo;

import java.time.LocalDate;

public class EstadoRevisando implements Estado{

    private Artigo artigo;

    public EstadoRevisando(Artigo artigo) {
        this.artigo = artigo;
    }

    @Override
    public void publicar(){
        GerenteDeSegurança seguranca = GerenteDeSegurança.getInstance();

        if(seguranca.ehUsuarioAutor()){
            this.artigo.transitarEstadoPara(new EstadoRevisando(artigo));
            this.artigo.getLogHistorico().add("Transitando para REVISANDO em " + LocalDate.now());
            return;
        }else{
            throw new RuntimeException("Usuario não tem permissão para publicar");
        }
    }

    @Override
    public void reprovar() {
        GerenteDeSegurança seguranca = GerenteDeSegurança.getInstance();

        if(seguranca.ehUsuarioModerador()){
            this.artigo.transitarEstadoPara(new EstadoRascunho(artigo));
            this.artigo.getLogHistorico().add("Transitando para RASCUNHO em " + LocalDate.now());
            return;
        }else{
            throw new RuntimeException("Usuario não tem permissão para reprovar");
        }
    }


}
