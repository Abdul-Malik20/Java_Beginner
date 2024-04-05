package org.phone;

public class InternelStorage {
	private void processorName() {
		System.out.println("Processor Name : macOS");
	}

	private void ramSize() {
		System.out.println("RAM Size : Apple NO RAM");
	}

	public static void main(String[] args) {
		InternelStorage i = new InternelStorage();
		ExternalStorage e = new ExternalStorage();
		System.out.println("Internel Storage Details : ");
		i.processorName();
		i.ramSize();
		System.out.println("-----------------------------");
		System.out.println("Externel Storage Details : ");
		e.size();

	}
}
