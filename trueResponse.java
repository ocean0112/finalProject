package application;

import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class trueResponse implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent event) {
		try {
			FileWriter write=new FileWriter("userAnswer.txt");
			write.write("True \n f");
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
