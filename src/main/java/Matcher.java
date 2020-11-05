/**
 * A matcher compares 2 primitives to see if there is a match
 */
public class Matcher {
    private Candidate a;
    private Candidate b;

    public Matcher(Candidate a, Candidate b){
        this.a=a;
        this.b=b;
    }

    public boolean match(){
        return a.match(b);
    }
}
