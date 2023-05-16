package com.matrix.mapstruct.hands.on.domain.mapper;

import com.matrix.mapstruct.hands.on.domain.dto.ClientDataDTO;
import com.matrix.mapstruct.hands.on.domain.model.ClientData;
import java.math.BigDecimal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface ClientDataMapper {

    @Mapping(target = "dataNascimento", source = "birthday", dateFormat = "dd/MM/yyyy")
    @Mapping(target = "desconto", source = "firstPurchase", qualifiedByName = "calculadoraDesconto")
    @Mapping(target = "listaDesejo", source = "wishlist")
    @Mapping(target = "favoriteProductName", source = "favoriteProduct.name")
    ClientDataDTO modelToDTO(ClientData clientData);

    @Named("calculadoraDesconto")
    default Long calculadoraDesconto(Boolean firstPurchase) {
        return firstPurchase.equals(Boolean.TRUE) ? 10L : null;
    }

}
