package isep.eapli.demo_orm.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class GrupoAutomovel {
    private String classe;
    private int nPortas;
    @Id
    private Long id;


    public void alterarNumeroPortas(int nPortas){
        this.nPortas = nPortas;
    }

    public void alterarClasse(String novaClasse){
        this.classe = novaClasse;
    }

    public String toString(){
        return String.format("Classe = " + this.classe);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
