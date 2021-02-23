package com.example.java;

import com.example.java.model.Olive;

import java.util.List;

public class OlivePress implements Press{

	public int getOil(List<Olive> olives) {

		int totalOil = 0;
		for (Olive o : olives) {
			totalOil += o.crush();
		}

		return totalOil;

	}

}
