
package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class UserAccount extends Actor {

	private String	userName;
	private int		password;


	@NotBlank
	@Column(unique = true)
	@Size(min = 5, max = 15)
	public String getUserName() {
		return this.userName;
	}

	@Size(min = 8, max = 20)
	public int getPassword() {
		return this.password;
	}

	public void setUserName(final String userName) {
		this.userName = userName;
	}

	public void setPassword(final int password) {
		this.password = password;
	}

}
