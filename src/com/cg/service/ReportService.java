package com.cg.service;

import com.cg.bean.DayReport;
import com.cg.bean.GameReport;
import com.cg.bean.PlayerReport;

public interface ReportService {

	GameReport gameWiseReport(String gameName);

	PlayerReport playerWiseReport(String playerName);

	DayReport dayWiseReport(String dayName);

}
