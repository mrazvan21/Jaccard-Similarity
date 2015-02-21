package com.razvan.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author Razvan Moldovan - razvanmoldovan.com
 *
 * @param <T>
 */
public class JaccardCoefficient <T> {

	/**
	 * Find the Jaccard Similarity of two sets
	 * 
	 * @param setA the first set to compare
	 * @param setB the second set to compare
	 * @return the Jaccard Similarity (intersect(setA, setB) / union(setA, setB))
	 */
	public Double calculate(List<T> setA, List<T> setB) {
		return (double) (intersect(setA, setB).size()) / 
				(double) (union(setA, setB).size());
	}
	
	/**
	 * 
	 * @param setA
	 * @param setB
	 * @return
	 */
	private List<T> intersect(List<T> setA, List<T> setB) {
		List<T> list = new ArrayList<T>();

		for (T t : setA) {
		    if(setB.contains(t)) {
		        list.add(t);
		    }
		}

		return list;
	}
	
	/**
	 * 
	 * @param setA
	 * @param setB
	 * @return
	 */
	private List<T> union(List<T> setA, List<T> setB) {
		Set<T> set = new HashSet<T>();

		set.addAll(setA);
		set.addAll(setB);

		return new ArrayList<T>(set);
	}
}

