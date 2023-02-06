class InnerForLoop {
    public static void main(String [] args ){
        System.out.println("Inner For Loop");
        int n = 3;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("i: "+i+" "+"j: "+j);
            }
            System.out.print("      ");
            for (int j=0;j<n;j++){
                System.out.print("i: "+i+" "+"j: "+j);
            }
            System.out.println();

        }
    }
    
}
