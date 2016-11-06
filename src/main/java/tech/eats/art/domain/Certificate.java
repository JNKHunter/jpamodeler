/**
 * This file was generated by the JPA Modeler
 */
package tech.eats.art.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;

/**
 * @author John
 */
@Embeddable
public class Certificate implements Serializable {

    @Basic
    private String name;

    @Basic
    private String issueDate;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIssueDate() {
        return this.issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

}
