package SpringDemo;

public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "SAD";
    }
}
