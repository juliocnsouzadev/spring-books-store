package br.com.juliocnsouza.my_books.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Price implements Serializable {

    private double ammount;
    private PriceType type;

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount( double ammount ) {
        this.ammount = ammount;
    }

    public PriceType getType() {
        return type;
    }

    public void setType( PriceType type ) {
        this.type = type;
    }

}
