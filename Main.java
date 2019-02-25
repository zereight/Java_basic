public class Main {
    public static void main(String[] args) {
        int N = 50;


        int[][] two_dimension_arr1 = new int [N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                two_dimension_arr1[i][j] = 48;
            }
        }

        int[][] two_dimension_arr2 = new int[N][];
        for(int i=0; i<N; i++){
            two_dimension_arr2[i] = new int[N];
            for(int j =0; j<N; j++){
                two_dimension_arr2[i][j] = 99;
            }
        }

    }
}