package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hospital_details")
public class Hospital {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hid;
    private String hname;
    private Integer numberofbeds;
}
