
package lasflores.service;

import java.util.List;

import lasflores.model.NewUserReg;



public interface NewUserRegService {
	
	public void saveNewUserReg(NewUserReg theNewUserReg);
	
	public NewUserReg getNewUserReg(int theId);
	
	public List<NewUserReg>getNewUserReg();

}
