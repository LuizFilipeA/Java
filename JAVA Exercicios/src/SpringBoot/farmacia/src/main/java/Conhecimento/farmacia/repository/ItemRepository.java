package Conhecimento.farmacia.repository;

import Conhecimento.farmacia.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//A Anotação @Repository indica ao spring que iremos utilizar um "stereotype" já estruturado no framwework
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    //Essa interface "ItemRepository" na verdade é uma interface já estruturada "jpa.repository" que vai simplificar a nossa integração de aplicações de dentro do Spring
    // Então a nossa interface herda diretamente essa interface já existente no framework. Uma interface de repositório. Só passamos como parametro para ser armazenado um "Item".
    }
