package com.micro.order.service.Command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long paymentId;
    private String paymentStatus;
    private String transactionId;
    private long orderId;
    private double price;
}
