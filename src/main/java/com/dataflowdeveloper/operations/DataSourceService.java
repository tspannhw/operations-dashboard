package com.dataflowdeveloper.operations;

//https://www.baeldung.com/spring-boot-logging

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("DataSourceService")
public class DataSourceService {

	private static final String TABLE_NAME_BULLETINTYPE_BULLETIN = "bulletin";
	private static final String TABLE_NAME_BULLETINTYPE_MEMORY = "memory";
	@Autowired
	public DataSource dataSource;

	// default to empty
	public Inception defaultValue() {
		return new Inception();
	}

	// querylimit
	@Value("${querylimit}")
	private String querylimit;

	/**
	 * 
	 * @param query
	 *            - search msg
	 * @return List of Inception
	 */
	public List<Yolo> search(String query) {
		if (query == null) {
			return null;
		}

		List<Yolo> results = new ArrayList<>();
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(
					"select * from gluoncvyolo WHERE imgname like ? or imgnamep like ? or class1 like ? or host like ? or te like ? LIMIT ?");
			ps.setString(1, "%" + query + "%");
			ps.setString(2, "%" + query + "%");
			ps.setString(3, "%" + query + "%");
			ps.setString(4, "%" + query + "%");
			ps.setString(5, "%" + query + "%");
			ps.setInt(6, Integer.parseInt(querylimit));
			ResultSet res = ps.executeQuery();
			Yolo yolo = null;
			while (res.next()) {
				yolo = new Yolo();
				yolo.setBattery(res.getString("battery"));
				yolo.setClass1(res.getString("class1"));
				yolo.setCpu(res.getString("cpu"));
				yolo.setDiskuage(res.getString("diskusage"));
				yolo.setEnd(res.getString("end"));
				yolo.setHost(res.getString("host"));
				yolo.setId(res.getString("id"));
				yolo.setImgname(res.getString("imgname"));
				yolo.setImgnamep(res.getString("imgnamep"));
				yolo.setMemory(res.getString(TABLE_NAME_BULLETINTYPE_MEMORY));
				yolo.setPct1(res.getString("pct1"));
				yolo.setShape(res.getString("shape"));
				yolo.setSystemtime(res.getString("systemtime"));
				yolo.setTe(res.getString("te"));
				results.add(yolo);
			}

			// CREATE EXTERNAL TABLE IF NOT EXISTS gluoncvyolo (imgname STRING, imgnamep
			// STRING, class1 STRING, pct1 STRING, host STRING, shape STRING, `end` STRING,
			// te STRING, battery INT, systemtime STRING, cpu DOUBLE, diskusage STRING,
			// memory DOUBLE, id STRING) STORED AS ORC LOCATION '/gluoncvyolo'

			res.close();
			ps.close();
			connection.close();
			res = null;
			ps = null;
			connection = null;
			yolo = null;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return results;
	}

	/**
	 * 
	 * @param query
	 * @return
	 */
	public List<Bulletin> searchMemoryBulletins(String query) {
		if (query == null) {
			return null;
		}
		
		return searchBulletins(query, TABLE_NAME_BULLETINTYPE_MEMORY);
	}
	
	/**
	 * 
	 * @param query
	 * @return
	 */
	public List<Bulletin> searchMainBulletins(String query) {
		if (query == null) {
			return null;
		}
		
		return searchBulletins(query, TABLE_NAME_BULLETINTYPE_BULLETIN);
	}
	
	/**
	 * 
	 * @param query
	 * @return
	 */
	public List<Bulletin> searchAllBulletins(String query) {
		if (query == null) {
			return null;
		}
		
		List<Bulletin> allBulletins = searchBulletins(query, TABLE_NAME_BULLETINTYPE_BULLETIN);
		
		if ( allBulletins == null) {
			allBulletins = new ArrayList<Bulletin>();
		}
		//faster than Hive 3 Union, there will be dupes
		allBulletins.addAll( searchBulletins(query, TABLE_NAME_BULLETINTYPE_MEMORY) );

		//could do sort and ... #TODO
		
		return allBulletins;
	}
	
	
	/**
	 * 
	 * @param query
	 * @return
	 */
	public List<Bulletin> searchBulletins(String query, String tableName) {
		if (query == null) {
			return null;
		}

		List<Bulletin> results = new ArrayList<>();
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(
					"select * from " + tableName + " WHERE UPPER(bulletinCategory) like UPPER(?) or UPPER(bulletinMessage) like UPPER(?) or UPPER(bulletinSourceName) like UPPER(?)  LIMIT ?");
			ps.setString(1, "%" + query + "%");
			ps.setString(2, "%" + query + "%");
			ps.setString(3, "%" + query + "%");
			ps.setInt(4, Integer.parseInt(querylimit));
			ResultSet res = ps.executeQuery();
			Bulletin bulletin = null;
			while (res.next()) {
				bulletin = new Bulletin();
				bulletin.setBulletinCategory(res.getString("bulletinCategory"));

				bulletin.setBulletinGroupId(res.getString("bulletinGroupId"));
				bulletin.setBulletinGroupName(res.getString("bulletinGroupName"));
				bulletin.setBulletinId(res.getString("bulletinId"));
				bulletin.setBulletinLevel(res.getString("bulletinLevel"));
				bulletin.setBulletinMessage(res.getString("bulletinMessage"));
				bulletin.setBulletinNodeAddress(res.getString("bulletinNodeAddress"));
				bulletin.setBulletinNodeId(res.getString("bulletinNodeId"));
				bulletin.setBulletinSourceId(res.getString("bulletinSourceId"));
				bulletin.setBulletinSourceName(res.getString("bulletinSourceName"));
				bulletin.setBulletinSourceType(res.getString("bulletinSourceType"));
				bulletin.setBulletinTimestamp(res.getString("bulletinTimestamp"));
				results.add(bulletin);
			}
			res.close();
			ps.close();
			connection.close();
			res = null;
			ps = null;
			connection = null;
			bulletin = null;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return results;
	}

	/**
	 * 
	 * @param query
	 * @return
	 */
	public List<Status> searchStatus(String query) {
		if (query == null) {
			return null;
		}
		
		
		List<Status> results = new ArrayList<>();
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(
					"select * from failure WHERE UPPER(componentName) like UPPER(?) or UPPER(processorType) like UPPER(?) or UPPER(componentType) like UPPER(?)  LIMIT ?");
			ps.setString(1, "%" + query + "%");
			ps.setString(2, "%" + query + "%");
			ps.setString(3, "%" + query + "%");
			ps.setInt(4, Integer.parseInt(querylimit));
			ResultSet res = ps.executeQuery();
			Status status = null;
			while (res.next()) {
				status = new Status();
				status.setActiveRemotePortCount(res.getString("activeRemotePortCount"));
				status.setActiveThreadCount(res.getString("activeThreadCount"));
				status.setActorHostname(res.getString("actorHostname"));
				status.setApplication(res.getString("application"));
				status.setAverageLineageDuration(res.getString("averagelineageduration"));
				status.setAverageLineageDurationMS(res.getString("averagelineagedurationms"));
				status.setBackPressureBytesThreshold(res.getString("backpressurebytesthreshold"));
				status.setBackPressureObjectThreshold(res.getString("backpressureobjectthreshold"));
				status.setBytesRead(res.getString("bytesread"));
				status.setBytesReceived(res.getString("bytesreceived"));
				status.setBytesSent(res.getString("bytessent"));
				status.setBytesTransferred(res.getString("bytestransferred"));
				status.setBytesWritten(res.getString("byteswritten"));
				status.setComponentId(res.getString("componentid"));
				status.setComponentName(res.getString("componentname"));
				status.setComponentType(res.getString("componenttype"));
				status.setDestinationId(res.getString("destinationId"));
				status.setDestinationName(res.getString("destinationName"));
				status.setFlowFilesReceived(res.getString("flowfilesreceived"));
				status.setFlowFilesRemoved(res.getString("flowfilesremoved"));
				status.setFlowFilesSent(res.getString("flowfilessent"));
				status.setFlowFilesTransferred(res.getString("flowfilestransferred"));
				status.setInactiveRemotePortCount(res.getString("inactiveremoteportcount"));
				status.setInputBytes(res.getString("inputBytes"));
				status.setInputContentSize(res.getString("inputcontentsize"));
				status.setInvocations(res.getString("invocations"));
				status.setIsBackPressureEnabled(res.getString("isbackpressureenabled"));
				status.setMaxQueuedBytes(res.getString("maxqueuedbytes"));
				status.setMaxQueuedCount(res.getString("maxqueuedcount"));
				status.setTimestampMillis(res.getString("timestampmillis"));
				status.setTimestamp(res.getString("timestamp"));
				status.setProcessorType(res.getString("processorType"));
				status.setParentId(res.getString("parentId"));
				status.setPlatform(res.getString("platform"));
				status.setProcessingNanos(res.getString("processingnanos"));
				status.setReceivedContentSize(res.getString("receivedcontentsize"));
				status.setReceivedCount(res.getString("receivedcount"));
				status.setQueuedBytes(res.getString("queuedbytes"));
				status.setQueuedContentSize(res.getString("queuedcontentsize"));
				status.setQueuedCount(res.getString("queuedcount"));
				status.setSentContentSize(res.getString("sentcontentsize"));
				status.setSentCount(res.getString("sentcount"));
				status.setSourceId(res.getString("sourceid"));
				status.setSourceName(res.getString("sourcename"));
				status.setStatusId(res.getString("statusid"));
				status.setInputCount(res.getString("inputcount"));
				status.setOutputBytes(res.getString("outputbytes"));
								
				results.add(status);
			}
			res.close();
			ps.close();
			connection.close();
			res = null;
			ps = null;
			connection = null;
			status = null;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return results;
	}

	/**
	 * metrics
	 * @param query
	 * @return
	 */
	public List<Metric> searchMetrics() {
		
		List<Metric> results = new ArrayList<>();
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(
					"select * from metrics LIMIT ? ORDER BY timestamp DESC");
			ps.setInt(1, Integer.parseInt(querylimit));
			ResultSet res = ps.executeQuery();
			Metric metric = null;
			while (res.next()) {
				metric = new Metric();
				metric.setActivethreads(res.getInt("activeThreads"));
				metric.setAvailablecores(res.getInt("availableCores"));
				metric.setBytesqueued(res.getInt("bytesQueued"));
				metric.setBytesreadlast5minutes(res.getInt("BytesReadLast5Minutes"));
				metric.setBytesreceivedlast5minutes(res.getInt("BytesReceivedLast5Minutes"));
				metric.setByteswrittenlast5minutes(res.getInt("BytesWrittenLast5Minutes"));
				metric.setFlowfilesqueued(res.getInt("FlowFilesQueued"));
				metric.setFlowfilesreceivedlast5minutes(res.getInt("FlowFilesReceivedLast5Minutes"));
				metric.setFlowfilessentlast5minutes(res.getInt("FlowFilesSentLast5Minutes"));
				metric.setJvmdaemon_thread_count(res.getInt("JVMDaemon_Thread_Count"));
				metric.setJvmfile_descriptor_usage(res.getInt("JVMFile_Descriptor_USage"));
				metric.setJvmgcruns(res.getInt("JVMGCRUNS"));
				metric.setJvmheap_usage(res.getInt("JVMHeap_usage"));
				metric.setJvmheap_used(res.getInt("JVMHeap_Used"));
				metric.setJvmnon_heap_usage(res.getInt("JVMNON_Heap_Usage"));
				metric.setJvmthread_count(res.getInt("JVMThread_Count"));
				metric.setJvmthread_statesblocked(res.getInt("JVMThread_statesblocked"));
				metric.setJvmthread_statesrunnable(res.getInt("JVMThread_statesRunnable"));
				metric.setJvmthread_statesterminated(res.getInt("JVMThread_statesTerminated"));
				metric.setJvmthread_statestimed_waiting(res.getInt("JVMThread_statestimed_Waiting"));
				metric.setJvmuptime(res.getInt("JVMuptime"));
				metric.setLoadaverage1min(res.getInt("LoadAverage1Min"));
				metric.setTimestamp(res.getInt("Timestamp"));
				metric.setTotaltaskdurationnanoseconds(res.getInt("TotalTaskDurationNanoSeconds"));
				metric.setTotaltaskdurationseconds(res.getInt("TotalTaskDurationSeconds"));
								
				results.add(metric);
			}
			res.close();
			ps.close();
			connection.close();
			res = null;
			ps = null;
			connection = null;
			metric = null;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return results;
	}
}
