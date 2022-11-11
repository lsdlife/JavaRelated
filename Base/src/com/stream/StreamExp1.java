package com.stream;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 需求：某个公司的开发部门，分为开发一部和二部，现在需要进行年中数据结算。
 * 分析：
 * ：员工信息至少包含了(名称、性别、工资、奖金、处罚记录)
 * ：开发一部有4个员工、开发二部有5名员工
 * ：分别筛选出2个部门的最高工资的员工信息，封装成优秀员工对象Topperformer
 * ：分别统计出2个部门的平均月收入，要求去掉最高和最低工资。
 * ：统计2个开发部门整体的平均工资，去掉最低和最高工资的平均值。
 */
public class StreamExp1 {
    public  static int totalMoney;
    public static int allTotalMoney;    //2个部门去掉最高和最低工资的总和

    public static void main(String[] args) {

        List<Employee> program1=new ArrayList<>();
        program1.add(new Employee("小李1","男",12000,4000,null));
        program1.add(new Employee("小李2","女",16000,5000,"打人"));
        program1.add(new Employee("小李3","男",22000,8000,null));
        program1.add(new Employee("小李4","男",20000,6000,null));


        List<Employee> program2=new ArrayList<>();
        program2.add(new Employee("小刘1","女",32000,1000,null));
        program2.add(new Employee("小刘2","男",26000,3000,"骂领导"));
        program2.add(new Employee("小刘3","男",22000,2000,null));
        program2.add(new Employee("小刘4","女",10000,6000,"迟到"));
        program2.add(new Employee("小刘5","男",23000,9000,"睡觉"));


        //1.开发一部最高工资的员工
        //指定大小规则了
//        Employee e=program1.stream().max(( (e1,e2)->
//                Integer.compare(e1.getBonus()+e1.getSalary(),e2.getSalary()+e2.getBonus()))).get();
//        System.out.println(e);


        Topperformer t = program1.stream().max(((e1, e2) ->
                Integer.compare(e1.getBonus() + e1.getSalary(), e2.getSalary() + e2.getBonus())))
                .map(e -> new Topperformer(e.getName(), e.getSalary() + e.getBonus())).get();
        System.out.println(t);




        //2.统计平均工资，去掉最高工资和最低工资
        //升序
        program1.stream().sorted(( e1,  e2)->Integer.compare(e1.getBonus()+e1.getSalary(),e2.getSalary()+e2.getBonus()))
                .skip(1).limit(program1.size()-2).forEach(System.out::println);

        //求总和
        program1.stream().sorted(( e1,  e2)->Integer.compare(e1.getBonus()+e1.getSalary(),e2.getSalary()+e2.getBonus()))
        .skip(1).limit(program1.size()-2).forEach(e -> {
            totalMoney+=(e.getBonus()+e.getSalary());
        });

        System.out.println("开发一部的平均工资"+totalMoney/(program1.size()-2));


        //3.合并两个流，再统计
        Stream<Employee> s1 = program1.stream();
        Stream<Employee> s2 = program2.stream();
        Stream<Employee> s3 = Stream.concat(s1, s2);

        /**
        s3.sorted(( e1,  e2)->Integer.compare(e1.getBonus()+e1.getSalary(),e2.getSalary()+e2.getBonus()))
                .skip(1).limit(program1.size()+program2.size()-2).forEach(System.out::println);
        */


        s3.sorted(( e1,  e2)->Integer.compare(e1.getBonus()+e1.getSalary(),e2.getSalary()+e2.getBonus()))
                .skip(1).limit(program1.size()+program2.size()-2).forEach(e -> {
                    allTotalMoney+=(e.getBonus()+e.getSalary());
                });
        System.out.println("开发部的平均工资为：");
        System.out.println(allTotalMoney/(program1.size()+program2.size()-2));

        //BigDecimal ：精确到小数点后几位
        BigDecimal a=BigDecimal.valueOf(allTotalMoney);
        BigDecimal b=BigDecimal.valueOf(program1.size()+program2.size()-2);
        System.out.println(a.divide(b,2, RoundingMode.HALF_UP));

    }
}
