class Program1 {
    public static void main(String [] args){
        int n=5;
        for(int i=0;i<n;i++){

            //I Pattern
            for (int j=0;j<n;j++){
                if (i==0 || j==(n-1)/2 || i==(n-1))  {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            //N Pattern
            System.out.print("  ");
            for (int j=0;j<n;j++){
                if (j==0||i==j||j==(n-1))  {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            //E Pattern
            System.out.print("  ");
            for (int j=0;j<n;j++){
                if (j==0||i==0||i==(n-1)||i==(n-1)/2)  {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            //U Pattern
            System.out.print("  ");
            for (int j=0;j<n;j++){
                if (j==0 && i<(n-1) || i==(n-1) && j>0 && j<(n-1) || j==(n-1) && i<(n-1))  {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }


            //R Pattern
            System.out.print("  ");
            for (int j=0;j<n;j++){
                if (j==0 || i==0 && j<3*(n-1)/4 || j==3*(n-1)/4 && i>0 && i<=(n-1)/2 
                || i==j && i>=(n-1)/2 && j>=(n-1)/2)  {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }


            //O Pattern
            System.out.print("  ");
            for (int j=0;j<n;j++){
                if (j==0 && i>0 && i<(n-1) || i==0 && j>0 && j<(n-1) || i==(n-1) && j>0 && j<(n-1)
                || j==n-1 && i>0 && i<(n-1))  {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }


             //N Pattern
             System.out.print("  ");
             for (int j=0;j<n;j++){
                 if (j==0||i==j||j==(n-1))  {
                     System.out.print("*");
                 }
                 else{
                     System.out.print(" ");
                 }
 
             }
            

            System.out.println();
        }
    }
    
}
