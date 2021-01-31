package map;

public class Map {

}

class mapNode<K, V>{
	K key;
	V value;
	mapNode<K, V> next;
	
	public mapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}
}
