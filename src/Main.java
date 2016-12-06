public class Main {

    public static void main(String[] args) {

        long num[] = {500, 25000, 20, 100, 1000000, 800, 10};


        long answer = remainder(num);
        System.out.println("Max Remainder is: " + answer);
        //System.out.println(remainder(num));
    }

    public static long remainder(long x[]) {
        long compare = 0;
        long maxValue = 0;
        dio dioObject = new dio();
        for (int i = 0; i< x.length; i++) {
            if(i == 0) {
                compare = dioObject.sum(x[i]);
                maxValue = dioObject.sum(x[i]);
            }
            else {
                compare = dioObject.sum(x[i]);
                if(compare > maxValue)
                    maxValue = compare;
            }
        }

        return maxValue;

    }

}
