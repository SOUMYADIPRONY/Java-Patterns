public class InvertedPyramid2 {
    public static void main(String args[]) {
      int n=4;
      
      for(int i=1; i<=n; i++){  //outer loop
      
            for(int j=1; j<=n-i; j++){
                System.out.print(" "); //inner loop-1 for printing spaces
            }
            
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            
            System.out.println("");
          
      }
    }
}