package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<type> {

	List<type> list = new ArrayList<>();

	public void addValue(type value) {
		list.add(value);

	}

	public type first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty!");
		}
		return list.get(0);
	}

	public type last() {
		if (list.size() <= 1) {
			throw new IllegalStateException("There is only one number...");
		}
		return list.get(list.size() - 1);

	}

	public void print() {

		if (!list.isEmpty() || list.size() != 0) {
			System.out.print("[");
			System.out.print(list.get(0));

			for (int i = 1; i < list.size(); i++) {
				System.out.print(", " + list.get(i));
			}

			System.out.println("]");
		}
	}

}
