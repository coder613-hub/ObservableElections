package assignment5;

import java.util.ArrayList;
import java.util.Observable;

public class RepFavoredObserver extends ReportStatistics{
	
	public RepFavoredObserver(Observable o, ArrayList<State> states) {
		super(o, states);
		super.setPopStrategy(new ReduceDemByFive());
		super.setElectStrategy(new StateAlwaysGoesRep());
		super.update(o, states);
	}
	

}
