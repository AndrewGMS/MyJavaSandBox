public class ThreeDMatrix{   //0               
 
 
public static void main(String[] args) {   //1 
  int treeD[][][] = new int[3][4][5];
  int i, j, k;
  for(i = 0; i < 3; i++) 
    for(j = 0; j < 4; j++)
      for(k = 0; k < 5; k++) 
        treeD[i][j][k] = i * j * k;

  for(i = 0; i < 3; i++) { //3
    for(j = 0; j < 4; j++) { //4
      for(k = 0; k < 5; k++) 
        System.out.print(treeD[i][j][k] + " ");
      System.out.println();  
     } //4
     System.out.println();  
} //3
     
}   //1 
}   //0 
