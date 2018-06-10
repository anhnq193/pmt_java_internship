package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "member_ticket", schema = "pm_db", catalog = "")
public class MemberTicketEntity {
    private int id;
    private MemberEntity memberId;
    private ShopEntity shopId;
    private MstTicketEntity lastTicketId;
    private Timestamp expireDate;
    private Timestamp lastPurchaseDate;
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
    @Column(name = "member_id")
    public MemberEntity getMemberId() {
        return memberId;
    }

    public void setMemberId(MemberEntity memberId) {
        this.memberId = memberId;
    }

    @ManyToOne
    @NotNull
    @Column(name = "shop_id")
    public ShopEntity getShopId() {
        return shopId;
    }

    public void setShopId(ShopEntity shopId) {
        this.shopId = shopId;
    }

    @ManyToOne
    @NotNull
    @Column(name = "last_ticket_id")
    public MstTicketEntity getLastTicketId() {
        return lastTicketId;
    }

    public void setLastTicketId(MstTicketEntity lastTicketId) {
        this.lastTicketId = lastTicketId;
    }

    @Basic
    @NotNull
    @Column(name = "expire_date")
    public Timestamp getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Timestamp expireDate) {
        this.expireDate = expireDate;
    }

    @Basic
    @NotNull
    @Column(name = "last_purchase_date")
    public Timestamp getLastPurchaseDate() {
        return lastPurchaseDate;
    }

    public void setLastPurchaseDate(Timestamp lastPurchaseDate) {
        this.lastPurchaseDate = lastPurchaseDate;
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
        MemberTicketEntity that = (MemberTicketEntity) o;
        return id == that.id &&
                memberId == that.memberId &&
                shopId == that.shopId &&
                lastTicketId == that.lastTicketId &&
                Objects.equals(expireDate, that.expireDate) &&
                Objects.equals(lastPurchaseDate, that.lastPurchaseDate) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, memberId, shopId, lastTicketId, expireDate, lastPurchaseDate, createdDate, updatedDate);
    }
}
