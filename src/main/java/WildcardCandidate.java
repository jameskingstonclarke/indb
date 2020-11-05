public class WildcardCandidate extends Candidate{
    public WildcardCandidate(){
        super(Type.WILDCARD);
    }

    @Override
    public boolean match(Candidate other){
        return true;
    }
}
