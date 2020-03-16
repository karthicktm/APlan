package com.harmonia.model

import net.corda.core.identity.Party
import net.corda.core.serialization.CordaSerializable
import java.time.Instant

@CordaSerializable
data class TestPlanDetails(
        val programId : String,
        val fasId : String,
        val siteDetails : SiteDetails,
        val creationTime : Instant,
        val createdBy : Party,
        val overAllTestStatus : Status
)

@CordaSerializable
data class SiteDetails(
        val siteId : String,
        val stageId : Stages,
        val checklistId : String
)

@CordaSerializable
data class TestCaseDetails(
        val testCaseId : String,
        val description : String,
        val criteria : String,
        val testCaseCreateBy : Party,
        val testCaseStatus : Status,
        val testCaseAcceptance : Status,
        val testCaseAcceptedBy : Party,
        val testCasePlanComment : String,
        val testCaseExecutionStatus : Status,
        val testCaseResultAcceptance : Status,
        val testCaseResultComment : String
)

@CordaSerializable
enum class Stages {
      CIVIL_WORKS,
      INSTALLATION,
      INTEGRATION,
      FINE_TUNING
}

@CordaSerializable
enum class Status {
    PROPOSED,
    ACCEPTED,
    EXECUTING,
    REJECTED,
    PASS,
    FAIL,
    NOT_EXECUTED,
    CLOSED
}



