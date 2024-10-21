package TripDesigners.Backend.destination.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TripDesigners.Backend.destination.dto.request.DestinationRequest;
import TripDesigners.Backend.destination.dto.request.DetailedDestinationRequest;
import TripDesigners.Backend.destination.dto.response.DestinationResponse;
import TripDesigners.Backend.destination.dto.response.DetailedDestinationResponse;
import TripDesigners.Backend.destination.service.DestinationService;
import TripDesigners.Backend.global.response.ApiResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/destination")
@RequiredArgsConstructor
public class DestinationController {

	private final DestinationService destinationService;

	@GetMapping
	public ApiResponse<List<DestinationResponse>> getDestinations() {
		return ApiResponse.ok(destinationService.getDestinations());
	}

	@PostMapping
	public ApiResponse<DestinationResponse> createDestination(@RequestBody DestinationRequest request) {
		return ApiResponse.created(destinationService.createDestination(request));
	}

	@GetMapping("/detailed/{name}")
	public ApiResponse<DetailedDestinationResponse> getDestination(@PathVariable String name) {
		return ApiResponse.ok(destinationService.getDestination(name));
	}

	@PostMapping("/detailed")
	public ApiResponse<DetailedDestinationResponse> createDetailedDestination(@RequestBody DetailedDestinationRequest request) {
		return ApiResponse.created(destinationService.createDetailedDestination(request));
	}
}
