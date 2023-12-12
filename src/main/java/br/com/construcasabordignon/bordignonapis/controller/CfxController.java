package br.com.construcasabordignon.bordignonapis.controller;

import br.com.construcasabordignon.bordignonapis.domain.dto.BorCfxClientesDTO;
import br.com.construcasabordignon.bordignonapis.service.BorCfxClientesService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CfxController {

    BorCfxClientesService service;

    @RequestMapping(value = "/cfx-service", method = RequestMethod.GET)
    public ResponseEntity<List<BorCfxClientesDTO>> cfxClientesDTOList () {

        return ResponseEntity.ok(service.cfxClientesDTOList());
    }
}
