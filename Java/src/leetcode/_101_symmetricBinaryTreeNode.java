package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Data : 2021-6-14
 * Author:Shilaiyuan
 * Description:
 *
 * **/


/**
 *
 *     Definition for a binary tree node
 *     struct TreeNode{
 *         int val;
 *         TreeNode *left;
 *         TreeNode *right;
 *         TreeNode(): val(0), left(nullptr),right(nullptr){
 *
 *         }
 *         TreeNode(int x): val(x), left(nullptr),right(nullptr){
 *
 *         }
 *         TreeNode(int x ,TreeNode *left, TreeNode *right): val(0), left(nullptr),right(nullptr){
 *
 *         }
 *
 *     }
 *
 * */

public class _101_symmetricBinaryTreeNode {


    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String org = bf.readLine();
        StringBuilder sb = new StringBuilder(0);
        for (int i = 0; i < org.length(); i++){
            if (org.charAt(i) != '[' && org.charAt(i) != ']'){
                sb.append(org.charAt(i));
            }
        }
        String[] input = sb.toString().split(",");
        int[] dat = new int[input.length];
        for (int i = 0; i < input.length; i++){
            dat[i] = Integer.parseInt(input[i]);
        }
        _101_symmetricBinaryTreeNode sol = new _101_symmetricBinaryTreeNode();

    }
}
