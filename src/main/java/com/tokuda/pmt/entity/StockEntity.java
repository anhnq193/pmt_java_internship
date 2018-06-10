package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "stock", schema = "pm_db", catalog = "")
public class StockEntity {
    private int id;
    private ProductEntity product;
    private ShopEntity shop;
    private int stockNumber;
    private int availableNumber;
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

    @OneToOne
    @NotNull
    @JoinColumn(name = "product_id")
    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    @ManyToOne
    @NotNull
    @JoinColumn(name = "shop_id")
    public ShopEntity getShop() {
        return shop;
    }

    public void setShop(ShopEntity shop) {
        this.shop = shop;
    }

    @Basic
    @NotNull
    @Column(name = "stock_number")
    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }

    @Basic
    @NotNull
    @Column(name = "available_number")
    public int getAvailableNumber() {
        return availableNumber;
    }

    public void setAvailableNumber(int availableNumber) {
        this.availableNumber = availableNumber;
    }

    @Basic
    @Column(name = "created_date")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
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
        StockEntity that = (StockEntity) o;
        return id == that.id &&
                product.equals(that.product) &&
                shop.equals(that.shop) &&
                stockNumber == that.stockNumber &&
                availableNumber == that.availableNumber &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, product, shop, stockNumber, availableNumber, createdDate, updatedDate);
    }
}
