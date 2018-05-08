package com.revature.kyubbs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.kyubbs.models.Report;
import com.revature.kyubbs.repositories.ReportRepository;

@Service
@Transactional
public class ReportServiceImpl implements ReportService {

	@Autowired
	ReportRepository reportRepo;

	@Override
	public List<Report> findAllReports() {
		return reportRepo.findAll();
	}

	@Override
	public Report findReportByIp(String ip) {
		return reportRepo.findReportByIp(ip);
	}

	@Override
	public Report findReportByPostId(int id) {
		return reportRepo.findReportByPostId(id);
	}

	@Override
	public Report findReportByThreadId(int id) {
		return reportRepo.findReportByThreadId(id);
	}

	@Override
	public Report addReport(Report r) {
		return reportRepo.save(r);
	}

	@Override
	public Report findReportById(Long id) {
		return reportRepo.getOne(id);
	}

	@Override
	public Report updateReportById(Report r) {
		return reportRepo.save(r);
	}

	@Override
	public void deleteReportById(Report r) {

		reportRepo.delete(r);

	}
}
