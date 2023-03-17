package pj1.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import pj1.Model.Voter;

@Repository
public class VoterDao {
	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public void voterSaveOrUpdate(Voter voter) {
		this.hibernateTemplate.saveOrUpdate(voter);
	}

	@Transactional
	public void voterDelete(int ID) {
		Voter voter = this.hibernateTemplate.get(Voter.class, ID);
		this.hibernateTemplate.delete(voter);
	}

	@Transactional
	public Voter voterget(int Id) {
		Voter voter = this.hibernateTemplate.get(Voter.class, Id);
		return voter;
	}

	@Transactional
	public List<Voter> votergetall() {
		List<Voter> voter = this.hibernateTemplate.loadAll(Voter.class);
		return voter;
	}
	

}
