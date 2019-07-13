package lasflores.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import lasflores.model.NewUserReg;


@Repository
public class UserRegDAOImpl implements UserRegDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveNewUserReg(NewUserReg theNewUserReg) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theNewUserReg);
	}

	public List<NewUserReg> getNewUserReg() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder cb= session.getCriteriaBuilder();
		CriteriaQuery<NewUserReg> cq=cb.createQuery(NewUserReg.class);
		Root<NewUserReg>root =cq.from(NewUserReg.class);
		cq.select(root);
		Query query= session.createQuery(cq);
		return query.getResultList();
	}

	public NewUserReg getNewUserReg(int theId) {
		// TODO Auto-generated method stub
		Session currentSession= sessionFactory.getCurrentSession();
		NewUserReg theNewUserReg=currentSession.get(NewUserReg.class,theId);
		return theNewUserReg;
	}
	
	


	

	
	

	

}
