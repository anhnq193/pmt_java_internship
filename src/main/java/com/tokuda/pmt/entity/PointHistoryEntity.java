package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "point_history", schema = "pm_db", catalog = "")
public class PointHistoryEntity {
    private int id;
    private PurchasingEntity purchasing;
    private PointEntity point;
    private Integer currentPoint;
    private Integer usePoint;
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
    @NotNull
    @Column(name = "purchasing_id")
    public PurchasingEntity getPurchasing() {
        return purchasing;
    }

    public void setPurchasing(PurchasingEntity purchasing) {
        this.purchasing = purchasing;
    }

    @ManyToOne
    @NotNull
    @Column(name = "point_id")
    public PointEntity getPoint() {
        return point;
    }

    public void setPoint(PointEntity point) {
        this.point = point;
    }

    @Basic
    @Column(name = "current_point")
    public Integer getCurrentPoint() {
        return currentPoint;
    }

    public void setCurrentPoint(Integer currentPoint) {
        this.currentPoint = currentPoint;
    }

    @Basic
    @Column(name = "use_point")
    public Integer getUsePoint() {
        return usePoint;
    }

    public void setUsePoint(Integer usePoint) {
        this.usePoint = usePoint;
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
        PointHistoryEntity that = (PointHistoryEntity) o;
        return id == that.id &&
                purchasing == that.purchasing &&
                point == that.point &&
                Objects.equals(currentPoint, that.currentPoint) &&
                Objects.equals(usePoint, that.usePoint) &&
                Objects.equals(useDate, that.useDate) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, purchasing, point, currentPoint, usePoint, useDate, createdDate, updatedDate);
    }
}
