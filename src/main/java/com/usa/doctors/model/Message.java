package com.usa.doctors.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "message")
@NoArgsConstructor
@Getter
@Setter
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "idDoctor")
    @JsonIgnoreProperties({"messages","client","reservations"})
    private Doctor doctor;

    @ManyToOne
    @JsonIgnoreProperties({"messages","client","reservations"})
    private Client client;
}
