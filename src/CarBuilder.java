public class CarBuilder {
    private String type; // 汽车品牌
    private String color; // 汽车颜色
    private int speed; // 汽车速度
    private int x; // 汽车坐标x
    private int y; // 汽车坐标y

    public CarBuilder() {
    }

    public CarBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public CarBuilder setX(int x) {
        this.x = x;
        return this;
    }

    public CarBuilder setY(int y) {
        this.y = y;
        return this;
    }

    public Car build() {
        return new Car(type, color, speed, x, y);
    }
}