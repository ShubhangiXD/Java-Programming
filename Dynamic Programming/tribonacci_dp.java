import java.util.HashMap;

class tribonacci_dp {
    public static int tribonacci(int n, HashMap<Integer, Integer> memo) {
        if (n == 1 || n == 0)
            return 0;
        if (n == 2)
            return 1;
        if (memo.containsKey(n))
            return memo.get(n);

        int res = (tribonacci(n - 1, memo) + tribonacci(n - 2, memo) + tribonacci(n - 3, memo));
        memo.put(n, res);
        return res;
    }

    public static int tribonacci(int n) {
        return tribonacci(n, new HashMap<>());
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
}