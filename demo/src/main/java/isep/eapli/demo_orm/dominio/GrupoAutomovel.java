package isep.eapli.demo_orm.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class GrupoAutomovel {
    private String classe;
    private int nPortas;
    @Id
    private String id;

    public GrupoAutomovel(String nome, int portas, String classe) {
        this.id = nome;
        this.classe = classe;
        this.nPortas = portas;

    }

    public GrupoAutomovel() {

    }


    public void alterarNumeroPortas(int nPortas){
        this.nPortas = nPortas;
    }

    public void alterarClasse(String novaClasse){
        this.classe = novaClasse;
    }

    public String toString(){
        return String.format("Classe = " + this.classe);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
