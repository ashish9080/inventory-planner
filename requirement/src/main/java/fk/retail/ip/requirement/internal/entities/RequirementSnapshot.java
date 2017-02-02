package fk.retail.ip.requirement.internal.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

/**
 * Created by nidhigupta.m on 27/01/17.
 */


@Entity
@XmlRootElement
@Getter
@NoArgsConstructor
@Immutable
@Table(name = "REQUIREMENT_SNAPSHOT")
public class RequirementSnapshot extends ReadOnlyEntity {

    private String forecast;

    private int inventoryQty;

    private int qoh;

    private int pendingPoQty;

    private int openReqQty;

    private int iwitIntransitQty;

    private String policy;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Group group;


}
