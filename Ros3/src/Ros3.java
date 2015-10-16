import java.util.Scanner;

public class Ros3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String DNA, rev;
		DNA = scan.nextLine();
		
		rev = reverse(DNA);
		for (int i=0; i<rev.length(); i++){
			switch(rev.charAt(i)){
				case 'A': rev = replace(rev, i, 'T'); break;
				case 'T': rev = replace(rev, i, 'A'); break;
				case 'C': rev = replace(rev, i, 'G'); break;
				case 'G': rev = replace(rev, i, 'C'); break;
			}
		}
		
		System.out.println(rev);
	}
	
	
	static String reverse(String str){
		String rev = new StringBuffer(str).reverse().toString();
		return rev;
	}
	
	static String replace(String str, int index, char replace){     
	    if(str==null){
	        return str;
	    }else if(index<0 || index>=str.length()){
	        return str;
	    }
	    char[] chars = str.toCharArray();
	    chars[index] = replace;
	    return String.valueOf(chars);       
	}

}
