import java.io.BufferedReader;
import java.io.File;
import java.nio.*;
import java.nio.charset.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class RNAintoProtein {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		List<String> tempList;
		/*File file = new File("./table.txt");
		BufferedReader fileRead = new BufferedReader(new FileReader(file));*/
		
		Path path = Paths.get("C:/WORK/TestWS/RNAintoProtein/bin", "table.txt");

	    Charset cs = Charset.forName("Windows-1251");
		tempList = Files.readAllLines(path, cs);
		
		for (int i=0; i<tempList.size(); i++){
			System.out.println(tempList.get(i));
		}
		
		/*
		
		RNA = scan.nextLine();
		
		String[][] tabl;
		
		
		for (int i=0; i<RNA.length(); i+=3){
			String rep;
			rep = RNA.substring(i, i+3);
			
			
			rep = rep.replace("GCU", "A");
			rep = rep.replace("GCC", "A");
			rep = rep.replace("GCA", "A");
			rep = rep.replace("GCG", "A");
			
			rep = rep.replace("CGU", "R");
			rep = rep.replace("CGC", "R");
			rep = rep.replace("CGA", "R");
			rep = rep.replace("CGG", "R");
			rep = rep.replace("AGA", "R");
			rep = rep.replace("AGG", "R");
			
			rep = rep.replace("AAU", "N");
			rep = rep.replace("AAC", "N");

			rep = rep.replace("GAU", "D");
			rep = rep.replace("GAC", "D");

			rep = rep.replace("UGU", "C");
			rep = rep.replace("UGC", "C");
			
			rep = rep.replace("CAA", "Q");
			rep = rep.replace("CAG", "Q");
			
			rep = rep.replace("GAA", "E");
			rep = rep.replace("GAG", "E");
			
			rep = rep.replace("GGU", "G");
			rep = rep.replace("GGC", "G");
			rep = rep.replace("GGA", "G");
			rep = rep.replace("GGG", "G");
			
			rep = rep.replace("CAU", "H");
			rep = rep.replace("CAC", "H");
			
			rep = rep.replace("AUU", "I");
			rep = rep.replace("AUC", "I");
			rep = rep.replace("AUA", "I");
			
			rep = rep.replace("AUU", "I");
			rep = rep.replace("AUC", "I");
			rep = rep.replace("AUA", "I");

			rep = rep.replace("AUG", "M");
			
			rep = rep.replace("ACU", "T");
			rep = rep.replace("ACC", "T");
			rep = rep.replace("ACA", "T");
			rep = rep.replace("ACG", "T");
			
			rep = rep.replace("AAU", "N");
			rep = rep.replace("AAC", "N");
			
			rep = rep.replace("AAA", "K");
			rep = rep.replace("AAG", "K");
			
			rep = rep.replace("AGU", "S");
			rep = rep.replace("AGC", "S");
			rep = rep.replace("UCU", "S");
			rep = rep.replace("UCC", "S");
			rep = rep.replace("UCA", "S");
			rep = rep.replace("UCG", "S");
			
			rep = rep.replace("UUU", "F");
			rep = rep.replace("UUC", "F");
			
			rep = rep.replace("UUA", "L");
			rep = rep.replace("UUG", "L");
			rep = rep.replace("CUU", "L");
			rep = rep.replace("CUC", "L");
			rep = rep.replace("CUA", "L");
			rep = rep.replace("CUG", "L");
			
			rep = rep.replace("CCU", "P");
			rep = rep.replace("CCC", "P");
			rep = rep.replace("CCA", "P");
			rep = rep.replace("CCG", "P");
			
			rep = rep.replace("UAU", "Y");
			rep = rep.replace("UAC", "Y");
			
			rep = rep.replace("UAA", "");
			rep = rep.replace("UAG", "");
			rep = rep.replace("UGA", "");
			
			rep = rep.replace("UGG", "W");
			
			rep = rep.replace("GUU", "V");
			rep = rep.replace("GUC", "V");
			rep = rep.replace("GUA", "V");
			rep = rep.replace("GUG", "V");
			
			protein = protein.concat(rep);
			if (rep.isEmpty()){
				break;
			}
			if (rep.length()>2){
				System.out.println("Warning!!!!!"+rep);
			}
		}
		
		System.out.println(protein);
		
		fileRead.close();
		*/
	}

}
