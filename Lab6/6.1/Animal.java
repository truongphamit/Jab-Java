public abstract class Animal {
	public String kind ; // Cow , p i g , c a t , e t c .
	public Animal() { }
	public String toString() {
		return " I am a " + kind + " and I go " + speak();
	}
	public abstract String speak() ; // A b s t r a c t m e t h o d
}
