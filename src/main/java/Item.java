import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * An item represents an in-memory store of some data
 */
public class Item extends Primitive{
    public HashMap<String, Candidate> data;

    public Item(){
        super();
        this.data = new HashMap<>();
    }

    public Item(String[] keys, Primitive[] values){
        this.data = new HashMap<>();
        for(int i=0;i<keys.length;i++){
            data.put(keys[i],new PrimitiveCandidate(values[i]));
        }
    }

    @Override
    public String toString(){
        String s= "";
        Iterator it = data.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            s+=pair.getKey()+":"+((Candidate)pair.getValue()).primitive.getData()+", ";
            it.remove(); // avoids a ConcurrentModificationException
        }
        return s;
    }

    public HashMap<String, Candidate> getData(){
        return this.data;
    }

    public ArrayList<Candidate> getCandidates(){
        return new ArrayList<Candidate>(this.data.values());
    }

    public int atomicity(){
        return this.data.size();
    }
}
