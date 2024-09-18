package org.zerock.hrm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long employeeId; // 사원 번호
  
}
