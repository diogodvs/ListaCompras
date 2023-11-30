package DG.ListaCompras.Controller;

import DG.ListaCompras.Model.Item;
import DG.ListaCompras.Repository.ItemRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/item")
public class ItemController {

    ItemRepository itemRep;
    @PostMapping
    public Item AdicionarItem(@RequestBody Item item){
        return itemRep.save(item);
    };

}
