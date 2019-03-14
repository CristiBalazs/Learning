public class Main {

    public static void main(String[] args) {
        //Find out the max number from an array and the min number
        int[] nr = {1, 102, 48, 13,2,0,-4};
        int max = 0;
        int min = nr[0];
        if (nr.length > 0) {
            for (int i = 0; i <= nr.length - 1; i++) {
                if (nr[i]<i){
                    min = nr[i];
                }
                if (nr[i]>max)
                    max = nr[i];
            }
        }
        System.out.println("Your max is " + min);
        System.out.println("Your max is "+max);
    }
}
