import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * 输入代码,请保留
         * 数组inputs对应控制台输入
         * inputs[0]: 汽车品牌
         * inputs[1]: 汽车颜色
         * inputs[2]: 汽车速度
         * inputs[3]，inputs[4]: 起始位置
         * inputs[5]：移动次数
         * inputs[6]，inputs[7]: 目标位置
         */

        Scanner sc = new Scanner(System.in);
        String[] inputs = new String[8];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextLine();
        }
        sc.close();

        /* 处理输入数据，并将其转换为规定类型 */
        String type = inputs[0];
        String color = inputs[1];
        int speed = Integer.parseInt(inputs[2]);
        int sx = Integer.parseInt(inputs[3]);
        int sy = Integer.parseInt(inputs[4]);
        int n = Integer.parseInt(inputs[5]);
        int tx = Integer.parseInt(inputs[6]);
        int ty = Integer.parseInt(inputs[7]);

        // 基于builder模式创建汽车对象
        CarBuilder builder = new CarBuilder();
        Car car = builder.setType(type)
                .setColor(color)
                .setSpeed(speed)
                .setX(sx)
                .setY(sy)
                .build();

        car.printStatus();
        // 基于adapter模式，实现汽车的移动
        CarAdapter adapter = new CarAdapter(car);
        for (int i = 0; i < n; i++) {
            adapter.move(tx, ty); // 移动n次，每次只移动speed个单位
            System.out.println(String.format("(%d,%d)", car.getX(), car.getY()));
        }


    }
}
