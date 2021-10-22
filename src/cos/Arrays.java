package cos;

public class Arrays {
	   int[] func_a(int[] arr) {
	        int length = arr.length;
	        int[] ret = new int[length*2];
	        for(int i = 0; i < length; i++)
	            ret[i + length] = ret[i] = arr[i];
	        return ret;
	    }
	    
	    boolean func_b(int[] first, int[] second){
	        int[] counter = new int[1001];
	        for(int i = 0; i < first.length; i++){
	            counter[first[i]]++;
	            counter[second[i]]--;
	        }
	        for(int i = 0; i < 1001; i++)
	            if(counter[i] != 0)
	                return false;
	        return true;
	    }
	    
	    boolean func_c(int[] first, int[] second){
	    int length = second.length;
	    for(int i = 0; i < length; i++){
	        int j;
	        for(j = 0; j < length; j++)
	            if(first[i + j] != second[j])
	                break;
	        if(j == length)
	            return true;
	    }
	    return false;
	}

	    public boolean solution(int[] arrA, int[] arrB) {
	        if(arrA.length != arrB.length)
	            return false;
	        if(func_b(arrA,arrB)) {
	            int[] arrAtemp = func_a(arrA);
	            if(func_c(arrAtemp,arrB))
	                return true;
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        Arrays sol = new Arrays();
	        int[] arrA1 = {1, 2, 3, 4};
	        int[] arrB1 = {3, 4, 1, 2};
	        boolean ret1 = sol.solution(arrA1, arrB1);

	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

	        int[] arrA2 = {1, 2, 3, 4};
	        int[] arrB2 = {1, 4, 2, 3};
	        boolean ret2 = sol.solution(arrA2, arrB2);

	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
	    }
}
