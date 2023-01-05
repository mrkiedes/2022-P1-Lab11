public class Temp {

    public static void main(String args[]){

        int temp[] = new int[15];

        for(int k = 0; k < temp.length; k++) {
            System.out.println(temp[k]);
        }
        for(int k = 0; k < temp.length; k++){
            temp[k] = 15;
        }
        for(int k = 0; k < temp.length; k++) {
            System.out.println(temp[k]);
        }



    }

}
