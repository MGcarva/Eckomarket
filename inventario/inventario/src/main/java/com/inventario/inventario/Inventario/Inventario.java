package com.inventario.inventario.Inventario;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Inventario {
@Id
@GeneratedValue
private Integer id;
@Basic
 private String nombre;
 private Integer cantidad;
 private String  fechaEntrada;
}
