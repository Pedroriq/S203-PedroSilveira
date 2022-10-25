package state.artigo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArtigoTest {

    @Test
    public void deveArtigoTransitarDeRascunhoAteAprovado() {
        GerenteDeSegurança segurança = GerenteDeSegurança.getInstance();

        Artigo artigo = new Artigo();

        segurança.setUsuarioCorrente("AUTOR");
        artigo.publicar();

        assertEquals("REVISANDO", artigo.getEstado());

        segurança.setUsuarioCorrente("MODERADOR");
        artigo.publicar();

        assertEquals("APROVADO", artigo.getEstado());

        artigo.getLogHistorico().forEach(System.out::println);
    }

}