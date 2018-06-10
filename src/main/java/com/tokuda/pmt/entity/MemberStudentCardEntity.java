package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "member_student_card", schema = "pm_db", catalog = "")
public class MemberStudentCardEntity {
    private int id;
    private MemberEntity member;
    private Timestamp expireDate;

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
    public MemberEntity getMember() {
        return member;
    }

    public void setMember(MemberEntity member) {
        this.member = member;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberStudentCardEntity that = (MemberStudentCardEntity) o;
        return id == that.id &&
                member == that.member &&
                Objects.equals(expireDate, that.expireDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, member, expireDate);
    }
}
