package baseball.io;

import static baseball.constant.MenuChoice.RESTART;
import static baseball.constant.MenuChoice.TERMINATE;
import static baseball.constant.Message.ERROR_MSG;
import static baseball.constant.Message.RESTART_MSG;
import static baseball.constant.Message.START_MSG;
import static baseball.constant.Message.SUCCESS_MSG;

import camp.nextstep.edu.missionutils.Console;

public class OutPut {

    public void startMsg() {
        System.out.println(START_MSG);
    }

    public void wonTheGame() {
        System.out.println(SUCCESS_MSG);
        System.out.println(RESTART_MSG);
    }

    public void restartGame() {
        String restart = Console.readLine();

        if (restart.equals(RESTART.getMenuChoice())) {
            System.out.println(START_MSG);
        }
    }

    public void terminateGame() {
        String restart = Console.readLine();

        if (!restart.equals(TERMINATE.getMenuChoice())) {
            throw new IllegalArgumentException(ERROR_MSG.getMessage());
        }
    }

}
