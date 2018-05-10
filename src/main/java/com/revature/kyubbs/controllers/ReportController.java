package com.revature.kyubbs.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.kyubbs.models.Report;
import com.revature.kyubbs.services.ReportService;

@CrossOrigin
@RestController
@RequestMapping("/report")
public class ReportController {

	@Autowired
	ReportService service;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Report> findAllReports() {
		return service.findAllReports();
	}

	@GetMapping(value = "id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Report findReportById(@PathVariable("id") Long id) {
		return service.findReportById(id);
	}
	
	@GetMapping(value = "ip/{ip}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Report findReportByIp(@PathVariable("ip") String ip) {
		return service.findReportByIp(ip);
	}

	@GetMapping(value = "postid/{postid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Report findReportByPostId(@PathVariable("postid") int id) {
		return service.findReportByPostId(id);
	}

	@GetMapping(value = "threadid/{threadid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Report findReportByThreadId(@PathVariable("threadid") int id) {
		return service.findReportByThreadId(id);
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Report addReport(@Valid @RequestBody Report r) {
		return service.addReport(r);
	}

	@PatchMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Report updateReport(@Valid @RequestBody Report r) {
		return service.updateReportById(r);
	}

	@DeleteMapping(value="/delete/{id}")
	public void deleteReport(Long id) {
		service.deleteReportById(id);
	}
}
