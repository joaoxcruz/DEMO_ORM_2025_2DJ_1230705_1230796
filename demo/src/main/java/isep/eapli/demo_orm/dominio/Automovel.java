package isep.eapli.demo_orm.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Automovel {
    @Id
    private String matricula;

    private int kms;

    public Automovel(String matricula, int kms) {
        this.matricula = matricula;
        this.kms = kms;
    }

    public Automovel() {

    }

    public String matricula(){
        return this.matricula;
    }

    public void alterarNumeroKms(int novosKms){
        this.kms = novosKms;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return "Automovel{" +
                "matricula='" + matricula + '\'' +
                ", kms=" + kms +
                '}';
    }
}