import java.util.*;


public class Question01 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int N= scan.nextInt();
        LinkedList<Integer> list= new LinkedList<>();
        for (int i=0; i<N; i++){
            list.add(scan.nextInt());
        }        
        
        int Q= scan.nextInt();
        for(int i=0; i<Q; i++){
            String action= scan.next();
            if (action.equals("Insert")){
                list.add(scan.nextInt(),scan.nextInt());
            }
            else {
                list.remove(scan.nextInt());
            }
        }
        
        for (Integer num: list){
            System.out.print(num+ " ");
        }
        scan.close();
    }
}
