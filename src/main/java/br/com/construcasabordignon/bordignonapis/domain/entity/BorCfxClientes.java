package br.com.construcasabordignon.bordignonapis.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "BOR_CFX_CLIENTES")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BorCfxClientes {

    @Id
    @GeneratedValue
    @Column(name="LOJA")
    private int loja;

    @Column(name="NUMVENDAS")
    private int numVendas;

    @Column(name="LOCALHOUR")
    private int localHour;

    @Column(name="LOCALDATE")
    private LocalDate localDate;

    @Column(name="VALORTOTAL")
    private BigDecimal valorTotal;

}
