package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "move_stock_history", schema = "pm_db", catalog = "")
public class MoveStockHistoryEntity {
    private int id;
    private ProductEntity product;
    private StockEntity stock;
    private ShopEntity shopFrom;
    private ShopEntity shopTo;
    private int fromStockNumber;
    private int toStockNumber;
    private int moveNumber;
    private Timestamp moveDate;

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
    @Column(name = "product_id")
    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    @ManyToOne
    @NotNull
    @Column(name = "stock_id")
    public StockEntity getStock() {
        return stock;
    }

    public void setStock(StockEntity stock) {
        this.stock = stock;
    }

    @ManyToOne
    @NotNull
    @Column(name = "shop_from")
    public ShopEntity getShopFrom() {
        return shopFrom;
    }

    public void setShopFrom(ShopEntity shopFrom) {
        this.shopFrom = shopFrom;
    }

    @ManyToOne
    @NotNull
    @Column(name = "shop_to")
    public ShopEntity getShopTo() {
        return shopTo;
    }

    public void setShopTo(ShopEntity shopTo) {
        this.shopTo = shopTo;
    }

    @Basic
    @NotNull
    @Column(name = "from_stock_number")
    public int getFromStockNumber() {
        return fromStockNumber;
    }

    public void setFromStockNumber(int fromStockNumber) {
        this.fromStockNumber = fromStockNumber;
    }

    @Basic
    @NotNull
    @Column(name = "to_stock_number")
    public int getToStockNumber() {
        return toStockNumber;
    }

    public void setToStockNumber(int toStockNumber) {
        this.toStockNumber = toStockNumber;
    }

    @Basic
    @NotNull
    @Column(name = "move_number")
    public int getMoveNumber() {
        return moveNumber;
    }

    public void setMoveNumber(int moveNumber) {
        this.moveNumber = moveNumber;
    }

    @Basic
    @NotNull
    @Column(name = "move_date")
    public Timestamp getMoveDate() {
        return moveDate;
    }

    public void setMoveDate(Timestamp moveDate) {
        this.moveDate = moveDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoveStockHistoryEntity that = (MoveStockHistoryEntity) o;
        return id == that.id &&
                product == that.product &&
                stock == that.stock &&
                shopFrom == that.shopFrom &&
                shopTo == that.shopTo &&
                fromStockNumber == that.fromStockNumber &&
                toStockNumber == that.toStockNumber &&
                moveNumber == that.moveNumber &&
                Objects.equals(moveDate, that.moveDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, product, stock, shopFrom, shopTo, fromStockNumber, toStockNumber, moveNumber, moveDate);
    }
}
