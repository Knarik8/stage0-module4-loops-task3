package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void printDigitsSum(int t) {
        String result = t + "";
        int sum = 0;
        for (int i = 1; i <= result.length(); i++) {
            if (t > 0) {
                int temp = t % 10;
                sum += temp;
                t = t / 10;
            } else if (t < 0){
                int temp = -t % 10;
                sum += temp;
                t = t / 10;
            }
        }
        System.out.println(sum);

    }
    public static void main(String[] args){
        printDigitsSum(-24358);
    }
}
