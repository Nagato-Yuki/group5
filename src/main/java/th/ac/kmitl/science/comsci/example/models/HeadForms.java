package th.ac.kmitl.science.comsci.example.models;

public class HeadForms {
    
    private String exchangedDocument;
    private int id;
    private String name;
    private int typeCode;
    private String issueDateTime;
    private String purpose;
    private int purposeCode;
    private int globalId;
    private String creationDateTime;
    private String includedNote;
    private String Subject;
    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    
    public int getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }

    
    public String getIncludedNote() {
        return includedNote;
    }

    public void setIncludedNote(String includedNote) {
        this.includedNote = includedNote;
    }

    
    public String getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    public int getGlobalId() {
        return globalId;
    }

    public void setGlobalId(int GlobalId) {
        this.globalId = GlobalId;
    }

    
    public int getPurposeCode() {
        return purposeCode;
    }

    public void setPurposeCode(int PurposeCode) {
        this.purposeCode = PurposeCode;
    }


    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String Purpose) {
        this.purpose = Purpose;
    }

    
    public String getIssueDateTime() {
        return issueDateTime;
    }

    public void setIssueDateTime(String IssueDateTime) {
        this.issueDateTime = IssueDateTime;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }
    

    public String getExchangedDocument() {
        return exchangedDocument;
    }

    public void setExchangedDocument(String exchangedDocument) {
        this.exchangedDocument = exchangedDocument;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
}
