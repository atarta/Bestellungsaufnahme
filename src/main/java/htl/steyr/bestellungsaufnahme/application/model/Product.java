package htl.steyr.bestellungsaufnahme.application.model;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import java.util.Set;

@EnableAutoConfiguration
@Entity
@Table(name = "produkt")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    Set<Order_Product> order_products;


    //hier weitermachen
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
