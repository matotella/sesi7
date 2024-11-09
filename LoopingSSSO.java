public class LoopingSSSO {
    public static void main(String[] args) {
        int  a = 4;
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){
                if (j < a - i - 1){
                    System.out.print("S");
                } else { 
                    System.out.print("O");
                }
            }
            System.out.println();
        }

    }
}
