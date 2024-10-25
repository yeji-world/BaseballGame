package lv2.numplay;

import java.util.*;

public class BaseballGame {

    int strike = 0;
    int ball = 0;
    int challenge = 0;

    ArrayList<Integer> randList = generateRandNum();
    int[] inputArr = new int[3];

    public BaseballGame() {
        generateRandNum();
    }

    public ArrayList<Integer> generateRandNum() {

        Random randNum = new Random();
        Set<Integer> numSet = new LinkedHashSet<>(3);

        while (numSet.size() < 3) {
            int num = randNum.nextInt(9) + 1;
            numSet.add(num);
        }

//        System.out.println(numSet); // 랜덤 넘버 확인용
        return new ArrayList<>(numSet);
    }

    public void playGame() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("숫자를 입력하세요: ");
                String input = sc.nextLine();

                boolean validResult = validateInput(input);
                if (validResult) {
                    continue;
                }

            } catch (NumberFormatException e) {
                System.out.println("올바르지 않은 입력값입니다.");
                continue;
            }

            challenge++; // 올바른 값을 입력했을 경우에만 카운트
            countStrikeAndBall();

            boolean result = GameDisplay.displayHint(strike, ball, challenge);
            if (result) {
                break;
            }
            strike = 0;
            ball = 0;
        }
    }

    public boolean validateInput(String input) {
        Set<String> inputSet = new HashSet<>();

        if (input.length() == 3) {
            for (int i = 0; i < inputArr.length; i++) {

                String[] splitInput = input.split("");
                inputSet.add(splitInput[i]);

                int inputNum = Integer.parseInt(splitInput[i]);
                inputArr[i] = inputNum;
            }
            if (inputSet.contains("0")) {
                System.out.println("올바르지 않은 입력값입니다. 각 자리 수에 들어갈 수 있는 숫자는 1~9입니다.");
                return true;
            }
            if (inputSet.size() != 3) {
                System.out.println("올바르지 않은 입력값입니다. 중복된 숫자가 있습니다.");
                return true;
            }

        } else {
            System.out.println("올바르지 않은 입력값입니다. 세자리 숫자를 입력하세요.");
            return true;
        }
        return false;
    }

    public void countStrikeAndBall() {
        for (int i = 0; i < randList.size(); i++) {

            if (randList.contains(inputArr[i])) {
                if (randList.get(i) == inputArr[i]) {
                    strike++;
                } else {
                    ball++;
                }
            }
        }
    }

}

