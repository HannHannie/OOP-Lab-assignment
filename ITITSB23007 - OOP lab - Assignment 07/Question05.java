import java.util.*;

public class Question05 {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Question05(String magazine, String note) {
        magazineMap = getWordFrequencies(magazine);
        noteMap = getWordFrequencies(note);
    }
    
    private Map<String, Integer> getWordFrequencies(String data) {
        Map<String, Integer> f = new HashMap<>();
        String[] words = data.split("\\s+");
        for ( String w : words ) {
            if ( !f.containsKey(w) ) {
                f.put(w, 0);
            }
            f.put(w, f.get(w) + 1);
        }
        return f;
    }
    
    public boolean solve() {
        for (Map.Entry<String, Integer> e : noteMap.entrySet() ) {
            String word = e.getKey();
            if ( ! magazineMap.containsKey(word) || magazineMap.get(word) < e.getValue() ) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Question05 s = new Question05(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}