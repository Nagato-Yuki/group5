package th.ac.kmitl.science.comsci.example.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.*;

public class ExchangedDocumentTest {
    
    @Test
    public void exchangedDocumentTest(){
        int id=123;
        String name="TaxVoince";
        int typeCode=1;
        Date currentDate = new Date();
        SimpleDateFormat isoDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        String currentDateString=isoDateFormat.format(currentDate);
        String issueDateTime=currentDateString;
        String purpose="TIV";
        int purposeCode=02;
        int globalId=123;
        String creationDateTime=currentDateString;
        String includedNote="nothing is wrong";
        String subject="create tax invoice";
        String content="Craea by a company";
        ExchangedDocument headforms=new ExchangedDocument();

        headforms.setId(id);
        headforms.setName(name);
        headforms.setTypeCode(typeCode);
        headforms.setIssueDateTime(issueDateTime);
        headforms.setPurpose(purpose);
        headforms.setPurposeCode(purposeCode);
        headforms.setGlobalId(globalId);
        headforms.setCreationDateTime(creationDateTime);
        headforms.setIncludedNote(includedNote);
        headforms.setSubject(subject);
        headforms.setContent(content);
        
        Assert.assertEquals(headforms.getId(),id);
        Assert.assertEquals(headforms.getName(),name);
        Assert.assertEquals(headforms.getTypeCode(),typeCode);
        Assert.assertEquals(headforms.getIssueDateTime(),issueDateTime);
        Assert.assertEquals(headforms.getPurpose(),purpose);
        Assert.assertEquals(headforms.getPurposeCode(),purposeCode);
        Assert.assertEquals(headforms.getGlobalId(),globalId);
        Assert.assertEquals(headforms.getCreationDateTime(),creationDateTime);
        Assert.assertEquals(headforms.getIncludedNote(),includedNote);
        Assert.assertEquals(headforms.getSubject(),subject);
        Assert.assertEquals(headforms.getContent(),content);     
    }
    
}
