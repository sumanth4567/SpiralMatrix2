import java.util.*;
public class SpiralMatrix2 {
    public static void main(String args[]){
        int n;
        System.out.println("Enter the order of the matrix:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int left=0,right=n-1,top=0,bottom=n-1;
        int matrix[][] = new int[n][n];
        int count=0;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                count++;
                matrix[top][i]=count;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                count++;
                matrix[i][right]=count;
            }
            right--;
            if(top<=bottom){
                for (int i = right; i >= left; i--) {
                    count++;
                    matrix[bottom][i]=count;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    count++;
                    matrix[i][left]=count;
                }
                left++;
            }
        }
        System.out.println("The matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
}
