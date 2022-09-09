import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredTrueAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 10000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredTrueAndUnderLimit1() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 50000;
        boolean registered = true;
        long expected = 15;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredFalseAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 152_000;
        boolean registered = false;
        long expected = 15;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredFalseAndUnderLimit2() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 350_000;
        boolean registered = false;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}