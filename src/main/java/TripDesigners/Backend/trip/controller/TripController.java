package TripDesigners.Backend.trip.controller;

import org.springframework.ai.vertexai.gemini.VertexAiGeminiChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TripController {

	private final VertexAiGeminiChatModel vertexAiGeminiChatModel;

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}

	@GetMapping("/gemini")
	public String gemini() {
		return vertexAiGeminiChatModel.call("Hello, Gemini!");
	}

	@GetMapping("/trip/{comment}")
	public String gemini(@PathVariable String comment) {
		return vertexAiGeminiChatModel.call(comment);
	}
}
