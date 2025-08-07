package com.geop.painelCentralControle.domain.entities.estacionamento;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.geop.painelCentralControle.domain.entities.Entidade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "estacionamento")
@EntityListeners(AuditingEntityListener.class)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Estacionamento extends Entidade {
    @Column(nullable = false, unique = true)
    private String idVaga;
    @Column(nullable = false)
    private String localizacao;
    @Column(nullable = false)
    private String tipoVaga;
    @Column(nullable = false)
    private String sensorId;
    @Column(nullable = false)
    private String cameraId;
    @Column(nullable = false)
    private String placaVeiculo;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private EstacionamentoDia estacionamentoDia;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private EstacionamentoSemana estacionamentoSemana;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private EstacionamentoMes estacionamentoMes;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private EstacionamentoAno estacionamentoAno;
    @Column(name = "data_ultima_atualizacao")
    private LocalDateTime dataUltimaAtualizacao;
    @Column(name = "usuario_responsavel")
    private String usuarioResponsavel;

}
