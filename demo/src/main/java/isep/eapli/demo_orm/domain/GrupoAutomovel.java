package isep.eapli.demo_orm.domain;

public class GrupoAutomovel {
    private String classe;
    private int nPortas;



    public void alterarNumeroPortas(int nPortas){
        this.nPortas = nPortas;
    }

    public void alterarClasse(String novaClasse){
        this.classe = novaClasse;
    }

    public String toString(){
        return String.format("Classe = " + this.classe);
    }
}
