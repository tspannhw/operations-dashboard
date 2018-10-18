package com.dataflowdeveloper.operations;

import java.io.Serializable;

/**
 * CREATE EXTERNAL TABLE IF NOT EXISTS bulletin (objectId ;, 
 * platform ;, project ;, bulletinId BIGINT, bulletinCategory ;,
 *  bulletinGroupId ;, bulletinGroupName ;, bulletinLevel ;, bulletinMessage ;,
 *   bulletinNodeAddress ;, bulletinNodeId ;, bulletinSourceId ;, bulletinSourceName ;,
 *    bulletinSourceType ;, bulletinTimestamp ;) STORED AS ORC
LOCATION '/error'
 * @author tspann
 *
 *table memory
 */
public class Bulletin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8129550130859896441L;
	/**
	 * variables from table
	 */
	private String objectId;
	private String platform;
	private String project ;
	private String bulletinId; 
	private String bulletinCategory ;
	private String bulletinGroupId ; 
	private String bulletinGroupName ;
	private String bulletinLevel ;
	private String bulletinMessage ;
	private String bulletinNodeAddress; 
	private String bulletinNodeId ;
	private String bulletinSourceId ;
	private String bulletinSourceName ;
	private String bulletinSourceType ; 
	private String bulletinTimestamp ;
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getBulletinId() {
		return bulletinId;
	}
	public void setBulletinId(String bulletinId) {
		this.bulletinId = bulletinId;
	}
	public String getBulletinCategory() {
		return bulletinCategory;
	}
	public void setBulletinCategory(String bulletinCategory) {
		this.bulletinCategory = bulletinCategory;
	}
	public String getBulletinGroupId() {
		return bulletinGroupId;
	}
	public void setBulletinGroupId(String bulletinGroupId) {
		this.bulletinGroupId = bulletinGroupId;
	}
	public String getBulletinGroupName() {
		return bulletinGroupName;
	}
	public void setBulletinGroupName(String bulletinGroupName) {
		this.bulletinGroupName = bulletinGroupName;
	}
	public String getBulletinLevel() {
		return bulletinLevel;
	}
	public void setBulletinLevel(String bulletinLevel) {
		this.bulletinLevel = bulletinLevel;
	}
	public String getBulletinMessage() {
		return bulletinMessage;
	}
	public void setBulletinMessage(String bulletinMessage) {
		this.bulletinMessage = bulletinMessage;
	}
	public String getBulletinNodeAddress() {
		return bulletinNodeAddress;
	}
	public void setBulletinNodeAddress(String bulletinNodeAddress) {
		this.bulletinNodeAddress = bulletinNodeAddress;
	}
	public String getBulletinNodeId() {
		return bulletinNodeId;
	}
	public void setBulletinNodeId(String bulletinNodeId) {
		this.bulletinNodeId = bulletinNodeId;
	}
	public String getBulletinSourceId() {
		return bulletinSourceId;
	}
	public void setBulletinSourceId(String bulletinSourceId) {
		this.bulletinSourceId = bulletinSourceId;
	}
	public String getBulletinSourceName() {
		return bulletinSourceName;
	}
	public void setBulletinSourceName(String bulletinSourceName) {
		this.bulletinSourceName = bulletinSourceName;
	}
	public String getBulletinSourceType() {
		return bulletinSourceType;
	}
	public void setBulletinSourceType(String bulletinSourceType) {
		this.bulletinSourceType = bulletinSourceType;
	}
	public String getBulletinTimestamp() {
		return bulletinTimestamp;
	}
	public void setBulletinTimestamp(String bulletinTimestamp) {
		this.bulletinTimestamp = bulletinTimestamp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bulletinCategory == null) ? 0 : bulletinCategory.hashCode());
		result = prime * result + ((bulletinGroupId == null) ? 0 : bulletinGroupId.hashCode());
		result = prime * result + ((bulletinGroupName == null) ? 0 : bulletinGroupName.hashCode());
		result = prime * result + ((bulletinId == null) ? 0 : bulletinId.hashCode());
		result = prime * result + ((bulletinLevel == null) ? 0 : bulletinLevel.hashCode());
		result = prime * result + ((bulletinMessage == null) ? 0 : bulletinMessage.hashCode());
		result = prime * result + ((bulletinNodeAddress == null) ? 0 : bulletinNodeAddress.hashCode());
		result = prime * result + ((bulletinNodeId == null) ? 0 : bulletinNodeId.hashCode());
		result = prime * result + ((bulletinSourceId == null) ? 0 : bulletinSourceId.hashCode());
		result = prime * result + ((bulletinSourceName == null) ? 0 : bulletinSourceName.hashCode());
		result = prime * result + ((bulletinSourceType == null) ? 0 : bulletinSourceType.hashCode());
		result = prime * result + ((bulletinTimestamp == null) ? 0 : bulletinTimestamp.hashCode());
		result = prime * result + ((objectId == null) ? 0 : objectId.hashCode());
		result = prime * result + ((platform == null) ? 0 : platform.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
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
		Bulletin other = (Bulletin) obj;
		if (bulletinCategory == null) {
			if (other.bulletinCategory != null)
				return false;
		} else if (!bulletinCategory.equals(other.bulletinCategory))
			return false;
		if (bulletinGroupId == null) {
			if (other.bulletinGroupId != null)
				return false;
		} else if (!bulletinGroupId.equals(other.bulletinGroupId))
			return false;
		if (bulletinGroupName == null) {
			if (other.bulletinGroupName != null)
				return false;
		} else if (!bulletinGroupName.equals(other.bulletinGroupName))
			return false;
		if (bulletinId == null) {
			if (other.bulletinId != null)
				return false;
		} else if (!bulletinId.equals(other.bulletinId))
			return false;
		if (bulletinLevel == null) {
			if (other.bulletinLevel != null)
				return false;
		} else if (!bulletinLevel.equals(other.bulletinLevel))
			return false;
		if (bulletinMessage == null) {
			if (other.bulletinMessage != null)
				return false;
		} else if (!bulletinMessage.equals(other.bulletinMessage))
			return false;
		if (bulletinNodeAddress == null) {
			if (other.bulletinNodeAddress != null)
				return false;
		} else if (!bulletinNodeAddress.equals(other.bulletinNodeAddress))
			return false;
		if (bulletinNodeId == null) {
			if (other.bulletinNodeId != null)
				return false;
		} else if (!bulletinNodeId.equals(other.bulletinNodeId))
			return false;
		if (bulletinSourceId == null) {
			if (other.bulletinSourceId != null)
				return false;
		} else if (!bulletinSourceId.equals(other.bulletinSourceId))
			return false;
		if (bulletinSourceName == null) {
			if (other.bulletinSourceName != null)
				return false;
		} else if (!bulletinSourceName.equals(other.bulletinSourceName))
			return false;
		if (bulletinSourceType == null) {
			if (other.bulletinSourceType != null)
				return false;
		} else if (!bulletinSourceType.equals(other.bulletinSourceType))
			return false;
		if (bulletinTimestamp == null) {
			if (other.bulletinTimestamp != null)
				return false;
		} else if (!bulletinTimestamp.equals(other.bulletinTimestamp))
			return false;
		if (objectId == null) {
			if (other.objectId != null)
				return false;
		} else if (!objectId.equals(other.objectId))
			return false;
		if (platform == null) {
			if (other.platform != null)
				return false;
		} else if (!platform.equals(other.platform))
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bulletin [objectId=");
		builder.append(objectId);
		builder.append(", platform=");
		builder.append(platform);
		builder.append(", project=");
		builder.append(project);
		builder.append(", bulletinId=");
		builder.append(bulletinId);
		builder.append(", bulletinCategory=");
		builder.append(bulletinCategory);
		builder.append(", bulletinGroupId=");
		builder.append(bulletinGroupId);
		builder.append(", bulletinGroupName=");
		builder.append(bulletinGroupName);
		builder.append(", bulletinLevel=");
		builder.append(bulletinLevel);
		builder.append(", bulletinMessage=");
		builder.append(bulletinMessage);
		builder.append(", bulletinNodeAddress=");
		builder.append(bulletinNodeAddress);
		builder.append(", bulletinNodeId=");
		builder.append(bulletinNodeId);
		builder.append(", bulletinSourceId=");
		builder.append(bulletinSourceId);
		builder.append(", bulletinSourceName=");
		builder.append(bulletinSourceName);
		builder.append(", bulletinSourceType=");
		builder.append(bulletinSourceType);
		builder.append(", bulletinTimestamp=");
		builder.append(bulletinTimestamp);
		builder.append("]");
		return builder.toString();
	}
	public Bulletin(String objectId, String platform, String project, String bulletinId, String bulletinCategory,
			String bulletinGroupId, String bulletinGroupName, String bulletinLevel, String bulletinMessage,
			String bulletinNodeAddress, String bulletinNodeId, String bulletinSourceId, String bulletinSourceName,
			String bulletinSourceType, String bulletinTimestamp) {
		super();
		this.objectId = objectId;
		this.platform = platform;
		this.project = project;
		this.bulletinId = bulletinId;
		this.bulletinCategory = bulletinCategory;
		this.bulletinGroupId = bulletinGroupId;
		this.bulletinGroupName = bulletinGroupName;
		this.bulletinLevel = bulletinLevel;
		this.bulletinMessage = bulletinMessage;
		this.bulletinNodeAddress = bulletinNodeAddress;
		this.bulletinNodeId = bulletinNodeId;
		this.bulletinSourceId = bulletinSourceId;
		this.bulletinSourceName = bulletinSourceName;
		this.bulletinSourceType = bulletinSourceType;
		this.bulletinTimestamp = bulletinTimestamp;
	}
	public Bulletin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
