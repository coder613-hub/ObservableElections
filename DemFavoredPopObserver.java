package assignment5;

import java.util.ArrayList;
import java.util.Observable;

public class DemFavoredPopObserver extends ReportStatistics{
	//Sara Nordlicht
	//Penina Rockove
	public DemFavoredPopObserver(Observable o, ArrayList<State> states) {
		super(o, states);
		super.setPopStrategy(new IgnoreHighestRepState());
		super.setElectStrategy(new HonestElect());
		super.update(o, states);
	}
}
