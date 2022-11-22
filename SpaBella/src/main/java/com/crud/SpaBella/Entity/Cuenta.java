package com.crud.SpaBella.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter 
@Getter
@NoArgsConstructor 
@AllArgsConstructor
@Entity
@Table(name = "cuentas")
public class Cuenta {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (unique = true,nullable = false)
    private Long idCuenta;

    @Column(name = "fecha_apertura")
    private Date fechaApertura;
    @Column(name = "saldo_cuenta")

 
    private Double saldoCuenta;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

}

