# ��һ����ҵָ����

## ѵ��Ŀ��

+   ѧϰʹ�� `git`�Լ� `gitlab`��ز���
+   ѧϰʹ�ÿγ���վ�ύ
+   ѧϰ Java �Ļ����﷨����ɸ�������Ĵ����޸�

## ����һ��git ѧϰ

### step 0 git ��װ������

#### git �İ�װ

##### Linux

```bash
sudo apt-get install git
```

##### Mac OS X

�� AppStore ��װ Xcode������ Xcode��ѡ��˵� "Xcode" -> "Preferences"���ڵ����������ҵ� "Downloads"��ѡ�� "Command Line Tools"���� "Install" ������ɰ�װ��

##### Windows

��[����](https://git-scm.com/downloads)��ѡ�����°汾�������ذ�װ��

#### git ������

```bash
git config --global user.name "�������"
git config --global user.email "23xxxxxx@buaa.edu.cn"
```

��������ָ������ git��ע�⽫ "�������" �� "23xxxxxx@buaa.edu.cn" �ֱ��滻������ʵ�����ͱ������䡣

#### ���� ssh key

�ο� [�鿴���� ssh ��Կ](https://www.runoob.com/w3cnote/view-ssh-public-key.html) ��ȡ������ ssh-key������ӵ� gitlab �У�����ͼ��ʾ����

![δ���������](./image/δ���������.png)

���ڣ������Ѿ���װ�����ú������ǵ� git�����ǿ���ʹ�������������� git ����ز�����Ҳ����ʹ�� IDEA ���Դ��� git ���������в������������Ƕ����ַ����ֱ���н��ܡ�

### step 1 �½��ֿ�

#### ������

**�ڱ����½�һ�����ļ��У��ڴ�Ŀ¼�´��նˣ�bash/git bash/powershell/����**

����

```bash
git clone ��ĸ��˵�һ����ҵ��Զ�ֿ̲�����
```

�����и�����ҵ 1 �ֿ������Ϊ ooprehomework\_2024\_���ѧ��\_hw\_1�����˵�һ����ҵ��Զ�ֿ̲����ӽ���ֿ����Կ���������ͼ��ʾ��

![21098a40ad82744b3f42ff587a0d2b0](./image/21098a40ad82744b3f42ff587a0d2b0.png)

#### IDEA���Ƽ���

�� IDEA��ѡ�� **���Ӱ汾�����л�ȡ��**��

![d45ab26e8b99d6a069c4115adde478c](./image/d45ab26e8b99d6a069c4115adde478c.png)

������ҵ�ֿ��Զ�����ӣ���ȡ��ʽ��������ͬ���������¡���ɡ�

![image-20240812141343621](./image/image-20240812141343621.png)

### step 2 ����һ���ύ

�����ڲֿ�������˸��ĺ󣬿��Խ����ύ����������Զ�ֿ̲��С��������ַ�ʽ���ɣ�**��������ֵ�ͬѧʹ�� IDEA �ύ**��

#### �������ύ

����Ĳֿ�Ŀ¼��

```bash
git add ��Ҫ�ύ���ļ�
git commit -m "�ύ��Ϣ"
git push
```

#### IDEA�ύ���Ƽ���

�� IDEA �д���Ŀ������汾���ƣ�ѡ�� **�ύ**��

![image-20240812141919215](./image/image-20240812141919215.png)

��д�����ύ���ύ��Ϣ��Ȼ���� **���ύ��**���ύ�󣬱��θ��Ľ��ᱣ���ڱ��أ�Ҫ����������Զ�ֿ̲��У���Ҫ�����ͼ�еġ����͡�����Ȼ����Ҳ���Ե�� **���ύ�����͡�** ��һ���Խ�������������

![9e8bb6a2db147e876d44e782ac2f99b](./image/9e8bb6a2db147e876d44e782ac2f99b.png)

### step 3 �ύ����

�������ύ���͵�Զ�ֿ̲�����Ƿ��� [�γ���վ](http://oo.buaa.edu.cn/courses)��ѡ��γ̺Ͷ�Ӧ����ҵ�������� **����** ���鿴�ύ�б���ѡ��һ���ύ���������⡣

���ˣ�����һ��������ȫ��������ϣ���������������������õ�Ԥ�ڽ��������������� `pull` �� `push`�������ɿ�ʼ�����������

### step 4 ��չ Git ���ܽ���

git ��һ��ʮ��ǿ��Ĵ�������ߣ�����ֻ������ git ��������÷���Ŀ����ȷ��ͬѧ���ܹ����м򵥵���ҵ�ύ��Ȼ������ʵ�����������У��ܶೡ����Ҫ�õ� git ���������ܣ��ڴ�������һ�������ļ򵥽��ܣ�ͬѧ���ڴ˺��ѧϰ������������Ƶĳ��������Բ����ĵ������͵ȣ����� git ��һǿ��Ĺ��ߣ�������Ч�Ľ�����⡣

#### 1\. �鿴��ʷ��¼ (Log)

**����**: ������Ҫ׷�ٴ���ı仯��ʷ���ҳ��ض����ܻ���������㣬�������˽�˭�ں�ʱ����ʲô�޸�ʱ��

```bash
git log
```

#### 2\. �Ƚϲ��� (Diff)

**����**: ���ύǰ��鼴���ύ�ĸ��ģ��������κ������ύ֮��Ƚϴ�����졣

```bash
git diff HEAD^ HEAD # �Ƚϵ�ǰ�ύ��ǰһ���ύ�Ĳ���
git diff master..feature-branch # �Ƚ�����֧�빦�ܷ�֧֮��Ĳ���
```

#### 3\. ���˸��� (Reset)

**����**: �����������ύ�˲�ϣ���ύ�ĸ��ģ�������Ҫ�ع���ĳ����ʷ�汾��

```bash
git reset --hard HEAD^ # ���˵�ǰһ���ύ
git reset --hard <commit-hash> # ���˵�ָ�����ύ
```

#### 4\. �ļ��ָ� (Checkout)

**����**: ������Ҫ�ָ������ļ���ĳ����ʷ״̬�������л�����ͬ�ķ�֧��

```bash
git checkout <commit-hash>^ -- path/to/file # �ָ��ļ����ض��ύ��״̬
git checkout master # �л�������֧
```

#### 5\. ��֧���� (Branch)

**����**: �����¹��ܻ��޸�bugʱ���������ķ�֧������Ӱ������֧���ȶ��ԡ�

```bash
git branch feature-branch # �����·�֧
git checkout feature-branch # �л����·�֧
git branch -d feature-branch # ɾ����֧
```

#### 6\. �ϲ���֧ (Merge)

**����**: ����������ڹ��ܷ�֧�ϵĹ�����׼������ϲ�������֧��������֧��

```bash
git merge feature-branch # �� feature-branch �ϲ�����ǰ��֧
```

## �ο�����

1.  [Git ʹ���ĵ� & ������������](https://juejin.cn/post/6844904191203213326)
2.  [Git ��ѩ��̳�](https://www.liaoxuefeng.com/wiki/896043488029600)�ĵ��п����ҵ�������ݡ�

## ����

���ϲ��ֽ�Ϊ��ϰ����������ҵ�ɼ���

## ����������ڸ��� Java ������ɴ�����޸�

### Part 1. Java ����֪ʶ����

> ���½̵̳Ĳ�������ʾȫ������ **IntelliJ IDEA**

#### һ���� C �� Java

�ڱ�����ҵ������ϣ��ͬѧ����ͨ��ʵ��һϵ�л������࣬������Ϥ�ࡢ���Ժͷ�����ʹ�ã���������̱��˼���������������˼�롣

##### Java ��̵�ģʽ

![65eb755831969042788c48f5c37028b](./image/65eb755831969042788c48f5c37028b.png)

����������֮ǰ�߼����Գ�����ơ����ݽṹ�γ���ʹ�õĻ��ڹ��̵ĳ�����Ʒ�������ʹ��һ���ļ�( XXX.c )�������д��룬 ������������ǽ�����ֽ�Ϊһ�����Ķ�����ÿ�� **��( .java �ļ�)** ���Լ������飬�������ݺͲ������ݵĺ�����װ��һ���ڳ��������ִ�й����У�����Ϣ���ݵģ���ͨ����֮�����Ϣ������ʵ�ֳ����ִ�С�

##### �������

�ڸոյı��ģʽ��ͼ�Ľ��������ǳ����� `MainClass` �� `����` �ĸ����ô MainClass ��������ʲô�����أ�

```java
public class MainClass {
    public static void main(String[] argv) {
       /* ���� */
       /*coding context*/
       /* ���� */
    }
}
```

Java �еķ��� `public static void main(String[] argv)`�����൱�� C ���Ե���ں��� `main()` ����� `main` ���� Java �������ִ����ڣ������� Java ����ʱ����������ɽ���Ӵ˴���ʼִ�С�Ϊ�˷������⣬�� OO �γ��У�**���㱣֤ `public static void main(String[] argv)` ����������ֻ������һ���ࣨͨ��Ϊ `MainClass`����**��

> ʵ��Ӧ���У������ж�����а��� `main` ���������ǿ����ֶ�ָ��һ�����е� `main` ������Ϊ������ڡ�

##### hw1 �漰���﷨֪ʶ

1.  ���
    
    ��������Ļ��� `Hello World!`��
    
    ```java
    String str = "Hello";
    System.out.println(str + " World!"); 
    // ������: 
    // Hello World!
    ```
    
    ����������п��Է��֣������õ��� System ���һ��������System ��λ�� Java.lang ��������ǰ Java ���������ƽ̨��ϵͳ���ĺܶ����ԺͿ��Ʒ����������ڸ�����ڲ���Ŀǰͬѧ�ǿ��԰������Ϊ Java Ϊ�����ṩ��һϵ�С��⺯������System ����һ����������࣬�����޷���������Ķ��󣬼��޷�ʵ�������ࡣ�� System ���ṩ��һϵ�� **��̬����������෽��**�����ǿ���ֱ��ͨ�� System ����������Щ��������෽����
    
2.  ����
    
    ���Ǵӱ�׼�����������`a`��������`b`���ַ���`c` �� `d`��
    
    ```java
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt(); // �ӱ�׼�������һ�� int �͵���
    double b = scanner.nextDouble(); // �ӱ�׼�������һ�� double �͵���
    String c = scanner.next(); // next �����Կհ׷���Ϊ�ָ��ӱ�׼��������ַ���
    String d = scanner.nextLine(); // nextLine �����Ի��з���Ϊ�ָ��ӱ�׼��������ַ���
    // ���� c �� d �Ķ��뷽ʽ�����ֱ����� hello world
    // c = "hello"
    // d = "hello world"
    ```
    
    ����������п��Է��֣������õ��� `Scanner` �࣬������������ʵ������`Scanner` ���� Java ��һ�������࣬���ṩ��һ�ּ��ķ����ӱ�׼���루System.in�������ļ���FileInputStream���ж�ȡ�������ͺ��ַ����Ĺ��ܡ�
    
    Scanner ����Զ�ȡ`int`��`long`��`float`��`double`��`String`�����͡���������ʹ��������ʽ��ȡ����ģʽ���ı���
    
    Scanner ���ṩ��һϵ�еķ�������ȡ��ͬ���͵����ݡ������������ǽ��ܵļ��ֶ�ȡ������Scanner �໹�ṩ�� `hasNext()` �� `hasNextLine()` �ȷ��������ڼ���Ƿ��и�������ݿ��Զ�ȡ��
    
    �ⲿ�����ݶ�ͬѧ����˵������Щ������⣬�����ݺ��ٿ����ڽӴ�һ��������ʱ���������������Ĺ������÷����㹻�ˡ�
    
    ���⣬�����⼸���÷���Scanner ����һ���� `nextLine()` �ķ���������ܻ�����ε���ҵ���õ������ǵ�������Բο��������ӣ�[Java Scanner �� | ����̳� (runoob.com)](https://www.runoob.com/java/java-scanner-class.html)
    
    ֵ��ע����ǣ��ڽ���ѧϰ�У�ͬѧ�ǻ��������ܶ��޷�������׼ȷʶ���ܵķ�������ʱ�����Ҫ��Ҳ������ϻ��߷��������ʵ�֣�������Ϊ��ʶ��������µ� bug
    
3.  `if-else`, `switch-case`,`for`,`while` �ȹؼ��ֵ��÷��� C ����ͬ�ġ�
    

##### ������

1.  ��д����ʱ�Ĵ���:
    
    ![�﷨����](./image/image-4.png)
    
    �������Ͻǳ��ֺ�ɫ��̾��֤����д���������޷�ͨ�����룬�ɵ�����ϽǺ�ɫ��̾�Ź۲��Ӧ������Ϣ�������޸ġ�
    
2.  ����ִ��ʱ�Ĵ���
    
    ![����ʱ����](./image/image-5.png)
    
    �������Ѿ�ͨ�����룬��ִ��ʱ���ִ��󣬿��Ե����Ӧ�����ֵ���ɫ����������ת������λ�ã�idea���и���������ʾ���ܵĴ���ԭ�򣬷���ͬѧ�޸Ĵ��롣
    
3.  �����������
    

+   **���� Expected**

```java
System.out.println("ȱ�ٷֺ�") // !
System.out.println("ȱһ������"; // !
```

+   **Unclosed String Literal** ������������ֵ�ԭ������������ַ���ȱ���� **��**

```java
System.out.println("ȱ��һ������); // !
```

+   **Cannot Find Symbol** ������������ֵ�ԭ����Ҫ��ʹ����δ����ı��������磺��ʶ������ʱ��ƴд�����������ʹ��ʱ��ƴд��һ�£�������δ��������δ��ͬһ�������������ñ�����û�е�����

```java
int defined = 3;
int result = define - i; // !
```

```java
int sum = 0;
for (int i = 0 ; i < 3; i++) {
    sum += i*i;
}
i++; // !
```

+   **Missing Return Statement** �������׳�������Ŀ������У�������䱻�����ʡ���ˣ��÷���û�з����κ�ֵ�������ڷ���������δ��������Ϊvoid

```java
public int add(int a, int b) {
    int sum = a + b;
}    
```

```java
public int add(int a) {
    int b = -1;
    if (b > 0) {
        return a + b;
    }
}    
```

+   **Non-Static Method �� Cannot Be Referenced From a Static Context** ���������׳���������ʱ����ζ�Ŵ������ **�Ӿ�̬�����������÷Ǿ�̬����**

```java
public class StaticTest {  
    private int count=0;  
    public static void main(String args[]) throws IOException {  
        count++; // !
    }  
} 
```

+   **Non-Static Method �� Cannot Be Referenced From a Static Context** ���������׳���������ʱ����ζ�Ŵ��� **�����ھ�̬���е��÷Ǿ�̬����**

```java
class Sample {  
   private int age;  
   public int getAge()  
   {  
      return age;  
   }  
   public static void main(String args[])  
   {  
       System.out.println("Age is:"+ getAge());  
   }  
}  
```

+   **Constructor in class cannot be applied to given types** ���������׳����������ʱ�򣬴����п��ܳ����˹��캯���д���ķ������ͣ�����������ʱ������͹��캯���Ĳ�����ƥ�䡣

```java
public class Constructor1 {
    private int a;
    public void Constructor1(int a) {
        this.a = a;
    }
}

public class Constructor2 {
    private int a;
    public Constructor2() {
        this.a = 100;
    }    
}   

public class Test {
    public static void main(String args[]) {
        Constructor1 c1 = new Constructor1(3); 
        Constructor2 c2 = new Constructor2(3); // !
    }
}    
```

+   **Cannot access private property** ���������׳����������ʱ��˵�������г�����һ�����е�˽������/˽�з������ⲿ����ʵ����

```java
public class Private {
    private int a;
    public Private() {
        a = 1024;
    }    
    private void modify() {
        a = a / 2;
    }    
}     

public class Other {
    public void test() {
        Private p = new Private();
        P.a = 3; // !
    }
    public static void main(String args[]) {
        Private p = new Private();
        p.modify(); // !
    }       
}        
```

#### ��������һ����

����������������һ�£������ᵽ�˺ܶ�ε� **"��"** ����ȷ������˵����������Ҫ���һ��**�����̵�**�������̵���һ���й�����ô���Ǿ��½�һ�� `Dog` �ࣺ

![�����µ���](./image/image-2.png)

���ǻ���C���ԵĽṹ�壬���С����һ���ṹ�塭��

```c
struct Dog {
    char name[30];
    char type[30];
    int age;
    double price;
    int isBought; //0 for on sale, 1 for saled
};
```

�� Java �У�С���ǡ���

```java
//Dog ��
public class Dog {
    //����
    private String name;
    private String type;
    private int age;
    private double price;
    private boolean isBought;

    //����
    public double getPrice() {
        return price;
    }

    public void setBought(boolean bought) {
        this.isBought = bought;
    }

    public void addAge() {
        this.age++;
    }
}
```

##### ����

�Ա� C - Java �����Ƿ��֣����������䡢�۸���Щ������Ϊ�ṹ���**�ṹ����**�����ݣ����Ϊ���е�**����**��

�������Ծ���˽�С�**private** �ģ��ⲿ��ȫ���������ǡ���������������Ϊ������˵��������һ���µ�**Person**�࣬������������Ҫֱ�� **�޸�** �� **����** С���ļ۸��ǲ����Եġ�������ͨ������ Dog ��� `getPrice()` �������ܿ���С���ļ۸�ͬʱ����С���� `setBought()` �������޸�С���Ƿ��Ѿ��������������

������󿪷�ǿ����װ��˽�б���������һ�㲻��������Զ���� public �ġ�������󷽷��Ļ����ص���˽�л������ڲ����ݣ���¶�����ݵı�Ҫ�����ӿڣ��������ṩ `setter-getter` ������������Ҫע�⣬�������ȫ�������Զ������������׵� get+set ����ô����Ա�������ó� private ������Ͳ����ˡ�

> ������ʾ�������а� **alt+insert** �����ɵ������´��ڣ�Mac ����ϵͳ��Ϊ **Command+N**���ṩ����ݵ���ӹ��췽����`setter-getter` �����ȡ�
> 
> ![��������](./image/image-3.png)

##### ����

�Ա� C - Java ,���Ƿ��� Java ���������� C �ĺ�������һ����������ض����ܵĴ���Ƭ�Ρ� �;�Ϊ **private** ���������Բ�ͬ���������ڷ�����Ҫ��¶���������Եı�Ҫ�����ӿڣ������Ҫ�����η�Ӧ�趨�� **public** �������С�������������������������Ա�һ����ʱ������ã��Ӷ�ʵ�ָ�С���������������Ĳ�����

#### ����ʵ����

�������ǵĳ����̵�����dog��"ģ��"������ʵ�ϣ������̵�Ӧ���е���������С��������С���ĸ����ˣ����ǻ���Ҫ�ڳ����̵��д���һ���������ڵ�С������Ȼ��Ϊ�˸��õı������С���йص����������Ҫͨ��һ�������ơ���ָ����ֻС����������ƣ���java�У����� **����**��

�Ա� C ���Ժ� Java ����

```c
void initial(struct Dog* dog, char name[30], char type[30], int age, double price) {
    strcpy(dog->name, name);
    strcpy(dog->type, type);
    dog->age = age;
    dog->price = price;
    dog->isBought = 0;
}

int main() {
    struct Dog dog; 
    // ��ʼ��
    initial(&dog, "puppy", "Bernese Montain", 1, 18000);
    // ����
    struct Person person = {"С��"};
    buy(&dog, &person);
}
```

```java
//��Dog ��
public class Dog {
    //��Ա������
    public Dog(String name, String type, int age, double price) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.price = price;
        this.isBought = false;
    }
    //������
}

//��MainClass ��
public class MainClass {
    public static void main(String[] args) {
        Dog dog;
        dog = new Dog("puppy","Bernese Mountain", 1, 18000);
        Person person = new Person("С��");
        person.buy(dog);
    }
}
```

���Ƿ��ֶ��� Java ���ԣ�**Dog** ���� `int`��`char` �����͵ı������͡� �������ǾͿ���ʹ��������䣺`Dog dog;` ������һ�� `Dog` �͵ı���`dog`�ˡ�

�Ա� C-Java ��Java ���������͵�**����**������ C �����е�һ���ṹ��**ָ��**��������������**��ʼ��**��ִ���κ�**��ֵ**�Ȳ�������ô��������ͻ�ָ��һ�� `null` ������������һ��������/��ָ�룬��ʱ��û���κ��ڴ�ռ䱻�������ڴ洢�������Ϣ��

> ��Java�У��������ͷ�Ϊ�����������ͺ��������ͣ�
> 
> +   **������������**�Ǵ洢������ֵ�ı������� `boolean`��`int`��`double`��`char`��
> +   **��������**��ָ��������ã����ǿ���ָ�����⸴�ӵ����ݽṹ�������顢��ͽӿڡ�
> 
> �����������͵ı���������ʱ��ֱ�ӱ�����Ĭ�ϳ�ʼֵ��������ָ�� `null`��

��**����**�����У�������ǲ�ʹ��**���캯��** new ����һ���µ�С������ô��ʱ��� dog Ҳ��һ�� null ���� �� `initial()` �����������Ƶ� `public Dog()` ��Ϊ���캯����������;��������Ҫ����һ�������ʱ�����һЩ��ʼ��������������������Ը����ʼֵ��

�����Ƽ�������������������ж���ʽд������ `public ���� (�����б�){}` �Ĺ��캯����

### Part 2. ��������

#### ��ҵҪ��

�γ����ڱ�����ҵ��Ӧ�� git �ֿ����ṩ��һ�� **�д���** �Ĵ��룬����Ҫ�Դ�������޸ģ�ʹ�����ܹ���ȷ���������ĳ����߼�����ɴ�����޸ĺ�����Ҫ�������ύ�� hw1 �����ⴰ�ڣ�����ͨ�����в��Ե�

#### ��������

��ӭ�������������԰������һλ���ﰮ���ߣ���ʼ����ֵΪ 0����ӵ��һֻ�ɰ�������������ӵ�� **���֡������ȡ����ֶȺͽ�����** ����������Ϣ������������չ˺�����ȷ��������̫����̫�����Ļ���̫������������Ը���ιʳ��ͬ��ʳ�����������ļ����ȣ�Ҳ����������ˣ��������Ŀ��ֶȡ�����ҪС�ģ�����ιʳ���ܻή�ͳ���Ľ����ȣ�

����ģ�������������Լ����

1.  ������ʳ�� biscuit �� fruit �ɹ�ιʳ��ÿ��ιʳ��**��Ҿ���ֵ���� 5 ��**
    +   biscuit��ιʳ biscuit �󣬳���� **�����Ƚ��� 10 ��**
    +   fruit��ιʳ fruit �󣬳���� **�����Ƚ��� 8 ��**
    +   ����ģ������ﱻιʳ���� **3** �� biscuit ��ÿ��ιʳ biscuit���ӵ� 4 �ο�ʼ���󣬼����Ƚ��� 10 ���ͬʱ��**�����Ƚ��� 5 ��**
2.  ��������һ����ˣ��**����Ŀ��ֶ����� 5 ��**��**��Ҿ���ֵ���� 7 ��**
3.  ����ļ����Ⱥͽ����Ȳ��õ��� 0�����ֶȲ��ø��� 100�����ĳ�β���ʹ�ó���ļ����Ȼ򽡿���С�� 0�������ļ����Ȼ򽡿�����Ϊ 0�����ĳ�β���ʹ�ó���Ŀ��ֶȳ��� 100�������Ŀ��ֶ���Ϊ 100��

#### ����Ҫ��

��Ϸ��ʼʱ������յ�һ�������������ֺ����ĳ�ʼ�����ȡ����ֶȺͽ����ȡ�

�� $1$ ��һ���ַ�������ʾ�����������֣��� $2,3,4$ ��һ��һ���Ǹ����������α�ʾ�������ĳ�ʼ�����ȡ����ֶȺͽ����ȡ�

�ӵ� $5$ �п�ʼ���㽫�ӱ�׼�����ȡһϵ��ָ�ֱ����������ָ��Ϊֹ��ÿ��ָ����������¼���֮һ��

+   `feed <food_name>`: ������ιʳĳ��ʳ�food\_name ֻ����Ϊ `biscuit` �� `fruit` ����֮һ����
+   `play`: �ͳ���һ����ˣ��
+   `status`: �鿴����ĵ�ǰ״̬��
+   `quit`: ������Ϸ��

���ݱ�ָ֤���������� $200$ ����

#### ���Ҫ��

����ÿ�� `status` ָ�����Ҫ�������ĵ�ǰ״̬����ʽΪ��

```
<pet_name>:
Hunger: <hunger>
Happiness: <happiness>
Health: <health>
```

����`<pet_name>`�ǳ�������֣�`<hunger>`��`<happiness>`��`<health>`�ֱ��ǳ���ļ����ȡ����ֶȺͽ����ȡ�

����Ϸ������������`quit`ָ�������Ҫ�������״̬��һ�������Ϣ��

```
<pet_name>:
Final Hunger: <hunger>
Final Happiness: <happiness>
Final Health: <health>

Final Player Exp: <exp>

Thank you for playing!
```

**ע�⣬��������������������Ĵ���������ȷ��ɵģ�ͬѧ�ǲ��޸� `System.out` ��ص����ݼ��ɡ�**

#### ����

##### �������� 1

```text
dog
10
10
10
feed fruit
play
status
feed biscuit
quit
```

##### ������� 1

```text
dog:
Hunger: 2
Happiness: 15
Health: 10

dog:
Hunger: 0
Happiness: 15
Health: 10

Final Player Exp: 17

Thank you for playing!
```

##### �������� 2

```text
dog
100
100
100
feed biscuit
feed biscuit
feed biscuit
feed biscuit
feed biscuit
quit
```

##### ������� 2

```text
dog:
Hunger: 50
Happiness: 100
Health: 90

Final Player Exp: 25

Thank you for playing!
```