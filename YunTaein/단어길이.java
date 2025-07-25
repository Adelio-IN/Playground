import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 단어길이 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int [] arr =  new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()); // 찾을 수 개수

        int answer;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int checkNum = Integer.parseInt(st.nextToken());
            answer = 0;

            int start = 0;
            int end = arr.length - 1;
            while(start <= end) {
                int mid = (start + end) / 2;
                if(checkNum == arr[mid]) {
                    answer =  1;
                    break;
                }
                else if(checkNum > arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            System.out.println(answer);
        }
    }
}