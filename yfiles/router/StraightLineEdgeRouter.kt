// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * This edge routing algorithm routes edges as straight-lines considering the specified [PortConstraint][yfiles.layout.PortConstraint]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouter">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [StraightLineEdgeRouter] with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouter%23StraightLineEdgeRouter-constructor-StraightLineEdgeRouter">Online Documentation</a>
 */
external open class StraightLineEdgeRouter  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets the key to register a [IDataProvider][yfiles.algorithms.IDataProvider] that provides the selected state of the edges of the graph.
 * 
 * Default value - [LayoutKeys.AFFECTED_EDGES_DP_KEY][yfiles.layout.LayoutKeys.AFFECTED_EDGES_DP_KEY]
 * @see [scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouter%23affectedEdgesDpKey">Online Documentation</a>
 */
open var affectedEdgesDpKey: EdgeDpKey<Boolean>
/**
 * Gets or sets the key to register a [IDataProvider][yfiles.algorithms.IDataProvider] that provides the selected state of the nodes of the graph.
 * 
 * Default value - [LayoutKeys.AFFECTED_NODES_DP_KEY][yfiles.layout.LayoutKeys.AFFECTED_NODES_DP_KEY]
 * @see [scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouter%23affectedNodesDpKey">Online Documentation</a>
 */
open var affectedNodesDpKey: NodeDpKey<Boolean>
/**
 * Gets or sets the (sub-)set of edges to be routed.
 * 
 * Default value - [Scope.ROUTE_ALL_EDGES]
 * @throws ArgumentError if the given argument is an unknown specifier
 * @see [affectedEdgesDpKey]
 * @see [affectedNodesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouter%23scope">Online Documentation</a>
 */
open var scope: Scope
/**
 * Routes the edges as straight-lines from their source to their target after invoking the [core layout algorithm][LayoutStageBase.applyLayoutCore].
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouter%23StraightLineEdgeRouter-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<StraightLineEdgeRouter> {
}
}

inline fun StraightLineEdgeRouter(
    block: StraightLineEdgeRouter.() -> Unit
): StraightLineEdgeRouter {
    return StraightLineEdgeRouter()
        .apply(block)
}
