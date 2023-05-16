package com.matrix.mapstruct.hands.on.domain.model;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientData {

    private Long id;

    private String name;

    private LocalDate birthday;

    private Boolean firstPurchase;

    private List<Product> wishlist;

    private Product favoriteProduct;

}
