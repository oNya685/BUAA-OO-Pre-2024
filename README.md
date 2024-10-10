# ��������ҵָ����

## ���㲿�֣��ύҪ�� && JunitҪ��

�뱣֤�ύ��Ŀ�Ķ���Ŀ¼���������ļ��У�`src`��`test`���������ϸ���˱���һ�£����뽫��ҵ��**���ܴ���**�����`src`�ļ����£�ͬʱ�����**junit���������**�ļ������`test`�ļ����£��Ա�֤������������У�����ʱ**ֻ��**���`src`Ŀ¼�µ��ļ����г���**����**�������Լ��������⣬Ҳ����˵��`test`Ŀ¼�µ�junit���Դ����񲻻ᱻ��⣩���ο�Ŀ¼�ṹ���£�

```plaintext
|-src
  |- Bottle.java
  |- Equipment.java
  |- ...
|-test
  |- BottleTest.java
  |- EquipmentTest.java
  |- ...
```

������ҵ��Ҫ��Junit���Ը�����**��֤**`method >= 90��`��`line >= 60%`����`idea`��ʾ�ĸ����ʺ�`����`�⵽�ĸ����ʿ������в����ͬѧ��������Ϊ׼��

## ��һ���֣�ѵ��Ŀ��

+   ���ռ̳��Լ��ӿڵ�ʹ��

## �ڶ����֣�Ԥ��֪ʶ

���������������������**��װ��**��**�̳���**��**��̬��**��

### �̳�

��Ҫ�˽�̳У����ǻ��ǰ�Ŀ��Ż����ǵĳ����̵ꡭ�� �����̵�֮ǰֻ������������������è��

![�Ա�](./image/image1.png)

ͨ���۲죬���Ƿ���è�͹��Ĵ��볤�ü���һ�������ǵ����Զ��������� name������ type���۸� price���Ƿ񱻹��� isBought��ͬʱ���ǵ���Ϊ���������Ǹ߶�����ġ������������������޸ģ��ͻ���������ظ��Ĳ���Ҫ�Ĵ��롣��ʱ��ȷ�������ǣ�������ȡ��

#### �̳еĸ���

**�̳�** ��������̳и������������Ϊ��ʹ��������и�������Ժͷ���������Ĵ����������������ݡ��¹��ܣ����Լ̳и���ȫ���Ĺ��ܣ����ǲ���ѡ���Եļ̳и���Ĳ��ֹ��ܡ�ͨ���̳У������𵽴��븴�õ�Ŀ�ġ�

#### �̳еĸ�ʽ

���Ǹ���Cat��Dog�����ԣ������һ�� **Animal** �ࣺ

```java
public class Animal {
    private String name;
    private String type;
    private int price;
    private boolean isBought;

    public Animal(String type, int price) {
        this.name = null;
        this.type = type;
        this.price = price;
        this.isBought = false;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
```

��ʱ Animal �༴���࣬Cat �� Dog ��Ϊ����̳��˸��� ������ʽ���£�

```java
public class Child extends Parent {
    /* ... */
}
```

��Ӧ�����ǵ������м���

```java
public class Dog extends Animal{

    public Dog(String type, int price) {
        super(type, price);
    }

    /* ... */
}
```

```java
public class Cat extends Animal{

    public Cat(String type, int price) {
        super(type, price);
    }

    /* ... */
}
```

> *super*�ؼ��ֵ�ʹ�ã�super�������Ϊ **�����**������this�������Ϊ**��ǰ��**��(Ҳ���Ǽ̳й�ϵ�е�����)��super���������������ԡ������������������ڹ���������ʹ����ʽ��д��super��java������Ҳ���Զ��ڷ�����ʼ��ӣ�����ʹ������Ĺ��췽��ǰһ���ȵ��ø���Ĺ��췽����

#### �̳��е����Եķ���

��ʱ���������Ҫͬʱ��С����Сè���� **����** �����ԣ�����Ҫ�� Dog �� Cat ��ֱ����`private int age;` ֻ��Ҫ�ڶ��߹�ͬ�ĸ��� **Animal** ������Ӧ���Ե�����

```java
public class Animal {
    private String name;
    private String type;
    private int price;
    private boolean isBought;
    private int age; /* new added */

    public Animal(String type, int price) {
        this.name = null;
        this.type = type;
        this.price = price;
        this.isBought = false;
        this.age = 0; /* new added */
    }

    public int getPrice() {
        return price;
    }

    public void information() {
        System.out.println("pet's price is: " + this.price);
    }
}
```

�����ǹ۲�����һ�δ��룬������Ҫ�� Dog ��������ļ۸񡭡�

```java
public class Dog extends Animal{

    public Dog(String type, int price, int age) {
        super(type, price, age);
    }

    public void printPrice() {
        System.out.println("dog's price is: " + this.price); // error!
    }
}
```

![image2](./image/image2.png)

���ǳ����˱������ ������Ϊ�����޷����ʸ��౻ **private** ���ε��ֶλ򷽷�������ʹ�� **protected** ����

```java
public class Dog extends Animal{

    public Dog(String type, int price, int age) {
        super(type, price, age);
    }

    public void information() {
        System.out.println("dog's price is: " + super.getPrice()); 
    }
}
```

#### �̳��еķ�������

�����������ͬ������ʱ�����ǹ۲촴���Ķ������ͣ�����������ȵ�������ķ������������в����ڸ÷�������ô������Ѱ�Ҹ��෽�����е��á�

```java
public class Main {
    public static void main(String[] args) {
        Dog bernese = new Dog("Bernese Mountain", 18000);
        Animal animal = new Animal("unknown species", 0);
        Animal strayDog = new Dog("unknown dog type", 3);
        // Dog sth = new Animal("***", 0); ���󣡣�����
        bernese.information(); // new Dog -> Dog�����и÷��� -> ����Dog�෽��
        System.out.println("-----------------------------------");
        animal.information(); // new Animal -> Animal�����и÷��� -> ����Animal�෽��
        System.out.println("-----------------------------------");
        strayDog.information();// new Dog -> Dog�����и÷��� -> ����Dog�෽��
    }
}
```

```
dog's price is: 18000
-----------------------------------
pet's price is: 0
-----------------------------------
dog's price is: 3
```

#### �̳��еķ�����д

������⣬����������Լ�**����**�ķ���/���ԣ���ôֱ�Ӽ��뵽�����м��ɡ�����������������Ҫ�Ը���ķ������е������£��Ƿ�Ҫ������ķ�������ȫ����дһ���أ� ��Ȼ���ǵģ�����֮��������̳о���ϣ��ͨ���ظ�������֮��Ĺ��Թ�ϵ�����ʹ�������ӳ̶ȡ�������Ǿ�����һ���µĸ��� **������д��override** �����ǵ������У�Animal����һ���������� *information* ���������ֻ��ӡ�˳���ļ۸񣬵���ϣ�����ҵ���С���� information ʱ���һ����Կ�����ֻС����Ʒ�ࡣ

```java
public class Dog extends Animal{

    public Dog(String type, int price) {
        super(type, price);
    }

    @Override
    public void information() {
        System.out.println("Dog's information: ");
        System.out.println("===================");
        super.information();
        System.out.println("dog's type is: " + this.getType());
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Dog bernese = new Dog("Bernese Mountain", 18000);
        bernese.information();
    }
}
```

```
Dog's information: 
===================
pet's price is: 18000
dog's type is: Bernese Mountain
```

#### �̳��е�ת��

##### ����ת��

�ڽ����˼̳й�ϵ֮�󣬿���ʹ��**������**ȥ����ͨ��**������**�����Ķ��������漰������Ҫ�ĸ��������������á�һ����ԣ�������һ�����ʵ�����������Ӧ�ڴ��е�һ�����ݽṹ��������������ʹ��һ��������ָ���ڴ��е�������ݽṹ�������󣩡�

�����ǿ���ʹ������� Dog ��������һ������`new Dog()` ��������䷵��һ�������Ķ�������ͬʱ��Ҫ����һ������������ָ�򷵻صĶ��󣬷�����ܾ��Ҳ�����������ˡ����ԣ�һ����붼����ôд��`Dog bernese = new Dog()` ��

�ڽ����˼̳й�ϵ֮������Ҳ����ʹ�� Animal ��������һ���������ã���ָ������Ϊ Dog �Ķ���`Animal pet = new Dog(...)`���ӳ������͵ĽǶȣ������﷽ʽ��Ϊ���ϵ�����ת�������**����ת��** (up cast)��

��������ڼ̳��еķ������ø�����ͬѧ�ǿ��Է��հ���������������

##### ����ת��

Java �����ṩ��һ������Ĺؼ��� `instanceof` �����ж�һ������������ָ��Ķ���Ĵ��������Ƿ�Ϊ�ض���ĳ���࣬һ��дΪ `obj instanceof A`������ obj Ϊһ���������ã�A Ϊһ�����ͣ����ӿڣ���������ʽ��ȡֵ���Ϊ�����ͣ���� obj �Ĵ�������Ϊ A������Ϊ true������Ϊ false����������ʽȡֵΪ true ������£�����ʹ��**����ת��** (down cast) ��ʹ��һ�� A ���͵Ķ���������obj�� `A ao = (A)obj` ��ע�⣬ʵ���� obj ��ָ�����Ĵ���������Զ���ᷢ���仯��ת�͵�ֻ�Ƕ����������͡��������Ӹ�������Ӧ������ת�ͳ�����

```java
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal pet;
        if (new Random().nextInt() > 0) { // ���һ������
            // �������� ������һֻ����ɽС��
            pet = new Dog("Bernese Mountain", 18000);
        } else {
            // ��С���� ������һֻ����è
            pet = new Cat("Maine Coon", 8000);
        }

        /* ֵ��ע����ǣ�
         * �� `instanceof` �������ʱ��ʹ������ת�ͣ����ܱ�֤����ת�͵İ�ȫ�ԣ���������ʱ�ᴥ������*/    

        if (pet instanceof Dog) {
            System.out.println("this is a dog!");
            Dog bernese = (Dog) pet;
            bernese.information();
        } else if (pet instanceof Cat) {
            System.out.println("this is a cat!");
            Cat maine = (Cat) pet;
            maine.information();
        } else {
            System.out.println("this is an unknown species");
        }
    }
}
```

### �ӿ�

���˵�̳���һ�������֮��Ĺ��Գ�ȡ����ô�ӿڿ�����Ϊ����Ϊ�Ĺ淶��׼������ڼ̳��Ƕ���������ԣ��ӿڸ�����Ǹ�д������ ������Ȼ���س����̵꣬������ڹ������Ĺ������������������ţ�һ����ϴ�貿��һ���Ǹɷ�����һ���ǹ��򴦡�

���ǹ۲�����������

```java
public class Bath {
    public void sendIn(String origin) {
        System.out.println("A pet is sent from " + origin);
    }

    public void sendOut(String target) {
        System.out.println("Bathing department sends a pet to " + target);
    }

    public void operation(Animal animal) {
        System.out.println("Bathing starts");
        animal.enhanceHealthCondition(30);
        System.out.println("Bathing finishes");
    }
}
```

```java
public class Feed {
    public void sendIn(String origin) {
        System.out.println("A pet is sent from " + origin);

    }

    public void sendOut(String target) {
        System.out.println("Feeding department sends a pet to " + target);
    }

    public void operation(Animal animal) {
        System.out.println("Feeding starts");
        animal.enhanceHealthCondition(10);
        System.out.println("Feeding finishes");
    }
}
```

```java
public class Purchase {
    public void sendIn(String origin) {
        System.out.println("A pet is sent from " + origin);

    }

    public void sendOut(String target) {
        System.out.println("Purchasing department sends a pet to " + target);
    }

    public void operation(Animal animal) {
        System.out.println("Negotiating price....");
        if (animal instanceof Dog) {
            System.out.println("A dog sells for " + animal.getPrice() + "��");
        } else if (animal instanceof Cat) {
            System.out.println("A cat sells for " + animal.getPrice() + "��");
        }
    }
}
```

�����������������ŵĹ���ģʽ�ǳ����������ͳһ��������Ϊ�����ܳ����������������λ�� �������Ƕ�Сè��С�����еĹ��Գ�ȡ����ʱ���Ƕ�������Ϊģʽ�淶������ȡ��

#### �ӿڵĸ���

**�ӿ�** ��һϵ�з�������������һЩ���������ļ��ϣ�һ���ӿ�ֻ�з���������û�з�����ʵ�֣������Щ���������ڲ�ͬ�ĵط�����ͬ����ʵ�֣�����Щʵ�ֿ��Ծ��в�ͬ����Ϊ�����ܣ���

��Ҫע����ǣ��ӿ��ṩ����Ϊ�ĳ�����ơ�������������У�Bath ��Feed ��Purchase �Ĺ�����������Ϊ���������ʹ�ýӿ��Ǻ��ʵġ���������һЩ����������֮����ܼ��й��Ե���Ϊ��Ҳ�й��Ե��������ԣ���ʱʹ���ཨ�������θ��Ӻ��ʡ�

#### �ӿڵĸ�ʽ

���ýӿ�

```java
public interface NameOfInterface {
    public [����ֵ] nameOfFunction (args..);
}
```

> �ӿ��еķ���Ĭ�ϱ�public static abstract���� ����ʵ����

```java
public class A implements NameOfInterface {
    /* ������ */

    /* @Override
     * ... */
}
```

�ڱ����У����Ǹ���**Bath** ��**Feed** ��**Purchase** �Ĺ��Բ���������һ���ӿڽ��� Department

```java
public interface Department {
    public void sendIn(String origin);
    public void sendOut(String target);
    public void operation(Animal animal);
}
```

Ȼ������**Bath** ��**Feed** ��**Purchase** ����ʵ�� (implements) ����ӿڣ� ��Ҫע����ǣ�����ʵ�ֽӿڵ�ʱ����Ҫʵ�ֽӿ������еķ������������������Ϊ������ࡣ ��ʵ�ֽӿڵ�ʱ��ҲҪע��һЩ����

1.  һ�������ͬʱʵ�ֶ���ӿڡ�
2.  һ����ֻ�ܼ̳�һ���࣬������ʵ�ֶ���ӿڡ�
3.  һ���ӿ��ܼ̳���һ���ӿڣ������֮��ļ̳бȽ����ơ�

```java
public class Bath implements Department {
    @Override
    public void sendIn(String origin) {
        System.out.println("A pet is sent from " + origin);
    }
    @Override
    public void sendOut(String target) {
        System.out.println("Bathing department sends a pet to " + target);
    }
    @Override
    public void operation(Animal animal) {
        System.out.println("Bathing starts");
        animal.enhanceHealthCondition(30);
        System.out.println("Bathing finishes");
    }
}
```

```java
public class Feed implements Department{
    @Override
    public void sendIn(String origin) {
        System.out.println("A pet is sent from " + origin);

    }
    @Override
    public void sendOut(String target) {
        System.out.println("Feeding department sends a pet to " + target);
    }
    @Override
    public void operation(Animal animal) {
        System.out.println("Feeding starts");
        animal.enhanceHealthCondition(10);
        System.out.println("Feeding finishes");
    }
}
```

```java
public class Purchase implements Department{
    @Override
    public void sendIn(String origin) {
        System.out.println("A pet is sent from " + origin);

    }
    @Override
    public void sendOut(String target) {
        System.out.println("Feeding department sends a pet to " + target);
    }
    @Override
    public void operation(Animal animal) {
        System.out.println("Negotiating price....");
        if (animal instanceof Dog) {
            System.out.println("A dog sells for " + animal.getPrice() + "��");
        } else if (animal instanceof Cat) {
            System.out.println("A cat sells for " + animal.getPrice() + "��");
        }
    }
}
```

#### �ӿ��е����Եķ���

�ӿڲ��ܰ������ԣ���ʵ���������������� Java 8 ��֮��İ汾�У��ӿڿ��Զ��峣����ʹ�� public static final ���η��������������ֱ��ͨ���ӿ���������Щ������

��ʽ: `public static final �������� �������� = ����ֵ;` �ӿ��еĳ���������и�ֵ��ͬʱһ����ֵ�㲻�ɸı䡣������Ա����ɣ��ӿڱ������һ�����һ��ģ������������Ҳ������һ����׼���ĳ�����

#### �ӿ�ͨ����̬����ʽʵ��ʵ����

�����ýӿ�������**ʵ����**һ������

```java
public class Main {
    public static void main(String[] args) {
        Department bath = new Bath();
        Department feed = new Feed();
        Department purchase = new Purchase();

        Animal bernese = new Dog("Bernese Mountain", 18000);
        bath.sendIn("Factory");
        bath.operation(bernese);
        bath.sendOut("Feeding Department");
        System.out.println("");
        feed.sendIn("Bathing Department");
        feed.operation(bernese);
        feed.sendOut("Purchase Department");
        System.out.println("");
        purchase.sendIn("Feeding Department");
        purchase.operation(bernese);
        purchase.sendOut("Customer");
    }
}
```

#### ʵ�ֽӿ���Ĺ���

���ڳ����̵꣬��Ҫ���й������������ţ���ʵ����`Department`�ӿڵ������ࡣ ��������Ҫ����**ʵ�ֽӿڵ���**ʱ������ʹ�ӿ���Ϊ���ͣ��ɴ˴ﵽ�����洢ʱ�������͵�ͳһ��д��

���Ǿ�һ�����ӣ�ÿ���µף������̵궼��Ҫ�����������ŷ�Ǯ���� ����������`Department`�ӿ�������һ������

```java
    public void getPaid(int wage);
```

Ȼ��ֱ���ʵ�ֽӿڵ��������У���д�����ʷ���

```java
/* ʣ��������ͬ�� */
public class Bath implements Department {
    /*...*/
    @Override
    public void getPaid(int wage) {
        System.out.println("Bathing department gets " + wage);
    }
}
```

��� PayDay��

```java
public class Main {
    public static void main(String[] args) {
        Department bath = new Bath();
        Department feed = new Feed();
        Department purchase = new Purchase();

        HashMap<String ,Department> departments = new HashMap<>();
        departments.put("Bath", bath);
        departments.put("Feed", feed);
        departments.put("Purchase", purchase);

        for (Department department : departments.values()) {
            department.getPaid(new Random().nextInt(8000,10000));
        }
    }
}        
```

���

```txt
Purchasing department gets 9245
Bathing department gets 8865
Feeding Department gets 9221
```

## �������֣���Ŀ����

### ����

������ҵ���ڵڶ�����ҵ�Ļ����Ͻ��п�����ȷ����ȫʵ��ǰ����Ŀ��Ҫ�󣬲����ü��д��롣

�����ϴ���ҵ���̵棬ð���������䱸��װ����ҩˮƿ��Ȼ�������ǵ����̽��ʱЯ��ȫ���ҵ�������ʵ�����������ˡ���������һ��Ԫ�ء�

Ϊ����׼������ð���ߵ�״̬�����������������ؼ����ԣ�������`hitPoint`������������`atk`�����������`def`����

ͬʱ����������ˡ�ս��������`CE`����Combat Effectiveness���ĸ��ҩˮƿҲ������ϸ������Ϊ�������͡�

����������ݣ�������ҵ�������漰��

1.  ��ð���ߵ����Թ���������ƣ�������CE���ܣ�
2.  ͨ����������еļ̳л��ƣ���ϸ����ҩˮƿ�����
3.  ��Ʋ�ʵʩ����ϵͳ��ʹð������ѡ��Я��������Ʒ����̽�ա�

### ս�����ӿ�

������ҵ����ս����`CE`�ĸ�����ȣ�Ϊȷ���������ȷ��������һ���ԣ��ڴ���ʽ�������º��ĸ��������ҵ������ȷ˵���������øö��壬����׸����

1.  **ս����λ**������������ͳһָ��ð���ߡ�ҩˮƿ�Լ�װ��������ʵ�塣���б�����Ϊս����λ�Ķ��󣬾��߱�һ����ͬ�����������Ǹ���ӵ��ս������Combat Effectiveness, CE������һ������������������Ϸ�е�Ч�ܻ�Ӱ������
2.  **��Ʒ**���ڱ�����ҵ�У���Ʒָװ����ҩˮƿ������ʵ�壬������ð���������𣬵���ͬ������ð��������Ϸ�����пɽ��������õ���Դ����Ʒ��һ���ؼ��������ڣ������ܹ���ð����**Я��**�������У���֧������ð�չ����е��������ж�����ע����ǣ��˶����ų���ð���߱�����ð���߲����ڡ���Ʒ�����룬��������Ʒ���е�ս����λ֮һ��

����������ȷ��ս����λ��`CE`��ֵ���㷽ʽ��

| ս����λ | `CE`��ֵ���㷽ʽ |
| --- | --- |
| ð���� | $CE=atk+def$������ð���ߵ�ս����Ϊ�乥�����������֮�� |
| ��Ʒ | ������ֱ��ָ�� $CE$ ��ֵ |

### ��������

�ϴ���ҵ��������ӵĸ��add�����������������ð����ӵ���������Ʒ����������û��Я�������Ʒ��

������ҵ��**Я��**�ĸ�����н綨�����ҽ���**�����Ʒ���ڸ�ð�������ڸ���ð���ߵı�����**�����ܳƸ�ð����Я���˴���Ʒ��

�ر�أ�������Ʒ��Я���������ƣ���**��ʱ��أ��κ�ð������ӵ�е���Ʒ�����Ա�Я��**��

���ǣ�����ð���� A ����Я����Ʒ B ���� B �Ѿ���ð���߱������ˣ���ô��ʱ����6��ָ�������κ�Ӱ�죨����Ҫ�κ������ͬʱ��Ʒ B ������ð���ߵı����� ����

�����������Ƕ���Ʒ��ʹ�ý��й涨��

#### ����ҩˮƿ�ľ���˵��

��ð����Я��ҩˮƿ A ʱ��������ʹ�ø�ҩˮƿ A��δЯ����ʹ��ʧ�ܡ�

ʹ��ʱ����ҩˮƿ�ǿգ���ð���ߵ�������Ի���Ӧ�ı䣨���������ҩˮƿ��գ���ҩˮƿ�ѿգ���ð���ߵ��������������ͷ��������䣬ʹ����Ȼ��Ϊ�ɹ���ͬʱ��Ϊ�˸�����Я��ҩˮƿ�ڳ��ռ䣬��ʹ�ú�ð���߽������ÿ�ҩˮƿ������ҩˮƿ�����ٱ���ð����ӵ�С��������������Ϊ���ǲ���Ҫ���������

ע�⣬����ҩˮƿ���״�ʹ��֮ǰ����Ĭ�ϴ���**�ǿ�**״̬����������������capacity�����Ϊ0��ҩˮƿ�����״�ʹ��֮ǰ����ͬ������Ϊ���ڷǿ�״̬��

**Bottleҩˮƿ����Ϊ�����ָ�ҩˮ������ҩˮ������ҩˮ**��

| ����`type` | ���� |
| --- | --- |
| `HpBottle` | �����ָ�ҩˮ����ð����ʹ�������ָ�ҩˮ����ð������������ֵΪ $capacity$ �������� |
| `AtkBottle` | ����ҩˮ����ð����ʹ������ҩˮ����ð������������ֵΪ $ҩˮƿ��CE+\frac{capacity}{100}$ �Ĺ������� |
| `DefBottle` | ����ҩˮ����ð����ʹ������ҩˮ����ð������������ֵΪ $ҩˮƿ��CE+\frac{capacity}{100}$ �ķ������� |

### ����Ҫ��

�ڱ�����ҵ�У���ʼʱ����û����Ҫ�����ð���ߣ���ͨ������������ָ�����޸ĵ�ǰ��״̬��

��**��ָ��4����**��

1.  ����һ����Ҫ�����ð���ߣ��¼����ð���߲�Я���κ�ҩˮƿ��װ�������ҳ�ʼ����Ϊ $500$����ʼ������Ϊ $1$����ʼ������Ϊ $0$��
2.  ��ĳ��ð��������һ��ҩˮƿ
3.  ��ĳ��ð��������һ��װ��
4.  ��ĳ��ð���ߵ�ĳ��װ������һ���;ö�
5.  ɾ��ĳ��ð���ߵ�ĳ����Ʒ
6.  ð���߳���Я����ӵ�е�ĳ����Ʒ
7.  ð����ʹ��ĳ��ҩˮƿ

### ���������ʽ

��һ��һ������ $n$����ʾ�����ĸ�����

�������� $n$ �У�ÿ��һ������ `{type} {attribute}` �Ĳ�����`{type}` �� `{attribute}` �䡢���ɸ� `{attribute}` ��ʹ��**����**���ո�ָ����������ʽ���京������

| type | attribute | ���� | �����ÿ����Ӧռһ�У� |
| --- | --- | --- | --- |
| 1 | `{adv_id} {name}` | ����һ�� ID Ϊ `{adv_id}`������Ϊ `{name}` ��ð���� | �� |
| 2 | `{adv_id} {bot_id} {name} {capacity} {type} {CE}` | �� ID Ϊ `{adv_id}` ��ð��������һ��ҩˮƿ��ҩˮƿ�� ID�����֡����������͡�ս�����ֱ�Ϊ `{bot_id}`��`{name}`��`{capacity}��{type}��{CE}`���ر�أ���typeΪ `HpBottle` ʱ����֤�����`CE`Ϊ $0$ | �� |
| 3 | `{adv_id} {equ_id} {name} {durability} {CE}` | �� ID Ϊ `{adv_id}` ��ð��������һ��װ����װ���� ID�����֡��;öȡ�ս�����ֱ�Ϊ `{equ_id}`��`{name}`��`{durability}��{CE}` | �� |
| 4 | `{adv_id} {equ_id}` | �� ID Ϊ `{adv_id}` ��ð���ߵ� id Ϊ `{equ_id}` ��װ������һ���;ö� | `{һ���ַ���} {һ������}`���ַ���Ϊװ���� **name**������Ϊ**װ�������;ú���;ö�** |
| 5 | `{adv_id} {id}` | �� ID Ϊ`{adv_id}`��ð���ߵ� id Ϊ `{id}` ����Ʒɾ�� | `{һ���ַ���A} {һ���ַ���B} {һ������C}`���ַ��� A Ϊ��Ʒ����������ֻ����������������ѡ��һ�� `HpBottle`��`AtkBottle`��`DefBottle`��`Equipment`�����ַ��� B Ϊ��ɾ������Ʒ��name<br>����ƷΪ**ҩˮƿ**������ C Ϊɾ����ҩˮƿ������<br>����ƷΪ**װ��**������ C Ϊɾ����װ�����;ö� |
| 6 | `{adv_id} {id}` | ID Ϊ `{adv_id}` ��ð���߳���Я�� id Ϊ `{id}` ����Ʒ | �� |
| 7 | `{adv_id} {bot_id}` | ID Ϊ `{adv_id}` ��ð���߳���ʹ����ӵ�е� id Ϊ`{bot_id}`��ҩˮƿ | �ɹ���`{һ���ַ���} {һ������A} {һ������B} {һ������C}`���ַ���Ϊ��ð���ߵ� `name`������ A Ϊ��ð����ʹ�ø�ҩˮƿ�������ֵ������ B Ϊ��ð����ʹ�ø�ҩˮƿ��Ĺ�����ֵ������ C Ϊ��ð����ʹ�ø�ҩˮƿ��ķ�����ֵ<br>ʧ�ܣ� `{adv_name} fail to use {name}`��`adv_name` Ϊ ID Ϊ `adv_id` ��ð���ߵ� name�� `name` Ϊ ID Ϊ `bot_id`��ҩˮƿ�� name) |

### ����

#### ����

```
6
1 123456 advName
2 123456 123 bottleName 40 HpBottle 0
7 123456 123
6 123456 123
7 123456 123
5 123456 123
```

#### ���

```
advName fail to use bottleName
advName 540 1 0
HpBottle bottleName 40
```

### ��������

#### ����Լ��

| ���� | ���� | ˵�� |
| --- | --- | --- |
| `id` | ���� | ȡֵ��Χ��0 - 2147483647 |
| `name` | �ַ��� | ��֤������ֿհ��ַ�����������: (0,40) |
| `capacity` | ���� | ȡֵ��Χ��0 - 2147483647 |
| `durability` | ���� | ȡֵ��Χ��1 - 2147483647 |
| `hitPoint` | ���� | ȡֵ��Χ��1 - 2147483647 |
| `CE` | ���� | ȡֵ��Χ��0 - 2147483647 |
| `atk` | ���� | ȡֵ��Χ��1 - 1073741823 |
| `def` | ���� | ȡֵ��Χ��0 - 1073741823 |

ע�⣬����Լ��ָ���ǣ��ڳ�������ʱ������Ͷ�Ӧ����ֵ����֤�ڱ���и����ķ�Χ�ڡ�

#### ����Լ��

1.  **��֤���е�ð���ߡ�ҩˮƿ��װ�� id ������ͬ**
2.  ��֤ɾ���˵�ҩˮƿ/װ���� id �����ٴγ���
3.  ���� 2-7 ��֤����ð���߾��Ѵ���
4.  ���� 4-7 ��֤��ð����ӵ�в������ᵽ id ��ҩˮƿ��װ��
5.  ��֤���ӵ�װ����ҩˮƿԭ��������
6.  ���������� $1��n��2000$
7.  ���� 2 ��֤���� type Ϊ `HpBottle` ʱ������� CE һ��Ϊ $0$
8.  ���� 7 ����֤���ᵽ��ҩˮƿ�ѱ�Я��

### ��ʾ

���ǵ�������δ�����й�������������ݣ������ڴ��ṩһ������������룬ͬѧ�ǿ��Խ��临�Ƶ��Լ������е��ʵ�λ��ֱ��ʹ�ã���Ȼ��ͬѧ��Ҳ����������ƴ������������������

```java
ArrayList<ArrayList<String>> inputInfo = new ArrayList<>(); // ����������뽫������������, ������c���ԵĶ�ά����
Scanner scanner = new Scanner(System.in);
int n = Integer.parseInt(scanner.nextLine().trim()); // ��ȡ����
for (int i = 0; i < n; ++i) {
    String nextLine = scanner.nextLine(); // ��ȡ����ָ��
    String[] strings = nextLine.trim().split(" +"); // ���ո���н��зָ�
    inputInfo.add(new ArrayList<>(Arrays.asList(strings))); // ��ָ��ָ��ĸ������ִ��������
}
```

������δ��룬�������Ϣ�ᱻ���� `inputInfo` ���"��ά����"�У���������������ȡ������ָ���������֡�