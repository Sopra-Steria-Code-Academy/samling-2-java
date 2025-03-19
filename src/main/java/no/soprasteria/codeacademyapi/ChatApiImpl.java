package no.soprasteria.codeacademyapi;

import no.soprasteria.generated.api.ChatApi;
import no.soprasteria.generated.models.ChatMessageDTO;
import no.soprasteria.generated.models.NewChatMessageDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Random;

@RestController
public class ChatApiImpl implements ChatApi {

    private final Random random = new Random();

    @Override
    public ResponseEntity<Void> chatDelete(Integer chatId) {
        if (chatId > 10){
            return ResponseEntity.status(401).build();
        }
        return ResponseEntity.status(200).build();
    }

    @Override
    public ResponseEntity<ChatMessageDTO> getChatByPathParamId(Integer chatId) {
        ChatMessageDTO msg = new ChatMessageDTO().id(chatId).message("Hei").messageTime(OffsetDateTime.now().toString()).author("Magnus");
        return ResponseEntity.ok(msg);
    }

    @Override
    public ResponseEntity<List<ChatMessageDTO>> listAllChats() {
        ChatMessageDTO msg = new ChatMessageDTO().message("Hei").messageTime(OffsetDateTime.now().toString()).author("Magnus");
        return ResponseEntity.ok(List.of(msg));
    }

    @Override
    public ResponseEntity<ChatMessageDTO> writeChatMessage(NewChatMessageDTO chatMessageDTO) {
        //persist stuff
        return ResponseEntity.ok(from(chatMessageDTO));
    }

    private ChatMessageDTO from(NewChatMessageDTO chatMessageDTO){
        return new ChatMessageDTO().id(random.nextInt()).message(chatMessageDTO.getMessage()).messageTime(chatMessageDTO.getMessageTime()).author(chatMessageDTO.getAuthor());
    }
}
