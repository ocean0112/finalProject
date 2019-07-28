package application;

import java.io.FileWriter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class submitbutton implements EventHandler<ActionEvent> {

	public submitbutton(String[] userAns) {
		try{
			for(int e=0;e>=userAns.length;e++) {
				FileWriter fw=new FileWriter("userAnswer.txt");
				fw.write(userAns[e]);
				fw.close();
			}
		}catch(Exception e){
			System.out.println("Failed to write to file...");
		}
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}
