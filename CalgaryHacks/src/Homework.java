import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Homework implements Comparable <Homework> {
	
	//this class will give user inputs on how difficult or the prioirity on an assignment
	List <String> homeworks = new ArrayList <>();
	private String homework;
	
	public Homework (String homework) {
		this.homework = homework;
	}
	
	
	public void askForDiff () {
		Scanner scanner = new Scanner (System.in);
		
	}
	public void addHomework (String name){
		homeworks.add (name);
	}
	
	@Override
	
	
	
}