package io.penguinstats.dao;

import io.penguinstats.model.Zone;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneDao extends MongoRepository<Zone, String> {

    Optional<Zone> findByZoneId(String zoneId);

}
