package algorithm.string;

import java.util.LinkedList;

/**
 * @author michael
 *	str n
 *	abcdef ---> defabc
 *
 *	Queue接口与List、Set同一级别，都是继承了Collection接口。LinkedList实现了Queue接 口。
 *	LinkedList queue = new LinkedList();
 *	queue.add();	尾部添加
 *	queue.remove();	头部删除
 */
public class StringRotate {
	public static void main(String args[]){
		String str = "abcdef";
		int n = 3;
		System.out.println(stringRotate(str,n));
	}
	public static String stringRotate(String str,int n){
		//create queue
		LinkedList queue = new LinkedList();
		for(int i=0;i<str.length();i++){
			queue.add(str.charAt(i));
		}
		if(str.length()==n)
			return str;
		for(int j=0;j<n;j++){
			char ch = (char)queue.remove();
			queue.add(ch);
		}
		return queue.toString();
	}
}
