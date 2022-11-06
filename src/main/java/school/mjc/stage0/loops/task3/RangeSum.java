package school.mjc.stage0.loops.task3;

public class RangeSum {
    public static void printSumInclusive(int firstBoarder, int secondBoarder) {
        int result = 0;
        for (int counter = firstBoarder; counter <= secondBoarder; counter++){
            result+=counter;
        }
        System.out.println(result);

    }
    public static void main(String[] args){
        printSumInclusive(-100, 100);
    }
}
