package com.harmonia.schemas

import com.harmonia.model.SiteDetails
import com.harmonia.model.Status
import net.corda.core.identity.Party
import net.corda.core.schemas.MappedSchema
import java.time.Instant
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

object AcceptancePlanProposalDetails

object AcceptancePlanProposalDetailsV1 : MappedSchema(
        schemaFamily = AcceptancePlanProposalDetails::class.java,
        version = 1,
        mappedTypes = listOf(PersistentPlanDetails::class.java)
) {
        @Entity
        @Table(name = "AP_DETAILS")
        class PersistentPlanDetails(
                @Column(name = "Linear_Id")
                var linearId : String,
                @Column(name = "Program_Id")
                var prgmId : String,
                @Column(name = "fasId")
                var fasId : String,
                @Column(name = "Site_Details")
                var siteDetails : String,
                @Column(name = "Creation_Time")
                var creationTime : Instant,
                @Column(name = "Created_By")
                var createdBy : String,
                @Column(name = "Overall_Status")
                var overallStatus : String,
                @Column(name = "Propose_To")
                var proposeTo : String,
                @Column(name = "Testcase_Details")
                var testCaseDetails : String
        )
}