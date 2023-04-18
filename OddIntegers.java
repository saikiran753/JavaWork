public class OddIntegers {
    public static void main(String[] args) {
        System.out.println("INTEGER");

        // Loop through all odd integers from 1 to 97, incrementing by 2 each time
        for (int i = 1; i <= 97; i += 2) {
            System.out.println(i);
        }

        // Calculate the middle three integers of the range and print them
        int middleStart = (97 - 1) / 2 - 1;
        int middleEnd = middleStart + 3;
        System.out.println((middleStart + 1) + " " + (middleStart + 2) + " " + (middleStart + 3));
    }
}