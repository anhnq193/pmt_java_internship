package com.tokuda.pmt.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "mst_prepaid", schema = "pm_db", catalog = "")
public class MstPrepaidEntity {
    private int id;
    private ShopEntity shopId;
    private byte isEnable;
    private String name;
    private int fee;
    private int balance;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private int status;

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
    @Column(name = "shop_id")
    public ShopEntity getShopId() {
        return shopId;
    }

    public void setShopId(ShopEntity shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "is_enable")
    public byte getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(byte isEnable) {
        this.isEnable = isEnable;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "balance")
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
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

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MstPrepaidEntity that = (MstPrepaidEntity) o;
        return id == that.id &&
                shopId == that.shopId &&
                isEnable == that.isEnable &&
                fee == that.fee &&
                balance == that.balance &&
                status == that.status &&
                Objects.equals(name, that.name) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, shopId, isEnable, name, fee, balance, createdDate, updatedDate, status);
    }
}
