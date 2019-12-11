package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Data{
	String name;
	int price;
	public Data(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}
public class CollectorsExample {
	public static void main(String[] args) {
		List<Data> list = new ArrayList<Data>();
		list.add(new Data("apple",100));
		list.add(new Data("pineapple",400));
		list.add(new Data("kiwi",300));
		list.add(new Data("guava",200));
		
		//Fetching data as list
		List<Integer> priceList = list.stream().map(x->x.price).collect(Collectors.toList());
		System.out.println(priceList.toString());
		
		//Fetching data as set
		Set<Integer> priceSet = list.stream().map(x->x.price).collect(Collectors.toSet());
		System.out.println(priceSet.toString());
		
		int sum = list.stream().collect(Collectors.summingInt(x->x.price));
		System.out.println(sum);		
	}
}
