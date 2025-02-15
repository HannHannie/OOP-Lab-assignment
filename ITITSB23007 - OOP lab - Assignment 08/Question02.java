import java.util.*;
class MyList {
    private List<String> values;
    //constructor
    public MyList (){
        values= new ArrayList<>();
    }
    void add (String value){
        values.add(value);
    }
    void remove(String value){
        values.remove(value);
    }
    //getter
    public List <String> getValues(){
        return values;
    }
}
public class Question02 {
    public static void main(String[] args) {
        MyList myList= new MyList();
        myList.add("Value 1");
        myList.add("Value 2");
        for (String a: myList.getValues()){
        System.out.println(a);
    }
}
}
