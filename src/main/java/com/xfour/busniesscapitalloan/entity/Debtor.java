package com.xfour.busniesscapitalloan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "m_debtor")
public class Debtor extends BaseEntity {
    @Column(name = "nik")
    private String nik;
    @Column(name = "npwp")
    private String npwp;
    @Column(name = "name")
    private String name;
    @Column(name = "handphone")
    private String handphone;
    @Column(name = "birth_place")
    private String birthPlace;
    @Column(name = "birth_date")
    private LocalDateTime birthDate;
    @Column(name = "gender")
    private String gender;
    @Column(name = "status")
    private String status;
    @Column(name = "address")
    private String address;
    @Column(name = "job")
    private String job;
    @OneToOne
    @JoinColumn(name = "umkm_id")
    private Umkm umkm;
    @OneToOne
    @JoinColumn(name = "user_credential_id")
    private UserCredential userCredential;
}
