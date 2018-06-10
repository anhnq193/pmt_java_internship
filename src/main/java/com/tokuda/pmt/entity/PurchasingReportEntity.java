package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "purchasing_report", schema = "pm_db", catalog = "")
public class PurchasingReportEntity {
    private int id;
    private PurchasingEntity purchasing;
    private String purchasingType;
    private String memo;
    private Integer money;
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
    @Column(name = "purchasing_id")
    public PurchasingEntity getPurchasing() {
        return purchasing;
    }

    public void setPurchasing(PurchasingEntity purchasing) {
        this.purchasing = purchasing;
    }

    @Basic
    @NotNull
    @Column(name = "purchasing_type")
    public String getPurchasingType() {
        return purchasingType;
    }

    public void setPurchasingType(String purchasingType) {
        this.purchasingType = purchasingType;
    }

    @Basic
    @Column(name = "memo")
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "money")
    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
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
        PurchasingReportEntity that = (PurchasingReportEntity) o;
        return id == that.id &&
                purchasing == that.purchasing &&
                Objects.equals(purchasingType, that.purchasingType) &&
                Objects.equals(memo, that.memo) &&
                Objects.equals(money, that.money) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, purchasing, purchasingType, memo, money, createdDate, updatedDate);
    }
}
