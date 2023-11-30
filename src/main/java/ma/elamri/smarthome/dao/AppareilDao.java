package ma.elamri.smarthome.dao;

import ma.elamri.smarthome.beans.Appareil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppareilDao  extends JpaRepository<Appareil, Long> {
}
