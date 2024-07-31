//https://leetcode.com/problems/rotate-image/description/


public class LeetCode48 {
    

    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix){

        //for rotating array by 90 degrees 
        //first transpose the array 
        //and reverse the elements in the array

        //transposing the array 
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){

                //swap the elements in the array 
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //after transposing the array 
        //we need to reverse the elements in the transposed array to get the output
        //reversing the elements 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){

                //swap the elements 
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
}
