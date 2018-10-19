
package report;

import java.util.Date;

public abstract class SystemReport {
    
    public final void generateReport(Date beginDate, Date endDate){
        getSystemData(beginDate, endDate);
        reportSystemFileType();
    }
    
    protected void getSystemData(Date beginDate, Date endDate){        
        System.out.println("Obteve os dados do sistema do dia "+ beginDate.toString() + "até "+endDate.toString() +" .");
    }
    
    protected abstract void reportSystemFileType();
}
