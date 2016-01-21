package MAPFileConverter;

public class ReferenceObject {
	
	private String cat;
	private String idNo;
	private String refName;
	private String refMobileNo;
	private String idType;
	private String  refEmailAdd;
	
	public ReferenceObject() {
		super();
	}

	public ReferenceObject(String cat, String idNo, String refName,
			String refMobileNo, String idType, String refEmailAdd) {
		super();
		this.cat = cat;
		this.idNo = idNo;
		this.refName = refName;
		this.refMobileNo = refMobileNo;
		this.idType = idType;
		this.refEmailAdd = refEmailAdd;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getRefName() {
		return refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}

	public String getRefMobileNo() {
		return refMobileNo;
	}

	public void setRefMobileNo(String refMobileNo) {
		this.refMobileNo = refMobileNo;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getRefEmailAdd() {
		return refEmailAdd;
	}

	public void setRefEmailAdd(String refEmailAdd) {
		this.refEmailAdd = refEmailAdd;
	}
	
	

}
