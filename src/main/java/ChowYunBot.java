import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class ChowYunBot extends  TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {

    }

    public String getBotUsername() {
        return "ChowYunBot";
    }

    public String getBotToken() {
        return null;
    }
}
