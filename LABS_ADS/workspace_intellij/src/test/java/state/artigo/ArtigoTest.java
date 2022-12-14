package state.artigo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArtigoTest {

    @Test
    public void deveArtigoTransitarDeRascunhoAteAprovado() {
        GerenteDeSeguran├ža seguranca = GerenteDeSeguran├ža.getInstance();

        Artigo artigo = new Artigo();

        seguranca.setUsuarioCorrente("AUTOR");
        artigo.onPublicar();

        assertTrue(artigo.getEstado() instanceof EstadoRevisando);

        seguranca.setUsuarioCorrente("MODERADOR");
        artigo.onPublicar();

        assertTrue(artigo.getEstado() instanceof EstadoAprovado);
    }

}