package com.matrix.mapstruct.hands.on.repository;

import com.matrix.mapstruct.hands.on.domain.model.ClientData;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ClientDataRepository {

    ProductRepository repository;

    public ClientData findClientData() {
        return new ClientData(1L, "Johnson", LocalDate.of(2000, 5, 21), Boolean.TRUE,
              repository.findWishList(), repository.findWishList().get(0));
    }
}
