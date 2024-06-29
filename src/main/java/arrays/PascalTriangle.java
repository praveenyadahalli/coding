package arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        int n=5;
        pascalTriangle(5);
    }

    // pascal triangle using dp
    public static void pascalTriangle(int n) {
        int arr[][]=new int[n][n];

        for(int line=0;line<n;line++){
            for(int i=0;i<=line;i++){
                if(i==0 || line==i){
                    arr[line][i]=1;
                    System.out.print(arr[line][i]+" ");
                }else{
                    arr[line][i]=arr[line-1][i-1]+arr[line-1][i];
                    System.out.print(arr[line][i]+" ");
                }
            }
            System.out.println();
        }
    }
}
