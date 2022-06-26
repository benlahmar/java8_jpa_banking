package com.bank.dao;


import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface IDao<T, K> {

	public void add(T t);
	public T findById(K id);
	public List<T> all();
	public void delete(T t);
	public void update(T t, K id);
	public  <E> List<E> findProp();
	
	public List<T> findBycritere(Predicate<T> condition);
	public void action(Consumer<T> consumer, T t);
	
}