package lasflores.service;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import lasflores.dao.UserRegDAO;
import lasflores.model.NewUserReg;

@Service
public class NewUserRegServiceImpl implements NewUserRegService


{
	
	@Autowired
	private UserRegDAO userregDAO;
	
	@Transactional
	public void saveNewUserReg(NewUserReg theNewUserReg) {
		userregDAO.saveNewUserReg(theNewUserReg);
		}
	
		@Transactional
		public NewUserReg getNewUserReg(int theId) {
		 return userregDAO.getNewUserReg(theId);
		}

		@Transactional
		public List<NewUserReg> getNewUserReg() {
		            return userregDAO.getNewUserReg();
		}

}
