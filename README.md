# java-racingcar-precourse

## 기능 요구 사항
초간단 자동차 경주 게임을 구현한다.

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
- 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.

## 입출력 요구 사항

### 입력
- 경주할 자동차 이름(이름은 쉼표(,) 기준으로 구분)
```
pobi,woni,jun
```

- 시도할 횟수
```
5
```

### 출력
- 차수별 실행 결과
```
pobi : --
woni : ----
jun : ---
```

- 단독 우승자 안내 문구
```
최종 우승자 : pobi
```

- 공동 우승자 안내 문구
```
최종 우승자 : pobi, jun
```

### 실행 결과 예시
```
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
pobi,woni,jun
시도할 횟수는 몇 회인가요?
5

실행 결과
pobi : -
woni :
jun : -

pobi : --
woni : -
jun : --

pobi : ---
woni : --
jun : ---

pobi : ----
woni : ---
jun : ----

pobi : -----
woni : ----
jun : -----

최종 우승자 : pobi, jun

```

## 구현할 기능 목록
- [ ] 게임 시작시, 경주할 자동차를 생성해야한다.
  - [ ] 자동차 이름은 쉼표(,)를 기준으로 구분하여 생성된다.
  - [x] 각 자동차 이름은 1자리 이상, 5자 이하만 가능하다.
  - [ ] 자동차 이름은 중복으로 사용될 수 없다.
  - [ ] 자동차 경주를 하기 위해서는, 자동차는 최소 2대 이상 생성되야 한다.
  
- [ ] 사용자는 몇 번의 이동을 할 것인지 입력할 수 있다.
  - [ ] 이동할 횟수는 0이상의 '자연수'이어야 한다.
  
- [ ] 자동차는 전진하거나 멈출 수 있다.
  - [ ] 0 - 9 사이에서 무작위한 값이 4이상인 경우엔 전진한다.
  - [ ] 0 - 9 사이에서 무작위한 값이 3이하인 경우엔 멈춘다.
  
- [ ] 각 라운드마다의 자동차 경주를 확인할 수 있다.
  - [ ] 경주하는 자동차 이름을 출력한다.
  - [ ] 자동차 이름과 함께, 각 자동차가 전진한 거리를 - 로 출력한다.
  
- [ ] 자동차 경주 게임의 우승자를 확인할 수 있다.
  - [ ] 단독 우승자의 경우, 우승한 자동차를 출력한다.
  - [ ] 공동 우승자의 경우, 우승한 자동차 이름을 ```,```로 구분지어서 출력한다.

- [ ] 예외 사항 총 정리
  - [ ] 자동차가 1대 이하인 경우
  - [x] 자동차 이름이 6자 이상인 혹은 없는 경우
  - [ ] 자동차 이름이 중복인 경우
  - [ ] 이동할 횟수가 0이상의 자연수가 아닌 경우