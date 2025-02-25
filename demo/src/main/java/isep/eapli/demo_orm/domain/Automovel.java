package isep.eapli.demo_orm.domain;

public class Automovel {
    public String matricula;

    private int kms;

    public String matricula(){
        return this.matricula;
    }

    public void alterarNumeroKms(int novosKms){
        this.kms = novosKms;
    }

    public String toString(){
        return matricula();
    }
}
