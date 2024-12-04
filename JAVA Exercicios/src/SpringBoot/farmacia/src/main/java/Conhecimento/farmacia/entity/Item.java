package Conhecimento.farmacia.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity é uma Anotação de entidade .
@Entity
public class Item {

    //Neste ponto, você já deve ter percebido que as anotações do spring boot recebem @ antes
    //A anotação @Id já indica para o nosso JPA que se trata de uma coluna na tabela de items, chama
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Design pattern strategy documentado no catálogo GOF. De modo que delega responsabilidades adquiridas pelas entidades, atribuindo, portanto, o comportamento.
    private Long id;
    private String name;
    private String description;
    private int quantity;
    private double price;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}