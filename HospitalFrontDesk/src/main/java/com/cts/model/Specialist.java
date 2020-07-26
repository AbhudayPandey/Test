package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "specialist_details")
public class Specialist {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;
    private String type;
    private String sname;
    private String availableday;
    private String availabletime;
	
    
}
