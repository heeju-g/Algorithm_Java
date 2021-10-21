package cos;

import java.util.Arrays;

public class ArraySort {
    public int[] solution(int[] arrA, int[] arrB) {
        int arrA_idx = 0, arrB_idx = 0;
        int arrA_len = arrA.length;
        int arrB_len = arrB.length;
        int answer[] = new int[arrA_len + arrB_len];
        int answer_idx = 0;
        //��ĭ1
        while(arrA_idx<arrA_len && arrB_idx<arrB_len){
            if(arrA[arrA_idx] < arrB[arrB_idx])
                answer[answer_idx++] = arrA[arrA_idx++];
            else
                answer[answer_idx++] = arrB[arrB_idx++];
        }
      //��ĭ2
        while(arrA_idx<arrA_len)
            answer[answer_idx++] = arrA[arrA_idx++];
      //��ĭ3
        while(arrB_idx<arrB_len)
            answer[answer_idx++] = arrB[arrB_idx++];
        return answer;
    }
    public static void main(String[] args) {
        ArraySort sol = new ArraySort();
        int[] arrA = {-2, 3, 5, 9};
        int[] arrB = {0, 1, 5};
        int[] ret = sol.solution(arrA, arrB);
 
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + Arrays.toString(ret) + " �Դϴ�.");
    }
}
