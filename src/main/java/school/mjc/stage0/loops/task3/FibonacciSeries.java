package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 1;
        int temp;
        System.out.println(first);
        System.out.println(second);
        for(int i = 1; i <= lastFibonacci-2; i++){
            temp = first + second;
            first = second;
            second = temp;
            System.out.println(temp);
        }
    }
    public static void main(String[] args){
    printFibonacci(5);
    }
}
