package TripDesigners.Backend.destination.service;

import static TripDesigners.Backend.destination.mapper.DestinationMapper.*;

import java.util.List;

import org.springframework.stereotype.Service;

import TripDesigners.Backend.destination.dto.request.DestinationRequest;
import TripDesigners.Backend.destination.dto.request.DetailedDestinationRequest;
import TripDesigners.Backend.destination.dto.response.DestinationResponse;
import TripDesigners.Backend.destination.dto.response.DetailedDestinationResponse;
import TripDesigners.Backend.destination.entity.Destination;
import TripDesigners.Backend.destination.entity.DetailDestination;
import TripDesigners.Backend.destination.mapper.DestinationMapper;
import TripDesigners.Backend.destination.repository.DestinationRepository;
import TripDesigners.Backend.destination.repository.DetailedDestinationRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DestinationService {

	private final DestinationRepository destinationRepository;
	private final DetailedDestinationRepository detailedDestinationRepository;

	public List<DestinationResponse> getDestinations() {
		return destinationRepository.findAll().stream()
			.map(DestinationMapper::toResponse)
			.toList();
	}

	public DestinationResponse createDestination(DestinationRequest request) {
		Destination destination = destinationRepository.save(toEntity(request));
		return toResponse(destination);
	}

	public DetailedDestinationResponse getDestination(String name) {
		return detailedDestinationRepository.findDetailDestinationByDestinationName(name)
			.map(DestinationMapper::toDetailedResponse)
			.orElseThrow(() -> new IllegalArgumentException("Destination not found"));
	}

	public DetailedDestinationResponse createDetailedDestination(DetailedDestinationRequest request) {
		DetailDestination detailDestination = detailedDestinationRepository.save(toDetailEntity(request));
		return toDetailedResponse(detailDestination);
	}
}
