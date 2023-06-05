package in.ineuron.in;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
	

	    public static int firstUniqChar(String s) {
	    
	        Map<Character, Integer> countMap = new HashMap<>();

	       
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
	        }

	        // Iterate through the string again and find the first non-repeating character
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (countMap.get(c) == 1) {
	                return i;
	            }
	        }

	      
	        return -1;
	    }

	    public static void main(String[] args) {
	        String s1 = "leetcode";
	        System.out.println("First non-repeating character index in '" + s1 + "': " + firstUniqChar(s1));

	        String s2 = "loveleetcode";
	        System.out.println("First non-repeating character index in '" + s2 + "': " + firstUniqChar(s2));

	        String s3 = "aabb";
	        System.out.println("First non-repeating character index in '" + s3 + "': " + firstUniqChar(s3));
	    }
	}


