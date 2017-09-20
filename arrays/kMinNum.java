package algorithm.arrays;

import java.util.Arrays;

/**
 * @author michael
 *	寻找最小的k个数
 */
public class kMinNum {
	public static void main(String args[]){
		String nums = "6570163";
		int n = 5;
		kMinNum(nums, n);
	}
	public static char[] kMinNum(String str,int n){
		char[] result;
		char[] numArr = str.toCharArray();
		//初始化n数组
		char[] minArr = new char[n];
		for(int i=0;i<n;i++){
			minArr[i] = numArr[i];
		}
		//利用选择排序获取最大值元素
		result = selectSort(minArr);
		for(int k=n;k<numArr.length;k++){
			if(numArr[k]<result[0]){
				result[0] = numArr[k];
				result = selectSort(result);
			}
		}
		System.out.println(Arrays.toString(result));
		return result;
	}
	//选择排序
	public static char[] selectSort(char[] chArr){
		for(int i=0;i<chArr.length-1;i++){
			int max = i;
			for(int j=i+1;j<chArr.length;j++){
				if(chArr[j]>chArr[max]){
					max = j;
				}
			}
			char temp = chArr[i];
			chArr[i] = chArr[max];
			chArr[max] = temp;
		}
		return chArr;
	}
}
