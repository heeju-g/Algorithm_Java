package sortingAndsearching;

import java.util.*;
class Sort01 {	
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer=new ArrayList<>();
		int[] tmp=arr.clone();
		Arrays.sort(tmp);
		for(int i=0; i<n; i++){
			if(arr[i]!=tmp[i]) answer.add(i+1);
		}
		return answer;
	}
	public static void main(String[] args){
		Sort01 S = new Sort01();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		for(int x : S.solution(n, arr)) System.out.print(x+" ");
		kb.close();
	}
}