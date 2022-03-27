package Builder;

public class Gitara {
    private String marka;//1
    private String kolor;//2
    private String drewnoKorpus;//3
    private String drewnoPodstrunnica;//4
    private String przetworniki;//5
    private String klucze;//6
    private String struny;//7
    private String typGitary;//8

    Gitara marka(String marka){
        this.marka=marka;
        return this;
    }
    Gitara kolor(String kolor){
        this.kolor=kolor;
        return this;
    }
    Gitara drewnoKorpus(String drewnoKorpus){
        this.drewnoKorpus=drewnoKorpus;
        return this;
    }
    Gitara drewnoPodstrunnica(String drewnoPodstrunnica){
        this.drewnoPodstrunnica=drewnoPodstrunnica;
        return this;
    }
    Gitara przetworniki(String przetworniki){
        this.przetworniki=przetworniki;
        return this;
    }
    Gitara klucze(String klucze){
        this.klucze=klucze;
        return this;
    }
    Gitara struny(String struny){
        this.struny=struny;
        return this;
    }
    Gitara typGitary(String typGitary){
        this.typGitary=typGitary;
        return this;
    }


    public Gitara builder() {
        return this;
    }
    public String getSklad(){
        return "\nMarka gitary - "+this.marka+"\nrodzaj gitary - "+this.typGitary+"\nkolor gitary - "+this.kolor+"\ndrewno korpusu - "+this.drewnoKorpus+"\ndrewno podstrunnicy - "
        +this.drewnoPodstrunnica+"\nprzetworniki - "+this.przetworniki+"\nKlucze - "+this.klucze+"\nStruny - "+this.struny+"\n\n";
    }

}
