import java.io.*;
import java.util.*;

/* 2. 대소문자 변환
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 *
 * 예시 입력
 * StuDY
 *
 * 예시 출력
 * sTUdy
 * */

public class Main {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for (Character c : str.toCharArray()) {
            if (c < 97) { // 문자가 대문자인 경우 소문자로 변환
                answer.append((char) (c + 32));
            } else answer.append((char) (c - 32)); // 소문자인 경우 대문자로 변환
        }

        return answer.toString();
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        bw.write(main.solution(str));

        bw.flush();
        bw.close();
    }
}