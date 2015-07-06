package org.bahmni.reports.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = DiagnosisReportConfig.class, name = "diagnosisReport"),
        @JsonSubTypes.Type(value = SqlReportConfig.class, name = "sqlReport"),
        @JsonSubTypes.Type(value = CodedObsCountConfig.class, name = "codedObsCountReport"),
        @JsonSubTypes.Type(value = ObsTemplateConfig.class, name = "obsTemplateReport"),
        @JsonSubTypes.Type(value = ObsValueCountConfig.class, name = "obsValueCountReport"),
        @JsonSubTypes.Type(value = ObsCountByConceptClassConfig.class, name = "obsCountByConceptClassReport"),
        @JsonSubTypes.Type(value = CodedObsByCodedObsReportConfig.class, name = "codedObsByCodedObsReport"),
        @JsonSubTypes.Type(value = MultipleCodedObsByCodedObsReportConfig.class, name = "multipleCodedObsByCodedObsReport"),
        @JsonSubTypes.Type(value = NumericConceptValuesConfig.class, name = "numericConceptValuesReport"),
        @JsonSubTypes.Type(value = DateConceptValuesConfig.class, name = "dateConceptValuesReport"),
        @JsonSubTypes.Type(value = PatientsWithLabtestResultsConfig.class, name = "patientsWithLabtestResultsReport"),
        @JsonSubTypes.Type(value = IpdPatientsConfig.class, name = "ipdPatientsReport"),
        @JsonSubTypes.Type(value = Config.class, name = "config"), })
public interface Config {
}
