// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This interface represents an entry of a [PortCandidateSet] and provides access to the actual [PortCandidate] instance and the maximum number of edges allowed to connect to it.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateSetEntry">Online Documentation</a>
 */
external interface IPortCandidateSetEntry : YObject {
/**
 * Gets the maximum number of edges allowed to connect to the [PortCandidate] associated with this [IPortCandidateSetEntry].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateSetEntry%23connections">Online Documentation</a>
 */
val connections: Int
/**
 * Gets the actual [PortCandidate] associated with this [IPortCandidateSetEntry].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortCandidateSetEntry%23portCandidate">Online Documentation</a>
 */
val portCandidate: PortCandidate

companion object : InterfaceMetadata<IPortCandidateSetEntry> {
}
}
