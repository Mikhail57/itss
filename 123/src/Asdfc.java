import java.util.Scanner;
public class Asdfc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in = new Scanner (System.in);
	 String x1=in.nextLine();
     int l=x1.length();
     int c[];
     for (i=0;l;i++)
     {
      if (x1.charAt(i)=="A")
      {
    	c[1]++;
      };
     	  if (x1.charAt(i)=="C")
      {
    	c[2]++;
      }; 
      	  if (x1.charAt(i)=="G")
      {
    	c[3]++;
      };
      if (x1.charAt(i)=="T")
      {
    	c[4]++;
      }; 
  	};
     System.out.println(c[1],c[2],c[3],c[4]);
	}
