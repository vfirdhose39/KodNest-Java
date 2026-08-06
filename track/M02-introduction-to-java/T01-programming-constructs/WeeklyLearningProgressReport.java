public class WeeklyLearningProgressReport {
    public static void main(String[] args) {
        int completedTopics = 17;
        int totalTopics = 20;
        int dailyLearningHours = 3;
        int learningDays = 5;
        int remainingTopics = totalTopics - completedTopics;
        int weeklyLearningHours = dailyLearningHours * learningDays;
        double progressPercentage = (double) completedTopics * 100 / totalTopics;
        System.out.println("completed topics = " + completedTopics);
        System.out.println("remaining topics = " + remainingTopics);
        System.out.println("weekly learning hours = " + weeklyLearningHours);
        System.out.println("progress percentage = " + progressPercentage);
    }
}

