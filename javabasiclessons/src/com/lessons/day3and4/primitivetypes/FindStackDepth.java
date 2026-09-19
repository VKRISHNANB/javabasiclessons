package com.lessons.day3and4.primitivetypes;

public class FindStackDepth {
	private static long depth = 0L;

	public static void main(String[] args) {
		try {
			deep();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void deep() throws InterruptedException {
		++depth;
		if ((depth % 500) == 0)
			System.out.println(depth);

		if (depth == 10100) {
			System.out.println(depth);
			Thread.sleep(5000);
		}
		deep();
	}
}
