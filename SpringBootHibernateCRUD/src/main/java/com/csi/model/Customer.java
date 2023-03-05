package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue
    @Column(name = "cust_id")
    private int custId;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_address")
    private String custAddress;

    @Column(name = "cust_contact_number")
    private long custContactNumber;

    @Column(name = "cust_account_balance")
    private Double custAccountBalance;

    @Column(name = "cust_DOB")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date custDOB;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public long getCustContactNumber() {
        return custContactNumber;
    }

    public void setCustContactNumber(long custContactNumber) {
        this.custContactNumber = custContactNumber;
    }

    public Double getCustAccountBalance() {
        return custAccountBalance;
    }

    public void setCustAccountBalance(Double custAccountBalance) {
        this.custAccountBalance = custAccountBalance;
    }

    public Date getCustDOB() {
        return custDOB;
    }

    public void setCustDOB(Date custDOB) {
        this.custDOB = custDOB;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", custContactNumber=" + custContactNumber +
                ", custAccountBalance=" + custAccountBalance +
                ", custDOB=" + custDOB +
                '}';
    }
}
