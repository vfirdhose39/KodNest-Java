public class PracticeReport {
    public static void main(String[] args) {
     
        int problemsSolved = 47;
        int totalDays = 5;
        double completionPercentage = 86.75;
        double reportValue = (double) problemsSolved;
        int wholePercentage = (int) completionPercentage;
        double averagePerDay = (double) problemsSolved / totalDays;
        boolean dailyTargetReached = averagePerDay >= 9.0;
        System.out.println("Report Value: " + reportValue);
        System.out.println("Whole Percentage: " + wholePercentage);
        System.out.println("Average Per Day: " + averagePerDay);
        System.out.println("Daily Target Reached: " + dailyTargetReached);
    }
}