package com.matrix.mapstruct.hands.on.domain.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientDataDTO {

    private String name;

    private String dataNascimento;

    private Long desconto;

    private List<ProductDTO> listaDesejo;

    private String favoriteProductName;

}
