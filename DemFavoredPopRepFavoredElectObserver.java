package assignment5;

import java.util.ArrayList;
import java.util.Observable;

public class DemFavoredPopRepFavoredElectObserver extends ReportStatistics {

	public DemFavoredPopRepFavoredElectObserver(Observable o, ArrayList<State> states) {
		super(o, states);
		super.setPopStrategy(new IgnoreHighestRepState());
		super.setElectStrategy(new StateAlwaysGoesRep());
		super.update(o, states);
	}

}
