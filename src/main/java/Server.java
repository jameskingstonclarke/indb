public class Server {

    private ExecutionEngine executionEngine;

    public Server(){
        this.executionEngine = new ExecutionEngine();
    }

    public void putItem(Item i){
        this.executionEngine.getItemStore().putItem(i);
    }

    public Result query(String queryString){
        return executionEngine.query(queryString);
    }
}
