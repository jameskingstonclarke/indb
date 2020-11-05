import java.util.ArrayList;

public class Result {

    public enum Status{
        OK,
        FAIL
    }

    private Status status;
    private ArrayList<Item> data;

    public Result(Status status, ArrayList<Item> data){
        this.status = status;
        this.data = data;
    }

    @Override
    public String toString(){
        return this.status+":"+this.data;
    }

    public Status getStatus() {
        return status;
    }

    public ArrayList<Item> getData() {
        return data;
    }
}
