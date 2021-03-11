package FishDisease.model;


public class Diagnosis {
	private String diseaseInfo;
	private String name;
	private String sympton;

	public String getDiseaseInfo() {
		return diseaseInfo;
	}

	public String getName() {
		return name;
	}

	public String getSympton() {
		return sympton;
	}

	public void setDiseaseInfo(String diseaseInfo) {
		this.diseaseInfo = diseaseInfo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSympton(String sympton) {
		this.sympton = sympton;
	}
}
