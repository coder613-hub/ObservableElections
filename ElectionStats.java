package assignment5;

import java.util.ArrayList;
import java.util.Observable;

public class ElectionStats extends Observable{
	
	private ArrayList<State> states;
	private PopularVote popVote;
	private ElectoralVote electVote;
	
	public ElectionStats(ArrayList<State> states) {
		this.states = states;
	}
	
	public ElectionStats() {
	}

	public void setStates(ArrayList<State> states) {
		this.states = states;
	}
	
	public void statisticsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setStatistics(PopularVote popVote, ElectoralVote electVote) {
		this.popVote = popVote;
		this.electVote = electVote;
		statisticsChanged();
	}

	//Needed for pull -
	public ArrayList<State> getStates(){
		return states;
	}
}
