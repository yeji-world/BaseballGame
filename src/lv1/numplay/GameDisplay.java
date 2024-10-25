package lv1.numplay;

public class GameDisplay {
    public static boolean displayHint(int strike, int ball, int count) {

        if (strike == 3) {
            System.out.println(count + "번의 시도: 정답입니다!");
            return true;
        } else if (strike == 0 && ball == 0) {
            System.out.println("아웃");
        } else {
            System.out.println(strike + "스트라이크 " + ball + "볼");
        }
        return false;
    }
}
