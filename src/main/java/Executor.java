/**
 * An executor's job is to execute the query in the most efficient way.
 * It first checks if the query has been cached.
 * If not, check to see if it can split up the query into sub-queries, check if these have been cached.
 * For each sub-query if no cache exists, execute the sub-query.
 */
public class Executor {
    private ExecutionEngine executionEngine;
    private Query query;

    public Executor(ExecutionEngine executionEngine, Query query){
        this.executionEngine = executionEngine;
        this.query = query;
    }

    public Result exec(){
        // to execute the query, first check if the query has been cached before
        if(executionEngine.getQueryCache().containsKey(this.query))
            return executionEngine.getQueryCache().get(this.query);
        this.executionEngine.flushCache();
        return this.query.execute();
    }
}
