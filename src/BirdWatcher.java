public class BirdWatcher {
    public static void main(String[] args) {

        int[] birdsPerDay = {0, 2, 5, 3, 7, 8, 4};
        int numberOfDays = 4;

        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);

        System.out.println("Last week's counts: " + java.util.Arrays.toString(birdWatcher.getLastWeek()));
        System.out.println("Birds visited today: " + birdWatcher.getToday());
        birdWatcher.incrementTodaysCount();
        System.out.println("Birds visited today after increment: " + birdWatcher.getToday());
        System.out.println("Was there a day without birds? " + birdWatcher.hasDayWithoutBirds());
        System.out.println("Total birds in first " + numberOfDays + " days: " + birdWatcher.getCountForFirstDays(numberOfDays));
        System.out.println("Number of busy days: " + birdWatcher.getBusyDays());
    }

    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    //    method that returns last week's counts
    public int[] getLastWeek() {
        return birdsPerDay;
    }

    //    method to return how many birds visited your garden today
    public int getToday() {
        int today = birdsPerDay.length;
        return birdsPerDay[today - 1];
    }

    // method to increment today's count
    public void incrementTodaysCount() {
        int today = birdsPerDay.length;
        birdsPerDay[today - 1]++;
    }

    //    method that returns true if there was a day at which zero birds visited the garden; otherwise, return false
    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0){
                return true;
            }
        }
        return false;
    }
    /*
    method that returns the number of birds that have visited your garden from the start of the week,
    but limit the count to the specified number of days from the beginning of the week.
    */
    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        int count = numberOfDays;
        if (numberOfDays > 7){
            count = 7;
        }
        for (int i = 0; i < count; i++) {
            total += birdsPerDay[i];
        }
        return total;
    }

    //    method to return the number of busy days. A busy day is one where five or more birds have visited your garden.
    public int getBusyDays() {
        int busy = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5){
                busy++;
            }
        }
        return busy;
    }
}
