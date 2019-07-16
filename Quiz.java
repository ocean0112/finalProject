package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import java.io.FileNotFoundException;

public class Quiz extends Application {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//Scanner input=new Scanner(System.in);
		
//		for(int i=0; i>=10;i++) {
//			Questions(i);
//			
//		}
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		//read questions from file
//		String[] question=new String[10];
//		File questFile=new File("question.txt");
//		Scanner questReader= new Scanner(questFile);
//		
//		//read answers from file
//		String[] answers=new String[10];
//		File answerFile=new File("answer.txt");
//		Scanner answerReader=new Scanner(answerFile);
//		
//		int i1=0;
//		
//		System.out.println("poop"+answerFile.exists()+questFile.exists());
		//print from file to array 
	//	do {
//			question[i1]=questReader.nextLine();
//			answers[i1]=answerReader.nextLine();
			
			Label q=new Label("poop");//question[i1]);
			HBox questionBox=new HBox(q);
			
			//for true answers
			Label t=new Label("True ");
			Button tb=new Button();
			//button click event
			tb.setOnAction(new trueResponse());
			HBox tAnswer=new HBox(tb,t);
			
			
			//for false answer
			Label f=new Label("False ");
			Button fb=new Button();
			//button click event
			fb.setOnAction(new falseResponse());
			HBox fAnswer=new HBox(fb,f);
			
			
			Label nxt=new Label("Next");
			Button nxtB=new Button();
			HBox nxtBox=new HBox(nxt,nxtB);
			
			
			// parent node
			GridPane gridpane=new GridPane();
			//sets constraints 
			GridPane.setRowIndex(questionBox,0);
			GridPane.setConstraints(tAnswer, 0, 1);
			GridPane.setConstraints(fAnswer,2,1);
			GridPane.setConstraints(nxtBox, 2, 2);
			
			gridpane.getChildren().addAll(questionBox,tAnswer,fAnswer,nxtBox);
	//	}while(i1<=10);
		
			
		Scene scene=new Scene(gridpane);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Group Project Quiz");
		
		primaryStage.show();
		
//		answerReader.close();
//		questReader.close();
	}
	
}
