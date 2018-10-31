
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Message extends DomainEntity {

	//Attributes
	private Date				sendDate;
	private Actor				recipient;
	private Actor				sender;
	private String				subject;
	private String				body;
	private Collection<String>	priority;


	//Getters and Setters
	@NotNull
	public Date getSendDate() {
		return this.sendDate;
	}

	public void setSendDate() {
		final Date date = new Date();
		this.sendDate = date;
	}
	@Valid
	public Actor getRecipient() {
		return this.recipient;
	}

	public void setRecipient(final Actor recipient) {
		this.recipient = recipient;
	}
	@Valid
	public Actor getSender() {
		return this.sender;
	}

	public void setSender(final Actor sender) {
		this.sender = sender;
	}
	@NotBlank
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(final String subject) {
		this.subject = subject;
	}
	@NotBlank
	public String getBody() {
		return this.body;
	}

	public void setBody(final String body) {
		this.body = body;
	}

	public Collection<String> getPriority() {
		return this.priority;
	}

	public void setPriority(final Collection<String> priority) {
		this.priority = priority;
	}

}
