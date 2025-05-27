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
import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph
import yfiles.layout.MultiStageLayout
import yfiles.layout.NodeLabelingPolicy

/**
 * A tree layout algorithm that arranges the subtrees of the tree in a balloon-like fashion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [BalloonLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23BalloonLayout-constructor-BalloonLayout">Online Documentation</a>
 */
external open class BalloonLayout  () : MultiStageLayout {

/**
 * Gets or sets whether or not (partially) overlapping nodes are allowed.
 * 
 * Default value - `false`. Nodes are not allowed to overlap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23allowOverlaps">Online Documentation</a>
 */
open var allowOverlaps: Boolean
/**
 * Gets or sets whether or not chains are drawn straight or not.
 * 
 * Default value - `false`. There is no guarantee that chains are drawn straight.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23chainStraighteningMode">Online Documentation</a>
 */
open var chainStraighteningMode: Boolean
/**
 * Gets or sets the child alignment policy for this layout algorithm.
 * 
 * Default value - [ChildAlignmentPolicy.COMPACT]
 * @throws ArgumentError if an unknown policy is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23childAlignmentPolicy">Online Documentation</a>
 */
open var childAlignmentPolicy: ChildAlignmentPolicy
/**
 * Gets or sets the child ordering policy for sorting the child nodes around their parents.
 * 
 * Default value - [ChildOrderingPolicy.COMPACT]
 * @throws ArgumentError if an unknown ordering policy is given
 * @see [fromSketchMode]
 * @see [comparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23childOrderingPolicy">Online Documentation</a>
 */
open var childOrderingPolicy: ChildOrderingPolicy
/**
 * Gets or sets the factor defining how compact layout results will potentially be, where a smaller factor produces potentially more compact layouts.
 * 
 * Default value - `0.5`. A factor offering good balance between compactness and runtime.
 * @throws ArgumentError if the factor is smaller than `0.05` or greater than `1.0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23compactnessFactor">Online Documentation</a>
 */
open var compactnessFactor: Double
/**
 * Gets or sets the [IComparer] instance that determines the order of the outgoing edges for each node of the tree.
 * 
 * Default value - `null`. The algorithm uses a built-in sorting logic.
 * @see [childOrderingPolicy]
 * @see [fromSketchMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23comparer">Online Documentation</a>
 */
open var comparer: IComparer<in Edge>?
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for arranging the components of the graph is activated.
 * 
 * Default value - `true`. The stage that arranges connected graph components is activated.
 * @see [MultiStageLayout.componentLayoutEnabled]
 * @see [MultiStageLayout.componentLayout]
 * @see [ComponentLayout][yfiles.layout.ComponentLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23componentLayoutEnabled">Online Documentation</a>
 */
override var componentLayoutEnabled: Boolean
/**
 * Gets or sets whether or not the layout algorithm reserves space for node labels.
 * 
 * Default value - `false`. Node labels are not considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets or sets the distance between edge labels belonging to the same edge as well as the distance of the edge labels to the target node of the edge.
 * 
 * Default value - `4.0`. Labels are close together and close to targets.
 * @throws ArgumentError if the given label spacing value is negative
 * @see [integratedEdgeLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23edgeLabelSpacing">Online Documentation</a>
 */
open var edgeLabelSpacing: Double
/**
 * Gets or sets whether or not to consider the given coordinates of the input diagram when arranging the tree.
 * 
 * Default value - `false`. The coordinates of the input are not considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23fromSketchMode">Online Documentation</a>
 */
open var fromSketchMode: Boolean
/**
 * The layout graph being acted upon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23graph">Online Documentation</a>
 */
protected final var graph: LayoutGraph
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for hiding group nodes is activated.
 * 
 * Default value - `true`. The stage responsible for hiding group nodes is activated.
 * @see [MultiStageLayout.hideGroupsStageEnabled]
 * @see [MultiStageLayout.hideGroupsStage]
 * @see [HideGroupsStage][yfiles.layout.HideGroupsStage]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23hideGroupsStageEnabled">Online Documentation</a>
 */
override var hideGroupsStageEnabled: Boolean
/**
 * Gets or sets whether or not the layout algorithm automatically places edge labels.
 * 
 * Default value - `false`. Edge labels are not placed by this algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23integratedEdgeLabeling">Online Documentation</a>
 */
open var integratedEdgeLabeling: Boolean
/**
 * Gets or sets whether or not the layout algorithm automatically places node labels.
 * 
 * Default value - `false`. Node labels are not placed by this algorithm.
 * @see [nodeLabelingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23integratedNodeLabeling">Online Documentation</a>
 */
open var integratedNodeLabeling: Boolean
/**
 * Gets or sets the mode for child node arrangement.
 * 
 * Default value - [InterleavedMode.OFF]. Interleaved placement is disabled.
 * @throws ArgumentError if an unknown mode for interleaved arrangement is given
 * @see [childAlignmentPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23interleavedMode">Online Documentation</a>
 */
open var interleavedMode: InterleavedMode
/**
 * Gets or sets the minimum length that this layout algorithm assigns to edges of the graph.
 * 
 * Default value - `40`
 * @throws ArgumentError if the given length is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23minimumEdgeLength">Online Documentation</a>
 */
open var minimumEdgeLength: Int
/**
 * Gets or sets the minimum distance to be kept between the nodes in the tree.
 * 
 * Default value - `10`
 * @throws ArgumentError if the given minimum distance is negative
 * @see [allowOverlaps]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23minimumNodeDistance">Online Documentation</a>
 */
open var minimumNodeDistance: Int
/**
 * Gets or sets the distance between node labels belonging to the same node.
 * 
 * Default value - `4.0`
 * @throws ArgumentError if the given spacing value is negative
 * @see [integratedNodeLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23nodeLabelSpacing">Online Documentation</a>
 */
open var nodeLabelSpacing: Double
/**
 * Gets or sets the policy defining how node labels are placed by the integrated node labeling mechanism (for example, the desired label orientation).
 * 
 * Default value - [NodeLabelingPolicy.RAY_LIKE]
 * @throws ArgumentError if an unknown labeling policy is given
 * @see [integratedNodeLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23nodeLabelingPolicy">Online Documentation</a>
 */
open var nodeLabelingPolicy: NodeLabelingPolicy
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] that modifies the orientation of the layout is activated.
 * 
 * Default value - `true`. The orientation [ILayoutStage][yfiles.layout.ILayoutStage] is activated.
 * @see [MultiStageLayout.orientationLayoutEnabled]
 * @see [MultiStageLayout.orientationLayout]
 * @see [MultiStageLayout.layoutOrientation]
 * @see [OrientationLayout][yfiles.layout.OrientationLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23orientationLayoutEnabled">Online Documentation</a>
 */
override var orientationLayoutEnabled: Boolean
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for routing parallel edges is activated.
 * 
 * Default value - `true`. The stage that routes parallel edges is activated.
 * @see [MultiStageLayout.parallelEdgeRouterEnabled]
 * @see [MultiStageLayout.parallelEdgeRouter]
 * @see [ParallelEdgeRouter][yfiles.router.ParallelEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23parallelEdgeRouterEnabled">Online Documentation</a>
 */
override var parallelEdgeRouterEnabled: Boolean
/**
 * Gets or sets the preferred radial amount (wedge) in degrees that child nodes may in total occupy around their parent node.
 * 
 * Default value - `340`
 * @throws ArgumentError if the given angle is smaller than `1` or larger than `359`
 * @see [preferredRootWedge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23preferredChildWedge">Online Documentation</a>
 */
open var preferredChildWedge: Int
/**
 * Gets or sets the preferred radial amount (wedge) in degrees that child nodes may in total occupy around the global root.
 * 
 * Default value - `360`
 * @throws ArgumentError if the given angle is smaller than `1` or larger than `360`
 * @see [preferredChildWedge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23preferredRootWedge">Online Documentation</a>
 */
open var preferredRootWedge: Int
/**
 * Gets or sets the root node selection policy of this layout algorithm.
 * 
 * Default value - [RootNodePolicy.DIRECTED_ROOT]
 * @throws ArgumentError if an unknown root node policy is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23rootNodePolicy">Online Documentation</a>
 */
open var rootNodePolicy: RootNodePolicy
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for routing self-loops is activated.
 * 
 * Default value - `true`. The stage that routes self-loops is activated.
 * @see [MultiStageLayout.selfLoopRouterEnabled]
 * @see [MultiStageLayout.selfLoopRouter]
 * @see [SelfLoopRouter][yfiles.layout.SelfLoopRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23selfLoopRouterEnabled">Online Documentation</a>
 */
override var selfLoopRouterEnabled: Boolean
/**
 * Arranges the given graph as a tree graph in a balloon-like fashion.
 * @param [graph] the input graph
 * @throws InvalidGraphStructureError if the given graph is not a tree
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23BalloonLayout-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )
/**
 * Calculates the wedge angle that has to be reserved for the subtree rooted at the given node scaling the [distance][BalloonLayoutNodeInfo.dist] with the given scale factor.
 * @param [root] the node for which the wedge angles are calculated
 * @param [scaleFactor] a factor to be applied to the [distance][BalloonLayoutNodeInfo.dist] of `root`
 * @return the sum of the upper and lower wedge angle of the subtree rooted at the given root node
 * @see [calculateChildArrangement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23BalloonLayout-method-calculateAngles">Online Documentation</a>
 */
 open protected   fun calculateAngles( root: Node ,
 scaleFactor: Double  = definedExternally):Double
/**
 * Calculates a child node arrangement for a given root node of the tree.
 * @param [root] the node for whose children to compute an arrangement
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23BalloonLayout-method-calculateChildArrangement">Online Documentation</a>
 */
 open protected   fun calculateChildArrangement( root: Node )
/**
 * Determines the root node of [graph] according to the chosen [root node policy][rootNodePolicy].
 * @return the root node of [graph]
 * @see [rootNodePolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23BalloonLayout-method-determineRoot">Online Documentation</a>
 */
 open protected   fun determineRoot():Node
/**
 * Returns the [BalloonLayoutNodeInfo] object associated with the given node while the layout algorithm is active.
 * @param [node] the node whose information object should be retrieved
 * @return the [BalloonLayoutNodeInfo] instance associated to the given node
 * @see [BalloonLayoutNodeInfo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23BalloonLayout-method-getInfo">Online Documentation</a>
 */
 open protected   fun getInfo( node: Node ):BalloonLayoutNodeInfo?
/**
 * Returns the preferred radial amount (wedge) in degrees that child nodes may in total occupy around the given node.
 * @param [root] the node to get the preferred wedge angle for
 * @return the preferred wedge angle for `root` in degrees
 * @see [preferredChildWedge]
 * @see [preferredRootWedge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23BalloonLayout-method-getPreferredChildWedge">Online Documentation</a>
 */
 open protected   fun getPreferredChildWedge( root: Node ):Int
/**
 * Sorts the child nodes (successors) of the given node.
 * @param [root] the node whose child nodes will be sorted
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23BalloonLayout-method-sortChildNodes">Online Documentation</a>
 */
 open protected   fun sortChildNodes( root: Node )

companion object : ClassMetadata<BalloonLayout> {
/**
 * A data provider key for marking nodes whose child nodes should be placed in an interleaved fashion.
 * @see [interleavedMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23INTERLEAVED_NODES_DP_KEY">Online Documentation</a>
 */
 val INTERLEAVED_NODES_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for marking the node that will be used as root node of the tree.
 * @see [rootNodePolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayout%23SELECTED_ROOT_DP_KEY">Online Documentation</a>
 */
 val SELECTED_ROOT_DP_KEY: NodeDpKey<Boolean>
}
}

inline fun BalloonLayout(
    block: BalloonLayout.() -> Unit
): BalloonLayout {
    return BalloonLayout()
        .apply(block)
}
