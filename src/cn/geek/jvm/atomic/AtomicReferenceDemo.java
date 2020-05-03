package cn.geek.jvm.atomic;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月05日 07:40:00
 */
public class AtomicReferenceDemo {


    /**
     * AtomicReference
     * AtomicReferenceArray
     * AtomicReferenceFieldUpdater
     *
     * AtomicBoolean
     *
     * AtomicInteger
     * AtomicIntegerArray
     * AtomicIntegerFieldUpdater
     *
     * AtomicLong
     * AtomicLongArray
     * AtomicLongFieldUpdater
     *
     * 处理CAS的ABA问题
     * AtomicMarkableReference  使用boolean类型来标记, 这个变量是否已经被改了
     * AtomicStampedReference  使用int来标记一个变量被改变了几次
     *
     */


}

class Student{
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
