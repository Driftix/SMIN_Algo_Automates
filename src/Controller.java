import java.util.LinkedList;

public class Controller {
    public static void main(String [] args) {
        Transition transition1 = new Transition(new Etat("etatdebut"), "transition1", new Etat("etatfin"));
        Transition transition2 = new Transition(new Etat("etatdebut"), "transition2", new Etat("etatfin"));
        TransitionPonderee transition3 = new TransitionPonderee(new Etat("etatdebut"), "transition1", new Etat("etatfin"), 5);
        LinkedList<Transition> transitions = new LinkedList<Transition>();
        transitions.add(transition1);
        transitions.add(transition2);
        transitions.add(transition3);
        for(Transition t : transitions){
            System.out.println(t.toString());
        }
    }
}
