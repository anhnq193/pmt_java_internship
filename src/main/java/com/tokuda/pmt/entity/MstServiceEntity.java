package com.tokuda.pmt.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "mst_service", schema = "pm_db", catalog = "")
public class MstServiceEntity {
    private int id;
    private ShopEntity shop;
    private MstCustomerTypeEntity customerType;
    private String serviceName;
    private String serviceDescription;
    private Integer fee;
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

    @ManyToOne
    @Column(name = "customer_type_id")
    public MstCustomerTypeEntity getCustomerType() {
        return customerType;
    }

    public void setCustomerType(MstCustomerTypeEntity customerType) {
        this.customerType = customerType;
    }

    @Basic
    @Column(name = "service_name")
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Basic
    @Column(name = "service_description")
    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    @Basic
    @Column(name = "fee")
    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
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
        MstServiceEntity that = (MstServiceEntity) o;
        return id == that.id &&
                shop == that.shop &&
                status == that.status &&
                Objects.equals(customerType, that.customerType) &&
                Objects.equals(serviceName, that.serviceName) &&
                Objects.equals(serviceDescription, that.serviceDescription) &&
                Objects.equals(fee, that.fee) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, shop, customerType, serviceName, serviceDescription, fee, createdDate, updatedDate, status);
    }
}
