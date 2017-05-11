package com.maffra.xyinc.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author heitor
 */
@Entity
public class Poi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String nomeDoPoi;
    private int coordenadaX;
    private int coordenadaY;

    public String getNomeDoPoi() {
        return nomeDoPoi;
    }

    public void setNomeDoPoi(String nomeDoPoi) {
        this.nomeDoPoi = nomeDoPoi;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        if (coordenadaX < 0) {
            this.coordenadaX = coordenadaX * (-1);
        } else {
            this.coordenadaX = coordenadaX;
        }
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        if (coordenadaY < 0) {
            this.coordenadaY = coordenadaY * (-1);
        } else {
            this.coordenadaY = coordenadaY;
        }
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }
}
