package wh.daywork.aug.aug07;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.BorderLayout;



public class MyFrame extends JFrame implements ActionListener {
    TreeSet<Student> t;
    JTextField text1;
    JTextField text2;
    JButton button;
    JTextArea area;

    MyFrame(){
        init();
        setVisible(true);
        setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
    }
    void init(){
        t=new TreeSet<Student>();
        JLabel label=new JLabel("姓名");
        text1=new JTextField(10);
        JLabel label2=new JLabel("成绩");
        text2=new JTextField(10);

        button=new JButton("确定");
        area=new JTextArea(20,30);

        JPanel panel=new JPanel();
        panel.add(label);
        panel.add(text1);
        panel.add(label2);
        panel.add(text2);
        panel.add(button);

        add(panel,BorderLayout.NORTH);
        add(area,BorderLayout.CENTER);
        text1.addActionListener(this);
        text2.addActionListener(this);
        button.addActionListener(this);
    }
    @Override
    public  void actionPerformed(ActionEvent e){
        String name=text1.getText();
        int score=0;
        try{
            score=Integer.parseInt(text2.getText());
            if (name.length()>0){
                Student student=new Student(name,score);
                t.add(student);
                show(t);
            }
        }catch (NumberFormatException exp){
            text2.setText("请输入正确的字符");

        }
    }
    public void show(TreeSet<Student> tr){
        area.setText(null);
        Iterator<Student> it=tr.iterator();
        while(it.hasNext()){
            Student student=(Student)it.next();
            area.append("姓名："+student.getName()+"   成绩："+student.getScore()+"\n");
        }
    }
}


