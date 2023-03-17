package pj1.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import pj1.Model.Admin;
import pj1.Model.Candidate;

@Repository
public class AdminDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public Admin adminget(int Id) throws Exception {
		Admin admin = this.hibernateTemplate.get(Admin.class, Id);
		return admin;
	}

	@Transactional
	public List<Admin> admingetAll() {
		List<Admin> admin = this.hibernateTemplate.loadAll(Admin.class);
		return admin;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
