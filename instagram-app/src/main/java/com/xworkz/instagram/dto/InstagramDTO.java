package com.xworkz.instagram.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "instagram_table")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class InstagramDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "NO_OF_USERS")
	private double noOfUsers;
	@Column(name = "VERSION")
	private float version;
	@Column(name = "NO_OF_FEATURES")
	private int noOfFeatures;
	@Column(name = "NET_WORTH")
	private double netWorth;
	@Column(name = "IS_PUBLIC")
	private boolean isPublic;
	@Column(name = "TYPE")
	private String type;

	public InstagramDTO(double noOfUsers, float version, int noOfFeatures, double netWorth, boolean isPublic,
			String type) {
		super();
		this.noOfUsers = noOfUsers;
		this.version = version;
		this.noOfFeatures = noOfFeatures;
		this.netWorth = netWorth;
		this.isPublic = isPublic;
		this.type = type;
	}

}
