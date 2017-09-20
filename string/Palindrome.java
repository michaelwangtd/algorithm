package algorithm.string;

/**
 * @author michael
 *	“回文”相关操作
 */
class Node{
	public Node(String data){
		this.data = data;
	}
	String data;
	Node next;
}
public class Palindrome {
	public static void main(String[] args) {
//		String str = "zlsslz";
		String str = "zlsaslz";
		
		Node head = new Node("a");
		head.next = new Node("b");
		head.next.next = new Node("b");
		head.next.next.next = new Node("a");
		
		String test = "aabcbbabb";
	}
	//最长“回文”子串长度（中心扩展法）
	public static int maxNumOfSubHuiWen(String str){
		char[] arr = str.toCharArray();
		int mn = 0;
		
		for(int i=0;i<arr.length;i++){
			int c = 0;
			for(int m=0;i-m>=0 && i+m+1<arr.length;m++){
				if(arr[i-m]==arr[i+m +1])
					c = m*2 +2;
				else break;
			}
			if(c>mn) mn = c;
			for(int n=0;i-n>=0 && i+n<arr.length;n++){
				if(arr[i-n]==arr[i+n])
					c = 1 + (n*2);
				else break;
			}
			if(c>mn) mn = c;
		}
		return mn;
	}
	
	//3 判断栈是否为“回文”
	public static boolean isHuiWenStack(){
		/*
		 * 将栈倒序生成新栈，同时比较两个栈对应元素
		 */
		return true;
	}
	
	//2 判断单向链表是否为“回文”
	public static boolean isHuiWenSingleLinkedList(Node head){
		Node rehead = reverseLinkedList(head);
		while(head!=null && rehead!=null){
			if(head.data!=rehead.data)
				return false;
			head = head.next;
			rehead = rehead.next;
		}
		return true;
	}
	//单链表反转
	public static Node reverseLinkedList(Node head){
		if(head==null || head.next==null){
			return head;
		}
		Node prev = reverseLinkedList(head.next);
		head.next.next = head;
		head.next = null;
		return prev;
	}
	
	//1 判断字符串是否为“回文”
	public static boolean isHuiWen(String str){
		char[] arr = str.toCharArray();
		int start = 0;
		int end = arr.length -1;
		while(start < end){
			if(arr[start]!=arr[end])
				return false;
			start--;
			end--;
		}
		return true;
	}
}
