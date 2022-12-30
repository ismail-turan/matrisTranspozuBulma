public class Main {
    public static void main(String[] args) {
        int[][] matrisA={
            {1,2,3},
            {4,5,8}
        };
        for (int i=0;i<matrisA.length;i++){
            for (int j=0;j<matrisA[i].length;j++){
                System.out.print(matrisA[i][j]+", ");
            }
            System.out.println();
        }

        int[][] matrisAT=new int[matrisA[0].length][matrisA.length] ;
        for (int i=0;i<matrisA.length;i++){
            for (int j=0;j<matrisA[i].length;j++){
                matrisAT[j][i]=matrisA[i][j];
            }
        }
        for (int i=0;i<matrisAT.length;i++){
            for (int j=0;j<matrisAT[i].length;j++){
                System.out.print(matrisAT[i][j]+", ");
            }
            System.out.println();
        }
    }
}