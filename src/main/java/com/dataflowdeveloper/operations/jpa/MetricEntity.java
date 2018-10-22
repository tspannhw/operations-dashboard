package com.dataflowdeveloper.operations.jpa;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
public class MetricEntity {

    //@Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
	private Long timestamp;
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
}

/***

Add a repo


import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MetricRepository extends CrudRepository<Metric, Long> {

    List<Metric> findBy(String lastName);
    List<Metric> findAll();
  Metric findOne();
 
}

@Bean
MetricRepository metricRepo;
https://spring.io/guides/gs/accessing-data-jpa/

*/