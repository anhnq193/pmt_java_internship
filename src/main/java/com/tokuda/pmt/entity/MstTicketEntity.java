package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "mst_ticket", schema = "pm_db", catalog = "")
public class MstTicketEntity {
    private int id;
    private ShopEntity shop;
    private MstCustomerTypeEntity customerType;
    private byte isEnable;
    private String name;
    private int fee;
    private int validMonths;
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
    @Column(name = "shop_id")
    public ShopEntity getShop() {
        return shop;
    }

    public void setShop(ShopEntity shop) {
        this.shop = shop;
    }

    @ManyToOne
    @NotNull
    @Column(name = "customer_type_id")
    public MstCustomerTypeEntity getCustomerType() {
        return customerType;
    }

    public void setCustomerType(MstCustomerTypeEntity customerType) {
        this.customerType = customerType;
    }

    @Basic
    @NotNull
    @Column(name = "is_enable")
    public byte getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(byte isEnable) {
        this.isEnable = isEnable;
    }

    @Basic
    @NotNull
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
    @NotNull
    @Column(name = "valid_months")
    public int getValidMonths() {
        return validMonths;
    }

    public void setValidMonths(int validMonths) {
        this.validMonths = validMonths;
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
        MstTicketEntity that = (MstTicketEntity) o;
        return id == that.id &&
                shop == that.shop &&
                customerType == that.customerType &&
                isEnable == that.isEnable &&
                fee == that.fee &&
                validMonths == that.validMonths &&
                Objects.equals(name, that.name) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, shop, customerType, isEnable, name, fee, validMonths, createdDate, updatedDate);
    }
}
