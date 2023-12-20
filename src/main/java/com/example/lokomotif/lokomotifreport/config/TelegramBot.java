// package com.example.lokomotif.lokomotifreport.config;

// import org.springframework.stereotype.Component;
// import org.telegram.telegrambots.bots.TelegramLongPollingBot;
// import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
// import org.telegram.telegrambots.meta.api.objects.Update;

// @Component
// public class TelegramBot extends TelegramLongPollingBot {
//     private final String token = "6949573094:AAH5rlAiyX6abG3WqSoIW3RqjWKGNIH4O5U";

//     // public TelegramBot() {
//     //     this.token = "6949573094:AAH5rlAiyX6abG3WqSoIW3RqjWKGNIH4O5U";
//     // }

//     @Override
//     public void onUpdateReceived(Update update) {
//         // Handle incoming updates here (if needed)
//     }

//     public void sendMessage(String text) {
//         SendMessage message = new SendMessage();
//         message.setChatId(823792528L);
//         message.setText(text);

//         try {
//             execute(message);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

//     @Override
//     public String getBotUsername() {
//         // Return your bot's username
//         return "Summarylokobot";
//     }

//     @Override
//     public String getBotToken() {
//         // Return your bot's token
//         return token;
//     }
// }
