package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "visitor_number", schema = "pm_db", catalog = "")
public class VisitorNumberEntity {
    private int id;
    private byte number;
    private Timestamp createdDate;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @NotNull
    @Column(name = "number")
    public byte getNumber() {
        return number;
    }

    public void setNumber(byte number) {
        this.number = number;
    }

    @Basic
    @Column(name = "created_date")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VisitorNumberEntity that = (VisitorNumberEntity) o;
        return id == that.id &&
                number == that.number &&
                Objects.equals(createdDate, that.createdDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, number, createdDate);
    }
}
