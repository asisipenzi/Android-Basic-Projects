package com.androidbasics.org;

public class ReportCard {
	char englishGrade;
	char mathGrade;
	char chemistryGrade;
	char computerScienceGrade;
	char businessStudiesGrade;
	char historyGrade;
	char biologyGrade;
	
	public ReportCard(char english, char math, char chemistry, char computerScience,
			char businessStudies, char history, char biology) {
//		super();
		englishGrade = english;
		mathGrade = math;
		chemistryGrade = chemistry;
		computerScienceGrade = computerScience;
		businessStudiesGrade = businessStudies;
		historyGrade = history;
		biologyGrade = biology;
	}

	private char getEnglishGrade() {
		return englishGrade;
	}

	private void setEnglishGrade(char englishGrade) {
		this.englishGrade = englishGrade;
	}

	private char getMathGrade() {
		return mathGrade;
	}

	private void setMathGrade(char mathGrade) {
		this.mathGrade = mathGrade;
	}

	private char getChemistryGrade() {
		return chemistryGrade;
	}

	private void setChemistryGrade(char chemistryGrade) {
		this.chemistryGrade = chemistryGrade;
	}

	private char getComputerScienceGrade() {
		return computerScienceGrade;
	}

	private void setComputerScienceGrade(char computerScienceGrade) {
		this.computerScienceGrade = computerScienceGrade;
	}

	private char getBusinessStudiesGrade() {
		return businessStudiesGrade;
	}

	private void setBusinessStudiesGrade(char businessStudiesGrade) {
		this.businessStudiesGrade = businessStudiesGrade;
	}

	private char getHistoryGrade() {
		return historyGrade;
	}

	private void setHistoryGrade(char historyGrade) {
		this.historyGrade = historyGrade;
	}

	private char getBiologyGrade() {
		return biologyGrade;
	}

	private void setBiologyGrade(char biologyGrade) {
		this.biologyGrade = biologyGrade;
	}

	@Override
	public String toString() {
		return "ReportCard\n" +
				"\nEnglishGrade= " + getEnglishGrade() + 
				"\nMathGrade= " + getMathGrade() + 
				"\nChemistryGrade= "	+ getChemistryGrade()+ 
				"\nComputerScienceGrade= " + getComputerScienceGrade() + 
				"\nBusinessStudiesGrade= " + getBusinessStudiesGrade() + 
				"\nHistoryGrade= " + getHistoryGrade() + 
				"\nBiologyGrade= " + getBiologyGrade();
	}
	
		
	

}
