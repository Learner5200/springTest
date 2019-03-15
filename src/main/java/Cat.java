public class Cat implements Animal {

	private FortuneService fortuneService;
	Cat(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getNoise() {
		return "Meow";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}










