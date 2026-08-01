package com.rwinkeler.matchingengine.domain.model;

import com.rwinkeler.matchingengine.domain.model.enums.OrderSide;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class Order {

    private String id;
    private String instrument;
    private OrderSide side;
    private BigDecimal price;
    private long quantity;

}
