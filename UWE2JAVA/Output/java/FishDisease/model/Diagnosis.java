package FishDisease.model;


public class Diagnosis {
	private String sympton;
	private String name;
	private String diseaseInfo;

	public String getSympton() {
		return sympton;
	}

	public String getName() {
		return name;
	}

	public String getDiseaseInfo() {
		return diseaseInfo;
	}

	public void setSympton(String sympton) {
		this.sympton = sympton;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDiseaseInfo(String diseaseInfo) {
		this.diseaseInfo = diseaseInfo;
	}
}
