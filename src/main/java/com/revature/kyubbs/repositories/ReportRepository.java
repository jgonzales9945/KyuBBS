package com.revature.kyubbs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.kyubbs.models.*;

public interface ReportRepository extends JpaRepository<Report, Long> {

	public Report findReportByIp(String ip);

	public Report findReportByPostId(int id);

	public Report findReportByThreadId(int id);

}
