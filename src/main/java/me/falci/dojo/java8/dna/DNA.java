package me.falci.dojo.java8.dna;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DNA {

	private final List<Character> validChars = Arrays.asList('A', 'C', 'G', 'T');		
	private final String sequence;
	private final Map<Character, Integer> dna = new HashMap<Character, Integer>();

	public DNA(String sequence) {
		this.sequence = sequence;
		
		validChars.forEach(item -> {
			dna.put(item, this.count(item));
		});
	}

	public int count(Character c) {
		if (!validChars.contains(c)) {
			throw new IllegalArgumentException();
		}
		
		return (int) sequence.chars()
			.filter(letra -> letra == c)
			.count();
	}

	public Map<Character, Integer> nucleotideCounts() {
		return dna;
	}

}
