package com.matrix.mapstruct.hands.on.controller;

import com.matrix.java.dto.lib.ResponseDTO;
import com.matrix.mapstruct.hands.on.domain.dto.ClientDataDTO;
import com.matrix.mapstruct.hands.on.service.ClientDataService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client")
@Slf4j
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class ClientDataController {

    private ClientDataService service;

    @GetMapping(value = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO<ClientDataDTO>> getClientData() {
        ResponseDTO<ClientDataDTO> responseDTO = service.getClientData();
        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
    }

}
