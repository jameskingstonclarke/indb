public class Primitive {

    public enum Type{
        NUMBER,
        BOOLEAN,
        STRING,
        ARRAY,
        ITEM
    }

    private Type dataType;
    private Object data;

    public Primitive(){

    }

    public Primitive(Type dataType, Object data){
        this.dataType = dataType;
        this.data = data;
    }

    @Override
    public String toString(){
        return this.data +":"+this.dataType;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Type getDataType() {
        return dataType;
    }

    public void setDataType(Type dataType) {
        this.dataType = dataType;
    }
}
