package com.matrix.mapstruct.hands.on.domain.mapper;

import com.matrix.mapstruct.hands.on.domain.dto.ProductDTO;
import com.matrix.mapstruct.hands.on.domain.model.Product;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

//    @Mapping(target = "")
    ProductDTO modelToDTO(Product product);

    List<ProductDTO> modelListToDTO(List<Product> products);

}
