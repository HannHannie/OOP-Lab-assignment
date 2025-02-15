import java.util.*;
public class Question04{
	
   static Iterator func(ArrayList mylist){
      Iterator it=mylist.iterator();
      while(it.hasNext()){// dò xem còn phần tử nào tiếp theo k
//code here-------------------
        Object a= it.next(); //gán phần tử dò đc vào a
        if(a instanceof String)
        // nếu phần tử là String thì sẽ break, nếu không thì tiếp tục
//----------------------------
			break;
		}
      return it;
      
   }
   @SuppressWarnings({ "unchecked" })
   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      //số số nguyên đc thêm vào
      int n = sc.nextInt();
      //số số chuỗi đc thêm vào
      int m = sc.nextInt();
      for(int i = 0;i<n;i++){
         mylist.add(sc.nextInt());
      }
      // đánh dấu kết thúc phần tử số nguyên
      mylist.add("###");

      for(int i=0;i<m;i++){
         mylist.add(sc.next());
      }
      
      Iterator it=func(mylist); // nhận mylist làm đầu vào và dùng Interator duyệt danh sách
      while(it.hasNext()){
         Object element = it.next();
         System.out.println((String)element);
      }
   }
}
