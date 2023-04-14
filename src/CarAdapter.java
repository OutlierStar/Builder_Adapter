public class CarAdapter implements Adapter {
    // 持有一个汽车对象
    private Car car;

    // 公有构造器
    public CarAdapter(Car car) {
        this.car = car;
    }

    // 重写move方法
    @Override
    public void move(int x, int y) {
        // 获取当前位置
        int cx = car.getX();
        int cy = car.getY();
        // 计算需要移动的方向和距离
        int dx = x - cx;
        int dy = y - cy;
        // 根据方向和距离调用汽车对象的移动方法
        if (dx>=dy) {
            if (dx > 0) {
                car.moveRight();
            } else if (dx < 0) {
                car.moveLeft();
            }
        } else {
            if (dy > 0) {
                car.moveDown();
            } else if (dy < 0) {
                car.moveUp();
            }
        }
        
        
    }
}