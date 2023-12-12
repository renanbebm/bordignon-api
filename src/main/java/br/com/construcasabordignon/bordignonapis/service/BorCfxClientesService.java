package br.com.construcasabordignon.bordignonapis.service;

import br.com.construcasabordignon.bordignonapis.domain.dto.BorCfxClientesDTO;
import br.com.construcasabordignon.bordignonapis.domain.entity.BorCfxClientes;
import br.com.construcasabordignon.bordignonapis.domain.repository.BorCfxClientesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BorCfxClientesService {

    private final BorCfxClientesRepository repository;

    public List<BorCfxClientesDTO> cfxClientesDTOList() {
        List<BorCfxClientes> list = repository.findAll();
        List<BorCfxClientesDTO> dtos = new ArrayList<>();

        list.forEach(i -> dtos.add(BorCfxClientesDTO.builder()
                        .loja(i.getLoja())
                        .localDate(i.getLocalDate())
                        .localHour(i.getLocalHour())
                        .valorTotal(i.getValorTotal())
                        .numVendas(i.getNumVendas())
                        .build()));

        return dtos;
    }

}
