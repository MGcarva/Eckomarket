package com.example.Marcket.Cliente;

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
public class Cliente {
 @Id
 @GeneratedValue
  private Integer id;
  @Basic
  private String nombre;
  private String apellido;
  private String email;
}
/*
Crear Cliente: Envía una solicitud POST a http://localhost:8080/cliente con un cuerpo JSON que contenga los datos del cliente.
Leer Todos los Clientes: Envía una solicitud GET a http://localhost:8080/cliente.
Leer Cliente por ID: Envía una solicitud GET a http://localhost:8080/cliente/{id}.
Actualizar Cliente: Envía una solicitud PUT a http://localhost:8080/cliente/{id} con el cuerpo JSON actualizado.
Eliminar Cliente: Envía una solicitud DELETE a http://localhost:8080/cliente/{id}.
*/