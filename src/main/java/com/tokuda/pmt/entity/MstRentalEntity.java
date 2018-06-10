package com.tokuda.pmt.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "mst_rental", schema = "pm_db", catalog = "")
public class MstRentalEntity {
    private int id;
    private ShopEntity shop;
    private String retalName;
    private String retalDescription;
    private int fee;
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
    public ShopEntity getShop() {
        return shop;
    }

    public void setShop(ShopEntity shop) {
        this.shop = shop;
    }

    @Basic
    @Column(name = "retal_name")
    public String getRetalName() {
        return retalName;
    }

    public void setRetalName(String retalName) {
        this.retalName = retalName;
    }

    @Basic
    @Column(name = "retal_description")
    public String getRetalDescription() {
        return retalDescription;
    }

    public void setRetalDescription(String retalDescription) {
        this.retalDescription = retalDescription;
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
        MstRentalEntity that = (MstRentalEntity) o;
        return id == that.id &&
                shop == that.shop &&
                fee == that.fee &&
                status == that.status &&
                Objects.equals(retalName, that.retalName) &&
                Objects.equals(retalDescription, that.retalDescription) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, shop, retalName, retalDescription, fee, createdDate, updatedDate, status);
    }
}
