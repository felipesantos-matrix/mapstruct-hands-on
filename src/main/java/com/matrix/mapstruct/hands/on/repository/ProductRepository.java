package com.matrix.mapstruct.hands.on.repository;

import com.matrix.mapstruct.hands.on.domain.model.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@NoArgsConstructor
@AllArgsConstructor
public class ProductRepository {

    public List<Product> findWishList() {
        return wishListGenerator();
    }

    private List<Product> wishListGenerator() {
        List<Product> wishList = new ArrayList<>();

        Product camiseta = new Product(1L, "Camiseta", BigDecimal.valueOf(149.99));
        Product tenis = new Product(2L, "Tênis", BigDecimal.valueOf(699.98));

        wishList.add(camiseta);
        wishList.add(tenis);

        return wishList;
    }

}
