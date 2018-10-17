package com.dataflowdeveloper.operations;

import java.io.Serializable;

/**
 * 
 * @author tspann
 *
 */
public class Yolo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2460656834916783475L;
	/**
	 * fields
	 */
	
	private String imgname;
	private String imgnamep;
	private String class1;
	private String pct1;
	private String host;
	private String shape;
	private String end;
	private String te;
	private String battery;
	private String systemtime;
	private String cpu;
	private String diskuage;
	private String memory;
	private String id;
	public String getImgname() {
		return imgname;
	}
	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	public String getImgnamep() {
		return imgnamep;
	}
	public void setImgnamep(String imgnamep) {
		this.imgnamep = imgnamep;
	}
	public String getClass1() {
		return class1;
	}
	public void setClass1(String class1) {
		this.class1 = class1;
	}
	public String getPct1() {
		return pct1;
	}
	public void setPct1(String pct1) {
		this.pct1 = pct1;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getTe() {
		return te;
	}
	public void setTe(String te) {
		this.te = te;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getSystemtime() {
		return systemtime;
	}
	public void setSystemtime(String systemtime) {
		this.systemtime = systemtime;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getDiskuage() {
		return diskuage;
	}
	public void setDiskuage(String diskuage) {
		this.diskuage = diskuage;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Yolo [imgname=");
		builder.append(imgname);
		builder.append(", imgnamep=");
		builder.append(imgnamep);
		builder.append(", class1=");
		builder.append(class1);
		builder.append(", pct1=");
		builder.append(pct1);
		builder.append(", host=");
		builder.append(host);
		builder.append(", shape=");
		builder.append(shape);
		builder.append(", end=");
		builder.append(end);
		builder.append(", te=");
		builder.append(te);
		builder.append(", battery=");
		builder.append(battery);
		builder.append(", systemtime=");
		builder.append(systemtime);
		builder.append(", cpu=");
		builder.append(cpu);
		builder.append(", diskuage=");
		builder.append(diskuage);
		builder.append(", memory=");
		builder.append(memory);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((battery == null) ? 0 : battery.hashCode());
		result = prime * result + ((class1 == null) ? 0 : class1.hashCode());
		result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
		result = prime * result + ((diskuage == null) ? 0 : diskuage.hashCode());
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + ((host == null) ? 0 : host.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imgname == null) ? 0 : imgname.hashCode());
		result = prime * result + ((imgnamep == null) ? 0 : imgnamep.hashCode());
		result = prime * result + ((memory == null) ? 0 : memory.hashCode());
		result = prime * result + ((pct1 == null) ? 0 : pct1.hashCode());
		result = prime * result + ((shape == null) ? 0 : shape.hashCode());
		result = prime * result + ((systemtime == null) ? 0 : systemtime.hashCode());
		result = prime * result + ((te == null) ? 0 : te.hashCode());
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
		Yolo other = (Yolo) obj;
		if (battery == null) {
			if (other.battery != null)
				return false;
		} else if (!battery.equals(other.battery))
			return false;
		if (class1 == null) {
			if (other.class1 != null)
				return false;
		} else if (!class1.equals(other.class1))
			return false;
		if (cpu == null) {
			if (other.cpu != null)
				return false;
		} else if (!cpu.equals(other.cpu))
			return false;
		if (diskuage == null) {
			if (other.diskuage != null)
				return false;
		} else if (!diskuage.equals(other.diskuage))
			return false;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (host == null) {
			if (other.host != null)
				return false;
		} else if (!host.equals(other.host))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imgname == null) {
			if (other.imgname != null)
				return false;
		} else if (!imgname.equals(other.imgname))
			return false;
		if (imgnamep == null) {
			if (other.imgnamep != null)
				return false;
		} else if (!imgnamep.equals(other.imgnamep))
			return false;
		if (memory == null) {
			if (other.memory != null)
				return false;
		} else if (!memory.equals(other.memory))
			return false;
		if (pct1 == null) {
			if (other.pct1 != null)
				return false;
		} else if (!pct1.equals(other.pct1))
			return false;
		if (shape == null) {
			if (other.shape != null)
				return false;
		} else if (!shape.equals(other.shape))
			return false;
		if (systemtime == null) {
			if (other.systemtime != null)
				return false;
		} else if (!systemtime.equals(other.systemtime))
			return false;
		if (te == null) {
			if (other.te != null)
				return false;
		} else if (!te.equals(other.te))
			return false;
		return true;
	}
	public Yolo(String imgname, String imgnamep, String class1, String pct1, String host, String shape, String end,
			String te, String battery, String systemtime, String cpu, String diskuage, String memory, String id) {
		super();
		this.imgname = imgname;
		this.imgnamep = imgnamep;
		this.class1 = class1;
		this.pct1 = pct1;
		this.host = host;
		this.shape = shape;
		this.end = end;
		this.te = te;
		this.battery = battery;
		this.systemtime = systemtime;
		this.cpu = cpu;
		this.diskuage = diskuage;
		this.memory = memory;
		this.id = id;
	}
	public Yolo() {
		super();
	}
	
	
	
	

	
}
