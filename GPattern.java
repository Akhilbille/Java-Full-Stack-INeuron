public class GPattern {
    public static void main(String args[]) {
        int n = 10;
        for (int i =0 ; i<n;i++){
            
            for (int j=0;j<n;j++){
                
                if (i==0 && j< 3*(n-1)/4 || j==3*(n-1)/4 && i<(n/4) || j==0 || i==(n-1) && j<(n-1)/2 || j==(n-1)/2 && i>3*(n-1)/4 || i==3*(n-1)/4 && j>=(n-1)/2 && j<=3*(n-1)/4 || j==3*(n-1)/4 && i>=3*(n-1)/4)
                    System.out.print("*");
                else
                    System.out.print(" ");
                    
            
            }
            System.out.println();
            
        }
      
    }
}
