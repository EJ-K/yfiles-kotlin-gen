// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.radial

import yfiles.algorithms.NodeDpKey
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.layout.EdgeBundling
import yfiles.layout.LayoutGraph
import yfiles.layout.MultiStageLayout
import yfiles.layout.NodeLabelingPolicy

/**
 * This layout algorithm arranges graphs in a radial fashion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [RadialLayout] instance with the default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23RadialLayout-constructor-RadialLayout">Online Documentation</a>
 */
external open class RadialLayout  () : MultiStageLayout {

/**
 * Gets or sets the [IDataProvider][yfiles.algorithms.IDataProvider] key used for looking up the selected nodes that should be placed in the center.
 * 
 * Default value - [LayoutKeys.AFFECTED_NODES_DP_KEY][yfiles.layout.LayoutKeys.AFFECTED_NODES_DP_KEY]. The selected nodes are placed in the center.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23centerNodesDpKey">Online Documentation</a>
 */
open var centerNodesDpKey: NodeDpKey<Boolean>
/**
 * Gets or sets the policy that determines which nodes are selected as roots of the (virtual) tree for the layout process and are set in the center of the circles.
 * 
 * Default value - [CenterNodesPolicy.WEIGHTED_CENTRALITY]. The node determined using weighted centrality is placed in the center.
 * @throws ArgumentError if an invalid center node policy is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23centerNodesPolicy">Online Documentation</a>
 */
open var centerNodesPolicy: CenterNodesPolicy
/**
 * Gets or sets whether or not node labels are taken into account when calculating node positions.
 * 
 * Default value - `false`. Node labels are not considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets or sets whether or not the points of the resulting edge path represent cubic bezier control points.
 * 
 * Default value - `false`. Each point is a normal polyline bend point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23createControlPoints">Online Documentation</a>
 */
open var createControlPoints: Boolean
/**
 * Gets the [EdgeBundling] instance that defines the settings of the edge bundling feature.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23edgeBundling">Online Documentation</a>
 */
open val edgeBundling: EdgeBundling
/**
 * Gets or sets the edge routing strategy.
 * 
 * Default value - [EdgeRoutingStrategy.ARC]. The edges will be routed as arcs.
 * @throws ArgumentError if an invalid edge routing strategy is set
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23edgeRoutingStrategy">Online Documentation</a>
 */
open var edgeRoutingStrategy: EdgeRoutingStrategy
/**
 * Gets or sets whether or not the layout algorithm automatically places node labels.
 * 
 * Default value - `false`. Node labels are not placed by this algorithm.
 * @see [nodeLabelingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23integratedNodeLabeling">Online Documentation</a>
 */
open var integratedNodeLabeling: Boolean
/**
 * Gets or sets the spacing between two consecutive circles (layers).
 * 
 * Default value - `25`
 * @throws ArgumentError if the spacing value is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23layerSpacing">Online Documentation</a>
 */
open var layerSpacing: Double
/**
 * Gets or sets the layering strategy that determines how nodes are distributed into different layers.
 * 
 * Default value - [LayeringStrategy.BFS]. The layers are determined using BFS.
 * @throws ArgumentError if an invalid layering strategy is set
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23layeringStrategy">Online Documentation</a>
 */
open var layeringStrategy: LayeringStrategy
/**
 * Gets or sets the maximum sector angle around a node within which the node's children will be placed.
 * 
 * Default value - `180`
 * @throws ArgumentError if the sector angle is negative or greater than `360` degrees
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23maximumChildSectorAngle">Online Documentation</a>
 */
open var maximumChildSectorAngle: Double
/**
 * Gets or sets the minimum bend angle (in degrees) between two adjacent edge segments.
 * 
 * Default value - `5`
 * @throws ArgumentError if the given minimum bend angle is negative or greater than `90`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23minimumBendAngle">Online Documentation</a>
 */
open var minimumBendAngle: Double
/**
 * Gets or sets the minimum distance between two neighboring edges of the same circle.
 * 
 * Default value - `50`
 * @throws ArgumentError if the given minimum distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23minimumEdgeToEdgeDistance">Online Documentation</a>
 */
open var minimumEdgeToEdgeDistance: Double
/**
 * Gets or sets the minimum distance between two circles.
 * 
 * Default value - `100`
 * @throws ArgumentError if the minimum layer distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23minimumLayerDistance">Online Documentation</a>
 */
open var minimumLayerDistance: Double
/**
 * Gets or sets the minimum distance between two neighboring nodes of the same circle.
 * 
 * Default value - `10`
 * @throws ArgumentError if the given minimum distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23minimumNodeToNodeDistance">Online Documentation</a>
 */
open var minimumNodeToNodeDistance: Double
/**
 * Gets or sets the distance between neighboring nodes on the outermost circle that do not share the same predecessor on the previous circle.
 * 
 * Default value - `0`. The nodes are distributed evenly.
 * @see [minimumNodeToNodeDistance]
 * @see [layeringStrategy]
 * @see [LayeringStrategy.DENDROGRAM]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23minimumSectorDistance">Online Documentation</a>
 */
open var minimumSectorDistance: Double
/**
 * Gets or sets the distance between node labels belonging to the same node.
 * 
 * Default value - `2.0`
 * @throws ArgumentError if the given spacing value is negative
 * @see [integratedNodeLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23nodeLabelSpacing">Online Documentation</a>
 */
open var nodeLabelSpacing: Double
/**
 * Gets or sets the policy defining how node labels are placed by the integrated node labeling mechanism (for example, the desired label orientation).
 * 
 * Default value - [NodeLabelingPolicy.RAY_LIKE]
 * @throws ArgumentError if an unknown labeling policy is given
 * @see [integratedNodeLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23nodeLabelingPolicy">Online Documentation</a>
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23orientationLayoutEnabled">Online Documentation</a>
 */
override var orientationLayoutEnabled: Boolean
/**
 * Calculates a radial arrangement for the given graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23RadialLayout-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )

companion object : ClassMetadata<RadialLayout> {
/**
 * A data provider key for providing user-defined layer/circle IDs.
 * @see [LayeringStrategy.USER_DEFINED]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23LAYER_ID_DP_KEY">Online Documentation</a>
 */
 val LAYER_ID_DP_KEY: NodeDpKey<Int>
/**
 * A data acceptor key for publishing the circle ID and sector data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23NODE_INFO_DP_KEY">Online Documentation</a>
 */
 val NODE_INFO_DP_KEY: NodeDpKey<RadialLayoutNodeInfo>
/**
 * A data provider key for specifying the comparator for the outgoing edges which ultimately orders the successor nodes of a node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayout%23OUT_EDGE_COMPARER_DP_KEY">Online Documentation</a>
 */
 val OUT_EDGE_COMPARER_DP_KEY: NodeDpKey<IComparer<Any>>
}
}

inline fun RadialLayout(
    block: RadialLayout.() -> Unit
): RadialLayout {
    return RadialLayout()
        .apply(block)
}
