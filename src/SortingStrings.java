public class SortingStrings {

    public static void main(String[] args) {
        String []name ={"Kamol", "Shreyo", "Argha", "Sneha", "Metali"};
        String temp="";
        int len = name.length;

        System.out.println("Before sorting");
        for(int i = 0; i<len; i++){
            System.out.print("\t"+ name[i]);// \n is known as new line character.
                                            // While using this in printf ("\n");sgives
                                            //\t while using in printf statement  a tab space between the words or characters.
        }

        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if (name[i].compareTo(name[j])>0){
                   temp=name[i];
                   name[i]=name[j];
                   name[j]=temp;
                }
            }
        }

        System.out.println("\n\tAfter sorting the names:");
        for(int i =0; i<len; i++){
            System.out.print("\t"+name[i]);
        }
    }



}
