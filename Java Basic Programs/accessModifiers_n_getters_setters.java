package com.company;

    class MyEmployee{
        private int id;
        private String name;

        public String getName(){
            return name;
        }
        public void setName(String n){
            this.name = n;
        }
        public void setId(int i){
            this.id = i;
        }
        public int getId(){
            return id;
        }
    }
    public class accessModifiers_n_getters_setters {
        public static void main(String[] args) {
            MyEmployee saurabh = new MyEmployee();
            // saurabh.id = 64;
            // saurabh.name = "Saurabh Kumar Suman"; --> Throws an error due to private access modifier
            saurabh.setName("Saurabh Kumar Suman");
            System.out.println(saurabh.getName());
            saurabh.setId(64);
            System.out.println(saurabh.getId());
        }
    }

