package com.sk.covid19trackerworldwide.controllers;

import com.sk.covid19trackerworldwide.models.LocationStats;
import com.sk.covid19trackerworldwide.sercices.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController
{
    @Autowired
    CoronaVirusDataService coronaVirusDataService;
    @GetMapping("/")
    public String Home(Model model)
    {
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int  totalReportedCases =allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        return "home";
    }

}
