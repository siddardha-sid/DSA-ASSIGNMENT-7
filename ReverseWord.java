import java.util.LinkedList;
import java.util.Queue;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words="hello boss";
		String[] s= words.split(" ");
System.out.println(reverse(s));;
	}
	public static String reverse(String[] s) {
		String swing="";
		String duplicate="";
		
		for(int i=0;i<s.length;i++) {
			for(int j=s[i].length()-1;j>=0;j--) {
				swing=swing+s[i].charAt(j);
			}
			duplicate=swing+" ";
		}
		return duplicate;
		
	}

}
