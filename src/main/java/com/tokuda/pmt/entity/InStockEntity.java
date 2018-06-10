package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "in_stock", schema = "pm_db", catalog = "")
public class InStockEntity {
    private int id;
    private ProductEntity product;
    private ShopEntity shop;
    private Integer inNumber;
    private Integer purchasedPrice;
    private Integer orderStatus;
    private Timestamp orderDate;
    private Timestamp inDate;
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
    @Column(name = "product_id")
    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    @ManyToOne
    @NotNull
    @Column(name = "shop_id")
    public ShopEntity getShop() {
        return shop;
    }

    public void setShop(ShopEntity shop) {
        this.shop = shop;
    }

    @Basic
    @Column(name = "in_number")
    public Integer getInNumber() {
        return inNumber;
    }

    public void setInNumber(Integer inNumber) {
        this.inNumber = inNumber;
    }

    @Basic
    @Column(name = "purchased_price")
    public Integer getPurchasedPrice() {
        return purchasedPrice;
    }

    public void setPurchasedPrice(Integer purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
    }

    @Basic
    @Column(name = "order_status")
    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "order_date")
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "in_date")
    public Timestamp getInDate() {
        return inDate;
    }

    public void setInDate(Timestamp inDate) {
        this.inDate = inDate;
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
        InStockEntity that = (InStockEntity) o;
        return id == that.id &&
                product == that.product &&
                shop == that.shop &&
                Objects.equals(inNumber, that.inNumber) &&
                Objects.equals(purchasedPrice, that.purchasedPrice) &&
                Objects.equals(orderStatus, that.orderStatus) &&
                Objects.equals(orderDate, that.orderDate) &&
                Objects.equals(inDate, that.inDate) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, product, shop, inNumber, purchasedPrice, orderStatus, orderDate, inDate, createdDate, updatedDate);
    }
}
