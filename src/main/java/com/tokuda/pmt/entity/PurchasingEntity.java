package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "purchasing", schema = "pm_db", catalog = "")
public class PurchasingEntity {
    private int id;
    private StaffEntity staff;
    private MemberEntity member;
    private int paymentType;
    private Integer isReserved;
    private int purchasingType;
    private ProductEntity product;
    private MstServiceEntity service;
    private MstRentalEntity rental;
    private Integer rentalNumber;
    private Integer addPrepaidBalance;
    private int prepaidMoney;
    private int coupon;
    private byte children;
    private byte isOut;
    private int additionalFee;
    private Integer usePointStatus;
    private Integer usePoint;
    private Integer point;
    private Integer fee;
    private int adjustFee;
    private int adjustStaffId;
    private String note;
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
    @Column(name = "staff_id")
    public StaffEntity getStaff() {
        return staff;
    }

    public void setStaff(StaffEntity staff) {
        this.staff = staff;
    }

    @ManyToOne
    @Column(name = "member_id")
    public MemberEntity getMember() {
        return member;
    }

    public void setMember(MemberEntity member) {
        this.member = member;
    }

    @Basic
    @NotNull
    @Column(name = "payment_type")
    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    @Basic
    @Column(name = "is_reserved")
    public Integer getIsReserved() {
        return isReserved;
    }

    public void setIsReserved(Integer isReserved) {
        this.isReserved = isReserved;
    }

    @Basic
    @NotNull
    @Column(name = "purchasing_type")
    public int getPurchasingType() {
        return purchasingType;
    }

    public void setPurchasingType(int purchasingType) {
        this.purchasingType = purchasingType;
    }

    @ManyToOne
    @Column(name = "product_id")
    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    @ManyToOne
    @Column(name = "service_id")
    public MstServiceEntity getService() {
        return service;
    }

    public void setService(MstServiceEntity service) {
        this.service = service;
    }

    @ManyToOne
    @Column(name = "rental_id")
    public MstRentalEntity getRental() {
        return rental;
    }

    public void setRental(MstRentalEntity rental) {
        this.rental = rental;
    }

    @Basic
    @Column(name = "rental_number")
    public Integer getRentalNumber() {
        return rentalNumber;
    }

    public void setRentalNumber(Integer rentalNumber) {
        this.rentalNumber = rentalNumber;
    }

    @Basic
    @Column(name = "add_prepaid_balance")
    public Integer getAddPrepaidBalance() {
        return addPrepaidBalance;
    }

    public void setAddPrepaidBalance(Integer addPrepaidBalance) {
        this.addPrepaidBalance = addPrepaidBalance;
    }

    @Basic
    @NotNull
    @Column(name = "prepaid_money")
    public int getPrepaidMoney() {
        return prepaidMoney;
    }

    public void setPrepaidMoney(int prepaidMoney) {
        this.prepaidMoney = prepaidMoney;
    }

    @Basic
    @NotNull
    @Column(name = "coupon")
    public int getCoupon() {
        return coupon;
    }

    public void setCoupon(int coupon) {
        this.coupon = coupon;
    }

    @Basic
    @NotNull
    @Column(name = "children")
    public byte getChildren() {
        return children;
    }

    public void setChildren(byte children) {
        this.children = children;
    }

    @Basic
    @NotNull
    @Column(name = "is_out")
    public byte getIsOut() {
        return isOut;
    }

    public void setIsOut(byte isOut) {
        this.isOut = isOut;
    }

    @Basic
    @NotNull
    @Column(name = "additional_fee")
    public int getAdditionalFee() {
        return additionalFee;
    }

    public void setAdditionalFee(int additionalFee) {
        this.additionalFee = additionalFee;
    }

    @Basic
    @Column(name = "use_point_status")
    public Integer getUsePointStatus() {
        return usePointStatus;
    }

    public void setUsePointStatus(Integer usePointStatus) {
        this.usePointStatus = usePointStatus;
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
    @Column(name = "point")
    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
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
    @NotNull
    @Column(name = "adjust_fee")
    public int getAdjustFee() {
        return adjustFee;
    }

    public void setAdjustFee(int adjustFee) {
        this.adjustFee = adjustFee;
    }

    @Basic
    @NotNull
    @Column(name = "adjust_staff_id")
    public int getAdjustStaffId() {
        return adjustStaffId;
    }

    public void setAdjustStaffId(int adjustStaffId) {
        this.adjustStaffId = adjustStaffId;
    }

    @Basic
    @NotNull
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
        PurchasingEntity that = (PurchasingEntity) o;
        return id == that.id &&
                paymentType == that.paymentType &&
                purchasingType == that.purchasingType &&
                prepaidMoney == that.prepaidMoney &&
                coupon == that.coupon &&
                children == that.children &&
                isOut == that.isOut &&
                additionalFee == that.additionalFee &&
                adjustFee == that.adjustFee &&
                adjustStaffId == that.adjustStaffId &&
                Objects.equals(staff, that.staff) &&
                Objects.equals(member, that.member) &&
                Objects.equals(isReserved, that.isReserved) &&
                Objects.equals(product, that.product) &&
                Objects.equals(service, that.service) &&
                Objects.equals(rental, that.rental) &&
                Objects.equals(rentalNumber, that.rentalNumber) &&
                Objects.equals(addPrepaidBalance, that.addPrepaidBalance) &&
                Objects.equals(usePointStatus, that.usePointStatus) &&
                Objects.equals(usePoint, that.usePoint) &&
                Objects.equals(point, that.point) &&
                Objects.equals(fee, that.fee) &&
                Objects.equals(note, that.note) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, staff, member, paymentType, isReserved, purchasingType, product, service, rental, rentalNumber, addPrepaidBalance, prepaidMoney, coupon, children, isOut, additionalFee, usePointStatus, usePoint, point, fee, adjustFee, adjustStaffId, note, createdDate, updatedDate);
    }
}
