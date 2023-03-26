# chat-gpt-to-rest-api
 Interaction with ChatGPT over Spring Boot 3 REST API. Different Models can be used.
 See details here: https://platform.openai.com/examples
 
 ### Example of a text translation service implementation:
 
 POST Request to **.../api/chat**
 ```
{
    "model": "text-davinci-003",
    "prompt": "Translate this into 1. German, 2. Spanish and 3. Japanese: My name is Patrick.",
    "max_tokens": 100,
    "temperature": 0.3
}
```

Response:
```
{
    "id": "cmpl-6yOdFbpC42CoFO0DuzjytZxGJ2tdL",
    "object": "text_completion",
    "created": 1679852385,
    "model": "text-davinci-003",
    "choices": [
        {
            "text": "\n\n1. Mein Name ist Patrick.\n2. Mi nombre es Patrick.\n3. 私の名前はパトリックです。",
            "index": 0,
            "logprobs": null,
            "finish_reason": "stop"
        }
    ],
    "usage": {
        "prompt_tokens": 21,
        "completion_tokens": 40,
        "total_tokens": 61
    }
}
```
