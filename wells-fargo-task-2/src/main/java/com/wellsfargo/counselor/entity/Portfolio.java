package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

@Entity
public class Portfolio {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long portfolioId;

        @ManyToOne
        private Client client;

        private double balance;

        public Portfolio() {
            // Default constructor
        }

        public Portfolio(Client client, double balance) {
            this.client = client;
            this.balance = balance;
        }

        // Getters and setters


    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
