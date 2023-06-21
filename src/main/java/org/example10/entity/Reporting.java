package org.example10.entity;

import java.util.Arrays;

public class Reporting {
    private Reporter reporter;
    private ReportingDetail[] details;

    public Reporting(Reporter reporter, ReportingDetail[] details) {
        this.reporter = reporter;
        this.details = details;
    }

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public ReportingDetail[] getDetails() {
        return details;
    }

    public void setDetails(ReportingDetail[] details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Reporting{" +
                "reporter=" + reporter +
                ", details=" + Arrays.toString(details) +
                '}';
    }
}
