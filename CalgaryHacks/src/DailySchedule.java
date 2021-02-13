

import java.util.ArrayList;

// represents user's schedule for any given day
public class DailySchedule { 

    private ArrayList<Activity> dailyActivity;
    
    public DailySchedule(){
        dailyActivity = new ArrayList<>();
    }

    /* checkAvailable returns true if there are no schedule conflicts with a 
        given time and date.
    */
    public boolean checkAvailable(String date, String time){
        for (int i = 0; i < dailyActivity.size(); i++){
            if ((dailyActivity.get(i).getDate() == date ) &&
            (dailyActivity.get(i).getTime() == time) ){
                    return false;
                }
            }
        return true;
    }
}