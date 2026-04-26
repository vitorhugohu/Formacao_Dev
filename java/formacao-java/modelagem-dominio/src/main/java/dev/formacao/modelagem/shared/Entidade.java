package dev.formacao.modelagem.shared;

import java.util.Objects;

public abstract class Entidade<ID extends Id> {
    private final  ID id;

    protected Entidade(ID id) {
        if (id == null) {
            throw new IllegalArgumentException(Id.ID_NULO);
        }

        this.id = id;
    }

    public ID getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id.valor());
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Entidade<ID> other = (Entidade<ID>) obj;
        return id.equals(other.id);
    }

    
}
