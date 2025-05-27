// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.layout.ItemCollection
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [SelfLoopCalculator].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculatorData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [SelfLoopCalculatorData] which helps configuring [SelfLoopCalculator].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculatorData%23SelfLoopCalculatorData-constructor-SelfLoopCalculatorData">Online Documentation</a>
 */
external open class SelfLoopCalculatorData  () : LayoutData {

/**
 * Gets or sets the mapping from edges to their minimum distance to the next edge and to node sides.
 * @see [SelfLoopCalculator.MINIMUM_EDGE_DISTANCE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculatorData%23minimumEdgeDistances">Online Documentation</a>
 */
final var minimumEdgeDistances: ItemMapping<IEdge, Double>
/**
 * Gets or sets the mapping from edges to the minimum length of their first segment.
 * @see [SelfLoopCalculator.MINIMUM_FIRST_SEGMENT_LENGTH_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculatorData%23minimumFirstSegmentLengths">Online Documentation</a>
 */
final var minimumFirstSegmentLengths: ItemMapping<IEdge, Double>
/**
 * Gets or sets the mapping from edges to the minimum length of their last segment.
 * @see [SelfLoopCalculator.MINIMUM_LAST_SEGMENT_LENGTH_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculatorData%23minimumLastSegmentLengths">Online Documentation</a>
 */
final var minimumLastSegmentLengths: ItemMapping<IEdge, Double>
/**
 * Gets or sets the mapping from nodes to their minimum distance to self-loop edges.
 * @see [SelfLoopCalculator.MINIMUM_NODE_DISTANCE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculatorData%23minimumNodeDistances">Online Documentation</a>
 */
final var minimumNodeDistances: ItemMapping<INode, Double>
/**
 * Gets or sets the mapping from edges to the minimum length of their octilinear segments.
 * @see [SelfLoopCalculator.MINIMUM_OCTILINEAR_SEGMENT_LENGTH_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculatorData%23minimumOctilinearSegmentLengths">Online Documentation</a>
 */
final var minimumOctilinearSegmentLengths: ItemMapping<IEdge, Double>
/**
 * Gets or sets the collection of edges that are routed in an octilinear fashion.
 * @see [SelfLoopCalculator.OCTILINEAR_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculatorData%23octilinearEdges">Online Documentation</a>
 */
final var octilinearEdges: ItemCollection<IEdge>

companion object : ClassMetadata<SelfLoopCalculatorData> {
}
}

inline fun SelfLoopCalculatorData(
    block: SelfLoopCalculatorData.() -> Unit
): SelfLoopCalculatorData {
    return SelfLoopCalculatorData()
        .apply(block)
}
