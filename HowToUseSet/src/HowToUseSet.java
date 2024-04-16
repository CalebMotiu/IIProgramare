import java.util.HashSet;
import java.util.Scanner;

public class HowToUseSet {
	
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        String [] pair_left = new String[t];
	        String [] pair_right = new String[t];
	        
	        for (int i = 0; i < t; i++) {
	            pair_left[i] = s.next();
	            pair_right[i] = s.next();
	        }
	        s.close();
	        
	        HashSet<String>set=new HashSet<String>();
	        int count=0;
	        for (int i = 0; i < 5; i++) {
	        	String setOfStrings=pair_left[i]+","+pair_right[i];
	        	if (!set.contains(setOfStrings))
	        	{
	        		set.add(setOfStrings);
	        		count++;
	        	}
	        }
	        
	        System.out.println(count);
	 }
}
