package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "out_stock", schema = "pm_db", catalog = "")
public class OutStockEntity {
    private int id;
    private PurchasingEntity purchasingId;
    private ShopEntity shopId;
    private Integer shippingPrice;
    private int outNumber;
    private Timestamp shippingDate;

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
    @Column(name = "purchasing_id")
    public PurchasingEntity getPurchasingId() {
        return purchasingId;
    }

    public void setPurchasingId(PurchasingEntity purchasingId) {
        this.purchasingId = purchasingId;
    }

    @ManyToOne
    @NotNull
    @Column(name = "shop_id")
    public ShopEntity getShopId() {
        return shopId;
    }

    public void setShopId(ShopEntity shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "shipping_price")
    public Integer getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(Integer shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    @Basic
    @NotNull
    @Column(name = "out_number")
    public int getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(int outNumber) {
        this.outNumber = outNumber;
    }

    @Basic
    @Column(name = "shipping_date")
    public Timestamp getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Timestamp shippingDate) {
        this.shippingDate = shippingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutStockEntity that = (OutStockEntity) o;
        return id == that.id &&
                purchasingId == that.purchasingId &&
                shopId == that.shopId &&
                outNumber == that.outNumber &&
                Objects.equals(shippingPrice, that.shippingPrice) &&
                Objects.equals(shippingDate, that.shippingDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, purchasingId, shopId, shippingPrice, outNumber, shippingDate);
    }
}
