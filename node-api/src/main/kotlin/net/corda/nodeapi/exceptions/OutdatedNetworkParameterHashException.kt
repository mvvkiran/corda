package net.corda.nodeapi.exceptions

import net.corda.core.CordaRuntimeException
import net.corda.core.crypto.SecureHash
import net.corda.core.flows.ClientRelevantError

class OutdatedNetworkParameterHashException(old: SecureHash, new: SecureHash) : CordaRuntimeException(TEMPLATE.format(old, new)), ClientRelevantError {

    private companion object {
        private const val TEMPLATE = "Refused to accept parameters with hash %s because network map advertises update with hash %s. Please check newest version"
    }
}