package com.geop.painelCentralControle.domain.entities.estacionamento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "estacionamento_mes")
public class EstacionamentoMes {
    @Column
    private Double taxaRotatividade;
    @Column
    private Double taxaOcupacao;
    @Column
    private String diaMaiorMovimento;
    @Column
    private Integer mediaDiariaEntradaVeiculos;
    @Column
    private LocalDateTime dataHoraEvento;
}
