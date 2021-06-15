package Questions;

import java.util.HashMap;

import javafx.scene.image.Image;

public class question_3 extends question {
	public question_3() {
		this.question="Say in english: Gato"; 
		// this variable is set in the constructor for now,
		//but this class should not change
		this.answer=2;
		// this variable indicates the index of Options ArrayList
		this.options.add(new HashMap<String, Image>());
		this.options.get(0).put("Chicken", new Image("chicken.png"));
		
		
		
	}
}