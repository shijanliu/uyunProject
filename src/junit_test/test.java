package junit_test;

import org.springframework.beans.factory.annotation.Autowired;

public class test {

        //姓名
        private String name;
        //年龄
        private  int  age;

        public int getAge() {
            return age;
        }
        @Autowired(required = false)
        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }
        @Autowired
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 自我介绍
         */
        public void intrduce(){
            System.out.println("您好，我叫"+this.name+"今年"+this.age+"岁！");
        }




}
