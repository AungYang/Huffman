import java.util.HashMap;
import java.util.Map;

public class Hashy {

	
	public static void main(String[] args) {
		String input = "AAAAABBAHHBCBGCCC";
		char[] input2 = input.toCharArray();
		
//		make counter
		Map<Character, Integer> freqCounter = new HashMap<>();
		
	
//		loop through char array
		for (char c : input2) {
		
			if (!freqCounter.containsKey(c)) {
				freqCounter.put(c, 1);
			} else {
				freqCounter.put(c, freqCounter.get(c)+1);
			}
		}
		System.out.println(freqCounter);
				
				
	}	
	
	
}

/*
 * 
// *key sets
 * for (char c : freqCounter.keySet()) {
			System.out.println(c);
		}
		
 //		print keys and values
		for (char c : freqCounter.keySet()) {
			System.out.println(c);
		}
	
		for (int x : freqCounter.values()) {
			System.out.println(x);
		}
	
//		increment by 1
		freqCounter.put('a', freqCounter.get('a')+1);
		
		
 */
