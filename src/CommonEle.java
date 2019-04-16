public class CommonEle {

    public static void main(String[] args) {
        String []A={"A", "B", "C", "D", "M", "N"};
        String []B={"A", "B", "D","F", "M", "P"};

        for(int i=0; i<A.length; i++){
            for(int j=0; j<B.length; j++){
                if (A[i]==B[j]){
                    System.out.print(A[i]);
                }
            }
        }
    }
}
