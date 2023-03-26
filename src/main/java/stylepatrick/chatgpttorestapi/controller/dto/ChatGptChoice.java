package stylepatrick.chatgpttorestapi.controller.dto;

public record ChatGptChoice(String text, Integer index, Object logprobs, String finish_reason) {
}
