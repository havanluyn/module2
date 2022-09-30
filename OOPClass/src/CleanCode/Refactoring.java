package CleanCode;

public class Refactoring {
    public static class TennisGame {

        public static final String LOVE_ALL = "Love-All";
        public static final String FIFTEEN_ALL = "Fifteen-All";
        public static final String THIRTY_ALL = "Thirty-All";
        public static final String FORTY_ALL = "Forty-All";
        public static final String DEUCE = "Deuce";
        public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
        public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
        public static final String WIN_FOR_PLAYER_1 = "Win for player1";
        public static final String WIN_FOR_PLAYER_2 = "Win for player2";
        public static final String LOVE = "Love";
        public static final String FIFTEEN = "Fifteen";
        public static final String THIRTY = "Thirty";
        public static final String FORTY = "Forty";
        public static final String UNKNOWN = "Unknown";

        public static String deuce(int score) {
            switch (score) {
                case 0:
                    return LOVE_ALL;
                case 1:
                    return FIFTEEN_ALL;
                case 2:
                    return THIRTY_ALL;
                case 3:
                    return FORTY_ALL;
                default:
                    return DEUCE;
            }
        }

        public static String advantage(int minusResult) {
            switch (minusResult) {
                case 1:
                    return ADVANTAGE_PLAYER_1;
                case -1:
                    return ADVANTAGE_PLAYER_2;
                case 2:
                    return WIN_FOR_PLAYER_1;
                default:
                    return WIN_FOR_PLAYER_2;
            }
        }

        public static String one2Three(int score) {
            switch (score) {
                case 0:
                    return LOVE;
                case 1:
                    return FIFTEEN;
                case 2:
                    return THIRTY;
                case 3:
                    return FORTY;
                default:
                    return UNKNOWN;
            }
        }

        public static String getScore(int scorePlayer1, int scorePlayer2) {

            if (scorePlayer1 == scorePlayer2)
                return deuce(scorePlayer2);
            if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
                int minusResult = scorePlayer1 - scorePlayer2;
                return advantage(minusResult);
            }
            return one2Three(scorePlayer1) + "-" + one2Three(scorePlayer2);
        }
    }
}
