// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.Edge
import yfiles.algorithms.INodeCursor
import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.layout.IEdgeLayout
import yfiles.layout.LayoutGraph
import yfiles.layout.MultiStageLayout

/**
 * The [AspectRatioTreeLayout] arranges tree graphs in a compact fashion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [AspectRatioTreeLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23AspectRatioTreeLayout-constructor-AspectRatioTreeLayout">Online Documentation</a>
 */
external open class AspectRatioTreeLayout  () : MultiStageLayout {

/**
 * Gets or sets the default aspect ratio for this [AspectRatioTreeLayout].
 * 
 * Default value - `1.41`
 * @throws ArgumentError if the specified aspect ratio is `0` or negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23aspectRatio">Online Documentation</a>
 */
open var aspectRatio: Double
/**
 * Gets or sets the preferred distance between any two bends of an edge.
 * 
 * Default value - `20`
 * @throws ArgumentError if the specified distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23bendDistance">Online Documentation</a>
 */
open var bendDistance: Double
/**
 * Gets or sets the [IComparer] that will be used for sorting the [outgoing edges][Node.sortOutEdges] of each local root in the tree before they are being arranged.
 * 
 * Default value - `null`. Only the built-in logic of the layout algorithm is used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23comparer">Online Documentation</a>
 */
open var comparer: IComparer<in Edge>?
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for arranging the components of the graph is activated.
 * 
 * Default value - `true`. The stage that arranges connected graph components is activated.
 * @see [MultiStageLayout.componentLayoutEnabled]
 * @see [MultiStageLayout.componentLayout]
 * @see [ComponentLayout][yfiles.layout.ComponentLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23componentLayoutEnabled">Online Documentation</a>
 */
override var componentLayoutEnabled: Boolean
/**
 * The input graph this algorithm is handling.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23graph">Online Documentation</a>
 */
protected final var graph: LayoutGraph
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for hiding group nodes is activated.
 * 
 * Default value - `true`. The stage responsible for hiding group nodes is activated.
 * @see [MultiStageLayout.hideGroupsStageEnabled]
 * @see [MultiStageLayout.hideGroupsStage]
 * @see [HideGroupsStage][yfiles.layout.HideGroupsStage]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23hideGroupsStageEnabled">Online Documentation</a>
 */
override var hideGroupsStageEnabled: Boolean
/**
 * Gets or sets the horizontal distance between adjacent nodes.
 * 
 * Default value - `10`
 * @throws ArgumentError if the specified distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23horizontalDistance">Online Documentation</a>
 */
open var horizontalDistance: Double
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for routing parallel edges is activated.
 * 
 * Default value - `true`. The stage that routes parallel edges is activated.
 * @see [MultiStageLayout.parallelEdgeRouterEnabled]
 * @see [MultiStageLayout.parallelEdgeRouter]
 * @see [ParallelEdgeRouter][yfiles.router.ParallelEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23parallelEdgeRouterEnabled">Online Documentation</a>
 */
override var parallelEdgeRouterEnabled: Boolean
/**
 * Gets or sets the desired placement of the tree's root node.
 * 
 * Default value - [RootPlacement.CORNER]
 * @throws ArgumentError if an unknown placement specifiers is set
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23rootPlacement">Online Documentation</a>
 */
open var rootPlacement: RootPlacement
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for routing self-loops is activated.
 * 
 * Default value - `true`. The stage that routes self-loops is activated.
 * @see [MultiStageLayout.selfLoopRouterEnabled]
 * @see [MultiStageLayout.selfLoopRouter]
 * @see [SelfLoopRouter][yfiles.layout.SelfLoopRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23selfLoopRouterEnabled">Online Documentation</a>
 */
override var selfLoopRouterEnabled: Boolean
/**
 * Gets or sets how the children of a local root are arranged and how the edges between them are routed.
 * 
 * Default value - [SubtreeArrangement.HORIZONTAL]
 * @throws ArgumentError if the specified routing policy is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23subtreeArrangement">Online Documentation</a>
 */
open var subtreeArrangement: SubtreeArrangement
/**
 * Gets or sets the vertical distance between adjacent nodes.
 * 
 * Default value - `10`
 * @throws ArgumentError if the specified distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23verticalDistance">Online Documentation</a>
 */
open var verticalDistance: Double
/**
 * Arranges the given graph considering the specified [aspect ratio][aspectRatio].
 * @param [graph] the input graph
 * @throws InvalidGraphStructureError if the input graph is not a tree
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23AspectRatioTreeLayout-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )
/**
 * Adds bends to the given [IEdgeLayout].
 * @param [edgeLayout] the layout of the edge that is routed
 * @param [localRoot] the local root of the subtree
 * @param [child] the child connected to the local root with the given edge
 * @param [rootPlacement] the placement specifier of the local root
 * @param [routingPolicy] the direction specifier for the routing
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23AspectRatioTreeLayout-method-createBends">Online Documentation</a>
 */
 open protected   fun createBends( edgeLayout: IEdgeLayout ,
 localRoot: Node ,
 child: Node ,
 rootPlacement: RootPlacement ,
 routingPolicy: SubtreeArrangement )
/**
 * Retrieves the aspect ratio for the subtree that is rooted at the given node.
 * @param [localRoot] the root node of the subtree
 * @return the aspect ratio of the subtree rooted at the local root node
 * @see [SUBTREE_ASPECT_RATIO_DP_KEY]
 * @see [aspectRatio]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23AspectRatioTreeLayout-method-getAspectRatio">Online Documentation</a>
 */
 open protected   fun getAspectRatio( localRoot: Node ):Double
/**
 * Retrieves the root placement for the subtree that is rooted at the given node.
 * @param [localRoot] the root of the subtree
 * @return the root placement of the subtree
 * @see [ROOT_PLACEMENT_DP_KEY]
 * @see [rootPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23AspectRatioTreeLayout-method-getRootPlacement">Online Documentation</a>
 */
 open protected   fun getRootPlacement( localRoot: Node ):RootPlacement
/**
 * Retrieves the routing for the subtree that is rooted at the given node.
 * @param [localRoot] the root of the subtree
 * @return the routing policy for the subtree
 * @see [SUBTREE_ROUTING_POLICY_DP_KEY]
 * @see [subtreeArrangement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23AspectRatioTreeLayout-method-getSubtreeArrangement">Online Documentation</a>
 */
 open protected   fun getSubtreeArrangement( localRoot: Node ):SubtreeArrangement
/**
 * Retrieves all children of the given local root.
 * @param [localRoot] the root of a subtree
 * @return all successors of the given node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23AspectRatioTreeLayout-method-getSuccessors">Online Documentation</a>
 */
 open protected   fun getSuccessors( localRoot: Node ):INodeCursor

companion object : ClassMetadata<AspectRatioTreeLayout> {
/**
 * A data provider key for specifying the placement of each subtree root.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23ROOT_PLACEMENT_DP_KEY">Online Documentation</a>
 */
 val ROOT_PLACEMENT_DP_KEY: NodeDpKey<RootPlacement>
/**
 * A data provider key for marking the node that will be used as root node of the tree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23SELECTED_ROOT_DP_KEY">Online Documentation</a>
 */
 val SELECTED_ROOT_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for specifying a target aspect ratio for each subtree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23SUBTREE_ASPECT_RATIO_DP_KEY">Online Documentation</a>
 */
 val SUBTREE_ASPECT_RATIO_DP_KEY: NodeDpKey<Double>
/**
 * A data provider key for specifying the routing direction for each subtree root.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayout%23SUBTREE_ROUTING_POLICY_DP_KEY">Online Documentation</a>
 */
 val SUBTREE_ROUTING_POLICY_DP_KEY: NodeDpKey<SubtreeArrangement>
}
}

inline fun AspectRatioTreeLayout(
    block: AspectRatioTreeLayout.() -> Unit
): AspectRatioTreeLayout {
    return AspectRatioTreeLayout()
        .apply(block)
}
