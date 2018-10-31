
package domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Fix_up_Task extends DomainEntity {

	private String	ticker;
	private Date	starDate;
	private String	description;
	private String	address;
	private double	maxPrice;
	private Date	estimatedDate;


	@NotBlank
	public String getTicker() {
		return this.ticker;
	}

	@Column(unique = true)
	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getStarDate() {
		return this.starDate;
	}

	public void setStarDate(final Date starDate) {
		this.starDate = starDate;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@NotBlank
	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	public double getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(final double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Date getEstimatedDate() {
		return this.estimatedDate;
	}

	public void setEstimatedDate(final Date estimatedDate) {
		this.estimatedDate = estimatedDate;
	}

}
