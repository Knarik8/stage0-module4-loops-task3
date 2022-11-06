package school.mjc.stage0.loops.task3;

//public class GreatestCommonDivisor {
//    public static void printGCD(int first, double second) {
//        if ((first % second == 0) || (second % first == 0)){
//            if (first > second){
//                System.out.println(second);
//            } else System.out.println(first);
//        } else {
//            if (first > second){
//                double remainder = first % second; //остаток от деления
//                double temp;
//                remainder = second ;
//                System.out.println(remainder);  //44
//                while (remainder != 0) {
//
//                    temp = remainder;
//                    double tmp_first = second;
//                    remainder = tmp_first % temp;
//
//                    System.out.println(remainder);
////                    result=second;
//
////                    second=remainder;
//
////                    double remainderTree = remainder % remainderTwo;
//
//
////                    System.out.println(remainder);
////                    double remainderTwo = second % remainder;
////                    double remainderTree = remainder % remainderTwo;
//
//                }
//
//            }
//        }
//
//    }
//    public static void main(String[] args){
//        printGCD(140, 96);
//    }
//}


public class GreatestCommonDivisor {
    public static void printGCD(int first, int second) {
       while (first != 0 && second != 0){
           if (first > second){
               first = first % second;
           } else {
               second = second % first;
           }
       }
       System.out.println(first+second);
    }
    public static void main(String[] args){
        printGCD(30, 30);
    }
}
