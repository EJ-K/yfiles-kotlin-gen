// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

import yfiles.algorithms.EdgeDirectedness
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.EdgeBundling
import yfiles.layout.LayoutGraph
import yfiles.layout.MultiStageLayout
import yfiles.layout.NodeLabelingPolicy
import yfiles.tree.BalloonLayout

/**
 * This layout algorithm arranges graphs in a circular fashion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [CircularLayout] instance with the default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23CircularLayout-constructor-CircularLayout">Online Documentation</a>
 */
external open class CircularLayout  () : MultiStageLayout {

/**
 * Gets the [BalloonLayout] instance used for arranging multiple partitions.
 * @see [layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23balloonLayout">Online Documentation</a>
 */
open val balloonLayout: BalloonLayout
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for arranging the components of the graph is activated.
 * 
 * Default value - `true`. The stage that arranges connected graph components is activated.
 * @see [MultiStageLayout.componentLayoutEnabled]
 * @see [MultiStageLayout.componentLayout]
 * @see [ComponentLayout][yfiles.layout.ComponentLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23componentLayoutEnabled">Online Documentation</a>
 */
override var componentLayoutEnabled: Boolean
/**
 * Gets or sets whether or not the layout algorithm reserves space for node labels preventing possible overlaps.
 * 
 * Default value - `false`. Node labels are not taken into account.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets or sets the descriptor that defines settings for the non-exterior edges.
 * @throws ArgumentError if the given descriptor is `null`
 * @see [edgeRoutingPolicy]
 * @see [exteriorEdgeLayoutDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23defaultEdgeLayoutDescriptor">Online Documentation</a>
 */
open var defaultEdgeLayoutDescriptor: EdgeLayoutDescriptor
/**
 * Gets the [EdgeBundling] instance that defines the settings of the edge bundling feature.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23edgeBundling">Online Documentation</a>
 */
open val edgeBundling: EdgeBundling
/**
 * Gets or sets the edge routing policy that determines whether edges are routed internally or externally with respect to a single partition circle.
 * 
 * Default value - [CircularLayoutEdgeRoutingPolicy.INTERIOR]. Edges are routed as simple straight lines on the interior.
 * @throws ArgumentError if the given edge routing policy is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23edgeRoutingPolicy">Online Documentation</a>
 */
open var edgeRoutingPolicy: CircularLayoutEdgeRoutingPolicy
/**
 * Gets or sets the descriptor that defines settings for the exterior edges.
 * @throws ArgumentError if the given descriptor is `null`
 * @see [edgeRoutingPolicy]
 * @see [defaultEdgeLayoutDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23exteriorEdgeLayoutDescriptor">Online Documentation</a>
 */
open var exteriorEdgeLayoutDescriptor: ExteriorEdgeLayoutDescriptor
/**
 * Gets or sets whether or not to take the coordinates of the input diagram into account when arranging the nodes of the partitions and the partitions themselves.
 * 
 * Default value - `false`. The layout algorithm does not consider the initial coordinates of the nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23fromSketchMode">Online Documentation</a>
 */
open var fromSketchMode: Boolean
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for hiding group nodes is activated.
 * 
 * Default value - `true`. The stage responsible for hiding group nodes is activated.
 * @see [MultiStageLayout.hideGroupsStageEnabled]
 * @see [MultiStageLayout.hideGroupsStage]
 * @see [HideGroupsStage][yfiles.layout.HideGroupsStage]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23hideGroupsStageEnabled">Online Documentation</a>
 */
override var hideGroupsStageEnabled: Boolean
/**
 * Gets or sets whether or not the layout algorithm automatically places node labels.
 * 
 * Default value - `false`. Node labels are not placed by this algorithm.
 * @see [nodeLabelingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23integratedNodeLabeling">Online Documentation</a>
 */
open var integratedNodeLabeling: Boolean
/**
 * Gets or sets the global layout style for this layout algorithm.
 * 
 * Default value - [LayoutStyle.BCC_COMPACT]
 * @throws ArgumentError if an unknown layout style is set
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23layoutStyle">Online Documentation</a>
 */
open var layoutStyle: LayoutStyle
/**
 * Gets or sets the maximum deviation angle allowed for an edge.
 * 
 * Default value - `90`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23maximumDeviationAngle">Online Documentation</a>
 */
open var maximumDeviationAngle: Int
/**
 * Gets or sets the distance between node labels belonging to the same node.
 * 
 * Default value - `2.0`
 * @throws ArgumentError if the given spacing value is negative
 * @see [integratedNodeLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23nodeLabelSpacing">Online Documentation</a>
 */
open var nodeLabelSpacing: Double
/**
 * Gets or sets the policy defining how node labels are placed by the integrated node labeling mechanism (for example, the desired label orientation).
 * 
 * Default value - [NodeLabelingPolicy.RAY_LIKE_LEAVES]
 * @throws ArgumentError if an unknown labeling policy is given
 * @see [integratedNodeLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23nodeLabelingPolicy">Online Documentation</a>
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23orientationLayoutEnabled">Online Documentation</a>
 */
override var orientationLayoutEnabled: Boolean
/**
 * Gets or sets the style for the arrangement of each partition.
 * 
 * Default value - [PartitionStyle.CYCLE]
 * @throws ArgumentError if an unknown style is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23partitionStyle">Online Documentation</a>
 */
open var partitionStyle: PartitionStyle
/**
 * Gets or sets whether or not, in the underlying tree, the children of a tree node are placed on a common radius.
 * 
 * Default value - `true`. Children are placed on a common radius.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23placeChildrenOnCommonRadius">Online Documentation</a>
 */
open var placeChildrenOnCommonRadius: Boolean
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for routing self-loops is activated.
 * 
 * Default value - `true`. The stage that routes self-loops is activated.
 * @see [MultiStageLayout.selfLoopRouterEnabled]
 * @see [MultiStageLayout.selfLoopRouter]
 * @see [SelfLoopRouter][yfiles.layout.SelfLoopRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23selfLoopRouterEnabled">Online Documentation</a>
 */
override var selfLoopRouterEnabled: Boolean
/**
 * Gets the [SingleCycleLayout] instance used for laying out nodes on a single cycle.
 * @see [layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23singleCycleLayout">Online Documentation</a>
 */
open val singleCycleLayout: SingleCycleLayout
/**
 * Gets or sets the minimum size (number of nodes including the root) a star needs to have to be detected and handled as a star substructure.
 * 
 * Default value - `4`
 * @throws ArgumentError if the given minimum size is less than `3`
 * @see [starSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23starSubstructureSize">Online Documentation</a>
 */
open var starSubstructureSize: Int
/**
 * Gets or sets the layout style for star substructures.
 * 
 * Default value - [CircularLayoutStarSubstructureStyle.NONE]. Stars are not detected and not handled in a special way.
 * @throws ArgumentError if the given style is unknown
 * @see [starSubstructureSize]
 * @see [EDGE_DIRECTEDNESS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23starSubstructureStyle">Online Documentation</a>
 */
open var starSubstructureStyle: CircularLayoutStarSubstructureStyle
/**
 * Gets or sets whether star substructures should be separated by the node type.
 * 
 * Default value - `true`. Star substructures are strictly separated by node type.
 * @see [starSubstructureStyle]
 * @see [LayoutKeys.NODE_TYPE_DP_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23starSubstructureTypeSeparation">Online Documentation</a>
 */
open var starSubstructureTypeSeparation: Boolean
/**
 * Calculates a circular layout for the given graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23CircularLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Arranges the given graph in a circular fashion.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23CircularLayout-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )

companion object : ClassMetadata<CircularLayout> {
/**
 * A data acceptor key for publishing the final circle information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23CIRCLE_ID_DP_KEY">Online Documentation</a>
 */
 val CIRCLE_ID_DP_KEY: NodeDpKey<Int>
/**
 * A data provider key for defining custom node partitions.
 * @see [LayoutStyle.CUSTOM_GROUPS]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23CUSTOM_GROUPS_DP_KEY">Online Documentation</a>
 */
 val CUSTOM_GROUPS_DP_KEY: NodeDpKey<Id>
/**
 * A data provider key for specifying the directedness of edges.
 * @see [starSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23EDGE_DIRECTEDNESS_DP_KEY">Online Documentation</a>
 */
 val EDGE_DIRECTEDNESS_DP_KEY: EdgeDpKey<EdgeDirectedness>
/**
 * A data provider key for marking edges that should be routed externally, around the circle instead of inside.
 * @see [edgeRoutingPolicy]
 * @see [CircularLayoutEdgeRoutingPolicy.MARKED_EXTERIOR]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayout%23EXTERIOR_EDGES_DP_KEY">Online Documentation</a>
 */
 val EXTERIOR_EDGES_DP_KEY: EdgeDpKey<Boolean>
}
}

inline fun CircularLayout(
    block: CircularLayout.() -> Unit
): CircularLayout {
    return CircularLayout()
        .apply(block)
}
