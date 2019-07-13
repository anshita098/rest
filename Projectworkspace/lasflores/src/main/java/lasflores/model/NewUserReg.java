package lasflores.model;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="customer")
public class NewUserReg 
{

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="userreg_generator")
	@SequenceGenerator(name="userreg_generator",sequenceName="userreg",allocationSize=1)
	@Column(name="id",updatable=false,nullable=false)
	private int id;
	
	@Column(name="firstname") 
	private String firstname;
	
	@Column(name="lastname") 
	private String lastname;
	
	//@Size(min=6)
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name= "phoneno")
	private String phoneno;
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


	
	@Override
	public String toString() {
		return "NewUserReg [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", password=" + password
				+ ", email=" + email + ", phoneno=" + phoneno + "]";
	}
	


}
