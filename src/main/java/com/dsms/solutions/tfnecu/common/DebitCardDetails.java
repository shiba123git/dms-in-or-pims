/**
 * 
 */
package com.dsms.solutions.tfnecu.common;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author shmi0516
 *
 */
@Entity
@Table(name = "DEBIT_CARD_DETAILS")
public class DebitCardDetails implements Serializable {

	private static final long serialVersionUID = -5613248286401094962L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "ccNo")
	private String ccNo;
	@Column(name = "pin")
	private int pin;
	@Column(name = "name")
	private String name;
	@Column(name = "cvvNo")
	private int cvvNo;
	@Column(name = "expairDate")
	private Date expairDate;
	@ManyToOne
	@JoinColumn(name = "accountNumber", nullable = false)
	private BankAccountDetails bankAccountDetails;

	public DebitCardDetails() {
		super();
	}

	public DebitCardDetails(String ccNo, int pin, String name, int cvvNo, Date expairDate,
			BankAccountDetails bankAccountDetails) {
		super();
		this.ccNo = ccNo;
		this.pin = pin;
		this.name = name;
		this.cvvNo = cvvNo;
		this.expairDate = expairDate;
		this.bankAccountDetails = bankAccountDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCcNo() {
		return ccNo;
	}

	public void setCcNo(String ccNo) {
		this.ccNo = ccNo;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCvvNo() {
		return cvvNo;
	}

	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}

	public Date getExpairDate() {
		return expairDate;
	}

	public void setExpairDate(Date expairDate) {
		this.expairDate = expairDate;
	}

	public BankAccountDetails getBankAccountDetails() {
		return bankAccountDetails;
	}

	public void setBankAccountDetails(BankAccountDetails bankAccountDetails) {
		this.bankAccountDetails = bankAccountDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
