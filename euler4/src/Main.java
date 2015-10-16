public class Main {

    public static void main(String[] args) {

        long largest = 0;

        int temp = 0;

        for (int i=100; i<1000; i++){
            for (int j=100; j<1000; j++){
                temp = i*j;
                if (isPalindrome(temp)&&(temp>largest)){
                    largest = temp;
                }
            }
        }

        System.out.print(largest);

    }

    static boolean isPalindrome(long number){
        return (number == reverse(number));
    }

    static long reverse(long number)
    {
        long reverse = 0;
        long remainder = 0;
        do {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;

        } while (number > 0);
        return reverse;
    }
}
