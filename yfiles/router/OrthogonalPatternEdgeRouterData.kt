// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.AbortHandler
import yfiles.collections.ICollection
import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.layout.DpKeyItemCollection
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.PortCandidate
import yfiles.layout.PortCandidateSet
import yfiles.layout.PortConstraint

/**
 * Specifies custom data for the [OrthogonalPatternEdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouterData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [OrthogonalPatternEdgeRouterData] which helps configuring [OrthogonalPatternEdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouterData%23OrthogonalPatternEdgeRouterData-constructor-OrthogonalPatternEdgeRouterData">Online Documentation</a>
 */
external open class OrthogonalPatternEdgeRouterData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouterData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the collection of edges affected by this router.
 * @see [OrthogonalPatternEdgeRouter.affectedEdgesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouterData%23affectedEdges">Online Documentation</a>
 */
final var affectedEdges: DpKeyItemCollection<IEdge>
/**
 * Gets or sets a mapping from nodes to their [PortCandidateSet].
 * @see [PortCandidateSet.NODE_PORT_CANDIDATE_SET_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouterData%23nodePortCandidateSets">Online Documentation</a>
 */
final var nodePortCandidateSets: ItemMapping<INode, PortCandidateSet>
/**
 * Gets or sets a mapping from edges to a collection of their source port [candidates][PortCandidate].
 * @see [PortCandidate.SOURCE_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouterData%23sourcePortCandidates">Online Documentation</a>
 */
final var sourcePortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their source [PortConstraint].
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouterData%23sourcePortConstraints">Online Documentation</a>
 */
final var sourcePortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to a collection of their target port [candidates][PortCandidate].
 * @see [PortCandidate.TARGET_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouterData%23targetPortCandidates">Online Documentation</a>
 */
final var targetPortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their target [PortConstraint].
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouterData%23targetPortConstraints">Online Documentation</a>
 */
final var targetPortConstraints: ItemMapping<IEdge, PortConstraint>

companion object : ClassMetadata<OrthogonalPatternEdgeRouterData> {
}
}

inline fun OrthogonalPatternEdgeRouterData(
    block: OrthogonalPatternEdgeRouterData.() -> Unit
): OrthogonalPatternEdgeRouterData {
    return OrthogonalPatternEdgeRouterData()
        .apply(block)
}
