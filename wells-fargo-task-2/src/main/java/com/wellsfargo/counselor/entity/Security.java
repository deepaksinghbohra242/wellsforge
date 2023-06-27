package com.wellsfargo.counselor.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
@Entity
public class Security {




        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long securityId;

        @ManyToOne
        private Portfolio portfolio;

        private String name;
        private String category;
        private LocalDate purchaseDate;
        private double purchasePrice;
        private int quantity;

        public Security() {
            // Default constructor
        }

        public Security(Portfolio portfolio, String name, String category, LocalDate purchaseDate, double purchasePrice, int quantity) {
            this.portfolio = portfolio;
            this.name = name;
            this.category = category;
            this.purchaseDate = purchaseDate;
            this.purchasePrice = purchasePrice;
            this.quantity = quantity;
        }

        // Getters and setters

    public Long getSecurityId() {
        return securityId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
