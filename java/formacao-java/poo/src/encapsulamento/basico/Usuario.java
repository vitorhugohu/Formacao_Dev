package encapsulamento.basico;

import java.util.UUID;

public class Usuario {
    private final UUID id;
    private String nome;
    private String email;

    public Usuario() {
        this(null);
    }

    public Usuario(UUID id) {
        this.id = (id != null) ? id : UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}