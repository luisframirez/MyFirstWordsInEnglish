package Levels;

import java.util.ArrayList;

import Questions.question;

public abstract class level {
	public static int level;
	protected int complejidad;
	protected String isAbout;
	protected ArrayList<question> questions;
	public int minimuQuestionToWin;
	public level(){
		this.questions=new ArrayList<question>();
	}
	
	public static int currentLevel() {
		return 0;
	}
	
	public ArrayList<question> getQuestions() {
		return this.questions;
	}
	
}
