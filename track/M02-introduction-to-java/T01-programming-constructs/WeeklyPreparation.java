public class WeeklyPreparation {
    public static void main(String[] args) {
        int javaHoursPerDay = 2;
        int aptitudeHoursPerDay = 1;
        int preparationDays = 5;
        int weeklyJavaHours = javaHoursPerDay * preparationDays;
        int weeklyAptitudeHours = aptitudeHoursPerDay * preparationDays;
        int totalPreparationHours = weeklyJavaHours + weeklyAptitudeHours;
        System.out.println("Java: " + weeklyJavaHours);
        System.out.println("Aptitude: " + weeklyAptitudeHours);
        System.out.println("Total: " + totalPreparationHours);
    }
    
}
