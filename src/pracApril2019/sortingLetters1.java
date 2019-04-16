package pracApril2019;

public class sortingLetters1 {
    public static void main(String[] args) {
        String str="Bangladesh";
        String myStr=str.toLowerCase();
        char []myCh = myStr.toCharArray();

        for (int i =0; i<myCh.length; i++){
            for(int j=i+1; j>0; j--){
                if(myCh[j]<myCh[j-1]){
                    char temp=myCh[j-1];
                    myCh[j-1]=myCh[j];
                    myCh[j]=temp;
                }
                myStr=String.valueOf(myCh);
                System.out.println(myStr);
            }
        }

    }
}
