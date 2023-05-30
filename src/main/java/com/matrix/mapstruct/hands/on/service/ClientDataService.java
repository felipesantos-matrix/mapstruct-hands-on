package com.matrix.mapstruct.hands.on.service;

import com.matrix.java.dto.lib.ResponseDTO;
import com.matrix.mapstruct.hands.on.domain.dto.ClientDataDTO;
import com.matrix.mapstruct.hands.on.domain.mapper.ClientDataMapper;
import com.matrix.mapstruct.hands.on.domain.model.ClientData;
import com.matrix.mapstruct.hands.on.repository.ClientDataRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class ClientDataService {

    private final ClientDataRepository repository;

    private final ClientDataMapper mapper;

    public ResponseDTO<ClientDataDTO> getClientData() {
        ClientDataDTO clientDataDTO = clientDataDTOConverter(repository.findClientData());
        return new ResponseDTO<>(clientDataDTO);
    }

    private ClientDataDTO clientDataDTOConverter(ClientData clientData) {
        return mapper.clientDataToDTO(clientData);
    }
}
