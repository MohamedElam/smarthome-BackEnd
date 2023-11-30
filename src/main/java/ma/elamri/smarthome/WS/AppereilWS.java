package ma.elamri.smarthome.WS;

import ma.elamri.smarthome.beans.Appareil;
import ma.elamri.smarthome.service.AppareilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/appareils")
@CrossOrigin(origins = "http://localhost:4200")
public class AppereilWS {

    @Autowired
    AppareilService appareilService;

    @GetMapping("")
    public List<Appareil> findAll() {
        return appareilService.findAll();
    }

    @PostMapping("")
    public int save(@RequestBody Appareil appareil) {
        return appareilService.save(appareil);
    }

    @GetMapping("id/{id}")
    public Optional<Appareil> findById(@PathVariable Long id) {
        return appareilService.findById(id);
    }

    @DeleteMapping("id/{id}")
    public void deleteById(@PathVariable Long id) {
        appareilService.deleteById(id);
    }

    @DeleteMapping("")
    public void deleteAll() {
        appareilService.deleteAll();
    }
}
