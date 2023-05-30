package com.matrix.mapstruct.hands.on.domain.mapper;

import com.matrix.mapstruct.hands.on.domain.dto.ProductDTO;
import com.matrix.mapstruct.hands.on.domain.model.Product;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO modelToDTO(Product product);

    List<ProductDTO> modelsToDTOs(List<Product> products);

}
