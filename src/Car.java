public class Car {
    private String type; // 汽车品牌
    private String color; // 汽车颜色
    private int speed; // 汽车速度
    private int x; // 汽车坐标x
    private int y; // 汽车坐标y

    public Car() {
    }

    public Car(String type, String color, int speed, int x, int y) {
        this.type = type;
        this.color = color;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // 汽车向左移动
    public void moveLeft() {
        x -= speed;
    }

    // 汽车向右移动
    public void moveRight() {
        x += speed;
    }

    // 汽车向上移动
    public void moveUp() {
        y -= speed;
    }

    // 汽车向下移动
    public void moveDown() {
        y += speed;
    }

    // 输出汽车状态
    public void printStatus() {
        System.out.println(String.format("%s-%s-%d-(%d,%d)", type, color, speed, x, y));
    }

}
