package assignment5;
//Sara Nordlicht
//Penina Rockove
public class PopularVote {
	private int demVote, repVote;

	public PopularVote(int dv, int rv) {
		this.demVote = dv;
		this.repVote = rv;
	}
	
	public int getDemVote() {
		return demVote;
	}

	public void setDemVote(int demVote) {
		this.demVote = demVote;
	}

	public int getRepVote() {
		return repVote;
	}

	public void setRepVote(int repVote) {
		this.repVote = repVote;
	}
}
