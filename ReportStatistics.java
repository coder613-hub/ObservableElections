package assignment5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public abstract class ReportStatistics implements Observer {
	IPopularVoteStrategy popStrategy;
	IElectoralVoteStrategy electStrategy;
	PopularVote popVote;
	ElectoralVote electVote;
	ArrayList<State> states;
	
	public ReportStatistics(Observable o, ArrayList<State> states) {
		o.addObserver(this);
		this.states = states;
	}
	
	public void update(Observable o, Object arg) {
		if(o instanceof ElectionStats) {
			ElectionStats stats = (ElectionStats) o;
			stats.setStates(states);
			this.popVote = popStrategy.getPopularStrategy(states);
			this.electVote = electStrategy.getElectoralStrategy(states);
			display();
		}
	}

	public void setPopStrategy(IPopularVoteStrategy popStrategy) {
		this.popStrategy = popStrategy;
	}

	public void setElectStrategy(IElectoralVoteStrategy electStrategy) {
		this.electStrategy = electStrategy;
	}
	

	public PopularVote getPopVote() {
		return popVote;
	}

	public void setPopVote(PopularVote popVote) {
		this.popVote = popVote;
	}

	public ElectoralVote getElectVote() {
		return electVote;
	}

	public void setElectVote(ElectoralVote electVote) {
		this.electVote = electVote;
	}

	public void display() {
		System.out.println("\nPopular Strategy - " + popStrategy.getStrategyName()
				+ "\nElectoral Strategy - " + electStrategy.getStrategyName());
		System.out.println("Total Democratic Electoral Votes: " + electVote.getDemVotes());
		System.out.println("Total Republican Electoral Votes: " + electVote.getRepVotes());
		System.out.println("Total Democratic Popular Votes: " + popVote.getDemVote());
		System.out.println("Total Republican Popular Votes: " + popVote.getRepVote());
		System.out.println("\nAll reports are purely observational"
				+ "\nand not legally binding in any way.");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	    Date date = new Date();
	    System.out.println(formatter.format(date)); 
	}
}
