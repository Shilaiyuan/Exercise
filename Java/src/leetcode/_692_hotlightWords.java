package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 做题日期：2021-5-20
 * 题目描述：给一个费控的单词列表，返回前k个出现次数最多的单词，返回结构按单词出现频率从高到低排序
 * 题目分析：
 *
 * */
public class _692_hotlightWords {
//    输入的字符串数组words为输入单词组，k为要求输出的项数
    /**
     * @Param Description：
     * @Param Input: 字符串数组words 整型常数 k
     * @Param Output: 容量为k的有序所有元素只出现一次的数组
     * */
    public List<String> topKFrequent(String[] words, int k){

        Map<String, Integer> cnt = new HashMap<String, Integer>();
        for (String word : words){
            cnt.put(word, cnt.getOrDefault(word, 0) + 1);
        }
        List<String> rec = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : cnt.entrySet()){
            rec.add(entry.getKey());
        }
        Collections.sort(rec, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return cnt.get(o1) == cnt.get(o2)? o1.compareTo(o2) : cnt.get(o2) - cnt.get(o1);
            }

        });
        return rec.subList(0,k);
    }


    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int k = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
//            由于输入的数据带中括号，首先去掉
            if (s.charAt(i) != '[' && s.charAt(i) != ']' && s.charAt(i) != '"' && s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }else continue;
        }
        String[] words = sb.toString().split(",");
        sb.setLength(0);
        _692_hotlightWords sol = new _692_hotlightWords();
        System.out.println(sol.topKFrequent(words,k));
    }

}
