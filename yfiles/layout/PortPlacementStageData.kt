// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.ICollection
import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Id

/**
 * Specifies custom data for the [PortPlacementStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStageData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PortPlacementStageData] which helps configuring the [PortPlacementStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStageData%23PortPlacementStageData-constructor-PortPlacementStageData">Online Documentation</a>
 */
external open class PortPlacementStageData  () : LayoutData {

/**
 * Gets or sets a mapping from nodes to their [PortCandidateSet].
 * @see [PortCandidateSet.NODE_PORT_CANDIDATE_SET_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStageData%23nodePortCandidateSets">Online Documentation</a>
 */
final var nodePortCandidateSets: ItemMapping<INode, PortCandidateSet>
/**
 * Gets or sets a mapping from edges to a collection of their source [port candidates][PortCandidate].
 * @see [sourcePortConstraints]
 * @see [PortCandidate.SOURCE_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStageData%23sourcePortCandidates">Online Documentation</a>
 */
final var sourcePortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their source [PortConstraint].
 * @see [sourcePortCandidates]
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStageData%23sourcePortConstraints">Online Documentation</a>
 */
final var sourcePortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to an object representing their source port group.
 * @see [targetPortGroupIds]
 * @see [PortConstraintKeys.SOURCE_PORT_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStageData%23sourcePortGroupIds">Online Documentation</a>
 */
final var sourcePortGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to a collection of their target port [candidates][PortCandidate].
 * @see [targetPortConstraints]
 * @see [PortCandidate.TARGET_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStageData%23targetPortCandidates">Online Documentation</a>
 */
final var targetPortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their target [PortConstraint].
 * @see [targetPortCandidates]
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStageData%23targetPortConstraints">Online Documentation</a>
 */
final var targetPortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to an object representing their target port group.
 * @see [sourcePortGroupIds]
 * @see [PortConstraintKeys.TARGET_PORT_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStageData%23targetPortGroupIds">Online Documentation</a>
 */
final var targetPortGroupIds: ItemMapping<IEdge, Id>

companion object : ClassMetadata<PortPlacementStageData> {
}
}

inline fun PortPlacementStageData(
    block: PortPlacementStageData.() -> Unit
): PortPlacementStageData {
    return PortPlacementStageData()
        .apply(block)
}
