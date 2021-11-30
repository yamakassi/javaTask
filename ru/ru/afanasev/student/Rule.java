package ru.afanasev.student;
public enum Rule implements Verifiable{

    RuleOne {
        @Override
        public boolean check(int x) {
            if (x == 10 || x == 5) return true;
            return false;
        }
    },
    RuleTwo {
        @Override
        public boolean check(int x) {
            if (x > 2 || x <= 5) return true;
            return false;

        }
    },
    RuleTree {
        @Override
        public boolean check(int x) {
            if (x > -1 || x <= 42) return true;
            return false;

        }
    };



}