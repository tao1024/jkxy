package com.tao1024.jkxy0610_PassObject;

import android.os.Parcel;
import android.os.Parcelable;
 
public class ObjUserPar implements Parcelable{

	private String name;
	private int age;
	
	public ObjUserPar(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int describeContents() {
		return 0;
	}
	
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(getName());
		dest.writeInt(getAge());
	}
	
	public static final Creator<ObjUserPar> CREATOR = new Creator<ObjUserPar>(){

		@Override
		public ObjUserPar createFromParcel(Parcel source) {
			return new ObjUserPar(source.readString(),source.readInt());
		}

		@Override
		public ObjUserPar[] newArray(int size) {
			return new ObjUserPar[size];
		}
		
	};
	
	
}
