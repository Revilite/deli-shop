package com.pluralsight.delishop.backend;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OrderFileHandler {
    public static void createReceipt(Order order) {
        LocalDateTime currentTimeStamp = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("./src/main/resources/receipts/" + currentTimeStamp.format(dtf) + ".txt"));

            bw.write(order.toCSVString());
            bw.write(String.format("Total Price: $%-15.2f", order.getTotalPrice()));
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
