public class SortStrings2 {

    public static void main(String[] args) {
        String []name ={"Kamol", "Shreyo", "Argha", "Sneha", "Metali"};
        int len =name.length;
        String temp;


        for(int i=0; i<len; i++){
            for(int j=i+1; j<i-1; j++){
                if(name[i].compareTo(name[j])>0){
                   temp= name[i];
                   name[i]=name[j];
                   name[j]=temp;
                }
            }
            System.out.println(name[i]);
        }
        for(int i=0; i<len;i++){
            System.out.println("/n/t/"+name[i]);
        }
    }


}
