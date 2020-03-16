package com.harmonia.schemas

import net.corda.core.schemas.MappedSchema
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

object AcceptanceChecklistProposalState
object AcceptanceChecklistProposalStateV1 : MappedSchema(
        schemaFamily = AcceptanceChecklistProposalState::class.java,
        version = 1,
        mappedTypes = listOf(PersistChecklist::class.java)
) {
    @Entity
    @Table(name = "AP_CHECKLIST")
    class PersistChecklist(
            @Column(name ="Linear_Id")
            var linearId : String,
            @Column(name ="TestPlanLinear_Id")
            var testPlanRef : String,
            @Column(name ="TestCase_Id")
            var testCaseId : String,
            @Column(name ="Description")
            var description : String,
            @Column(name ="Criteria")
            var criteria : String,
            @Column(name ="TestCaseCreatedBy")
            var testCaseCreatedBy : String,
            @Column(name = "TestCaseStatus")
            var testCaseStatus : String,
            @Column(name ="TestCaseAcceptance")
            var testCaseAcceptance : String,
            @Column(name = "TestCaseAcceptedBy")
            var testCaseAcceptedBy : String,
            @Column(name = "TestCasePlanComment")
            var testCasePlanComment : String,
            @Column(name = "TestCaseExecutionStatus")
            var testCaseExecutionStatus : String,
            @Column(name ="TestCaseResultAcceptance")
            var testCaseResultAcceptance : String,
            @Column(name ="testCaseResultComment")
            var testCaseResultComment : String
    )


}