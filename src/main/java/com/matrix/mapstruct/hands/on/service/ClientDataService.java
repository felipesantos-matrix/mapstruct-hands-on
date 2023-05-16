package com.matrix.mapstruct.hands.on.service;

import com.matrix.java.dto.lib.ResponseDTO;
import com.matrix.mapstruct.hands.on.domain.dto.ClientDataDTO;
import com.matrix.mapstruct.hands.on.domain.model.ClientData;
import com.matrix.mapstruct.hands.on.repository.ClientDataRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class ClientDataService {

    ClientDataRepository repository;

    public ResponseDTO<ClientDataDTO> getClientData() {
        ClientDataDTO clientDataDTO = clientDataDTOTransformer(repository.findClientData());
        return new ResponseDTO<>(clientDataDTO);
    }

    private ClientDataDTO clientDataDTOTransformer(ClientData clientData) {
        return mapper.modelToDTO(clientData);
    }
}
