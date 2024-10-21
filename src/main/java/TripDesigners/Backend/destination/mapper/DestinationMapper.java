package TripDesigners.Backend.destination.mapper;

import TripDesigners.Backend.destination.dto.request.DestinationRequest;
import TripDesigners.Backend.destination.dto.request.DetailedDestinationRequest;
import TripDesigners.Backend.destination.dto.response.DestinationResponse;
import TripDesigners.Backend.destination.dto.response.DetailedDestinationResponse;
import TripDesigners.Backend.destination.entity.Destination;
import TripDesigners.Backend.destination.entity.DetailDestination;

public final class DestinationMapper {

	public static Destination toEntity(DestinationRequest request) {
		return new Destination(request.name(), request.nation());
	}

	public static DestinationResponse toResponse(Destination destination) {
		return new DestinationResponse(destination.getName(), destination.getNation());
	}

	public static DetailedDestinationResponse toDetailedResponse(DetailDestination detailDestination) {
		return new DetailedDestinationResponse(detailDestination.getDestinationName(),
			detailDestination.getDescription(), detailDestination.getLink());
	}

	public static DetailDestination toDetailEntity(DetailedDestinationRequest request) {
		return new DetailDestination(request.destinationName(), request.description(), request.link());
	}
}
