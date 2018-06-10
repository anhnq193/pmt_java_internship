package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "purchasing_online", schema = "pm_db", catalog = "")
public class PurchasingOnlineEntity {
    private int id;
    private PurchasingEntity purchasing;
    private String fullname;
    private String kana;
    private String tel;
    private String zipcode;
    private PrefEntity pref;
    private String ward;
    private String addr1;
    private String addr2;
    private MstPaymentMethodEntity paymentMethod;
    private int coupon;
    private int totalFee;
    private int paymentFee;
    private Timestamp purchasedDate;
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
    @Column(name = "fullname")
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Basic
    @Column(name = "kana")
    public String getKana() {
        return kana;
    }

    public void setKana(String kana) {
        this.kana = kana;
    }

    @Basic
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "zipcode")
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @ManyToOne
    @Column(name = "pref_id")
    public PrefEntity getPref() {
        return pref;
    }

    public void setPref(PrefEntity pref) {
        this.pref = pref;
    }

    @Basic
    @Column(name = "ward")
    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    @Basic
    @Column(name = "addr1")
    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    @Basic
    @Column(name = "addr2")
    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    @ManyToOne
    @NotNull
    @Column(name = "payment_method_id")
    public MstPaymentMethodEntity getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(MstPaymentMethodEntity paymentMethod) {
        this.paymentMethod = paymentMethod;
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
    @Column(name = "total_fee")
    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    @Basic
    @NotNull
    @Column(name = "payment_fee")
    public int getPaymentFee() {
        return paymentFee;
    }

    public void setPaymentFee(int paymentFee) {
        this.paymentFee = paymentFee;
    }

    @Basic
    @NotNull
    @Column(name = "purchased_date")
    public Timestamp getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(Timestamp purchasedDate) {
        this.purchasedDate = purchasedDate;
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
        PurchasingOnlineEntity that = (PurchasingOnlineEntity) o;
        return id == that.id &&
                purchasing == that.purchasing &&
                paymentMethod == that.paymentMethod &&
                coupon == that.coupon &&
                totalFee == that.totalFee &&
                paymentFee == that.paymentFee &&
                Objects.equals(fullname, that.fullname) &&
                Objects.equals(kana, that.kana) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(zipcode, that.zipcode) &&
                Objects.equals(pref, that.pref) &&
                Objects.equals(ward, that.ward) &&
                Objects.equals(addr1, that.addr1) &&
                Objects.equals(addr2, that.addr2) &&
                Objects.equals(purchasedDate, that.purchasedDate) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, purchasing, fullname, kana, tel, zipcode, pref, ward, addr1, addr2, paymentMethod, coupon, totalFee, paymentFee, purchasedDate, createdDate, updatedDate);
    }
}
