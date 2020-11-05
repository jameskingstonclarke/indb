import java.util.ArrayList;
import java.util.HashMap;

public class ItemStore {
    private ArrayList<Item> items;
    private HashMap<Query, Result> queryCache;

    public ItemStore(){
        this.items = new ArrayList<>();
    }

    @Override
    public String toString(){
        String s = "";
        for (Item item: items)
            s+=(item.toString()+"\n");
        return s;
    }

    public boolean putItem(Item item){
        this.items.add(item);
        return true;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }
}
