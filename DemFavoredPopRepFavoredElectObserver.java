package assignment5;

import java.util.ArrayList;
import java.util.Observable;
//Sara Nordlicht
//Penina Rockove 

public class DemFavoredPopRepFavoredElectObserver extends ReportStatistics {

	public DemFavoredPopRepFavoredElectObserver(Observable o, ArrayList<State> states) {
		super(o, states);
		super.setPopStrategy(new IgnoreHighestRepState());
		super.setElectStrategy(new StateAlwaysGoesRep());
		super.update(o, states);
	}

}
