# BaseballGame

1️⃣ lv.1

[Main 클래스]

- BaseballGame 클래스 인스턴스화
- BaseballGame의 play 메서드 호출

[BaseballGame 클래스]

- BaseballGame 생성자
    - 정답 생성 메서드 generateRandNuM 호출
- generateRandNum 메서드
    - Random 클래스: 정답 생성
    - LinkedHashSet 컬렉션 : 중복 불허용
    - size 3, 1~9 숫자 랜덤 생성
- play 메서드
    - Scanner 클래스: 사용자 숫자 입력
    - while문
        - try..catch문: 정수 외 입력시 NumberFormatException 예외처리
        - if..else문: 사용사 입력값의 유효성 검증(세자리수, 0 입력, 중복된 수)
        - for문: 같은 숫자 & 같은 자리 -> 스트라이크, 같은 숫자 & 다른 자리 -> 볼 개수 카운트
        - GameDiseplay 클래스.displayHint 메서드 호출: boolean으로 true인 경우 break

[GameDisplay 클래스]

- if..else if..else 문
    - 스트라이크 3번 -> 정답
    - 스트라이크 0번 & 볼 0번 -> 아웃
    - 둘다 아니면 스트라이크/볼 개수 출력
- boolean 타입으로 반환

2️⃣ lv.2

[Main 클래스]

- 메뉴 선택하기
    - Scanner 클래스: 메뉴 번호 입력
    - While문 + if..else if..else문: 메뉴 번호에 따른 처리

[BaseballGame 클래스]

lv.1과 동일하지만 기능별로 메서드로 구분

- generateRandNum 메서드: 정답 생성
- playGame 메서드: 사용사 숫자 입력, 사용자 입력값의 유효성 검증, 힌트 출력
    - validateInput 메서드 호출
    - countStrikeAndBall 메서드 호출
    - GameDisplay 클래스.displayHint 메서드 호출
- validateInput 메서드: 사용자 입력값의 유효성 검증
- countStrikeAndBall 메서드: 스트라이크, 볼 카운트
