package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "stock_history", schema = "pm_db", catalog = "")
public class StockHistoryEntity {
    private int id;
    private ProductEntity product;
    private StockEntity stock;
    private ShopEntity shop;
    private Timestamp setDate;
    private int presetNumber;
    private int setNumber;

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
    @Column(name = "stock_id")
    public StockEntity getStock() {
        return stock;
    }

    public void setStock(StockEntity stock) {
        this.stock = stock;
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
    @NotNull
    @Column(name = "set_date")
    public Timestamp getSetDate() {
        return setDate;
    }

    public void setSetDate(Timestamp setDate) {
        this.setDate = setDate;
    }

    @Basic
    @NotNull
    @Column(name = "preset_number")
    public int getPresetNumber() {
        return presetNumber;
    }

    public void setPresetNumber(int presetNumber) {
        this.presetNumber = presetNumber;
    }

    @Basic
    @NotNull
    @Column(name = "set_number")
    public int getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(int setNumber) {
        this.setNumber = setNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockHistoryEntity that = (StockHistoryEntity) o;
        return id == that.id &&
                product == that.product &&
                stock == that.stock &&
                shop == that.shop &&
                presetNumber == that.presetNumber &&
                setNumber == that.setNumber &&
                Objects.equals(setDate, that.setDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, product, stock, shop, setDate, presetNumber, setNumber);
    }
}
