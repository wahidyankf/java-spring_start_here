package main;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;

public class Main {

    public static void main(String[] args) {
        System.out.println(">>>>>>>>");

        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Parrot p = context.getBean(Parrot.class);

            System.out.println(p.getName());

            String s = context.getBean(String.class);

            System.out.println(s);

            Integer n = context.getBean(Integer.class);

            System.out.println(n);
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}
