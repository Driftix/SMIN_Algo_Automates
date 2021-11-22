public class Transition {
    private Etat s;
    private String e;

    private Etat s2;
    public Transition(Etat s, String e, Etat s2){
        this.s = s;
        this.e = e;
        this.s2 = s2;
    }
    public String toString(){
        return "Etat source :" +s.getIdentifiant() + " Etiquette :" + e + " Etat cible :" + s2.getIdentifiant();
    }
    public boolean equals(Transition transition){
        return transition.getE() == this.getE() && transition.getS() == this.getS() && transition.getS2() == this.getS2() ? true : false;
    }

    public Etat getS() {
        return s;
    }

    public Etat getS2() {
        return s2;
    }

    public String getE() {
        return e;
    }
    public Transition getTransition(){
        return this;
    }
}
