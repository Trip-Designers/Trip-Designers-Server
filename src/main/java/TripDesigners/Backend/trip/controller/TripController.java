package TripDesigners.Backend.trip.controller;

import org.springframework.ai.vertexai.gemini.VertexAiGeminiChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TripController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}

}
