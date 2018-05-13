package neu.edu.entity;
// Generated Apr 28, 2017 7:49:59 AM by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * Payment generated by hbm2java
 */
public class Payment implements java.io.Serializable {

	private Integer id;
	private Projects projects;
	private UserAccounts userAccounts;
	private UserPaymentInfo userPaymentInfo;
	private Integer amount;
	private Date paymentDate;

	public Payment() {
	}

	public Payment(Projects projects, UserAccounts userAccounts, UserPaymentInfo userPaymentInfo, Integer amount,
			Date paymentDate) {
		this.projects = projects;
		this.userAccounts = userAccounts;
		this.userPaymentInfo = userPaymentInfo;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Projects getProjects() {
		return this.projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	public UserAccounts getUserAccounts() {
		return this.userAccounts;
	}

	public void setUserAccounts(UserAccounts userAccounts) {
		this.userAccounts = userAccounts;
	}

	public UserPaymentInfo getUserPaymentInfo() {
		return this.userPaymentInfo;
	}

	public void setUserPaymentInfo(UserPaymentInfo userPaymentInfo) {
		this.userPaymentInfo = userPaymentInfo;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

}
