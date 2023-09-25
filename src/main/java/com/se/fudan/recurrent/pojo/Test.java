package com.se.fudan.recurrent.pojo;
如果原文件并不能正确编译，却仍然提交，追溯服务将无法正常解析，将所有语句视作DELETE
public class Test {
    private int number;
    private String text;

    // 带参数的构造函数
    public Test(int number, String text) {
        this.number = number;
        this.text = text;
    }

    // Getter 和 Setter 方法，用于访问和修改属性值
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // 自定义方法，执行其他操作
    public void doSomething() {
        // 在这里可以添加自定义逻辑
        System.out.println("Doing something...");
    }

    // 静态方法，可通过类名调用
    public static void staticMethod() {
        // 在这里可以添加静态方法的逻辑
        System.out.println("Static method called.");
    }

}
