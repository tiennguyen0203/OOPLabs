class Pyramid {
    public static void main(String[] args) {
       int k = 0;
       for(int height = 5; height > 0; height--){
           
           for(int n = 0; n < height; n++){
               System.out.print(" ");
           }
           
           for(int j = 0; j < 2*k + 1; j++){
               System.out.print("*");
           }
           System.out.println();
           k++;
       }
    }
}