package com.harmonia

import net.corda.core.flows.InitiatingFlow
import net.corda.core.flows.StartableByRPC
import net.corda.core.flows.StartableByService

@InitiatingFlow
@StartableByRPC
@StartableByService
class AcceptancePlanProposalFlow ()