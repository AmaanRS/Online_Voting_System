package pj1.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int candidateId;
	private String candidateName;
	
	
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", candidateName=" + candidateName + "]";
	}
	public Candidate(int candidateId, String candidateName) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
	}
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
