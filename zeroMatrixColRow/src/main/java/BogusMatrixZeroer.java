public class BogusMatrixZeroer {
  public static int[][] startingMatrix = {
    {1,1,1,1}, {1,0,1,1}, {1,1,1,0}, {1,1,1,1}
  };

  public static void main(String[] args) {
    int[][] output = new int[startingMatrix.length][startingMatrix[0].length];
    for (int i = 0 ; i < startingMatrix.length ; i++) {
      for(int j = 0 ; j < startingMatrix[i].length; j++) {
        output[i][j] = 1;
      }
    } 
    for (int i = 0 ; i < startingMatrix.length ; i++) {
      for(int j = 0 ; j < startingMatrix[i].length; j++) {
        if(startingMatrix[i][j] == 0) {
          for(int k = 0 ; k < startingMatrix.length ; k++) {
            output[k][j] = 0;
          }
          for(int g = 0 ; g < startingMatrix[i].length ; g++) {
            output[i][g] = 0;
          }
        }
      }
    }
    for (int i = 0 ; i < output.length ; i++) {
      for(int j = 0 ; j < output[i].length; j++) {
        System.out.print(output[i][j]);
      }
      System.out.println();
    }
  }
}
