import javafx.event.ActionEvent; 
import javafx.event.EventHandler;

public class fb implements EventHandler<ActionEvent> {
	private int i;
	private String[] userAnswers;
	public fb(int i, String[] userAnswers) {
		// TODO Auto-generated constructor stub
		this.i=i;
		this.userAnswers=userAnswers;
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		userAnswers[i]="False";
	}

}
