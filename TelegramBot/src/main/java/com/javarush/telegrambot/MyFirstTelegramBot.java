package com.javarush.telegrambot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MyFirstTelegramBot extends MultiSessionTelegramBot {
    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }

    public static final String NAME = "Andrey_first_2024_bot"; // TODO: добавьте имя бота в кавычках
    public static final String TOKEN = "7042447291:AAGNRX_fDY6Dz3XvW8JL4WcaKHTdUDo1_hQ"; //TODO: добавьте токен бота в кавычках

    public MyFirstTelegramBot() {
        super(NAME, TOKEN);
    }

    @Override
    public void onUpdateEventReceived(Update updateEvent) {
        // TODO: основной функционал бота будем писать здесь
        sendTextMessageAsync("Привет!");
        sendTextMessageAsync("Привет! *Все хорошо!*");
        sendTextMessageAsync("Привет! _Все похуй!!_");
    }


}