import java.io.*;
import java.util.*;

/* 1. 문자 찾기
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 *
 * 예시 입력
 * Computercooler
 * c
 *
 * 예시 출력
 * 2
 * */

public class Main {
    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (Character c : str.toCharArray()) {
            if (c == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char t = br.readLine().charAt(0);

        bw.write(String.valueOf(main.solution(str, t)));

        bw.flush();
        bw.close();
    }
}