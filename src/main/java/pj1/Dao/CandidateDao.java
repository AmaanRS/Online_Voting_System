package pj1.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import pj1.Model.Candidate;

@Repository
public class CandidateDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void candidateSaveOrUpdate(Candidate candidate) {
		this.hibernateTemplate.saveOrUpdate(candidate);
	}

	@Transactional
	public void candidateDelete(int ID) {
		Candidate candidate = this.hibernateTemplate.get(Candidate.class, ID);
		this.hibernateTemplate.delete(candidate);
	}

	@Transactional
	public Candidate candidateget(int Id) {
		Candidate candidate = this.hibernateTemplate.get(Candidate.class, Id);
		return candidate;
	}

	@Transactional
	public List<Candidate> candidategetall() {
		List<Candidate> candidate = this.hibernateTemplate.loadAll(Candidate.class);
		return candidate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
