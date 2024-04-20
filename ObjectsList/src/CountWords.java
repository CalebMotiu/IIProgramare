import java.util.LinkedList;
import java.util.TreeMap;

public class CountWords {
	
    public static TreeMap<String, Integer> countWords(String[] words) {
        TreeMap<String, Integer> wordCountMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
    
	public static void main(String[] args) {
    String[] inputWords = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
    TreeMap<String, Integer> wordCountMap = countWords(inputWords);

    System.out.println(wordCountMap);
	}
}
