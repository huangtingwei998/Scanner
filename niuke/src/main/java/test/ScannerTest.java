package test;

import java.util.List;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

    }
    public static void Test1() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    }
//    输入 一个String，如 输入"dsad343"
    public static void Test2() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
    }
//    输入 一个String数组，如输入"2s 3e 4 5re 6s 6
    public static void Test3() {
        Scanner sc = new Scanner(System.in);
        String strs = sc.nextLine();
        String[] list = strs.split(" ");
    }
//    .输入 一个int数组，如输入
    public static void Test4() {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while(sc.hasNextLine()) {
            String in = sc.nextLine();
            if (in == null || in.length() == 0) {
                break; }list.add(in);
        }
        int[] target = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            target[i] = Integer.parseInt(list.get(i));
        }
    }
}
