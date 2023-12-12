package br.com.construcasabordignon.bordignonapis.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder
public class BorCfxClientesDTO {

    private int loja;
    private int numVendas;
    private int localHour;
    private LocalDate localDate;
    private BigDecimal valorTotal;


}
