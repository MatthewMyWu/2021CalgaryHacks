
import java.util.ArrayList;

import java.util.Scanner;


// represents a logbook consisting of the weekly schedule
public class Logbook {

    private ArrayList<DailySchedule> weeklySchedule;
    private Scanner input;


    // EFFECTS: constructs a new logbook instance
    public Logbook() {
        weeklySchedule = new ArrayList<>();
    }

    public void addActivity(String activityName) {

        Activity activity = new Activity(activityName);
        System.out.println("Activity category? \n");
        activity.setCategory(input.nextLine());

        // idk how i should go about adding this task to the weekly schedule,
        // so im just adding it to the very front of the array every time
        if (activity.getCategory().equals("social")) {
            System.out.println("On what day? ");
            activity.setDate(input.nextLine());
            System.out.println("At what time? ");
            activity.setTime(input.nextLine());
        } else if (activity.getCategory().equals("school")) {
            System.out.println("What kind of task is it? ");
            activity
        }
    }

    


}