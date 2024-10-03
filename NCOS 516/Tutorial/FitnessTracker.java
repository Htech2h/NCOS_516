package Tutorial;

public class FitnessTracker {
    private String exerciseName;
    private int minutesPent;
    private String date;

    FitnessTracker() {
        setExerciseName("Running");
        setMinutesPent(0);
        setDate("01/01/2024");
    }
    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }
    public void setMinutesPent(int minutesPent) {
        this.minutesPent = minutesPent;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getExerciseName() {
        return exerciseName;
    }
    public int getMinutesPent() {
        return minutesPent;
    }
    public String getDate() {
        return date;
    }
}
