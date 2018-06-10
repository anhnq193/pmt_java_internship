package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "purchasing_online_detail", schema = "pm_db", catalog = "")
public class PurchasingOnlineDetailEntity {
    private int id;
    private PurchasingOnlineEntity purchasingOnline;
    private ProductEntity product;
    private int price;
    private int number;
    private int fee;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @NotNull
    @Column(name = "purchasing_online_id")
    public PurchasingOnlineEntity getPurchasingOnline() {
        return purchasingOnline;
    }

    public void setPurchasingOnline(PurchasingOnlineEntity purchasingOnline) {
        this.purchasingOnline = purchasingOnline;
    }

    @ManyToOne
    @NotNull
    @Column(name = "product_id")
    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    @Basic
    @NotNull
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @NotNull
    @Column(name = "number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Basic
    @Column(name = "fee")
    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Basic
    @NotNull
    @Column(name = "created_date")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @NotNull
    @Column(name = "updated_date")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchasingOnlineDetailEntity that = (PurchasingOnlineDetailEntity) o;
        return id == that.id &&
                purchasingOnline == that.purchasingOnline &&
                product == that.product &&
                price == that.price &&
                number == that.number &&
                fee == that.fee &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, purchasingOnline, product, price, number, fee, createdDate, updatedDate);
    }
}
