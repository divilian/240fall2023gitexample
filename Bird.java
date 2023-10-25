
class Bird extends Animal {

    Bird() { 
        super();
        System.out.println("hi i'm a bird");
    }

    String makeNoise() {
        return "tweet";
    }
    
    // Birds will "move" by flying.
    String move(int distance) {
        return super.move(distance);
    }

}


