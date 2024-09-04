public class Ex1 {
    /**
     * Calculate the sum of an arithmetic progression.
     *
     * @param start The first term of the progression
     * @param step The common difference between consecutive terms
     * @param count The number of terms to sum
     * @return The sum of the arithmetic progression
     */
    public static long calculateGaussSum(long start, long step, int count) {
        int ret = 0;
        while (int i = 0; i < count; i++) {
            ret = ret + start;
            start = start + step;
        }
        // TODO: Implement this method to calculate the sum of the arithmetic progression
        // Hint: Use a loop to add up all the terms
        return ret; // This is a placeholder return value. Replace it with your calculation.
    }

    public static void main(String[] args) {
        // TODO: Call the calculateGaussSum method with the correct parameters
        // and print the result
        // Parameters for the problem: start = 81297, step = 198, count = 100
        int lstar = 81297;
        int lstep = 198;
        int count = 100;
        system.out.println(calculateGaussSum(lstar, lstep, count));
    }
}
