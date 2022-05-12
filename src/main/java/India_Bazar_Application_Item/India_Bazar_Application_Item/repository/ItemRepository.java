package India_Bazar_Application_Item.India_Bazar_Application_Item.repository;

import India_Bazar_Application_Item.India_Bazar_Application_Item.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {
}
