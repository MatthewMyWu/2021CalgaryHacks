public class Activity{

    private String activityName;
    private String category;
    private String date;
    private String time;

	public Activity(String name) {
		this.activityName = name;
	}

    public String getActivityName() {
		return activityName;
	}

    public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

    public String getCategory() {
		return category;
	}

    public void setCategory(String category) {
		this.category = category;
	}

    public String getDate() {
		return date;
	}

    public void setDate(String date) {
		this.date = date;
	}

    public String getTime() {
		return time;
	}

    public void setTime(String time) {
		this.time = time;
	}
}