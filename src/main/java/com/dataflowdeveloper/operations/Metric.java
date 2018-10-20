package com.dataflowdeveloper.operations;

import java.io.Serializable;

/**
 * CREATE EXTERNAL TABLE IF NOT EXISTS metrics (appid STRING, instanceid STRING, hostname STRING, `timestamp` BIGINT, loadAverage1min DOUBLE, availableCores INT, FlowFilesReceivedLast5Minutes INT, BytesReceivedLast5Minutes BIGINT, FlowFilesSentLast5Minutes INT, BytesSentLast5Minutes BIGINT,
 *  FlowFilesQueued INT, BytesQueued BIGINT, BytesReadLast5Minutes BIGINT, BytesWrittenLast5Minutes BIGINT, ActiveThreads INT, TotalTaskDurationSeconds BIGINT, TotalTaskDurationNanoSeconds BIGINT, jvmuptime BIGINT, jvmheap_used DOUBLE, jvmheap_usage DOUBLE, jvmnon_heap_usage DOUBLE
 jvmthread_statesrunnable INT, jvmthread_statesblocked INT, jvmthread_statestimed_waiting INT, jvmthread_statesterminated INT, jvmthread_count INT, jvmdaemon_thread_count INT, jvmfile_descriptor_usage DOUBLE, jvmgcruns BIGINT, jvmgctime BIGINT) STORED AS ORC
    LOCATION '/metrics'
    
 * @author tspann
 *
 */
public class Metric implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2843179637589601806L;
	private int timestamp;
	private double loadAverage1min;
	private int availableCores;
	private int FlowFilesReceivedLast5Minutes;
	private int BytesReceivedLast5Minutes;
	private int FlowFilesSentLast5Minutes;
	private int BytesSentLast5Minutes;
	private int FlowFilesQueued;
	private int BytesQueued;
	private int BytesReadLast5Minutes;
	private int BytesWrittenLast5Minutes;
	private int ActiveThreads;
	private int TotalTaskDurationSeconds;
	private int TotalTaskDurationNanoSeconds;
	private int jvmuptime;
	private double jvmheap_used;
	private double jvmheap_usage;
	private double jvmnon_heap_usage;
	private int jvmthread_statesrunnable;
	private int jvmthread_statesblocked;
	private int jvmthread_statestimed_waiting;
	private int jvmthread_statesterminated;
	private int jvmthread_count;
	private int jvmdaemon_thread_count;
	private double jvmfile_descriptor_usage;
	private int jvmgcruns;

	
	
	public Metric() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Metric(int timestamp, double loadAverage1min, int availableCores, int flowFilesReceivedLast5Minutes,
			int bytesReceivedLast5Minutes, int flowFilesSentLast5Minutes, int bytesSentLast5Minutes,
			int flowFilesQueued, int bytesQueued, int bytesReadLast5Minutes, int bytesWrittenLast5Minutes,
			int activeThreads, int totalTaskDurationSeconds, int totalTaskDurationNanoSeconds, int jvmuptime,
			double jvmheap_used, double jvmheap_usage, double jvmnon_heap_usage, int jvmthread_statesrunnable,
			int jvmthread_statesblocked, int jvmthread_statestimed_waiting, int jvmthread_statesterminated,
			int jvmthread_count, int jvmdaemon_thread_count, double jvmfile_descriptor_usage, int jvmgcruns) {
		super();
		this.timestamp = timestamp;
		this.loadAverage1min = loadAverage1min;
		this.availableCores = availableCores;
		FlowFilesReceivedLast5Minutes = flowFilesReceivedLast5Minutes;
		BytesReceivedLast5Minutes = bytesReceivedLast5Minutes;
		FlowFilesSentLast5Minutes = flowFilesSentLast5Minutes;
		BytesSentLast5Minutes = bytesSentLast5Minutes;
		FlowFilesQueued = flowFilesQueued;
		BytesQueued = bytesQueued;
		BytesReadLast5Minutes = bytesReadLast5Minutes;
		BytesWrittenLast5Minutes = bytesWrittenLast5Minutes;
		ActiveThreads = activeThreads;
		TotalTaskDurationSeconds = totalTaskDurationSeconds;
		TotalTaskDurationNanoSeconds = totalTaskDurationNanoSeconds;
		this.jvmuptime = jvmuptime;
		this.jvmheap_used = jvmheap_used;
		this.jvmheap_usage = jvmheap_usage;
		this.jvmnon_heap_usage = jvmnon_heap_usage;
		this.jvmthread_statesrunnable = jvmthread_statesrunnable;
		this.jvmthread_statesblocked = jvmthread_statesblocked;
		this.jvmthread_statestimed_waiting = jvmthread_statestimed_waiting;
		this.jvmthread_statesterminated = jvmthread_statesterminated;
		this.jvmthread_count = jvmthread_count;
		this.jvmdaemon_thread_count = jvmdaemon_thread_count;
		this.jvmfile_descriptor_usage = jvmfile_descriptor_usage;
		this.jvmgcruns = jvmgcruns;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Metric [timestamp=");
		builder.append(timestamp);
		builder.append(", loadAverage1min=");
		builder.append(loadAverage1min);
		builder.append(", availableCores=");
		builder.append(availableCores);
		builder.append(", FlowFilesReceivedLast5Minutes=");
		builder.append(FlowFilesReceivedLast5Minutes);
		builder.append(", BytesReceivedLast5Minutes=");
		builder.append(BytesReceivedLast5Minutes);
		builder.append(", FlowFilesSentLast5Minutes=");
		builder.append(FlowFilesSentLast5Minutes);
		builder.append(", BytesSentLast5Minutes=");
		builder.append(BytesSentLast5Minutes);
		builder.append(", FlowFilesQueued=");
		builder.append(FlowFilesQueued);
		builder.append(", BytesQueued=");
		builder.append(BytesQueued);
		builder.append(", BytesReadLast5Minutes=");
		builder.append(BytesReadLast5Minutes);
		builder.append(", BytesWrittenLast5Minutes=");
		builder.append(BytesWrittenLast5Minutes);
		builder.append(", ActiveThreads=");
		builder.append(ActiveThreads);
		builder.append(", TotalTaskDurationSeconds=");
		builder.append(TotalTaskDurationSeconds);
		builder.append(", TotalTaskDurationNanoSeconds=");
		builder.append(TotalTaskDurationNanoSeconds);
		builder.append(", jvmuptime=");
		builder.append(jvmuptime);
		builder.append(", jvmheap_used=");
		builder.append(jvmheap_used);
		builder.append(", jvmheap_usage=");
		builder.append(jvmheap_usage);
		builder.append(", jvmnon_heap_usage=");
		builder.append(jvmnon_heap_usage);
		builder.append(", jvmthread_statesrunnable=");
		builder.append(jvmthread_statesrunnable);
		builder.append(", jvmthread_statesblocked=");
		builder.append(jvmthread_statesblocked);
		builder.append(", jvmthread_statestimed_waiting=");
		builder.append(jvmthread_statestimed_waiting);
		builder.append(", jvmthread_statesterminated=");
		builder.append(jvmthread_statesterminated);
		builder.append(", jvmthread_count=");
		builder.append(jvmthread_count);
		builder.append(", jvmdaemon_thread_count=");
		builder.append(jvmdaemon_thread_count);
		builder.append(", jvmfile_descriptor_usage=");
		builder.append(jvmfile_descriptor_usage);
		builder.append(", jvmgcruns=");
		builder.append(jvmgcruns);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ActiveThreads;
		result = prime * result + BytesQueued;
		result = prime * result + BytesReadLast5Minutes;
		result = prime * result + BytesReceivedLast5Minutes;
		result = prime * result + BytesSentLast5Minutes;
		result = prime * result + BytesWrittenLast5Minutes;
		result = prime * result + FlowFilesQueued;
		result = prime * result + FlowFilesReceivedLast5Minutes;
		result = prime * result + FlowFilesSentLast5Minutes;
		result = prime * result + TotalTaskDurationNanoSeconds;
		result = prime * result + TotalTaskDurationSeconds;
		result = prime * result + availableCores;
		result = prime * result + jvmdaemon_thread_count;
		long temp;
		temp = Double.doubleToLongBits(jvmfile_descriptor_usage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + jvmgcruns;
		temp = Double.doubleToLongBits(jvmheap_usage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(jvmheap_used);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(jvmnon_heap_usage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + jvmthread_count;
		result = prime * result + jvmthread_statesblocked;
		result = prime * result + jvmthread_statesrunnable;
		result = prime * result + jvmthread_statesterminated;
		result = prime * result + jvmthread_statestimed_waiting;
		result = prime * result + jvmuptime;
		temp = Double.doubleToLongBits(loadAverage1min);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + timestamp;
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
		Metric other = (Metric) obj;
		if (ActiveThreads != other.ActiveThreads)
			return false;
		if (BytesQueued != other.BytesQueued)
			return false;
		if (BytesReadLast5Minutes != other.BytesReadLast5Minutes)
			return false;
		if (BytesReceivedLast5Minutes != other.BytesReceivedLast5Minutes)
			return false;
		if (BytesSentLast5Minutes != other.BytesSentLast5Minutes)
			return false;
		if (BytesWrittenLast5Minutes != other.BytesWrittenLast5Minutes)
			return false;
		if (FlowFilesQueued != other.FlowFilesQueued)
			return false;
		if (FlowFilesReceivedLast5Minutes != other.FlowFilesReceivedLast5Minutes)
			return false;
		if (FlowFilesSentLast5Minutes != other.FlowFilesSentLast5Minutes)
			return false;
		if (TotalTaskDurationNanoSeconds != other.TotalTaskDurationNanoSeconds)
			return false;
		if (TotalTaskDurationSeconds != other.TotalTaskDurationSeconds)
			return false;
		if (availableCores != other.availableCores)
			return false;
		if (jvmdaemon_thread_count != other.jvmdaemon_thread_count)
			return false;
		if (Double.doubleToLongBits(jvmfile_descriptor_usage) != Double
				.doubleToLongBits(other.jvmfile_descriptor_usage))
			return false;
		if (jvmgcruns != other.jvmgcruns)
			return false;
		if (Double.doubleToLongBits(jvmheap_usage) != Double.doubleToLongBits(other.jvmheap_usage))
			return false;
		if (Double.doubleToLongBits(jvmheap_used) != Double.doubleToLongBits(other.jvmheap_used))
			return false;
		if (Double.doubleToLongBits(jvmnon_heap_usage) != Double.doubleToLongBits(other.jvmnon_heap_usage))
			return false;
		if (jvmthread_count != other.jvmthread_count)
			return false;
		if (jvmthread_statesblocked != other.jvmthread_statesblocked)
			return false;
		if (jvmthread_statesrunnable != other.jvmthread_statesrunnable)
			return false;
		if (jvmthread_statesterminated != other.jvmthread_statesterminated)
			return false;
		if (jvmthread_statestimed_waiting != other.jvmthread_statestimed_waiting)
			return false;
		if (jvmuptime != other.jvmuptime)
			return false;
		if (Double.doubleToLongBits(loadAverage1min) != Double.doubleToLongBits(other.loadAverage1min))
			return false;
		if (timestamp != other.timestamp)
			return false;
		return true;
	}

	public int getTimestamp(){
		return timestamp;
	}

	public void setTimestamp(int timestamp){
		this.timestamp=timestamp;
	}

	public double getLoadaverage1min(){
		return loadAverage1min;
	}

	public void setLoadaverage1min(double loadAverage1min){
		this.loadAverage1min=loadAverage1min;
	}

	public int getAvailablecores(){
		return availableCores;
	}

	public void setAvailablecores(int availableCores){
		this.availableCores=availableCores;
	}

	public int getFlowfilesreceivedlast5minutes(){
		return FlowFilesReceivedLast5Minutes;
	}

	public void setFlowfilesreceivedlast5minutes(int FlowFilesReceivedLast5Minutes){
		this.FlowFilesReceivedLast5Minutes=FlowFilesReceivedLast5Minutes;
	}

	public int getBytesreceivedlast5minutes(){
		return BytesReceivedLast5Minutes;
	}

	public void setBytesreceivedlast5minutes(int BytesReceivedLast5Minutes){
		this.BytesReceivedLast5Minutes=BytesReceivedLast5Minutes;
	}

	public int getFlowfilessentlast5minutes(){
		return FlowFilesSentLast5Minutes;
	}

	public void setFlowfilessentlast5minutes(int FlowFilesSentLast5Minutes){
		this.FlowFilesSentLast5Minutes=FlowFilesSentLast5Minutes;
	}

	public int getBytessentlast5minutes(){
		return BytesSentLast5Minutes;
	}

	public void setBytessentlast5minutes(int BytesSentLast5Minutes){
		this.BytesSentLast5Minutes=BytesSentLast5Minutes;
	}

	public int getFlowfilesqueued(){
		return FlowFilesQueued;
	}

	public void setFlowfilesqueued(int FlowFilesQueued){
		this.FlowFilesQueued=FlowFilesQueued;
	}

	public int getBytesqueued(){
		return BytesQueued;
	}

	public void setBytesqueued(int BytesQueued){
		this.BytesQueued=BytesQueued;
	}

	public int getBytesreadlast5minutes(){
		return BytesReadLast5Minutes;
	}

	public void setBytesreadlast5minutes(int BytesReadLast5Minutes){
		this.BytesReadLast5Minutes=BytesReadLast5Minutes;
	}

	public int getByteswrittenlast5minutes(){
		return BytesWrittenLast5Minutes;
	}

	public void setByteswrittenlast5minutes(int BytesWrittenLast5Minutes){
		this.BytesWrittenLast5Minutes=BytesWrittenLast5Minutes;
	}

	public int getActivethreads(){
		return ActiveThreads;
	}

	public void setActivethreads(int ActiveThreads){
		this.ActiveThreads=ActiveThreads;
	}

	public int getTotaltaskdurationseconds(){
		return TotalTaskDurationSeconds;
	}

	public void setTotaltaskdurationseconds(int TotalTaskDurationSeconds){
		this.TotalTaskDurationSeconds=TotalTaskDurationSeconds;
	}

	public int getTotaltaskdurationnanoseconds(){
		return TotalTaskDurationNanoSeconds;
	}

	public void setTotaltaskdurationnanoseconds(int TotalTaskDurationNanoSeconds){
		this.TotalTaskDurationNanoSeconds=TotalTaskDurationNanoSeconds;
	}

	public int getJvmuptime(){
		return jvmuptime;
	}

	public void setJvmuptime(int jvmuptime){
		this.jvmuptime=jvmuptime;
	}

	public double getJvmheap_used(){
		return jvmheap_used;
	}

	public void setJvmheap_used(double jvmheap_used){
		this.jvmheap_used=jvmheap_used;
	}

	public double getJvmheap_usage(){
		return jvmheap_usage;
	}

	public void setJvmheap_usage(double jvmheap_usage){
		this.jvmheap_usage=jvmheap_usage;
	}

	public double getJvmnon_heap_usage(){
		return jvmnon_heap_usage;
	}

	public void setJvmnon_heap_usage(double jvmnon_heap_usage){
		this.jvmnon_heap_usage=jvmnon_heap_usage;
	}

	public int getJvmthread_statesrunnable(){
		return jvmthread_statesrunnable;
	}

	public void setJvmthread_statesrunnable(int jvmthread_statesrunnable){
		this.jvmthread_statesrunnable=jvmthread_statesrunnable;
	}

	public int getJvmthread_statesblocked(){
		return jvmthread_statesblocked;
	}

	public void setJvmthread_statesblocked(int jvmthread_statesblocked){
		this.jvmthread_statesblocked=jvmthread_statesblocked;
	}

	public int getJvmthread_statestimed_waiting(){
		return jvmthread_statestimed_waiting;
	}

	public void setJvmthread_statestimed_waiting(int jvmthread_statestimed_waiting){
		this.jvmthread_statestimed_waiting=jvmthread_statestimed_waiting;
	}

	public int getJvmthread_statesterminated(){
		return jvmthread_statesterminated;
	}

	public void setJvmthread_statesterminated(int jvmthread_statesterminated){
		this.jvmthread_statesterminated=jvmthread_statesterminated;
	}

	public int getJvmthread_count(){
		return jvmthread_count;
	}

	public void setJvmthread_count(int jvmthread_count){
		this.jvmthread_count=jvmthread_count;
	}

	public int getJvmdaemon_thread_count(){
		return jvmdaemon_thread_count;
	}

	public void setJvmdaemon_thread_count(int jvmdaemon_thread_count){
		this.jvmdaemon_thread_count=jvmdaemon_thread_count;
	}

	public double getJvmfile_descriptor_usage(){
		return jvmfile_descriptor_usage;
	}

	public void setJvmfile_descriptor_usage(double jvmfile_descriptor_usage){
		this.jvmfile_descriptor_usage=jvmfile_descriptor_usage;
	}

	public int getJvmgcruns(){
		return jvmgcruns;
	}

	public void setJvmgcruns(int jvmgcruns){
		this.jvmgcruns=jvmgcruns;
	}
}