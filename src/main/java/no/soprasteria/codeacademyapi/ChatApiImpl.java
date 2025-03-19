package no.soprasteria.codeacademyapi;

import no.soprasteria.generated.api.ChatApi;
import no.soprasteria.generated.models.ChatMessageDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.List;

@RestController
public class ChatApiImpl implements ChatApi {

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
    public ResponseEntity<ChatMessageDTO> writeChatMessage(ChatMessageDTO chatMessageDTO) {
        return ResponseEntity.ok(chatMessageDTO);
    }
}
