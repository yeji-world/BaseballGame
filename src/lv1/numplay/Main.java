package lv1.numplay;

public class Main {
    public static void main(String[] args) {
     BaseballGame baseballGame = new BaseballGame();
        System.out.println("= 게임을 시작합니다 =");
        System.out.println("1~9 사이에 중복없이 세 자리 숫자를 입력해주세요.");
        baseballGame.play();
    }
}
