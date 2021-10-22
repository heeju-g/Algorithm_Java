package cos;

public class KSum {
    public int solution(int[] arr, int K) {
        int n = arr.length;				
        int answer = 0;
				for(int i = 0; i<n; i++)
				 for(int j = i + 1; j < n; ++j)
            for(int k = j + 1; k < n; ++k)
                if((arr[i]+arr[j]+arr[k])%K == 0)
                answer += 1;
        return answer;
    }
    public static void main(String[] args) {
        KSum sol = new KSum();
        int[] arr = {1, 2, 3, 4, 5};
        int K = 3;
        int ret = sol.solution(arr, K);


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
