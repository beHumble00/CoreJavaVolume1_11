//1. public : 访问修饰符(access modifier), 控制程序其他部分对这段代码的访问级别
//2. 类名标准命名规范 : 首字母大写,驼峰命名(camel case => CamelCase)
//3. 源代码的文件名必须与公共类名相同
public class FirstSample {
    public static void main(String[] args) {
        int num  = 100_000_000;
        System.out.println("We will not use 'Hello World !' ");
        System.out.println(num);
        System.out.println(Character.isJavaIdentifierPart('$'));
        System.out.println(Character.isJavaIdentifierPart('￥'));
    }
}
