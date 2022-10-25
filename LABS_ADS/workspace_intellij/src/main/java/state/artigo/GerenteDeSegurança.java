package state.artigo;
public class GerenteDeSegurança {

    private static GerenteDeSegurança instance;

    private GerenteDeSegurança(){
    }

    public static GerenteDeSegurança getInstance(){
        if (instance == null){
            instance = new GerenteDeSegurança();
        }
        return instance;
    }

    private String usuarioCorrente;

    public String getUsuarioCorrente() {
        return usuarioCorrente;
    }

    public void setUsuarioCorrente(String usuarioCorrente){
        this.usuarioCorrente = usuarioCorrente;
    }

    public boolean ehUsuarioModerador(){
        return "MODERADOR".equals(this.usuarioCorrente);
    }

    public boolean ehUsuarioAutor(){
        return "AUTOR".equals(this.usuarioCorrente);
    }
}