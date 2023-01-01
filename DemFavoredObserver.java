package assignment5;

import java.util.ArrayList;
import java.util.Observable;
//Sara Nordlicht
//Penina Rockove
public class DemFavoredObserver extends ReportStatistics {

	public DemFavoredObserver(Observable o, ArrayList<State> states) {
		super(o, states);
		super.setPopStrategy(new IgnoreHighestRepState());
		super.setElectStrategy(new StateWithMostElectoralGoesDem());
		super.update(o, states);
	}

}
