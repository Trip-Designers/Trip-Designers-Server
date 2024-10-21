package TripDesigners.Backend.destination.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class DetailDestination {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String destinationName;

	private String description;

	private String link;

	public DetailDestination(final String destinationName, final String description, final String link) {
		this.destinationName = destinationName;
		this.description = description;
		this.link = link;
	}
}
