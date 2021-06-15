package application;
	
import java.io.IOException;
import java.util.HashMap;

import Levels.*;
import Questions.question;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	
	private static Pane root= new Pane();
	public static level currentLevel;
	public static question currentQuestion;
	public static int QuestionsAnswered=0;
	public final static String ANIMALS="animals";
	public final static String NUMBERS="numbers";
	public final static String ACTIONS="actions";
	private static int questionsOfLevel;
	
	private static int rightAnswers;
	
	private final static HashMap<String,level> levels= new HashMap<String, level>();
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// initialization of variables of instance
			
			//levels
			Main.levels.put("animals", new animales());
			Main.levels.put("numbers", new numeros());
			Main.levels.put("actions", new acciones());
			
			
			
			
		
			
			Main.newPane("Welcome.fxml");
			primaryStage.setScene(new Scene(Main.root));
			primaryStage.show();
						
			
		} catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	
	
	
	
	// this method is used when new Pane is needed to be displayed (new questions)
	public static void newPane(String resourceURL) throws IOException { 
		Main.root = (Pane) FXMLLoader.load(Main.class.getResource(resourceURL));
		
	}
	
	
	public static void nextLevel(String level) throws IOException {
		
		
		Main.currentLevel=Main.levels.get(level);
		Main.questionsOfLevel=Main.currentLevel.getQuestions().size();
		
		
		
		nextQuestion();
		
	}
	public static void nextQuestion() throws IOException {
		
		if (rightAnswers==QuestionsAnswered) {
			nextLevel();
		}
		if (QuestionsAnswered==questionsOfLevel) {
			
		}
		
		currentQuestion=currentLevel.getQuestions().get(QuestionsAnswered);
		newPane(currentQuestion.url);
		Main.QuestionsAnswered++;
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	// this method is called when play button is pushed
	public static play() {
		
	}
}
