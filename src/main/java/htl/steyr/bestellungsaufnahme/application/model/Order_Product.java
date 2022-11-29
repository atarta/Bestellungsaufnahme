package htl.steyr.bestellungsaufnahme.application.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;

@EnableAutoConfiguration
@Entity
@Table(name = "order_product")
public class Order_Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId")
    Order order;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    Product product;

    @Column(name = "quantitiy", nullable = false)
    private long quantitiy;

    @Column(name = "product_price", nullable = false)
    private float product_price;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
