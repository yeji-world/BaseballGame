package lv2.numplay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("1. 게임 시작하기 | 2. 게임 기록 보기 | 3. 종료하기");
            System.out.print("환영합니다! 원하시는 메뉴를 선택해주세요: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                BaseballGame baseballGame = new BaseballGame(); // 객체 생성
                System.out.println("= 게임을 시작합니다 =");
                System.out.println("1~9 사이에 중복없이 세 자리 숫자를 입력해주세요.");
                baseballGame.playGame();

            } else if (menu == 2) {
                System.out.println("= Lv.3에서 보실 수 있습니다 =");
                continue;
            } else if (menu == 3) {
                System.out.println("= 게임을 종료합니다 =");
                break;
            }else {
                System.out.println("= 잘못 선택하셨습니다 =");
            }

        }
    }
}
