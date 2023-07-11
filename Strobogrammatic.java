import java.util.HashMap;
import java.util.Map;

public class Strobogrammatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(isStrobogrammatic("691869"));
	}
	public static boolean isStrobogrammatic(String s) {
		Map<Character,Character> m=new HashMap<>();
		m.put('0', '0');
		m.put('1', '1');
		m.put('8', '8');
		m.put('6', '9');
		m.put('9', '6');
		int leftchar=0;
		int rightchar=s.length()-1;
		while(leftchar<=rightchar) {
			if(!m.containsKey(s.charAt(leftchar)) && !m.containsKey(s.charAt(rightchar))) {
				return false;
			}
			if(m.get(s.charAt(leftchar))!=s.charAt(rightchar)) {
				return false;
			}
			leftchar++;
			rightchar--;
		}
		return true;
		
	}

}
