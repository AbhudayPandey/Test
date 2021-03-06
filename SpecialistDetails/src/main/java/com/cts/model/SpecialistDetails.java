package com.cts.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import javax.persistence.*;
import java.util.Date;
@ToString
@Data
@AllArgsConstructor
@NonNull
@NoArgsConstructor
@Entity
@Table(name = "specialist_details")
public class SpecialistDetails {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;
    private String type;
    private String name;
    private String availableday;
    private String availabletime;
	
    
    
   
	
}
