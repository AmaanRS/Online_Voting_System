package pj1.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int voterId;
	private String voterName;
	private String voterPassword;

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	public String getVoterName() {
		return voterName;
	}

	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}

	public String getVoterPassword() {
		return voterPassword;
	}

	public void setVoterPassword(String voterPassword) {
		this.voterPassword = voterPassword;
	}

	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", voterName=" + voterName + ", voterPassword=" + voterPassword + "]";
	}

	public Voter(int voterId, String voterName, String voterPassword) {
		super();
		this.voterId = voterId;
		this.voterName = voterName;
		this.voterPassword = voterPassword;
	}

	public Voter() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
