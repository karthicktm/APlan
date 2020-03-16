package com.harmonia.states

import com.harmonia.contracts.TemplateContract
import com.harmonia.model.TestCaseDetails
import com.harmonia.model.TestPlanDetails
import net.corda.core.contracts.BelongsToContract
import net.corda.core.contracts.LinearState
import net.corda.core.contracts.UniqueIdentifier
import net.corda.core.identity.AbstractParty
import net.corda.core.identity.Party



@BelongsToContract(TemplateContract::class)
data class AcceptancePlanProposalState(
        override val linearId : UniqueIdentifier = UniqueIdentifier(),
        val testPlanDetails : TestPlanDetails,
        val proposeTo : Party,
        val checkListDetails : List<AcceptanceChecklistProposalState>
        ):LinearState{
    override val participants: List<AbstractParty> = listOf(testPlanDetails.createdBy,proposeTo)
}

@BelongsToContract(TemplateContract::class)
data class AcceptanceChecklistProposalState(
        override val linearId : UniqueIdentifier = UniqueIdentifier(),
        val testPlanId : UniqueIdentifier,
        val testCaseDetails : TestCaseDetails
):LinearState {
    override val participants: List<AbstractParty> = listOf(testCaseDetails.testCaseCreateBy, testCaseDetails.testCaseAcceptedBy)
}
