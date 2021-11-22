
public class TransitionPonderee extends Transition{
    private int poid;

    public TransitionPonderee(Etat s, String e, Etat s2 , int poid) {
        super(s, e, s2);
        this.poid = poid;
    }

    public String toString(){
        return super.toString() + " Poid :" + this.poid;
    }
    public boolean equals(TransitionPonderee transitionPonderee){
        if(super.equals(super.getTransition())){
            return transitionPonderee.getPoid() == this.getPoid() ? true : false;
        }else{
            return false;
        }
    }

    public int getPoid() {
        return poid;
    }
}

