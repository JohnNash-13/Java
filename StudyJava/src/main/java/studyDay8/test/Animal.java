package studyDay8.test;

/**
 * Animals
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/17 20:40
 **/
public class Animal {

    private String name;
    private String type;

    public Animal() {}

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 重写equals方法通常要求两个对象是同一个类的实例
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        //为什么不使用 o instanceof Animal;
        //因为instanceof 用法 --> 引用类型变量 instanceof 类或接口， 不太合适， ps： sparrow s instanceof Animal  也返回true
        if (o != null && o.getClass() == Animal.class) {
            var animalObj = (Animal)o;
            if (this.getType().equals(animalObj.getType())) {
                return true;
            }
        }
        return false;
    }

}
