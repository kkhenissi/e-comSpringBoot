package com.kkhenissi.ecomSpringBoot.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1", types = Product.class)
public interface ProduitProjection {
    public  Long getId();
    public double getCurrentPrice();
    public String getDescription();
}
