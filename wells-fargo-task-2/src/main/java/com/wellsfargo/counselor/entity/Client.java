package com.wellsfargo.counselor.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;



@Entity
public class Client<FinancialAdvisor> {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long clientId;

        private String name;
        private String phoneNumber;

        @ManyToOne
        private FinancialAdvisor financialAdvisor;

        public Client() {
            // Default constructor
        }

        public Client(String name, String phoneNumber, FinancialAdvisor financialAdvisor) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.financialAdvisor = financialAdvisor;
        }

        // Getters and setters


    public Long getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
