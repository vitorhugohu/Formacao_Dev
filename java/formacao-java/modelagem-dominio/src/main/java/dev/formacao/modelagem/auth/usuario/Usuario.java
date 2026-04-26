package dev.formacao.modelagem.auth.usuario;

import javax.xml.crypto.Data;

import dev.formacao.modelagem.shared.DataPassada;
import dev.formacao.modelagem.shared.Email;
import dev.formacao.modelagem.shared.Entidade;
import dev.formacao.modelagem.shared.IdUuid;
import dev.formacao.modelagem.shared.NomePessoa;

public class Usuario extends Entidade<IdUuid> {
    private NomePessoa nome;
    private Email email;
    private DataPassada dataCadastro;

    public Usuario(IdUuid id, NomePessoa nome, Email email, DataPassada dataCadastro) {
        super(id);
        this.nome = nome;
        this.email = email;
        this.dataCadastro = dataCadastro;
    }

    public NomePessoa getNome() {
        return nome;
    }

    public Email getEmail() {
        return email;
    }

    public DataPassada getDataCadastro() {
        return dataCadastro;
    }
}
