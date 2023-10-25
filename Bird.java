
class Bird extends Animal {

    Bird() { 
        System.out.println("hi i'm a bird");
    }

    String makeNoise() {
        return "chirp";
    }
    
    String move(int distance) {
        return super.move(distance);
    }

}


