package ru.netology.transfer.data;

import lombok.Value;

import java.util.Random;

public class DataHelper {
    private DataHelper() {
    }

    @Value
    public static class CardInfo {
        String cardNumber;
        String testId;
    }

    private static final CardInfo card1 = new CardInfo("5559 0000 0000 0001", "92df3f1c-a033-48e6-8390-206f6b1f56c0");
    private static final CardInfo card2 = new CardInfo("5559 0000 0000 0002", "0f3f5c2a-249e-4c3d-8287-09f7a039391d");

    public static CardInfo[] allCards = new CardInfo[]{card1, card2};

//    public static CardInfo getCardInfo(int cardNumberInOrder) {
//        if (cardNumberInOrder == 1) {
//            return new CardInfo("5559 0000 0000 0001", "92df3f1c-a033-48e6-8390-206f6b1f56c0");
//        } else if (cardNumberInOrder == 2) {
//            return new CardInfo("5559 0000 0000 0002", "0f3f5c2a-249e-4c3d-8287-09f7a039391d");
//        } else {
//            return null;
//        }
//    }

}