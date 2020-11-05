/**
 * A candidate represents something that can be matched to
 */
public abstract class Candidate {


    public enum Type{
        WILDCARD,
        PRIMITIVE,
    }

    protected Type type;
    protected Primitive primitive;

    public Candidate(Type type){
        this.type = type;
    }

    public Candidate(Primitive primitive){
        this.type = Type.PRIMITIVE;
        this.primitive = primitive;
    }


    public abstract boolean match(Candidate other);
}
