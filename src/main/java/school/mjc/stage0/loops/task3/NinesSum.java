package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void calculateSum(int lengthOfLastNumber) {
        String temp = "";
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++){
            temp+="9";
            sum+= Integer.parseInt(temp);
            System.out.println(temp);
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        calculateSum(6);
    }
}
