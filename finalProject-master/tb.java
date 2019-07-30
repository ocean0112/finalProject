import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class tb implements EventHandler<ActionEvent> {
	private int i;
	private String[] userAnswers;
	public tb(int i, String[] userAnswers) {
		 this.i=i;
		 this.userAnswers=userAnswers;
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		userAnswers[i]="True";
	}

}
