package ru.afanasev.armory;

class AutomaticGun extends Gun{
    private final int lenQueue;

    public AutomaticGun() {
        this(30,30);
    }
    public AutomaticGun(int maxAmmo) {
        this(maxAmmo/2,maxAmmo);
    }

    public AutomaticGun(int lenQueue,  int maxAmmo) {
        super(maxAmmo, maxAmmo);
        if(lenQueue<=0) throw new IllegalArgumentException("Скорострельность не может быть меньше 1");
        this.lenQueue = lenQueue;
    }


    public void shootNseconds(int n) {
        for(int i=0;i<lenQueue*n ;i++){
            super.shoot();

        }
    }
}


