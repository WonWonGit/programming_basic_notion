package enums;

public enum Rank {
    ONE(1, 1000),
    TWO(2, 2000),
    THREE(3, 3000);

    private final int number;
    private final int money;

    Rank(int number, int money) {  // Default 생성자는 private 으로 설정되어 있음.
        this.number = number;
        this.money = money;
    }

    public int getNumber() {
        return this.number;
    }

    public int getMoney() {
        return this.money;
    }
    
}
