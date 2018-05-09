package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.*;

public interface ReportService {

	public List<Report> findAllReports();

	public Report findReportByIp(String ip);

	public Report findReportByPostId(Long id);

	public Report findReportByThreadId(Long id);

	public Report addReport(Report r);

	public Report findReportById(Long id);

	public Report updateReportById(Report r);

	public void deleteReportById(Report r);

}
