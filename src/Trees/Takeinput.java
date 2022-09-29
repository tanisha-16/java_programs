/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Takeinput {
    public static TreeNode<Integer> takeinput(Scanner s) {

        int n = s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        int childcount = s.nextInt();
        for (int i = 0; i < childcount; i++) {
            TreeNode<Integer> child = takeinput(s);
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data + ",";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }
}
