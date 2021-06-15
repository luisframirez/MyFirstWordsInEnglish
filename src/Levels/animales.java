package Levels;

import java.util.ArrayList;

import Questions.*;

//import Questions.question_1;

public class animales extends level{
	public animales() {
		this.complejidad=1;
		this.isAbout="This level is about animals";
		this.questions.add(new question_1());
		this.questions.add(new question_2());
		this.questions.add(new question_3());
		this.questions.add(new question_4());
		this.questions.add(new question_5());
		
		
		
		this.minimuQuestionToWin=3;
	}
	
	
	
	
}
