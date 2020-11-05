import java.util.HashMap;

public class ExecutionEngine {
    private ItemStore itemStore;
    private HashMap<Query, Result> queryCache;

    public ExecutionEngine(){
        this.itemStore = new ItemStore();
        this.queryCache = new HashMap<>();
    }

    public Result query(String queryString){
        // first construct a query and an executor
        Query query = new Query(this, queryString);
        Executor executor = new Executor(this, query);
        return executor.exec();
    }

    public HashMap<Query, Result> getQueryCache(){
        return this.queryCache;
    }

    public ItemStore getItemStore(){
        return this.itemStore;
    }

    /**
     * Called when the item store has been modified
     */
    public void flushCache(){
        // this should be more advanced but for now clear the entire cache
        this.queryCache.clear();
    }
}
