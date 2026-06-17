package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    @Column(nullable = false)
    private LocalDate createdDate;

    protected Portfolio() {}

    public Portfolio(Client client, LocalDate createdDate) {
        this.client = client;
        this.createdDate = createdDate;
    }

    // getters + setters
}