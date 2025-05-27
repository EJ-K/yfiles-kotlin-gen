// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.NodeList
import yfiles.algorithms.Rectangle2D
import yfiles.algorithms.YPoint
import yfiles.lang.ClassMetadata

/**
 * [FixNodeLayoutStage] fixes the initial position of either a *single* node or the alignment of the bounding box of several nodes (but not the positions of the individual nodes).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixNodeLayoutStage">Online Documentation</a>
 * 
 * @constructor Creates a new [FixNodeLayoutStage] instance with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixNodeLayoutStage%23FixNodeLayoutStage-constructor-FixNodeLayoutStage">Online Documentation</a>
 */
external open class FixNodeLayoutStage  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets the fix point calculation policy used in [calculateFixPoint] to determine which point in the corresponding rectangle should be considered fixed.
 * 
 * Default value - [FixPointPolicy.CENTER]
 * @throws ArgumentError if the specified policy is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixNodeLayoutStage%23fixPointPolicy">Online Documentation</a>
 */
open var fixPointPolicy: FixPointPolicy
/**
 * Gets or sets whether or not subgraph edges are taken into account when calculating the bounding box of the fixed nodes.
 * 
 * Default value - `false`. Subgraph edges are not taken into account.
 * @see [calculateBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixNodeLayoutStage%23includingEdges">Online Documentation</a>
 */
open var includingEdges: Boolean
/**
 * Gets or sets whether or not label geometries are taken into account when calculating the bounding box of the fixed nodes.
 * 
 * Default value - `false`. Label geometries are not taken into account.
 * @see [calculateBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixNodeLayoutStage%23includingLabels">Online Documentation</a>
 */
open var includingLabels: Boolean
/**
 * Delegates to the [core layout algorithm][LayoutStageBase.coreLayout] and moves the fixed point back to its initial location.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixNodeLayoutStage%23FixNodeLayoutStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Calculates the bounding box of the specified nodes.
 * @param [graph] the graph associated with the specified nodes
 * @param [fixedNodes] the list of nodes for which to determine the bounding box
 * @return the bounding box of the specified nodes
 * @see [includingEdges]
 * @see [includingLabels]
 * @see [calculateFixPoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixNodeLayoutStage%23FixNodeLayoutStage-method-calculateBounds">Online Documentation</a>
 */
 open protected   fun calculateBounds( graph: LayoutGraph ,
 fixedNodes: NodeList ):Rectangle2D
/**
 * Calculates the fix point of the specified rectangle according to the policy returned by [fixPointPolicy].
 * @param [bounds] the rectangle for which to determine the fix point
 * @return the fix point of the specified rectangle or `null` if nothing should be fixed
 * @throws ArgumentError if the current fix point policy is invalid
 * @see [fixPointPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixNodeLayoutStage%23FixNodeLayoutStage-method-calculateFixPoint(Rectangle2D)">Online Documentation</a>
 */
 open protected   fun calculateFixPoint( bounds: Rectangle2D ):YPoint?
/**
 * Calculates the fix point for the specified nodes in the specified graph.
 * @param [graph] the graph associated with the specified nodes
 * @param [fixedNodes] the list of nodes for which a fix point has to be determined
 * @return the fix point for the specified nodes in the specified graph
 * @see [fixPointPolicy]
 * @see [calculateBounds]
 * @see [calculateFixPoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixNodeLayoutStage%23FixNodeLayoutStage-method-calculateFixPoint(LayoutGraph,NodeList)">Online Documentation</a>
 */
 open protected   fun calculateFixPoint( graph: LayoutGraph ,
 fixedNodes: NodeList ):YPoint?

companion object : ClassMetadata<FixNodeLayoutStage> {
/**
 * A data provider key for determining the nodes that should be considered fixed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixNodeLayoutStage%23FIXED_NODE_DP_KEY">Online Documentation</a>
 */
 val FIXED_NODE_DP_KEY: NodeDpKey<Boolean>
}
}

inline fun FixNodeLayoutStage(
    block: FixNodeLayoutStage.() -> Unit
): FixNodeLayoutStage {
    return FixNodeLayoutStage()
        .apply(block)
}
