package ma.elamri.smarthome.service;

import ma.elamri.smarthome.beans.Appareil;
import ma.elamri.smarthome.dao.AppareilDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@Service
@CrossOrigin(origins = "http://localhost:4200")
public class AppareilService {

    //injecter Dao dans le service
    @Autowired
    AppareilDao appareilDao;

    public List<Appareil> findAll() {
        return appareilDao.findAll();
    }

    public int save(Appareil appareil) {
        if (appareil == null) return -1;
        else {
            appareilDao.save(appareil);
            return 1;
        }
    }

    public Optional<Appareil> findById(Long aLong) {
        return appareilDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        appareilDao.deleteById(aLong);
    }

    public void deleteAll() {
        appareilDao.deleteAll();
    }
}
