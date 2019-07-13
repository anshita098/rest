package lasflores.dao;

import java.util.List;

import lasflores.model.NewUserReg;

public interface UserRegDAO

{
public void saveNewUserReg(NewUserReg theNewUserReg);
	
	public List<NewUserReg>getNewUserReg();
	
	public NewUserReg getNewUserReg(int theId);
	
	//public void deleteCustomer(int theId);
	
}
