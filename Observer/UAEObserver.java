package observerHW;

import java.util.ArrayList;
import java.util.List;

public class UAEObserver extends Observer{
	public UAEObserver(KabulMainClock kab_clock){
		kabul_clock = kab_clock;
		kabul_clock.attach(this);	
	}
	
	private List<Observer_of_UAE> observer = new ArrayList<Observer_of_UAE>();

	private int state;
	
	
	public int getState(){
		return state;
	}
	
	public void Setstate(int state){
		
		this.state = state;
		notifyAlOb();
	}
	
	
	public void attach(Observer_of_UAE obs){
		observer.add(obs);
	}

	@Override
	public void update() {
		System.out.println("I am updated:"+ 22+":"+50);
		
	}

	private void notifyAlOb() {
		for (Observer_of_UAE obs :observer){
			obs.UAE_update();
		}
		
	}

}
