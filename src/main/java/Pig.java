public class Pig implements Animal {
    private FortuneService fortuneService;

    public String getNoise() {
        return "Oink";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
