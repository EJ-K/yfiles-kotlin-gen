// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.EdgeDpKey
import yfiles.lang.ClassMetadata

/**
 * A [SelfLoopRouter] routes the self-loops (reflexive edges) of a graph.
 * @see [MultiStageLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopRouter">Online Documentation</a>
 * 
 * @constructor Creates a new [SelfLoopRouter] with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopRouter%23SelfLoopRouter-constructor-SelfLoopRouter">Online Documentation</a>
 */
external open class SelfLoopRouter  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets the number of points that are used for rounding the corners of the self-loops.
 * 
 * Default value - `2`
 * @throws ArgumentError if the specified point count is less than `1`
 * @see [layoutStyle]
 * @see [SelfLoopStyle.ROUNDED]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopRouter%23cornerApproximationPointsCount">Online Documentation</a>
 */
open var cornerApproximationPointsCount: Int
/**
 * Gets or sets whether or not this algorithm should keep all self-loop routes.
 * 
 * Default value - `false`. Self-loops get a new route.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopRouter%23keepAllSelfLoopRoutes">Online Documentation</a>
 */
open var keepAllSelfLoopRoutes: Boolean
/**
 * Gets or sets the layout style of the self-loops.
 * 
 * Default value - [SelfLoopStyle.ROUNDED]
 * @throws ArgumentError if the specified style is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopRouter%23layoutStyle">Online Documentation</a>
 */
open var layoutStyle: SelfLoopStyle
/**
 * Gets or sets the distance between two self-loops incident to the same node.
 * 
 * Default value - `5`
 * @throws ArgumentError if the specified distance is negative
 * @see [SelfLoopStyle.ROUNDED]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopRouter%23lineDistance">Online Documentation</a>
 */
open var lineDistance: Double
/**
 * Gets or sets whether or not the algorithm chooses the side of the self-loop depending on the incident edges.
 * 
 * Default value - `true`. The corner of the nodes where self-loops are placed is chosen considering incident edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopRouter%23smartSelfLoopPlacement">Online Documentation</a>
 */
open var smartSelfLoopPlacement: Boolean
/**
 * Delegates the arrangement of nodes and edges to the [core layout algorithm][LayoutStageBase.coreLayout] and routes the self-loops.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopRouter%23SelfLoopRouter-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Calculates the routes of the self-loops in the given graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopRouter%23SelfLoopRouter-method-layoutSelfLoops">Online Documentation</a>
 */
 open protected   fun layoutSelfLoops( graph: LayoutGraph )

companion object : ClassMetadata<SelfLoopRouter> {
/**
 * A data provider key for determining which self-loops should keep their current path.
 * @see [keepAllSelfLoopRoutes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopRouter%23KEEP_SELF_LOOP_LAYOUT_DP_KEY">Online Documentation</a>
 */
 val KEEP_SELF_LOOP_LAYOUT_DP_KEY: EdgeDpKey<Boolean>
}
}

inline fun SelfLoopRouter(
    block: SelfLoopRouter.() -> Unit
): SelfLoopRouter {
    return SelfLoopRouter()
        .apply(block)
}
