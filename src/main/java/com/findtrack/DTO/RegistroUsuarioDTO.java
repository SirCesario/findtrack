package com.findtrack.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistroUsuarioDTO {

    private Long id;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;
    private String usuario;
}
