// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.IDataMap
import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * The [CompactNodePlacer] produces a compact placement of the children.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new [CompactNodePlacer] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactNodePlacer%23CompactNodePlacer-constructor-CompactNodePlacer">Online Documentation</a>
 */
external open class CompactNodePlacer  () : NodePlacerBase {

/**
 * Gets or sets the horizontal distance between nodes or subtrees.
 * 
 * Default value - `20`
 * @throws ArgumentError if the specified distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactNodePlacer%23horizontalDistance">Online Documentation</a>
 */
open var horizontalDistance: Double
/**
 * Gets or sets the minimum length for the first segment of an edge.
 * 
 * Default value - `20`
 * @throws ArgumentError if the minimum segment length is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactNodePlacer%23minimumFirstSegmentLength">Online Documentation</a>
 */
open var minimumFirstSegmentLength: Double
/**
 * Gets or sets the minimum length for the last segment of an edge.
 * 
 * Default value - `20`
 * @throws ArgumentError if the minimum segment length is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactNodePlacer%23minimumLastSegmentLength">Online Documentation</a>
 */
open var minimumLastSegmentLength: Double
/**
 * Gets or sets the preferred aspect ratio (width/height) for the subtrees.
 * 
 * Default value - `1`
 * @throws ArgumentError if the specified aspect ratio is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactNodePlacer%23preferredAspectRatio">Online Documentation</a>
 */
open var preferredAspectRatio: Double
/**
 * Gets or sets the vertical distance between nodes or subtrees.
 * 
 * Default value - `20`
 * @throws ArgumentError if the specified distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactNodePlacer%23verticalDistance">Online Documentation</a>
 */
open var verticalDistance: Double
/**
 * Creates a [IProcessor].
 * @param [layouter] the current [TreeLayout] instance
 * @param [graph] the input graph
 * @param [currentRoot] the root node handled by this [INodePlacer]
 * @return a [IProcessor] instance or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactNodePlacer%23CompactNodePlacer-method-createProcessor">Online Documentation</a>
 */
 override   fun createProcessor( layouter: TreeLayout ,
 graph: LayoutGraph ,
 currentRoot: Node ):IProcessor?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactNodePlacer%23CompactNodePlacer-method-determineChildConnector">Online Documentation</a>
 */
 override   fun determineChildConnector( child: Node ):ParentConnectorDirection
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactNodePlacer%23CompactNodePlacer-method-determineChildConnectors">Online Documentation</a>
 */
 override   fun determineChildConnectors( localRoot: Node ,
 connectorMap: IDataMap<Node, ParentConnectorDirection> )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactNodePlacer%23CompactNodePlacer-method-placeSubtreeOfNode">Online Documentation</a>
 */
 override   fun placeSubtreeOfNode( localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):SubtreeShape

companion object : ClassMetadata<CompactNodePlacer> {
/**
 * A data acceptor key for storing/restoring the placement strategy of the children of nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactNodePlacer%23STRATEGY_MEMENTO_DP_KEY">Online Documentation</a>
 */
 val STRATEGY_MEMENTO_DP_KEY: NodeDpKey<CompactStrategyMemento>
}
}

inline fun CompactNodePlacer(
    block: CompactNodePlacer.() -> Unit
): CompactNodePlacer {
    return CompactNodePlacer()
        .apply(block)
}
