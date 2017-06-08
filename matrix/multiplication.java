public class Re {
    public static void main(String[] args) {
        int[][] one = {{7,8,9},{3,6,5}}; // A
        int[][] two ={{3,5,2,1},{8,9,3,-5},{7,3,-4,-1}};  // B
        int[][] result = new int[2][4];
        int i = 0,
            tmpResult = 0;


        for (int n =  0 ; n < 2 ; n ++ ) {
            for (int  m = 0 ;m < 4; m ++){
                do{
//                    System.out.print("|-" + i + "-|");
//                    System.out.print("|-" + m + "-|");
//                    System.out.print( one[n][i] + "he" + two[i][m] + "\t");
                    tmpResult += one[n][i] * two[i][m];
                    i ++;
                }while(i < 3);
                i = 0;
                result[n][m] = tmpResult;
            }
            i = 0;
        }
        System.out.println(result);
    }