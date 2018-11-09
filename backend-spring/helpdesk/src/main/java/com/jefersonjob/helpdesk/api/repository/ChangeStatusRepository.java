package com.jefersonjob.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jefersonjob.helpdesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {
	
	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);

}
