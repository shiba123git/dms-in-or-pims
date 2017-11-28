/**
 * 
 */
package com.dsms.solutions.tfnecu.common;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Babu
 *
 */
@Entity
@Table(name = "T_MY_IMAGE_DETAILS")
public class MyImageDetails implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "imageid")
	private int imageid;
	@Column(name = "name")
	private String name;
	@Column(name = "createdDate")
	private Date createdDate;
	@Column(name = "description")
	private String description;
	@Column(name = "searchCondition")
	private String searchCondition;
	@Column(name = "image")
	private Blob image;

	public MyImageDetails() {
	}

	public int getImageid() {
		return imageid;
	}

	public void setImageid(int imageid) {
		this.imageid = imageid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public MyImageDetails(String name, Date createdDate, String description, String searchCondition, Blob image) {
		super();
		this.name = name;
		this.createdDate = createdDate;
		this.description = description;
		this.searchCondition = searchCondition;
		this.image = image;

	}

}
