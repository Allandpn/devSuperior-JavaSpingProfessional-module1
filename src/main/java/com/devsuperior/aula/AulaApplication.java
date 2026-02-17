package com.devsuperior.aula;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class AulaApplication implements CommandLineRunner {

    @Autowired
    public OrderService orderService;

	public static void main(String[] args) {

        SpringApplication.run(AulaApplication.class, args);


	}

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int code = Integer.parseInt(sc.nextLine());
        double basic = Double.parseDouble(sc.nextLine());
        double discount = Double.parseDouble(sc.nextLine());

        Order order = new Order(code, basic, discount);

        System.out.println("Pedido código " + order.getCode());
        System.out.printf("Valor total: R$%.2f", orderService.total(order));
    }
}
