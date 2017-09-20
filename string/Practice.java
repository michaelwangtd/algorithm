package algorithm.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Practice {
	public static void main(String[] args) {
		
		//1
//		String str = "ab*c*d";
//		System.out.println(leftMoveStar(str));
		
		//2
		String str = "aabbddd";
		countChar(str);
		
	}
	
	/*
	 * 查找字符串中字符出现次数
	 * hashmap
	 */
	public static void countChar(String str){
		char[] arr = str.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<arr.length;i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i], 0);
			}
			map.put(arr[i],map.get(arr[i]) + 1);
		}
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			char ch = (char)it.next();
			System.out.println(ch + ":" + map.get(ch));
		}
		
	}
	
	/*
	 * 1 ab*c* ---> ** abc
	 */
	public static String leftMoveStar(String str){
		char[] arr = str.toCharArray();
		int j = arr.length-1;
		int i = j;
		for(;j>=0;j--){
			if('*'!=arr[j]){
				arr[i] = arr[j];
				i--;
			}
		}
		for(;i>=0;i--){
			arr[i] = '*';
		}
		return new String(arr);
	}
	
}
