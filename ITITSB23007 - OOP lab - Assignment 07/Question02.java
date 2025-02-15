//Complete this code or write your own from scratch
import java.util.*;

class Solution{
	public static void main(String []argh)
	{
        Map<String, Integer> phonebook = new HashMap<>();
		Scanner in = new Scanner(System.in);
        //line 1
		int n=in.nextInt();
		in.nextLine();
        //line 2 3
		for(int i=0;i<n;i++)
		{   
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            phonebook.put(name, phone);
		}
		while(in.hasNext())
		{
            //search name
			String s =in.nextLine();
            if (phonebook.containsKey(s)){
                System.out.println(s+"="+phonebook.get(s));
            }
            else{
                System.out.println("Not found");
            }
		}
		in.close();
	}
}



