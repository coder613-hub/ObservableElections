package assignment5;

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
