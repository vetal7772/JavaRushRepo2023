package test.project.codewars;

public class Kata8 {
    public static void main(String[] args) {
        int res = squareSum(new int[]{1, 2, 2});
        System.out.println(res);
    }

    public static int squareSum(int[] n) {
        int result = 0;
        for (int i = 0; i < n.length; i++) {
            result += n[i] * n[i];

        }
        return result;
    }
}
