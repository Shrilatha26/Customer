package India_Bazar_Application_Item.India_Bazar_Application_Item.service;

import India_Bazar_Application_Item.India_Bazar_Application_Item.model.Item;
import India_Bazar_Application_Item.India_Bazar_Application_Item.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;


    public Item addData(Item item)
    {
        return itemRepository.save(item);             //add Data to items repo
    }

    public Item getItemById(int id){
        return itemRepository.findById(id).get();      //Find item Data by id
    }

    public List<Item> getAllItemData(){
        return itemRepository.findAll();                //Display All Items Data
    }

}
