package Questions;

import java.util.HashMap;

import javafx.scene.image.Image;

public class question_1 extends question {
	public question_1() {
		this.question="Say in english: Caballo";
		this.answer=1;
		this.options.add(new HashMap<String, Image>());
		this.options.get(0).put("Horse", new Image("horse.png"));
		this.options.add(new HashMap<String, Image>());
		this.options.get(1).put("Sheep", new Image("sheep.png"));
		this.options.add(new HashMap<String, Image>());
		this.options.get(2).put("goat", new Image("goat.png"));
		
		
		
	}
}
