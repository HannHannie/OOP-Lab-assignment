import java.io.*;

public class Question0d {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i=0; i<10; i++){
            int T= (i+1)*N;
            System.out.println(N+" x "+(i+1)+" = "+ T);
        }
        bufferedReader.close();
    }
}
