package algorithm.string;

import java.util.HashSet;

/**
 * 
 * @author michael
 *	
 *	ABCD ADF
 */
public class StringContain {
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "BG";
		System.out.println(stringContain(str1, str2));
		
		/*	方法二：使用位运算
		 * char[] strArr = str2.toCharArray();
		for(char item:strArr){
			System.out.println(item - 'A');
			System.out.println(1 << (item - 'A'));
		}*/
	}
	public static boolean stringContain(String str1,String str2){
		
		char[] str1Arr = str1.toCharArray();
		char[] str2Arr = str2.toCharArray();
		
		HashSet hs = new HashSet();
		for(char item:str1Arr){
			hs.add(item);
		}
		for(char item:str2Arr){
			if(!hs.contains(item))
				return false;
		}
		return true;
	}
}
