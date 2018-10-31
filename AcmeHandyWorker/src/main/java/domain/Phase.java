
package domain;

import java.util.Date;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Phase extends DomainEntity {

	//Attribute
	private String	title;
	private String	description;
	private Date	startMoment;
	private Date	finishMoment;
	private int		number;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public Date getStartMoment() {
		return this.startMoment;
	}

	public void setStartMoment(final Date startMoment) {
		this.startMoment = startMoment;
	}

	public Date getFinishMoment() {
		return this.finishMoment;
	}

	public void setFinishMoment(final Date finishMoment) {
		this.finishMoment = finishMoment;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(final int number) {
		this.number = number;
	}
}
