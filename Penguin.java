
import java.awt.Image;

// represents the penguin ood
public class Penguin {

    // TODO:
    // - how to represent penguin as an img?
    //   - maybe add field
    // - 

    private String username;
    private String name;
    private int dailyWaterGoal;
    private int dailyHomeworkGoal;
    private int dailySocialGoal;

    private Image penguinSprite; 

    private PenguinMood feeling;

    // EFFECTS: creates a Penguin object with given name
    public Penguin(String name) {
        this.name = name;
        feeling = PenguinMood.HAPPY;
    }

    // setters

    public void setMood(PenguinMood mood) {
        this.feeling = mood;
    }

    public void setDailyWaterGoal(int goal) {
        this.dailyWaterGoal = goal;
    }

    public void setDailyHomeworkGoal(int goal) {
        this.dailyHomeworkGoal = goal;
    }

    public void setDailySocialGoal(int goal) {
        this.dailySocialGoal = goal;
    }

    // getters
	public PenguinMood getMood (){
		return feeling;
	}

    public String getPenguinName() {
        return this.name;
    }

    public int getDailyWaterGoal() {
        return this.dailyWaterGoal;
    }

    public int getDailyHomeworkGoal() {
        return this.dailyHomeworkGoal;
    }

    public int getDailySocialGoal() {
        return this.dailySocialGoal;
    }

}