package sg.edu.nus.iss.yunakti.model;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;


public class YJavaElement {

	public YJavaElement() {
	}
	public YJavaElement(String fullyQualifiedName) {
		this.fullyQualifiedName=fullyQualifiedName;
	}
	
	private String fullyQualifiedName; //will be int, char etc in case of primitives of FQ names in case of objects

	public String getFullyQualifiedName() {
		return fullyQualifiedName;
	}

	public void setFullyQualifiedName(String fullyQualifiedName) {
		this.fullyQualifiedName = fullyQualifiedName;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
