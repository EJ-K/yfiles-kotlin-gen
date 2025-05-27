// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface that provides more information about a potential label geometry (a candidate) to an automatic labeling algorithm.
 * @see [ILabelCandidateDescriptorProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelCandidateDescriptor">Online Documentation</a>
 */
external interface ILabelCandidateDescriptor : YObject {
/**
 * Gets a penalty value that is used by labeling algorithms to judge the severity if this candidate overlaps with an edge path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelCandidateDescriptor%23edgeOverlapPenalty">Online Documentation</a>
 */
val edgeOverlapPenalty: Double
/**
 * Gets a value indicating whether this candidate is deemed an external candidate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelCandidateDescriptor%23externalCandidate">Online Documentation</a>
 */
val externalCandidate: Boolean
/**
 * Gets a penalty value that is used by labeling algorithms to judge the severity if this label candidate overlaps with a node's bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelCandidateDescriptor%23nodeOverlapPenalty">Online Documentation</a>
 */
val nodeOverlapPenalty: Double
/**
 * Gets a profit value that is used by labeling algorithms to judge how good this label candidate is.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelCandidateDescriptor%23profit">Online Documentation</a>
 */
val profit: Double

companion object : InterfaceMetadata<ILabelCandidateDescriptor> {
}
}
