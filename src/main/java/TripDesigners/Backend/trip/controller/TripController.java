package TripDesigners.Backend.trip.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TripController {

	private final OpenAiChatModel openAiChatModel;

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}

	@GetMapping("/gemini")
	public String gemini() {
		return openAiChatModel.call("Hello, Gemini!");
	}
}
