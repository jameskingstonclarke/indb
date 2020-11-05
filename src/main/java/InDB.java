public class InDB {

    private String location;

    public InDB(String location){
        this.location = location;
    }

    /**
     * Query the DB
     * @param queryString
     * @return
     */
    public Result query(String queryString){
        return null;
    }

    public String getLocation(){
        return this.location;
    }
}
