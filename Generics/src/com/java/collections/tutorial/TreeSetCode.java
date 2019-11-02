package com.java.collections.tutorial;

import java.util.Comparator;

 public class TreeSetCode implements Comparable<TreeSetCode> {
	public int id;
	public String name;
	public TreeSetCode(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TreeSetCode other = (TreeSetCode) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TreeSetCode [id=" + id + ", name=" + name + "]";
	}
//	@Override
//	public int compare(TreeSetCode o1, TreeSetCode o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	@Override
	public int compareTo(TreeSetCode o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
