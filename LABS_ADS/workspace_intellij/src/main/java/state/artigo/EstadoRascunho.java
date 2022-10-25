package state.artigo;

public class EstadoRascunho implements Estado {

    private Artigo artigo;

    public EstadoRascunho(Artigo artigo){
        this.artigo = artigo;
    }

    @Override
    public void publicar(){

    }

    @Override
    public void reprovar(){

    }

}
