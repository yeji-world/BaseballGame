package lv1.numplay;

import lv2.numplay.GameDisplay;

import java.util.*;

public class BaseballGame {

    int[] input = new int[3];
    ArrayList<Integer> numList = generateRandNum();

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


    public void play() {
        Scanner sc = new Scanner(System.in);

        int strike = 0;
        int ball = 0;
        int count = 0;

        int[] inputArr = new int[3];

        while (true) {
            count++;
            try {
                System.out.print("숫자를 입력하세요: ");
                String input = sc.nextLine();

                Set<String> inputSet = new HashSet<>();

                if (input.length() == 3) {
                    for (int i = 0; i < inputArr.length; i++) {

                        String[] splitInput = input.split("");
                        inputSet.add(splitInput[i]);

                        int inputNum = Integer.parseInt(splitInput[i]);
                        inputArr[i] = inputNum;
                    }
                    if (inputSet.contains("0")) {
                        System.out.println("각 자리 수에 들어갈 수 있는 숫자는 1~9입니다.");
                        continue;
                    }
                    if (inputSet.size() != 3) {
                        System.out.println("중복된 숫자가 있습니다.");
                        continue;
                    }

                } else {
                    System.out.println("세자리 숫자를 입력하세요.");
                    continue;
                }

            } catch (NumberFormatException e) {
                System.out.println("올바르지 않은 입력값입니다.");
                continue;
            }

            for (int i = 0; i < numList.size(); i++) {

                if (numList.contains(inputArr[i])) {
                    if (numList.get(i) == inputArr[i]) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }

            boolean result = GameDisplay.displayHint(strike, ball, count);
            if (result) {
                break;
            }

            strike = 0;
            ball = 0;

        }
    }

}

