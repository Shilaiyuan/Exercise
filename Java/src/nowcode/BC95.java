package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BC95 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        int[] scores = new int[N];
        int diff = 0;
        for (int i = 0; i < N; i++){
            scores[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(scores);
        diff = scores[N-1] - scores[0];
        System.out.println(diff);
    }
}