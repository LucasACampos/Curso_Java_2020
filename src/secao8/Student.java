package secao8;

public class Student {
	
	private static final double NOTE_TO_PASS = 60.0;
	
	private String name;
	
	private double note1;
	
	private double note2;
	
	private double note3;
	
	public Student(String name, double note1, double note2, double note3) {
		this.name = name;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;
	}
	
	public Student() {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getNote1() {
		return note1;
	}
	
	public void setNote1(double note1) {
		this.note1 = note1;
	}
	
	public double getNote2() {
		return note2;
	}
	
	public void setNote2(double note2) {
		this.note2 = note2;
	}
	
	public double getNote3() {
		return note3;
	}
	
	public void setNote3(double note3) {
		this.note3 = note3;
	}
	
	public double getTotalPoints(){
		return note1 + note2 + note3;
	}
	
	public double pointsToPass(){
		double totalPoints = this.getTotalPoints();
		return (totalPoints >= NOTE_TO_PASS) ? 0 : NOTE_TO_PASS - totalPoints;
	}
	
	
}
