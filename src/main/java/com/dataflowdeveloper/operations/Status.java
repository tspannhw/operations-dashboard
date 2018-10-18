package com.dataflowdeveloper.operations;

import java.io.Serializable;

/**
 * (statusId ; timestampMillis ; `timestamp` ; actorHostname ; componentType ;
 * componentName ; parentId ; platform ; `application` ; componentId ;
 * activeThreadCount ; flowFilesReceived ; flowFilesSent ; bytesReceived ;
 * bytesSent ; queuedCount ; bytesRead ; bytesWritten ; bytesTransferred ;
 * flowFilesTransferred ; inputContentSize ; outputContentSize ;
 * queuedContentSize ; activeRemotePortCount ; inactiveRemotePortCount ;
 * receivedContentSize ; receivedCount ; sentContentSize ; sentCount ;
 * averageLineageDuration ; inputBytes ; inputCount ; outputBytes ; outputCount
 * ; sourceId ; sourceName ; destinationId ; destinationName ; maxQueuedBytes ;
 * maxQueuedCount ; queuedBytes ; backPressureBytesThreshold ;
 * backPressureObjectThreshold ; isBackPressureEnabled ; processorType ;
 * averageLineageDurationMS ; flowFilesRemoved ; invocations ; processingNanos
 * BIGINT)
 * 
 * @author tspann
 *
 * 
 *         table failure
 */
public class Status implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 990643178975347603L;
	
	// values
	private String statusId;
	private String timestampMillis;
	private String timestamp;
	private String actorHostname;
	private String componentType;
	private String componentName;
	private String parentId;
	private String platform;
	private String application;
	private String componentId;
	private String activeThreadCount;
	private String flowFilesReceived;
	private String flowFilesSent;
	private String bytesReceived;
	private String bytesSent;
	private String queuedCount;
	private String bytesRead;
	private String bytesWritten;
	private String bytesTransferred;
	private String flowFilesTransferred;
	private String inputContentSize;
	private String outputContentSize;
	private String queuedContentSize;
	private String activeRemotePortCount;
	private String inactiveRemotePortCount;
	private String receivedContentSize;
	private String receivedCount;
	private String sentContentSize;
	private String sentCount;
	private String averageLineageDuration;
	private String inputBytes;
	private String inputCount;
	private String outputBytes;
	private String outputCount;
	private String sourceId;
	private String sourceName;
	private String destinationId;
	private String destinationName;
	private String maxQueuedBytes;
	private String maxQueuedCount;
	private String queuedBytes;
	private String backPressureBytesThreshold;
	private String backPressureObjectThreshold;
	private String isBackPressureEnabled;
	private String processorType;
	private String averageLineageDurationMS;
	private String flowFilesRemoved;
	private String invocations;
	private String processingNanos;
	public String getStatusId() {
		return statusId;
	}
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	public String getTimestampMillis() {
		return timestampMillis;
	}
	public void setTimestampMillis(String timestampMillis) {
		this.timestampMillis = timestampMillis;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getActorHostname() {
		return actorHostname;
	}
	public void setActorHostname(String actorHostname) {
		this.actorHostname = actorHostname;
	}
	public String getComponentType() {
		return componentType;
	}
	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	public String getActiveThreadCount() {
		return activeThreadCount;
	}
	public void setActiveThreadCount(String activeThreadCount) {
		this.activeThreadCount = activeThreadCount;
	}
	public String getFlowFilesReceived() {
		return flowFilesReceived;
	}
	public void setFlowFilesReceived(String flowFilesReceived) {
		this.flowFilesReceived = flowFilesReceived;
	}
	public String getFlowFilesSent() {
		return flowFilesSent;
	}
	public void setFlowFilesSent(String flowFilesSent) {
		this.flowFilesSent = flowFilesSent;
	}
	public String getBytesReceived() {
		return bytesReceived;
	}
	public void setBytesReceived(String bytesReceived) {
		this.bytesReceived = bytesReceived;
	}
	public String getBytesSent() {
		return bytesSent;
	}
	public void setBytesSent(String bytesSent) {
		this.bytesSent = bytesSent;
	}
	public String getQueuedCount() {
		return queuedCount;
	}
	public void setQueuedCount(String queuedCount) {
		this.queuedCount = queuedCount;
	}
	public String getBytesRead() {
		return bytesRead;
	}
	public void setBytesRead(String bytesRead) {
		this.bytesRead = bytesRead;
	}
	public String getBytesWritten() {
		return bytesWritten;
	}
	public void setBytesWritten(String bytesWritten) {
		this.bytesWritten = bytesWritten;
	}
	public String getBytesTransferred() {
		return bytesTransferred;
	}
	public void setBytesTransferred(String bytesTransferred) {
		this.bytesTransferred = bytesTransferred;
	}
	public String getFlowFilesTransferred() {
		return flowFilesTransferred;
	}
	public void setFlowFilesTransferred(String flowFilesTransferred) {
		this.flowFilesTransferred = flowFilesTransferred;
	}
	public String getInputContentSize() {
		return inputContentSize;
	}
	public void setInputContentSize(String inputContentSize) {
		this.inputContentSize = inputContentSize;
	}
	public String getOutputContentSize() {
		return outputContentSize;
	}
	public void setOutputContentSize(String outputContentSize) {
		this.outputContentSize = outputContentSize;
	}
	public String getQueuedContentSize() {
		return queuedContentSize;
	}
	public void setQueuedContentSize(String queuedContentSize) {
		this.queuedContentSize = queuedContentSize;
	}
	public String getActiveRemotePortCount() {
		return activeRemotePortCount;
	}
	public void setActiveRemotePortCount(String activeRemotePortCount) {
		this.activeRemotePortCount = activeRemotePortCount;
	}
	public String getInactiveRemotePortCount() {
		return inactiveRemotePortCount;
	}
	public void setInactiveRemotePortCount(String inactiveRemotePortCount) {
		this.inactiveRemotePortCount = inactiveRemotePortCount;
	}
	public String getReceivedContentSize() {
		return receivedContentSize;
	}
	public void setReceivedContentSize(String receivedContentSize) {
		this.receivedContentSize = receivedContentSize;
	}
	public String getReceivedCount() {
		return receivedCount;
	}
	public void setReceivedCount(String receivedCount) {
		this.receivedCount = receivedCount;
	}
	public String getSentContentSize() {
		return sentContentSize;
	}
	public void setSentContentSize(String sentContentSize) {
		this.sentContentSize = sentContentSize;
	}
	public String getSentCount() {
		return sentCount;
	}
	public void setSentCount(String sentCount) {
		this.sentCount = sentCount;
	}
	public String getAverageLineageDuration() {
		return averageLineageDuration;
	}
	public void setAverageLineageDuration(String averageLineageDuration) {
		this.averageLineageDuration = averageLineageDuration;
	}
	public String getInputBytes() {
		return inputBytes;
	}
	public void setInputBytes(String inputBytes) {
		this.inputBytes = inputBytes;
	}
	public String getInputCount() {
		return inputCount;
	}
	public void setInputCount(String inputCount) {
		this.inputCount = inputCount;
	}
	public String getOutputBytes() {
		return outputBytes;
	}
	public void setOutputBytes(String outputBytes) {
		this.outputBytes = outputBytes;
	}
	public String getOutputCount() {
		return outputCount;
	}
	public void setOutputCount(String outputCount) {
		this.outputCount = outputCount;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	public String getDestinationId() {
		return destinationId;
	}
	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}
	public String getDestinationName() {
		return destinationName;
	}
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	public String getMaxQueuedBytes() {
		return maxQueuedBytes;
	}
	public void setMaxQueuedBytes(String maxQueuedBytes) {
		this.maxQueuedBytes = maxQueuedBytes;
	}
	public String getMaxQueuedCount() {
		return maxQueuedCount;
	}
	public void setMaxQueuedCount(String maxQueuedCount) {
		this.maxQueuedCount = maxQueuedCount;
	}
	public String getQueuedBytes() {
		return queuedBytes;
	}
	public void setQueuedBytes(String queuedBytes) {
		this.queuedBytes = queuedBytes;
	}
	public String getBackPressureBytesThreshold() {
		return backPressureBytesThreshold;
	}
	public void setBackPressureBytesThreshold(String backPressureBytesThreshold) {
		this.backPressureBytesThreshold = backPressureBytesThreshold;
	}
	public String getBackPressureObjectThreshold() {
		return backPressureObjectThreshold;
	}
	public void setBackPressureObjectThreshold(String backPressureObjectThreshold) {
		this.backPressureObjectThreshold = backPressureObjectThreshold;
	}
	public String getIsBackPressureEnabled() {
		return isBackPressureEnabled;
	}
	public void setIsBackPressureEnabled(String isBackPressureEnabled) {
		this.isBackPressureEnabled = isBackPressureEnabled;
	}
	public String getProcessorType() {
		return processorType;
	}
	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}
	public String getAverageLineageDurationMS() {
		return averageLineageDurationMS;
	}
	public void setAverageLineageDurationMS(String averageLineageDurationMS) {
		this.averageLineageDurationMS = averageLineageDurationMS;
	}
	public String getFlowFilesRemoved() {
		return flowFilesRemoved;
	}
	public void setFlowFilesRemoved(String flowFilesRemoved) {
		this.flowFilesRemoved = flowFilesRemoved;
	}
	public String getInvocations() {
		return invocations;
	}
	public void setInvocations(String invocations) {
		this.invocations = invocations;
	}
	public String getProcessingNanos() {
		return processingNanos;
	}
	public void setProcessingNanos(String processingNanos) {
		this.processingNanos = processingNanos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activeRemotePortCount == null) ? 0 : activeRemotePortCount.hashCode());
		result = prime * result + ((activeThreadCount == null) ? 0 : activeThreadCount.hashCode());
		result = prime * result + ((actorHostname == null) ? 0 : actorHostname.hashCode());
		result = prime * result + ((application == null) ? 0 : application.hashCode());
		result = prime * result + ((averageLineageDuration == null) ? 0 : averageLineageDuration.hashCode());
		result = prime * result + ((averageLineageDurationMS == null) ? 0 : averageLineageDurationMS.hashCode());
		result = prime * result + ((backPressureBytesThreshold == null) ? 0 : backPressureBytesThreshold.hashCode());
		result = prime * result + ((backPressureObjectThreshold == null) ? 0 : backPressureObjectThreshold.hashCode());
		result = prime * result + ((bytesRead == null) ? 0 : bytesRead.hashCode());
		result = prime * result + ((bytesReceived == null) ? 0 : bytesReceived.hashCode());
		result = prime * result + ((bytesSent == null) ? 0 : bytesSent.hashCode());
		result = prime * result + ((bytesTransferred == null) ? 0 : bytesTransferred.hashCode());
		result = prime * result + ((bytesWritten == null) ? 0 : bytesWritten.hashCode());
		result = prime * result + ((componentId == null) ? 0 : componentId.hashCode());
		result = prime * result + ((componentName == null) ? 0 : componentName.hashCode());
		result = prime * result + ((componentType == null) ? 0 : componentType.hashCode());
		result = prime * result + ((destinationId == null) ? 0 : destinationId.hashCode());
		result = prime * result + ((destinationName == null) ? 0 : destinationName.hashCode());
		result = prime * result + ((flowFilesReceived == null) ? 0 : flowFilesReceived.hashCode());
		result = prime * result + ((flowFilesRemoved == null) ? 0 : flowFilesRemoved.hashCode());
		result = prime * result + ((flowFilesSent == null) ? 0 : flowFilesSent.hashCode());
		result = prime * result + ((flowFilesTransferred == null) ? 0 : flowFilesTransferred.hashCode());
		result = prime * result + ((inactiveRemotePortCount == null) ? 0 : inactiveRemotePortCount.hashCode());
		result = prime * result + ((inputBytes == null) ? 0 : inputBytes.hashCode());
		result = prime * result + ((inputContentSize == null) ? 0 : inputContentSize.hashCode());
		result = prime * result + ((inputCount == null) ? 0 : inputCount.hashCode());
		result = prime * result + ((invocations == null) ? 0 : invocations.hashCode());
		result = prime * result + ((isBackPressureEnabled == null) ? 0 : isBackPressureEnabled.hashCode());
		result = prime * result + ((maxQueuedBytes == null) ? 0 : maxQueuedBytes.hashCode());
		result = prime * result + ((maxQueuedCount == null) ? 0 : maxQueuedCount.hashCode());
		result = prime * result + ((outputBytes == null) ? 0 : outputBytes.hashCode());
		result = prime * result + ((outputContentSize == null) ? 0 : outputContentSize.hashCode());
		result = prime * result + ((outputCount == null) ? 0 : outputCount.hashCode());
		result = prime * result + ((parentId == null) ? 0 : parentId.hashCode());
		result = prime * result + ((platform == null) ? 0 : platform.hashCode());
		result = prime * result + ((processingNanos == null) ? 0 : processingNanos.hashCode());
		result = prime * result + ((processorType == null) ? 0 : processorType.hashCode());
		result = prime * result + ((queuedBytes == null) ? 0 : queuedBytes.hashCode());
		result = prime * result + ((queuedContentSize == null) ? 0 : queuedContentSize.hashCode());
		result = prime * result + ((queuedCount == null) ? 0 : queuedCount.hashCode());
		result = prime * result + ((receivedContentSize == null) ? 0 : receivedContentSize.hashCode());
		result = prime * result + ((receivedCount == null) ? 0 : receivedCount.hashCode());
		result = prime * result + ((sentContentSize == null) ? 0 : sentContentSize.hashCode());
		result = prime * result + ((sentCount == null) ? 0 : sentCount.hashCode());
		result = prime * result + ((sourceId == null) ? 0 : sourceId.hashCode());
		result = prime * result + ((sourceName == null) ? 0 : sourceName.hashCode());
		result = prime * result + ((statusId == null) ? 0 : statusId.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((timestampMillis == null) ? 0 : timestampMillis.hashCode());
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
		Status other = (Status) obj;
		if (activeRemotePortCount == null) {
			if (other.activeRemotePortCount != null)
				return false;
		} else if (!activeRemotePortCount.equals(other.activeRemotePortCount))
			return false;
		if (activeThreadCount == null) {
			if (other.activeThreadCount != null)
				return false;
		} else if (!activeThreadCount.equals(other.activeThreadCount))
			return false;
		if (actorHostname == null) {
			if (other.actorHostname != null)
				return false;
		} else if (!actorHostname.equals(other.actorHostname))
			return false;
		if (application == null) {
			if (other.application != null)
				return false;
		} else if (!application.equals(other.application))
			return false;
		if (averageLineageDuration == null) {
			if (other.averageLineageDuration != null)
				return false;
		} else if (!averageLineageDuration.equals(other.averageLineageDuration))
			return false;
		if (averageLineageDurationMS == null) {
			if (other.averageLineageDurationMS != null)
				return false;
		} else if (!averageLineageDurationMS.equals(other.averageLineageDurationMS))
			return false;
		if (backPressureBytesThreshold == null) {
			if (other.backPressureBytesThreshold != null)
				return false;
		} else if (!backPressureBytesThreshold.equals(other.backPressureBytesThreshold))
			return false;
		if (backPressureObjectThreshold == null) {
			if (other.backPressureObjectThreshold != null)
				return false;
		} else if (!backPressureObjectThreshold.equals(other.backPressureObjectThreshold))
			return false;
		if (bytesRead == null) {
			if (other.bytesRead != null)
				return false;
		} else if (!bytesRead.equals(other.bytesRead))
			return false;
		if (bytesReceived == null) {
			if (other.bytesReceived != null)
				return false;
		} else if (!bytesReceived.equals(other.bytesReceived))
			return false;
		if (bytesSent == null) {
			if (other.bytesSent != null)
				return false;
		} else if (!bytesSent.equals(other.bytesSent))
			return false;
		if (bytesTransferred == null) {
			if (other.bytesTransferred != null)
				return false;
		} else if (!bytesTransferred.equals(other.bytesTransferred))
			return false;
		if (bytesWritten == null) {
			if (other.bytesWritten != null)
				return false;
		} else if (!bytesWritten.equals(other.bytesWritten))
			return false;
		if (componentId == null) {
			if (other.componentId != null)
				return false;
		} else if (!componentId.equals(other.componentId))
			return false;
		if (componentName == null) {
			if (other.componentName != null)
				return false;
		} else if (!componentName.equals(other.componentName))
			return false;
		if (componentType == null) {
			if (other.componentType != null)
				return false;
		} else if (!componentType.equals(other.componentType))
			return false;
		if (destinationId == null) {
			if (other.destinationId != null)
				return false;
		} else if (!destinationId.equals(other.destinationId))
			return false;
		if (destinationName == null) {
			if (other.destinationName != null)
				return false;
		} else if (!destinationName.equals(other.destinationName))
			return false;
		if (flowFilesReceived == null) {
			if (other.flowFilesReceived != null)
				return false;
		} else if (!flowFilesReceived.equals(other.flowFilesReceived))
			return false;
		if (flowFilesRemoved == null) {
			if (other.flowFilesRemoved != null)
				return false;
		} else if (!flowFilesRemoved.equals(other.flowFilesRemoved))
			return false;
		if (flowFilesSent == null) {
			if (other.flowFilesSent != null)
				return false;
		} else if (!flowFilesSent.equals(other.flowFilesSent))
			return false;
		if (flowFilesTransferred == null) {
			if (other.flowFilesTransferred != null)
				return false;
		} else if (!flowFilesTransferred.equals(other.flowFilesTransferred))
			return false;
		if (inactiveRemotePortCount == null) {
			if (other.inactiveRemotePortCount != null)
				return false;
		} else if (!inactiveRemotePortCount.equals(other.inactiveRemotePortCount))
			return false;
		if (inputBytes == null) {
			if (other.inputBytes != null)
				return false;
		} else if (!inputBytes.equals(other.inputBytes))
			return false;
		if (inputContentSize == null) {
			if (other.inputContentSize != null)
				return false;
		} else if (!inputContentSize.equals(other.inputContentSize))
			return false;
		if (inputCount == null) {
			if (other.inputCount != null)
				return false;
		} else if (!inputCount.equals(other.inputCount))
			return false;
		if (invocations == null) {
			if (other.invocations != null)
				return false;
		} else if (!invocations.equals(other.invocations))
			return false;
		if (isBackPressureEnabled == null) {
			if (other.isBackPressureEnabled != null)
				return false;
		} else if (!isBackPressureEnabled.equals(other.isBackPressureEnabled))
			return false;
		if (maxQueuedBytes == null) {
			if (other.maxQueuedBytes != null)
				return false;
		} else if (!maxQueuedBytes.equals(other.maxQueuedBytes))
			return false;
		if (maxQueuedCount == null) {
			if (other.maxQueuedCount != null)
				return false;
		} else if (!maxQueuedCount.equals(other.maxQueuedCount))
			return false;
		if (outputBytes == null) {
			if (other.outputBytes != null)
				return false;
		} else if (!outputBytes.equals(other.outputBytes))
			return false;
		if (outputContentSize == null) {
			if (other.outputContentSize != null)
				return false;
		} else if (!outputContentSize.equals(other.outputContentSize))
			return false;
		if (outputCount == null) {
			if (other.outputCount != null)
				return false;
		} else if (!outputCount.equals(other.outputCount))
			return false;
		if (parentId == null) {
			if (other.parentId != null)
				return false;
		} else if (!parentId.equals(other.parentId))
			return false;
		if (platform == null) {
			if (other.platform != null)
				return false;
		} else if (!platform.equals(other.platform))
			return false;
		if (processingNanos == null) {
			if (other.processingNanos != null)
				return false;
		} else if (!processingNanos.equals(other.processingNanos))
			return false;
		if (processorType == null) {
			if (other.processorType != null)
				return false;
		} else if (!processorType.equals(other.processorType))
			return false;
		if (queuedBytes == null) {
			if (other.queuedBytes != null)
				return false;
		} else if (!queuedBytes.equals(other.queuedBytes))
			return false;
		if (queuedContentSize == null) {
			if (other.queuedContentSize != null)
				return false;
		} else if (!queuedContentSize.equals(other.queuedContentSize))
			return false;
		if (queuedCount == null) {
			if (other.queuedCount != null)
				return false;
		} else if (!queuedCount.equals(other.queuedCount))
			return false;
		if (receivedContentSize == null) {
			if (other.receivedContentSize != null)
				return false;
		} else if (!receivedContentSize.equals(other.receivedContentSize))
			return false;
		if (receivedCount == null) {
			if (other.receivedCount != null)
				return false;
		} else if (!receivedCount.equals(other.receivedCount))
			return false;
		if (sentContentSize == null) {
			if (other.sentContentSize != null)
				return false;
		} else if (!sentContentSize.equals(other.sentContentSize))
			return false;
		if (sentCount == null) {
			if (other.sentCount != null)
				return false;
		} else if (!sentCount.equals(other.sentCount))
			return false;
		if (sourceId == null) {
			if (other.sourceId != null)
				return false;
		} else if (!sourceId.equals(other.sourceId))
			return false;
		if (sourceName == null) {
			if (other.sourceName != null)
				return false;
		} else if (!sourceName.equals(other.sourceName))
			return false;
		if (statusId == null) {
			if (other.statusId != null)
				return false;
		} else if (!statusId.equals(other.statusId))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (timestampMillis == null) {
			if (other.timestampMillis != null)
				return false;
		} else if (!timestampMillis.equals(other.timestampMillis))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Status [statusId=");
		builder.append(statusId);
		builder.append(", timestampMillis=");
		builder.append(timestampMillis);
		builder.append(", timestamp=");
		builder.append(timestamp);
		builder.append(", actorHostname=");
		builder.append(actorHostname);
		builder.append(", componentType=");
		builder.append(componentType);
		builder.append(", componentName=");
		builder.append(componentName);
		builder.append(", parentId=");
		builder.append(parentId);
		builder.append(", platform=");
		builder.append(platform);
		builder.append(", application=");
		builder.append(application);
		builder.append(", componentId=");
		builder.append(componentId);
		builder.append(", activeThreadCount=");
		builder.append(activeThreadCount);
		builder.append(", flowFilesReceived=");
		builder.append(flowFilesReceived);
		builder.append(", flowFilesSent=");
		builder.append(flowFilesSent);
		builder.append(", bytesReceived=");
		builder.append(bytesReceived);
		builder.append(", bytesSent=");
		builder.append(bytesSent);
		builder.append(", queuedCount=");
		builder.append(queuedCount);
		builder.append(", bytesRead=");
		builder.append(bytesRead);
		builder.append(", bytesWritten=");
		builder.append(bytesWritten);
		builder.append(", bytesTransferred=");
		builder.append(bytesTransferred);
		builder.append(", flowFilesTransferred=");
		builder.append(flowFilesTransferred);
		builder.append(", inputContentSize=");
		builder.append(inputContentSize);
		builder.append(", outputContentSize=");
		builder.append(outputContentSize);
		builder.append(", queuedContentSize=");
		builder.append(queuedContentSize);
		builder.append(", activeRemotePortCount=");
		builder.append(activeRemotePortCount);
		builder.append(", inactiveRemotePortCount=");
		builder.append(inactiveRemotePortCount);
		builder.append(", receivedContentSize=");
		builder.append(receivedContentSize);
		builder.append(", receivedCount=");
		builder.append(receivedCount);
		builder.append(", sentContentSize=");
		builder.append(sentContentSize);
		builder.append(", sentCount=");
		builder.append(sentCount);
		builder.append(", averageLineageDuration=");
		builder.append(averageLineageDuration);
		builder.append(", inputBytes=");
		builder.append(inputBytes);
		builder.append(", inputCount=");
		builder.append(inputCount);
		builder.append(", outputBytes=");
		builder.append(outputBytes);
		builder.append(", outputCount=");
		builder.append(outputCount);
		builder.append(", sourceId=");
		builder.append(sourceId);
		builder.append(", sourceName=");
		builder.append(sourceName);
		builder.append(", destinationId=");
		builder.append(destinationId);
		builder.append(", destinationName=");
		builder.append(destinationName);
		builder.append(", maxQueuedBytes=");
		builder.append(maxQueuedBytes);
		builder.append(", maxQueuedCount=");
		builder.append(maxQueuedCount);
		builder.append(", queuedBytes=");
		builder.append(queuedBytes);
		builder.append(", backPressureBytesThreshold=");
		builder.append(backPressureBytesThreshold);
		builder.append(", backPressureObjectThreshold=");
		builder.append(backPressureObjectThreshold);
		builder.append(", isBackPressureEnabled=");
		builder.append(isBackPressureEnabled);
		builder.append(", processorType=");
		builder.append(processorType);
		builder.append(", averageLineageDurationMS=");
		builder.append(averageLineageDurationMS);
		builder.append(", flowFilesRemoved=");
		builder.append(flowFilesRemoved);
		builder.append(", invocations=");
		builder.append(invocations);
		builder.append(", processingNanos=");
		builder.append(processingNanos);
		builder.append("]");
		return builder.toString();
	}
	public Status(String statusId, String timestampMillis, String timestamp, String actorHostname, String componentType,
			String componentName, String parentId, String platform, String application, String componentId,
			String activeThreadCount, String flowFilesReceived, String flowFilesSent, String bytesReceived,
			String bytesSent, String queuedCount, String bytesRead, String bytesWritten, String bytesTransferred,
			String flowFilesTransferred, String inputContentSize, String outputContentSize, String queuedContentSize,
			String activeRemotePortCount, String inactiveRemotePortCount, String receivedContentSize,
			String receivedCount, String sentContentSize, String sentCount, String averageLineageDuration,
			String inputBytes, String inputCount, String outputBytes, String outputCount, String sourceId,
			String sourceName, String destinationId, String destinationName, String maxQueuedBytes,
			String maxQueuedCount, String queuedBytes, String backPressureBytesThreshold,
			String backPressureObjectThreshold, String isBackPressureEnabled, String processorType,
			String averageLineageDurationMS, String flowFilesRemoved, String invocations, String processingNanos) {
		super();
		this.statusId = statusId;
		this.timestampMillis = timestampMillis;
		this.timestamp = timestamp;
		this.actorHostname = actorHostname;
		this.componentType = componentType;
		this.componentName = componentName;
		this.parentId = parentId;
		this.platform = platform;
		this.application = application;
		this.componentId = componentId;
		this.activeThreadCount = activeThreadCount;
		this.flowFilesReceived = flowFilesReceived;
		this.flowFilesSent = flowFilesSent;
		this.bytesReceived = bytesReceived;
		this.bytesSent = bytesSent;
		this.queuedCount = queuedCount;
		this.bytesRead = bytesRead;
		this.bytesWritten = bytesWritten;
		this.bytesTransferred = bytesTransferred;
		this.flowFilesTransferred = flowFilesTransferred;
		this.inputContentSize = inputContentSize;
		this.outputContentSize = outputContentSize;
		this.queuedContentSize = queuedContentSize;
		this.activeRemotePortCount = activeRemotePortCount;
		this.inactiveRemotePortCount = inactiveRemotePortCount;
		this.receivedContentSize = receivedContentSize;
		this.receivedCount = receivedCount;
		this.sentContentSize = sentContentSize;
		this.sentCount = sentCount;
		this.averageLineageDuration = averageLineageDuration;
		this.inputBytes = inputBytes;
		this.inputCount = inputCount;
		this.outputBytes = outputBytes;
		this.outputCount = outputCount;
		this.sourceId = sourceId;
		this.sourceName = sourceName;
		this.destinationId = destinationId;
		this.destinationName = destinationName;
		this.maxQueuedBytes = maxQueuedBytes;
		this.maxQueuedCount = maxQueuedCount;
		this.queuedBytes = queuedBytes;
		this.backPressureBytesThreshold = backPressureBytesThreshold;
		this.backPressureObjectThreshold = backPressureObjectThreshold;
		this.isBackPressureEnabled = isBackPressureEnabled;
		this.processorType = processorType;
		this.averageLineageDurationMS = averageLineageDurationMS;
		this.flowFilesRemoved = flowFilesRemoved;
		this.invocations = invocations;
		this.processingNanos = processingNanos;
	}
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}

}
