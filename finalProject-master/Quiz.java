
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Quiz extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		String[] userAnswers=new String[10];
		Label [] q=new Label[9];
		VBox[] questionBox = new VBox[9];
		ToggleGroup[] group=new ToggleGroup[9];
		RadioButton[] tb=new RadioButton[9];
		RadioButton[] fb=new RadioButton[9];
		HBox[] answers=new HBox[9];
		String[] questions = new String[10];
        BufferedReader reader;
        
        try {
            reader = new BufferedReader( new FileReader(new File("question.txt")));

            String line = reader.readLine();
            for(int i=0; line!=null; line = reader.readLine()){
                questions[i] = line;
                i++;
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
        for (int i=0 ;i < 9/*questions.length*/; i++){
            q[i]=new Label(i+1+". "+questions[i]);
            group[i] = new ToggleGroup();
            tb[i] = new RadioButton("True");
            fb[i] = new RadioButton("False");
            tb[i].setPadding(new Insets(3)); // sets spacing in pixels around the True buttons.
            fb[i].setPadding(new Insets(2,2,8,2)); // sets spacing in pixels around the False buttons.
            
            tb[i].setToggleGroup(group[i]);
            fb[i].setToggleGroup(group[i]);
            answers[i]=new HBox(tb[i],fb[i]);
            
            tb[i].setOnAction(new tb(i,userAnswers));
            fb[i].setOnAction(new fb(i,userAnswers));
            questionBox[i]=new VBox(q[i], answers[i]);
            questionBox[i].setAlignment(Pos.CENTER_LEFT);
            questionBox[i].setPadding(new Insets(3,20,3,20));
        }
	//q10
		Label q10=new Label("10. "+questions[9]);
		HBox questionBox10=new HBox(q10);
		ToggleGroup group10 = new ToggleGroup();
	    
		RadioButton a = new RadioButton("The Little Mermaid");
	    a.setToggleGroup(group10);
	    RadioButton b = new RadioButton("Finding Nemo");
	    b.setToggleGroup(group10);
	    RadioButton c = new RadioButton("The Lion King");
	    c.setToggleGroup(group10);
	    RadioButton d = new RadioButton("The Lord of The Rings: The Return of The King");
	    d.setToggleGroup(group10);
	    
	    a.setOnAction(event -> {
			userAnswers[9]="a";
		});
		b.setOnAction(event -> {
			userAnswers[9]="b";
		});
		c.setOnAction(event -> {
			userAnswers[9]="c";
		});
		d.setOnAction(event -> {
			userAnswers[9]="d";
		});
		
	    HBox abcdbox=new HBox(a,b,c,d);
	    VBox qb10=new VBox(questionBox10,abcdbox);
        q10.setAlignment(Pos.CENTER_LEFT);
        q10.setPadding(new Insets(3,20,3,20));
	//submit
		Button sub=new Button("Submit");
		sub.setOnAction(new submitbutton(userAnswers));
		HBox subs=new HBox(sub);

		// parent node
		GridPane gridpane=new GridPane();
		//sets constraints  and it's column,row
		for(int i=0;i<9;i++)	{
			GridPane.setRowIndex(questionBox[i],i);
		}
		GridPane.setRowIndex(qb10,10);
		GridPane.setRowIndex(subs,12);
		
		gridpane.getChildren().addAll(questionBox[0],questionBox[1],questionBox[2],questionBox[3],questionBox[4],questionBox[5],questionBox[6],questionBox[7],questionBox[8],qb10,subs);

		Scene scene=new Scene(gridpane);

		primaryStage.setScene(scene);

		primaryStage.setTitle("Group Project Quiz");

		primaryStage.show();
	}	
}
