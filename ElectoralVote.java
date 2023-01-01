package assignment5;

public class ElectoralVote {
	//Sara Nordlicht
	//Penina Rockove
	private int demVote, repVote;
	
	public ElectoralVote(int dv, int rv) {
		this.demVote = dv;
		this.repVote = rv;
	}

	public int getDemVotes() {
		return demVote;
	}

	public void setDemVotes(int demVotes) {
		this.demVote = demVotes;
	}

	public int getRepVotes() {
		return repVote;
	}

	public void setRepVotes(int repVotes) {
		this.repVote = repVotes;
	}
}
