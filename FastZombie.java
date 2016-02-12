public class FastZombie extends Zombie{

    public FastZombie(String name) {
        super(name);
    }
    
    public void run() {
        System.out.println(name + " will get you soon");
    }

//    public void bite (Zombie z){
//        System.out.println("hi");
//    }
    public void bite (FastZombie f) {
        super.bite((Zombie) f);
        System.out.println("#FasterThan" +f.name);
    }
}
