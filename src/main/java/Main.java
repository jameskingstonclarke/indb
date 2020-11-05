import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        System.out.println(Information.info());


        Server s = new Server();
        Item i = new Item(new String[]{"first"}, new Primitive[]{new Primitive(Primitive.Type.NUMBER, 1)});
        System.out.println(i);
        s.putItem(i);

        Result result = s.query("");
        result.getData().forEach((item)->System.out.println(item));

        // create a new InDB instance

//        InDB indb = new InDB("localhost:8080/testdb");
//        indb.query("document {name:int, age:num}");
//        indb.query("put {name:*, age:*}");
//        indb.query("update {name:*} {age:19}");
//        indb.query("get {name:*}");
    }
}
