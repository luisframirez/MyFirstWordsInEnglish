package Questions;

import java.util.HashMap;

import javafx.scene.image.Image;

public class question_2 extends question {
	public question_2() {
		this.question="Say in english: Perro"; 
		// this variable is set in the constructor for now,
		//but this class should not change
		this.answer=2;
		// this variable indicates the index of Options ArrayList
		this.options.add(new HashMap<String, Image>());
		this.options.get(0).put("hyena", new Image("hyena.png"));
		this.options.add(new HashMap<String, Image>());
		this.options.get(0).put("cat", new Image("cat.png"));
		this.options.add(new HashMap<String, Image>());
		this.options.get(0).put("Dog", new Image("dog.png"));
		
		
		
	}
}