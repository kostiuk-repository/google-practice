package topic07_prefix_sums.practice;

public class Easy_03_04_HighestAltitude {

    /**
     * Drill 4/5 for Easy_03_HighestAltitude — Multiple Road Trips
     * Technique: generalize Easy_03_HighestAltitude from a single gain array to a batch
     * of independent gain arrays, applying the same build-prefix-then-take-max logic to
     * each one separately.
     *
     * You are given a list of gain arrays, one per road trip. Each trip independently
     * starts at altitude 0. Return an array where the i-th value is the highest altitude
     * reached during the i-th trip.
     *
     * Example:
     * Input: trips = [[-5,1,5,0,-7], [3,-2,4]]
     * Output: [1, 5]
     * Explanation: Trip 1 altitudes: 0,-5,-4,1,1,-6 -> max 1. Trip 2 altitudes: 0,3,1,5 -> max 5.
     */
    public int[] highestAltitudePerTrip(int[][] trips) {
        // TODO: Implement your solution here.
        return new int[0];
    }
}
