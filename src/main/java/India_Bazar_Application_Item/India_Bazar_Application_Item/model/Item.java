package India_Bazar_Application_Item.India_Bazar_Application_Item.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="item")
public class Item {
    @Id
    int id;
    String name;
    Float weight;
    String weight_units;
    Long list_price;

}
