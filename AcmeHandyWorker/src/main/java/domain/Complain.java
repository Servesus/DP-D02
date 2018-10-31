
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Complain extends DomainEntity {

	private String				ticker;
	private Date				moment;
	private String				description;
	private Collection<String>	attchment;


	@NotBlank
	public String getTicker() {
		return this.ticker;
	}

	@Column(unique = true)
	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public Collection<String> getAttchment() {
		return this.attchment;
	}

	public void setAttchment(final Collection<String> attchment) {
		this.attchment = attchment;
	}

}
