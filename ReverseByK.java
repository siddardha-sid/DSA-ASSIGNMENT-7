
public class ReverseByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(reverse("siddu",3));
	}
	public static String reverse(String s,int k) {
		int i=0;
		String reverse="";
		while(i<k) {
			reverse=s.charAt(i)+reverse;
			i++;
		}
		while(i<s.length()) {
			reverse=reverse+s.charAt(i);
			i++;
		}
		return reverse;
	}

}
