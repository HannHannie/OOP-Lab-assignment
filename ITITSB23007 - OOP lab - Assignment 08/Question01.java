    class MyPair<T, U>{
    public final T Fst;
    public final U Snd;
    public MyPair(T fst, U snd){
        this.Fst=fst;
        this.Snd=snd;
    }
    public String toString(){
        return "("+ Fst+", "+ Snd+")";
    }
    //Question H ==================
    public MyPair<U, T> Swap(){
        return new MyPair<>(Snd, Fst);
    }
    //=============================
}
public class Question01{
 public static void main(String[] args) {
    //question A (with emty Main method)
        //the code stills run without error
    //Question B
    MyPair<String, Integer> myPair= new MyPair<>("Anders", 13);
    System.out.println(myPair);
    //Question C
    MyPair<String, Double> myPair1= new MyPair<>("Phoenix", 39.7);
    System.out.println(myPair1);
    //Question D
        //This should not be allowed because Java enforces strict type safety with generics
    //Question E
    @SuppressWarnings("unchecked")
    MyPair<String, Integer>[] grade = new MyPair[5];
    grade[0]= new MyPair<>("A", 10);
    grade[1]= new MyPair<>("B", 11);
    grade[2]= new MyPair<>("C", 12);
    //Question F
    for (MyPair<String, Integer> grades:grade){
        System.out.println(grades);
    }
    //the values of those array elements that we did not assign anything to are "null"
    //Question G
    MyPair<Integer, Integer> apm= new MyPair<>(5, 10);
    MyPair<MyPair<Integer, Integer>, String> appointment= new MyPair<>(apm, "D");
    System.out.println(appointment);
    System.out.println(appointment.Fst.Snd); //Output: 10
    //Question H
    MyPair<String, Integer> H= new MyPair<>("E", 20);
    MyPair<Integer, String> swap1= H.Swap();
    System.out.println(swap1);
 }
}