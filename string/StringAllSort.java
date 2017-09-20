package algorithm.string;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author michael
 *	字符串全排列:abc ---> abc、acb、bac、bca、cab、cba
 *	
 *	字典序排列:两寻找、一交换、一反转
 */
public class StringAllSort {
	public static void main(String[] args) {
//		String test = "215430";
		String test = "abc";
//		System.out.println(getNextDicOrder(test));
		
		System.out.println(test);
		String result = "";
		while((result = getNextDicOrder(test))!=null){
			test = result;
			System.out.println(result);
		}
	}
	
	public static String getNextDicOrder(String str){
		char[] strArr = str.toCharArray();
		int i = 0;
		for(i=str.length()-2;i>=0 && strArr[i]>strArr[i+1];i--){
			
		}
		if(i<0){//排列已经完成
			return null;
		}
		int k = 0;
		for(k=str.length()-1;k>i && strArr[k]<=strArr[i];k--){
			
		}
		//交换i、k元素
		char temp = strArr[i];
		strArr[i] = strArr[k];
		strArr[k] = temp;
		//反转
		char[] reArr = rotate(strArr,i+1,str.length()-1);
		return new String(reArr);
	}
	public static char[] rotate(char[] arr,int begin,int end){
		LinkedList stack = new LinkedList();
		
		for(int i=begin;i<=end;i++){
			stack.addFirst(arr[i]);
		}
		for(int j=begin;j<=end;j++){
			arr[j] = (char)stack.remove();
		}
		return arr;
	}
}
