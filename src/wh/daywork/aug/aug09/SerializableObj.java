package wh.daywork.aug.aug09;

import java.io.*;

class Student implements java.io.Serializable {
	String name;
	int age;
	String sex;

	public Student(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + '}';
	}
}

public class SerializableObj {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("E:/myDoc/stu.txt"));
			Student student = new Student("阿娜", 30, "女");
			oos.writeObject(student);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {

				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class SerializableObj2 {
	public static void main(String[] args) throws ClassNotFoundException,IOException{
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("E:/myDoc/stu.txt"));
            Student student = (Student) ois.readObject();
            System.out.println("姓名为："+student.getName());
            System.out.println("年龄为："+student.getAge());
            System.out.println("性别为："+student.getSex());

        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}
}