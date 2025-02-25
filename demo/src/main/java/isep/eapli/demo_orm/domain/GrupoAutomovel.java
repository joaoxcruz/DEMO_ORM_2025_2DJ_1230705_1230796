package isep.eapli.demo_orm.domain;

public class GrupoAutomovel {
    private String classe;

    public void alterarClasse(String novaClasse){
        this.classe = novaClasse;
    }

    public String toString(){
        return String.format("Classe = " + this.classe);
    }
}
