public class ZombieLauncher{
	public static void main(String[] args){
//		FastZombie witch = new FastZombie("Witch");
//        ((Zombie) witch).bite(witch);
		Object witch = new FastZombie("Witch");
		Zombie zoey = (FastZombie) witch;
		zoey.bite((FastZombie) zoey);


	}
	
}