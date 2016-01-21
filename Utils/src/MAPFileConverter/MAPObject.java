package MAPFileConverter;

public class MAPObject {
	
	private ApplicationObject appObject;
	private IndivObject indivObject;
	private ReferenceObject refObject;
	
	public MAPObject() {
		super();
	}

	public MAPObject(ApplicationObject appObject, IndivObject indivObject,
			ReferenceObject refObject) {
		super();
		this.appObject = appObject;
		this.indivObject = indivObject;
		this.refObject = refObject;
	}

	public ApplicationObject getAppObject() {
		return appObject;
	}

	public void setAppObject(ApplicationObject appObject) {
		this.appObject = appObject;
	}

	public IndivObject getIndivObject() {
		return indivObject;
	}

	public void setIndivObject(IndivObject indivObject) {
		this.indivObject = indivObject;
	}

	public ReferenceObject getRefObject() {
		return refObject;
	}

	public void setRefObject(ReferenceObject refObject) {
		this.refObject = refObject;
	}
	
	
}
