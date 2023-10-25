
class Bird extends Animal {

    Bird() { 
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


