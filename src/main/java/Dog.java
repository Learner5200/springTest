public class Dog implements Animal {
    private FortuneService fortuneService;

    public Dog(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    public String getNoise() {
		return "Woof";
	}

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}








