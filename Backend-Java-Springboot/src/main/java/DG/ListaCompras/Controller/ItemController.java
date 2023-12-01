package DG.ListaCompras.Controller;

import DG.ListaCompras.Model.Item;
import DG.ListaCompras.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/item")
public class ItemController {

    ItemRepository itemRep;
    @PostMapping
    public Item AdicionarItem(@RequestBody Item item){
        return itemRep.save(item);
    };

    @DeleteMapping("/{id}")
    public void DeleteItem(@PathVariable Long id){
        itemRep.deleteById(id);
    };

    public Item BuscarporId(@PathVariable Long id) {
        Optional<Item> optionalId = itemRep.findById(id);
        if (optionalId.isPresent()){
            
        }
        return itemRep.findById(id);
    }

}
