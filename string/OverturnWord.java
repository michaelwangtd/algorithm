package algorithm.string;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 
 * @author michael
 *
 *	str
 *	I am a student. ---> student. a am I
 */

public class OverturnWord {
	public static void main(String args[]){
		String str = "I am a student.";
		System.out.println(overturnWord(str));
	}
	
	public static String overturnWord(String str){
		String[] strArr = str.split(" ");
		LinkedList stack = new LinkedList();
		
		for(String word:strArr){
			stack.addFirst(word);
		}
		
		String result = "";
		while(!stack.isEmpty()){
			result += (String)stack.remove() + " ";
		}
		return result;
	}
}
