package algorithm.string;

/**
 * @author michael
 *	
 *	str2int "123" ---> 123
 *	
 *	注意：
 *	Character.digit(strArr[i],10);
 */
public class Str2Int {
	public static void main(String[] args) {
		String str = "123";
		
		System.out.println(str2Int(str));
	
		//方法二：有现成的方法
//		System.out.println(Integer.parseInt(str));
	}
	public static int str2Int(String str){
		char[] strArr = str.toCharArray();
		int re = 0;
		int i=0;
		int signal = 1;
		while(i<str.length()){
			if("-".equals(strArr[i]))
				signal = -1;
			System.out.println(Character.digit(strArr[i],10));
			re = re * 10 + Character.digit(strArr[i],10);
			i++;
		}
		return re;
	}
}
