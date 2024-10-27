package racingcar.domain;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RacingCars {
private static final int MINIMUM_CAR_COUNT = 2;
    private final List<RacingCar> racingCars;

    public RacingCars(List<RacingCar> racingCars) {
        validateDuplicateRacingCarNames(racingCars);
        validateMinimumCarCount(racingCars);
        this.racingCars = racingCars;
    }

    private void validateDuplicateRacingCarNames(List<RacingCar> racingCars) {
        Set<RacingCarName> racingCarNames = racingCars.stream()
                .map(RacingCar::getRacingCarName)
                .collect(Collectors.toSet());

        if (racingCarNames.size() != racingCars.size()) {
            throw new IllegalArgumentException("자동차 이름을 중복으로 사용할 수 없습니다.");
        }
    }

    private void validateMinimumCarCount(List<RacingCar> racingCars) {
        if (racingCars.size() < MINIMUM_CAR_COUNT) {
            throw new IllegalArgumentException("자동차 경주를 위해서는 최소 2대 이상의 자동차를 만들어야 합니다.");
        }
    }
}
