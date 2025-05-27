// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enumeration for the different possible [IPortCandidate.validity] states.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateValidity">Online Documentation</a>
 */
external sealed class PortCandidateValidity: YEnum<PortCandidateValidity> {
   companion object: EnumMetadata<PortCandidateValidity> {
       /**
 * The candidate is valid and can be used to connect an edge to.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateValidity%23VALID">Online Documentation</a>
 */
val VALID: PortCandidateValidity

/**
 * The candidate should not be used to connect an edge to.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateValidity%23INVALID">Online Documentation</a>
 */
val INVALID: PortCandidateValidity

/**
 * The candidate cannot be used to create a port, instead [IPortCandidate.getPortCandidateAt] needs to be called to obtain a [IPortCandidate] that is either [VALID] or [INVALID].
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateValidity%23DYNAMIC">Online Documentation</a>
 */
val DYNAMIC: PortCandidateValidity
   }
}
