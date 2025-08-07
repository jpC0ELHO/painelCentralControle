package com.geop.painelCentralControle.domain.entities.estacionamento;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "estacionamento_ano")
public class EstacionamentoAno {
    @Column
    private Double percentualUsoPorVaga;
    @Column
    private Integer tempoMedioOcupacao; // minutos
    @Column
    private Integer horarioDePicoMedia; // horas
    @Column
    private String previsaoFluxoProximoHorario;
    @Column
    private String eventoIrregularDetectado;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private LocalDateTime dataHoraEvento;
    @Column
    private Integer totalVagas;
}
