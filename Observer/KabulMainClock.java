package observerHW;

import java.util.ArrayList;
import java.util.List;

public class KabulMainClock {
	
	private List<Observer> observer = 
			new ArrayList<Observer>();

	private int state;
	
	public int getState(){
		return state;
		
	}
	
	public void setState(int state){
		this.state = state;
		notifyAllObs();
	}
	
	public void attach(Observer obs){
		observer.add(obs);
	}

	private void notifyAllObs() {
		// TODO Auto-generated method stub
		
		for (Observer obs: observer){
			obs.update();
			
		}
		
	}
}

