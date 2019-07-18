package application;

import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class trueResponse implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent event) {
		try {
			File file=new File("userAnswer.txt");
			FileWriter write=new FileWriter(file);
			write.write("True \n f");
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
