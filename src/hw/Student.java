package hw;

public class Student {
	private String name , id;
	private int score;
	public Student(String name1 , String id1 , int score1){
		this.name = name1;
		this.id = id1;
		this.setScore (score1);
	}
	public void setScore(int val){
		score = val;
	}
	public int getScore(){
		return score;
	}

}
