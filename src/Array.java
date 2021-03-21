public class Array {
    public static void main(String[] args) {
//        int [] c =new int[12];
//        System.out.println(c);

        int [] arrays;
        arrays = new int[5];
//
//        arrays[0]= 56;
//        arrays[1]= 11;
//        arrays[2]= 10;
//        arrays[3] =12;
//        arrays[4] = 6;
//        for (int counter = 0; counter < arrays.length;){
//        System.out.println(arrays[counter]);
//            System.out.println(arrays[2]);
//            System.out.println(arrays[3]);
//            System.out.println(arrays[4]);
//            System.out.println(arrays[5]);
//            ++counter;

//        }
        for(int i = 0; i<=4; i++){
           arrays[i]=i+1;
        }
        for(int i =0; i<=arrays.length-1;i++){
            System.out.println(arrays[i]);
        }
    }

}
