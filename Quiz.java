package application;
import javafx.application.Application; 
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Quiz extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);
	}
public static String[] userAns=new String[10];
	@Override
	public void start(Stage primaryStage) {
	//q1
		Label q=new Label("1) ");
		HBox questionBox=new HBox(q);
		 
		ToggleGroup group1 = new ToggleGroup();
	    RadioButton tb = new RadioButton("True");
	    tb.setToggleGroup(group1);
	    tb.setSelected(true);
	    RadioButton fb = new RadioButton("False");
	    fb.setToggleGroup(group1);
		HBox tAnswer=new HBox(tb);
		HBox fAnswer=new HBox(fb);

		
	
	//q2
		Label q2=new Label("2) ");
		HBox questionBox2=new HBox(q2);
		
		ToggleGroup group2 = new ToggleGroup();
	    RadioButton tb2 = new RadioButton("True");
	    tb2.setToggleGroup(group2);
	    tb2.setSelected(true);
	    RadioButton fb2 = new RadioButton("False");
	    fb2.setToggleGroup(group2);
		HBox tAnswer2=new HBox(tb);
		HBox fAnswer2=new HBox(fb);
		
	//q3
		Label q3=new Label("3) ");
		HBox questionBox3=new HBox(q3);
		
		ToggleGroup group3 = new ToggleGroup();
	    RadioButton tb3 = new RadioButton("True");
	    tb3.setToggleGroup(group3);
	    tb3.setSelected(true);
	    RadioButton fb3 = new RadioButton("False");
	    fb3.setToggleGroup(group3);
		HBox tAnswer3=new HBox(tb3);
		HBox fAnswer3=new HBox(fb3);

	//q4
		Label q4=new Label("4) ");
		HBox questionBox4=new HBox(q4);
		
		ToggleGroup group4 = new ToggleGroup();
	    RadioButton tb4 = new RadioButton("True");
	    tb4.setToggleGroup(group4);
	    tb4.setSelected(true);
	    RadioButton fb4 = new RadioButton("False");
	    fb4.setToggleGroup(group4);
		HBox tAnswer4=new HBox(tb4);
		HBox fAnswer4=new HBox(fb4);
		
	//q5	
		Label q5=new Label("5) ");
		HBox questionBox5=new HBox(q5);
		
		ToggleGroup group5 = new ToggleGroup();
	    RadioButton tb5 = new RadioButton("True");
	    tb5.setToggleGroup(group5);
	    tb5.setSelected(true);
	    RadioButton fb5 = new RadioButton("False");
	    fb5.setToggleGroup(group5);
		HBox tAnswer5=new HBox(tb5);
		HBox fAnswer5=new HBox(fb5);
		
	//q6
		Label q6=new Label("6) ");
		HBox questionBox6=new HBox(q6);
		
		ToggleGroup group6 = new ToggleGroup();
	    RadioButton tb6 = new RadioButton("True");
	    tb6.setToggleGroup(group6);
	    tb6.setSelected(true);
	    RadioButton fb6 = new RadioButton("False");
	    fb6.setToggleGroup(group6);
		HBox tAnswer6=new HBox(tb6);
		HBox fAnswer6=new HBox(fb6);
	//q7
		Label q7=new Label("7) ");
		HBox questionBox7=new HBox(q7);
		
		ToggleGroup group7 = new ToggleGroup();
	    RadioButton tb7 = new RadioButton("True");
	    tb7.setToggleGroup(group7);
	    tb7.setSelected(true);
	    RadioButton fb7 = new RadioButton("False");
	    fb7.setToggleGroup(group7);
		HBox tAnswer7=new HBox(tb7);
		HBox fAnswer7=new HBox(fb7);
		
	//q8
		Label q8=new Label("8) ");
		HBox questionBox8=new HBox(q8);
		
		ToggleGroup group8 = new ToggleGroup();
	    RadioButton tb8 = new RadioButton("True");
	    tb8.setToggleGroup(group8);
	    tb8.setSelected(true);
	    RadioButton fb8 = new RadioButton("False");
	    fb8.setToggleGroup(group8);
		HBox tAnswer8=new HBox(tb8);
		HBox fAnswer8=new HBox(fb8);
		
	//q9
		Label q9=new Label("9) ");
		HBox questionBox9=new HBox(q9);
		
		ToggleGroup group9 = new ToggleGroup();
	    RadioButton tb9 = new RadioButton("True");
	    tb9.setToggleGroup(group9);
	    tb9.setSelected(true);
	    RadioButton fb9 = new RadioButton("False");
	    fb9.setToggleGroup(group9);
		HBox tAnswer9=new HBox(tb9);
		HBox fAnswer9=new HBox(fb9);
	//q10
		Label q10=new Label("10) ");
		HBox questionBox10=new HBox(q10);
		ToggleGroup group10 = new ToggleGroup();
	    RadioButton a = new RadioButton("A");
	    a.setToggleGroup(group10);
	    a.setSelected(true);
	    RadioButton b = new RadioButton("B");
	    b.setToggleGroup(group2);
	    RadioButton c = new RadioButton("C");
	    c.setToggleGroup(group10);
	    RadioButton d = new RadioButton("D");
	    d.setToggleGroup(group10);
	    HBox abox=new HBox(a);
	    HBox bbox=new HBox(b);
	    HBox cbox=new HBox(c);
	    HBox dbox=new HBox(d);
	//submit
		Label submit=new Label("Submit");
		Button sub=new Button();

		HBox subs=new HBox(submit,sub);

		// parent node
		GridPane gridpane=new GridPane();
		//sets constraints  and it's column,row
		GridPane.setRowIndex(questionBox,0);
		GridPane.setConstraints(tAnswer, 0, 1);
		GridPane.setConstraints(fAnswer, 2, 1);

		GridPane.setRowIndex(questionBox2, 2);
		GridPane.setConstraints(tAnswer2, 0, 3);
		GridPane.setConstraints(fAnswer2, 2, 3);

		GridPane.setRowIndex(questionBox3,4);
		GridPane.setConstraints(tAnswer3, 0, 5);
		GridPane.setConstraints(fAnswer3, 2, 5);

		GridPane.setRowIndex(questionBox4, 6);
		GridPane.setConstraints(tAnswer4, 0, 7);
		GridPane.setConstraints(fAnswer4, 2, 7);

		GridPane.setRowIndex(questionBox5,8);
		GridPane.setConstraints(tAnswer5, 0, 9);
		GridPane.setConstraints(fAnswer5, 2, 9);

		GridPane.setRowIndex(questionBox6, 10);
		GridPane.setConstraints(tAnswer6, 0, 11);
		GridPane.setConstraints(fAnswer6, 2, 11);

		GridPane.setRowIndex(questionBox7,12);
		GridPane.setConstraints(tAnswer7, 0, 13);
		GridPane.setConstraints(fAnswer7, 2, 13);

		GridPane.setRowIndex(questionBox8, 14);
		GridPane.setConstraints(tAnswer8, 0, 15);
		GridPane.setConstraints(fAnswer8, 2, 15);

		GridPane.setRowIndex(questionBox9, 16);
		GridPane.setConstraints(tAnswer9, 0, 17);
		GridPane.setConstraints(fAnswer9, 2, 17);

		GridPane.setRowIndex(questionBox10,18);
		GridPane.setConstraints(abox, 0, 19);
		GridPane.setConstraints(bbox, 1, 19);
		GridPane.setConstraints(cbox, 2, 19);
		GridPane.setConstraints(dbox, 3, 19);
		GridPane.setRowIndex(subs,20);
		gridpane.getChildren().addAll(questionBox,tAnswer,fAnswer, questionBox2,tAnswer2,fAnswer2,questionBox3,tAnswer3,fAnswer3,questionBox4,tAnswer4,fAnswer4,questionBox5,tAnswer5,fAnswer5,questionBox6,tAnswer6,fAnswer6,questionBox7,tAnswer7,fAnswer7,questionBox8,tAnswer8,fAnswer8,questionBox9,tAnswer9,fAnswer9,questionBox10,abox,bbox,cbox,dbox,subs);

		Scene scene=new Scene(gridpane);

		primaryStage.setScene(scene);

		primaryStage.setTitle("Group Project Quiz");

		primaryStage.show();
	}	
}
