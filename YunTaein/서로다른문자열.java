import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 서로다른문자열{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<String> strSet = new HashSet<>(); // 중복 문자열 허용 X
        String s = st.nextToken();

        for(int i = 0; i < s.length(); i++) { 
            for(int j = 0; j < s.length(); j++) {
                strSet.add(s.substring(i, j));
            }
        }
        System.out.println(strSet.size());
    }
}