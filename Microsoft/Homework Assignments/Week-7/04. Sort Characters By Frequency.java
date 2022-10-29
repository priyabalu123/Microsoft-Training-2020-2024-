class Solution{
public String frequencySort(String s) {
	// Count the occurence on each character
	HashMap<Character, Integer> cnt = new HashMap<>();
	for (char c : s.toCharArray()) {
		cnt.put(c, cnt.getOrDefault(c, 0) + 1);
	}
	
	// Sorting
	List<Character> chars = new ArrayList(cnt.keySet());
	Collections.sort(chars, (a, b) -> (cnt.get(b) - cnt.get(a)));

	// Build string
	StringBuilder sb = new StringBuilder();
	for (Object c : chars) {
		for (int i = 0; i < cnt.get(c); i++) {
			sb.append(c);
		}
	}
	return sb.toString();
}
}
//451. Sort Characters By Frequency
/*Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.*/
