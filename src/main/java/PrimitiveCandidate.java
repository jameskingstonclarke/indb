public class PrimitiveCandidate extends Candidate{
    public PrimitiveCandidate(Primitive primitive){
        super(Type.PRIMITIVE);
        this.primitive = primitive;
    }

    @Override
    public boolean match(Candidate other){
        return (primitive.getDataType().equals(other.primitive.getDataType())
        && primitive.getData().equals(other.primitive.getData()));
    }
}
