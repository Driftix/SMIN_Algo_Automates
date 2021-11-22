public class Etat {
    private String identifiant;

    public Etat(String identifiant){
        this.identifiant = identifiant;
    }
    public Etat(Etat etat){
        this.identifiant = new Etat(etat).getIdentifiant();
    }

    public String getIdentifiant(){
        return this.identifiant;
    }
    public String toString(){
        return "Etat: " + this.getIdentifiant();
    }
    public boolean equals(Etat etat){
        return etat.getIdentifiant() == this.getIdentifiant() ? true: false;
    }
}
