import java.io.*;
import java.util.*;

/* 3. 문장 속 단어
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.

 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.

 * 출력
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
 * 단어를 답으로 합니다.

 * 예시 입력
 * it is time to study

 * 예시 출력
 * study
 * */

public class Main {
    public String solution(String str) {
        String answer = new String();

        String[] words = str.split(" ");
        int maxLength = 0;

        for (String word : words) {
            int wLen = word.length();

            if (wLen > maxLength) {
                maxLength = wLen;
                answer = word;
            }
        }

        return answer;
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