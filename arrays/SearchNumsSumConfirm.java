package algorithm.arrays;

import java.util.HashMap;

public class SearchNumsSumConfirm {
	public static void main(String[] args) {
		int[] arr = {3,2,6,5,7,9};
		int sum = 10;
		searchIndexSumConfirm(arr, sum);
	}
	public static void searchIndexSumConfirm(int[] arr,int sum){
		int idx1 = 0;
		int idx2 = 0;
		//初始化散列表
		HashMap<Integer,Integer> map = new HashMap();
		for(int i=0;i<arr.length;i++){
			map.put(arr[i], i);
		}
		for(int j=0;j<arr.length;j++){
			if(map.containsKey(sum-arr[j])){
				idx2 = map.get(sum-arr[j]);
				idx1 = j;
				break;
			}
		}
		System.out.println(idx1 + ":" + arr[idx1]);
		System.out.println(idx2 + ":" + arr[idx2]);
	}
}
