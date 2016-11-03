package org.tutorial.model;

import java.math.BigInteger;

/**
 * Created by Jan on 2016-11-03.
 */
public class Greeting {
    private BigInteger id;
    private String text;

    public Greeting() {

    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
