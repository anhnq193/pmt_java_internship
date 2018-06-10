package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pre_paid_history", schema = "pm_db", catalog = "")
public class PrePaidHistoryEntity {
    private int id;
    private PurchasingEntity purchasingId;
    private PrePaidEntity prePaidId;
    private Integer currentValue;
    private Integer useValue;
    private Timestamp useDate;
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
    @Column(name = "purchasing_id")
    public PurchasingEntity getPurchasingId() {
        return purchasingId;
    }

    public void setPurchasingId(PurchasingEntity purchasingId) {
        this.purchasingId = purchasingId;
    }

    @ManyToOne
    @NotNull
    @Column(name = "pre_paid_id")
    public PrePaidEntity getPrePaidId() {
        return prePaidId;
    }

    public void setPrePaidId(PrePaidEntity prePaidId) {
        this.prePaidId = prePaidId;
    }

    @Basic
    @Column(name = "current_value")
    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    @Basic
    @Column(name = "use_value")
    public Integer getUseValue() {
        return useValue;
    }

    public void setUseValue(Integer useValue) {
        this.useValue = useValue;
    }

    @Basic
    @Column(name = "use_date")
    public Timestamp getUseDate() {
        return useDate;
    }

    public void setUseDate(Timestamp useDate) {
        this.useDate = useDate;
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
        PrePaidHistoryEntity that = (PrePaidHistoryEntity) o;
        return id == that.id &&
                prePaidId == that.prePaidId &&
                Objects.equals(purchasingId, that.purchasingId) &&
                Objects.equals(currentValue, that.currentValue) &&
                Objects.equals(useValue, that.useValue) &&
                Objects.equals(useDate, that.useDate) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, purchasingId, prePaidId, currentValue, useValue, useDate, createdDate, updatedDate);
    }
}
