package assignment5;

import java.util.ArrayList;
import java.util.Observable;

public class HonestObserver extends ReportStatistics{
	//Sara Nordlicht
	//Penina Rockove
	public HonestObserver(Observable o, ArrayList<State> states) {
		super(o, states);
		super.setPopStrategy(new HonestPop());
		super.setElectStrategy(new HonestElect());
		super.update(o, states);
	}

}
