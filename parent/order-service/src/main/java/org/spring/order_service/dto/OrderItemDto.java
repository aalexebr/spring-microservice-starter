package org.spring.order_service.dto;

import java.math.BigDecimal;
import java.util.List;

import org.spring.order_service.model.Order;
import org.spring.order_service.model.OrderItems;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDto {

	private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
