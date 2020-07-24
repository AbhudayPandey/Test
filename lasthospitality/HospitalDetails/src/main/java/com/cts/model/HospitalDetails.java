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
@NoArgsConstructor
@Entity
@Table(name = "hospital_details")
public class HospitalDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hid;
    private String hname;
    private Integer numberofbeds;
}
