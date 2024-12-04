package Conhecimento.farmacia.repository;

import Conhecimento.farmacia.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository = Anotação spring boot pra indicar que é um repositório, e nosso repositório extende uma interface pronta pra uso da JPA java persist API
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}