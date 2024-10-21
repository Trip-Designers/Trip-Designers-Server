package TripDesigners.Backend.destination.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import TripDesigners.Backend.destination.entity.DetailDestination;

public interface DetailedDestinationRepository extends JpaRepository<DetailDestination, Long> {

	Optional<DetailDestination> findDetailDestinationByDestinationName(String name);
}
