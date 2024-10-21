package TripDesigners.Backend.destination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import TripDesigners.Backend.destination.entity.Destination;

public interface DestinationRepository extends JpaRepository<Destination, Long> {
}
