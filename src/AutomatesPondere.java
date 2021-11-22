import java.util.*;

public class AutomatesPondere {
    /*private TreeSet<Etat> S;
    private Etat I;
    private TreeSet<Etat> F;
    private TreeSet<Transition> T;
    private TreeSet<String> A;*/

    private Set <String> A ;
    private Map<Etat, List<TransitionPonderee>> auto ;
    private Set<Etat> F ;
    private Etat I ;
    public AutomatesPondere(Set<Etat> S, Etat I, Set<Etat> F, Set<TransitionPonderee> T ) {
        ArrayList<TransitionPonderee> transitionPondereetemp;

        for(Etat etat : S){
            transitionPondereetemp = new ArrayList<>();
            for(TransitionPonderee transitionPonderee : T){
                if(transitionPonderee.getS().equals(etat)){
                    transitionPondereetemp.add(transitionPonderee);
                }
            }
            auto.put(etat,transitionPondereetemp);
        }
        this.I = I;
        this.F = F;
    }
    public void calculAlphabet(){

    }
}
