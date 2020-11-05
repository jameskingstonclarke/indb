import java.util.ArrayList;

public class Query {

    private ExecutionEngine executionEngine;
    private String queryString;
    /**
     * A query is made up of a set of candidates
     */
    private ArrayList<Candidate> candidates;

    public Query(ExecutionEngine executionEngine, String queryString){
        this.executionEngine = executionEngine;
        this.queryString = queryString;
        this.candidates = new ArrayList<>();


        this.candidates.add(new WildcardCandidate());
    }

    @Override
    public String toString(){
        return this.queryString;
    }

    public String getQueryString(){
        return this.queryString;
    }

    public Result execute(){
        ArrayList<Item> items = new ArrayList<>();
        for(Item item : this.executionEngine.getItemStore().getItems()){
            if(matchItem(item))
                items.add(item);
        }
        return new Result(Result.Status.OK, items);
    }

    private boolean matchItem(Item item){
        if(this.candidates.size()<=item.atomicity()){
            for(int i=0;i<this.candidates.size();i++){
                Matcher matcher = new Matcher(this.candidates.get(i), item.getCandidates().get(i));
                boolean match = matcher.match();
                if(!match)
                    return false;
            }
        }
        return true;
    }
}
