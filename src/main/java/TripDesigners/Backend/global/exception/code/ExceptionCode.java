package TripDesigners.Backend.global.exception.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExceptionCode {
	/*
	default -> 0xxx
	destination -> 1xxx
	trip -> 2xxx
	other -> 9xxx
	 */
	DEFAULT_BAD_REQUEST(1, "BAD REQUEST");


	private final int code;
	private final String message;
}
