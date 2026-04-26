package dev.formacao.modelagem.anemica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UsuarioTest {
    
    @Test
    void teste1() {
        assertTrue(true);
    }

    @Test
    void teste2() {
        assertFalse(false);
    }

    @Test
    void deveCriarUsuarioComAtributosCorretos() {
        Usuario usuario = new Usuario();
        usuario.setId("1");
        usuario.setNome("João Silva");
        usuario.setEmail("js@gmail.com");
        usuario.setSenha("senha123");

        assertEquals("1", usuario.getId());
    }

    @Test
    void deveCriarUsuarioComAtributosErrados() {
        Usuario usuario = new Usuario();
        usuario.setId("   ");
        usuario.setNome("João Silva");
        usuario.setEmail("js");
        usuario.setSenha("123456");

        assertEquals("   ", usuario.getId());
    }

    @Test
    void deveCriarUsuariosIguais() {
        Usuario usuario1 = new Usuario();
        usuario1.setId("1");
        usuario1.setNome("João Silva");
        usuario1.setEmail("jsilva@empresa.com.br");

        Usuario usuario2 = new Usuario();
        usuario2.setId("1");
        usuario2.setNome("Maria Souza");
        usuario1.setEmail("jsilva@empresa.com.br");

        assertEquals(usuario1, usuario2);
    }

    @Test
    void deveCriarUsuariosDiferentes() {
        Usuario usuario1 = new Usuario();
        usuario1.setId("1");
        usuario1.setNome("João Silva");
        usuario1.setEmail("jsilva@empresa.com.br");

        Usuario usuario2 = new Usuario();
        usuario2.setId("2");
        usuario2.setNome("Maria");
        usuario1.setEmail("mariasilva@empresa.com.br");

        assertNotEquals(usuario1, usuario2);
    }

    @Test
    void deveCompararUsuarioComOutroObjeto() {
        Usuario usuario = new Usuario();
        usuario.setId("1");
        usuario.setNome("João Silva");

        String outroObjeto = "Não sou um usuário";

        assertNotEquals(usuario, outroObjeto);
    }

    @Test 
    void deveCompararUsuarioComNull() {
        Usuario usuario = new Usuario();
        usuario.setId("1");
        usuario.setNome("João Silva");

        assertNotEquals(usuario, null);
    }

    @Test
    void deveCompararUsuarioComEleMesmo() {
        Usuario usuario1 = new Usuario();
        usuario1.setId("1");
        usuario1.setNome("João Silva");

        Usuario usuario2 = usuario1;

        assertEquals(usuario1, usuario2);
    }

    @Test
    void deveCompararUsuarioComUsuarioComIdNull() {
        Usuario usuario1 = new Usuario();
        usuario1.setId(null);
        usuario1.setNome("João Silva");

        Usuario usuario2 = new Usuario();
        usuario2.setId("2");
        usuario2.setNome("Maria Souza");

        assertNotEquals(usuario1, usuario2);
    }

    @Test
    void deveCompararUsuariosComIdNull() {
        Usuario usuario1 = new Usuario();
        usuario1.setId(null);
        usuario1.setNome("João Silva");

        Usuario usuario2 = new Usuario();
        usuario2.setId(null);
        usuario2.setNome("Maria Souza");

        assertEquals(usuario1, usuario2);
    }

    @Test
    void deveGerarHashCodeCorreto() {
        Usuario usuario1 = new Usuario();
        usuario1.setId("1");
        usuario1.setNome("João Silva");

        Usuario usuario2 = new Usuario();
        usuario2.setId("1");
        usuario2.setNome("Maria");

        assertEquals(usuario1.hashCode(), usuario2.hashCode());
    }
}
