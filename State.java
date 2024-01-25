package assignment5;

public class State {
	private String name;
	private int electoralVotes;
	private int demVotes;
	private int repVotes;
	
	public State(String name, int electoralVotes, int repVotes, int demVotes) {
		this.name = name;
		this.electoralVotes = electoralVotes;
		this.demVotes = demVotes;
		this.repVotes = repVotes;
	}
	
	public int getDemVotes() {
		return demVotes;
	}

	public void setDemVotes(int demVotes) {
		this.demVotes = demVotes;
	}

	public int getRepVotes() {
		return repVotes;
	}

	public void setRepVotes(int repVotes) {
		this.repVotes = repVotes;
	}

	public int getDemElectoralVotes() {
		if(demVotes>repVotes) {
			return electoralVotes;
		}
		return 0;
		//deal with close election here - return half
	}
	public int getRepElectoralVotes() {
		if(repVotes>demVotes) {
			return electoralVotes;
		}
		return 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getElectoralVotes() {
		return electoralVotes;
	}


}
