package India_Bazar_Application_Item.India_Bazar_Application_Item.controller;

import India_Bazar_Application_Item.India_Bazar_Application_Item.model.Item;
import India_Bazar_Application_Item.India_Bazar_Application_Item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping("/addData")
    public Item addData(@RequestBody Item item)
    {
        return itemService.addData(item);           //add Data to Item
    }

    @GetMapping("/getItemById/{id}")
    public Item getItemById(@PathVariable int id)
    {
        return itemService.getItemById(id);     //Get item by id
    }
    @GetMapping("/getAllItemData")
    public List<Item> getAllItemData()
    {
        return itemService.getAllItemData();        //Display all the items
    }
}
