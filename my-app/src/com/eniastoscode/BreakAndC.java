package com.eniastoscode;

    public class BreakAndC{
        public static void main(String[] args) {
            //Loops
            String[] names = {"Ali", "Anna", "Bob", "Mike"};
            for (String name : names) {
                if (name.startsWith("A")) {
                    continue;
                }
                {
                    System.out.println(name);
                }
            }

            }
        }
