// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.algorithms.EdgeDirectedness
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.Graph
import yfiles.algorithms.GraphDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.ComponentLayout
import yfiles.layout.IGroupBoundsCalculator
import yfiles.layout.LayoutGraph
import yfiles.layout.MultiStageLayout

/**
 * This layout algorithm arranges graphs in an organic fashion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [OrganicLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23OrganicLayout-constructor-OrganicLayout">Online Documentation</a>
 */
external open class OrganicLayout  () : MultiStageLayout {

/**
 * Gets or sets whether or not group nodes are compacted automatically.
 * 
 * Default value - `true`. Automatic group node compaction is enabled.
 * @see [groupNodeCompactness]
 * @see [compactnessFactor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23automaticGroupNodeCompaction">Online Documentation</a>
 */
open var automaticGroupNodeCompaction: Boolean
/**
 * Gets or sets whether or not the layout algorithm tries to straighten paths of degree-2 nodes.
 * 
 * Default value - `false`. Chains are not automatically recognized and straightened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23chainRecognition">Online Documentation</a>
 */
open var chainRecognition: Boolean
/**
 * Gets or sets the minimum size (number of nodes) a chain needs to have to be detected and handled as a chain substructure.
 * 
 * Default value - `4`
 * @throws ArgumentError if the given minimum size is less than `2`
 * @see [chainSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23chainSubstructureSize">Online Documentation</a>
 */
open var chainSubstructureSize: Int
/**
 * Gets or sets the style specifier for chain substructures.
 * 
 * Default value - [ChainSubstructureStyle.NONE]
 * @throws ArgumentError if the given style is unknown
 * @see [chainSubstructureSize]
 * @see [scope]
 * @see [EDGE_DIRECTEDNESS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23chainSubstructureStyle">Online Documentation</a>
 */
open var chainSubstructureStyle: ChainSubstructureStyle
/**
 * Gets or sets whether or not the layout algorithm tries to force nodes of cycles on geometric circles.
 * 
 * Default value - `false`. Cycles are not automatically recognized and forced on geometric circles.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23circleRecognition">Online Documentation</a>
 */
open var circleRecognition: Boolean
/**
 * Gets or sets whether or not detected clusters are taken into account as group substructures.
 * 
 * Default value - `false`
 * @see [clusteringPolicy]
 * @see [groupSubstructureScope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23clusterAsGroupSubstructureAllowed">Online Documentation</a>
 */
open var clusterAsGroupSubstructureAllowed: Boolean
/**
 * Gets or sets whether or not a clustering algorithm is applied to the input graph.
 * 
 * Default value - `false`. Automatic clustering is disabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23clusterNodes">Online Documentation</a>
 */
@Deprecated("Read documentation for more information")
open var clusterNodes: Boolean
/**
 * Gets or sets the clustering policy that is applied to the input graph and before executing the arrangement algorithm.
 * 
 * Default value - [OrganicLayoutClusteringPolicy.NONE]. Automatic clustering is disabled.
 * @throws ArgumentError if an unknown clustering policy is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23clusteringPolicy">Online Documentation</a>
 */
open var clusteringPolicy: OrganicLayoutClusteringPolicy
/**
 * Gets or sets the quality measure of the [edge betweenness][OrganicLayoutClusteringPolicy.EDGE_BETWEENNESS] clustering algorithm if it is chosen as clustering policy.
 * 
 * Default value - `1`
 * @throws ArgumentError if the specified quality measure is outside the interval `[0,1]`
 * @see [OrganicLayoutClusteringPolicy.EDGE_BETWEENNESS]
 * @see [maximumDuration]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23clusteringQuality">Online Documentation</a>
 */
open var clusteringQuality: Double
/**
 * Gets or sets the compactness factor for the layout algorithm.
 * 
 * Default value - `0.5`
 * @throws ArgumentError if the specified value is outside the interval `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23compactnessFactor">Online Documentation</a>
 */
open var compactnessFactor: Double
/**
 * Gets or sets whether or not to reserve space for node labels during layout calculation.
 * 
 * Default value - `false`. Node labels are not considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets or sets whether or not to consider node sizes during layout calculation.
 * 
 * Default value - `false`. Points will be used for modeling the nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23considerNodeSizes">Online Documentation</a>
 */
open var considerNodeSizes: Boolean
/**
 * Gets or sets whether or not the layout algorithm should create a 3D result.
 * 
 * Default value - `false`. The layout algorithm doesn't produce a 3D result.
 * @see [Z_COORDINATE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23create3DLayout">Online Documentation</a>
 */
open var create3DLayout: Boolean
/**
 * Gets or sets the minimum size (number of nodes) a cycle needs to have to be detected and handled as a cycle substructure.
 * 
 * Default value - `4`
 * @throws ArgumentError if the given minimum size is less than `3`
 * @see [cycleSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23cycleSubstructureSize">Online Documentation</a>
 */
open var cycleSubstructureSize: Int
/**
 * Gets or sets the style specifier for cycle substructures.
 * 
 * Default value - [CycleSubstructureStyle.NONE]
 * @throws ArgumentError if the given style is unknown
 * @see [cycleSubstructureSize]
 * @see [scope]
 * @see [EDGE_DIRECTEDNESS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23cycleSubstructureStyle">Online Documentation</a>
 */
open var cycleSubstructureStyle: CycleSubstructureStyle
/**
 * Gets or sets whether or not the deterministic mode of this algorithm is enabled.
 * 
 * Default value - `false`. The layout algorithm is non-deterministic.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23deterministic">Online Documentation</a>
 */
open var deterministic: Boolean
/**
 * Gets or sets the [IGroupBoundsCalculator] instance used for calculating the size of group nodes.
 * 
 * Default value - [MinimumSizeGroupBoundsCalculator][yfiles.layout.MinimumSizeGroupBoundsCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23groupBoundsCalculator">Online Documentation</a>
 */
open var groupBoundsCalculator: IGroupBoundsCalculator
/**
 * Gets or sets the compactness of group nodes.
 * 
 * Default value - `0.4`
 * @throws ArgumentError if specified compactness value is outside the interval `[0,1]`
 * @see [automaticGroupNodeCompaction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23groupNodeCompactness">Online Documentation</a>
 */
open var groupNodeCompactness: Double
/**
 * Gets or sets the scope specifier for group substructures.
 * 
 * Default value - [OrganicLayoutGroupSubstructureScope.NO_GROUPS]
 * @throws ArgumentError if the given scope is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23groupSubstructureScope">Online Documentation</a>
 */
open var groupSubstructureScope: OrganicLayoutGroupSubstructureScope
/**
 * Gets or sets the minimum size (number of nodes) a group needs to have to be detected and handled as a group substructure.
 * 
 * Default value - `4`
 * @throws ArgumentError if the given minimum size is less than `2`
 * @see [groupSubstructureScope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23groupSubstructureSize">Online Documentation</a>
 */
open var groupSubstructureSize: Int
/**
 * Gets or sets whether or not the layout algorithm will place edge labels.
 * 
 * Default value - `false`. Integrated edge labeling is disabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23integratedEdgeLabeling">Online Documentation</a>
 */
open var integratedEdgeLabeling: Boolean
/**
 * Gets or sets the maximum duration in milliseconds that this layout algorithm is allowed to run.
 * 
 * Default value - `30000`
 * @throws ArgumentError if the specified duration has a negative value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Gets or sets the minimum node distance that this algorithm should enforce between all pairs of nodes.
 * 
 * Default value - `0`
 * @throws ArgumentError if the specified minimum node distance is negative
 * @see [nodeOverlapsAllowed]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23minimumNodeDistance">Online Documentation</a>
 */
open var minimumNodeDistance: Double
/**
 * Gets or sets whether or not the layout algorithm tries to avoid node/edge overlaps.
 * 
 * Default value - `false`. Overlaps between nodes and edges are not avoided.
 * @see [nodeOverlapsAllowed]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23nodeEdgeOverlapAvoided">Online Documentation</a>
 */
open var nodeEdgeOverlapAvoided: Boolean
/**
 * Gets or sets whether or not overlaps between nodes are allowed.
 * 
 * Default value - `false`. Node overlaps are not allowed.
 * @see [minimumNodeDistance]
 * @see [scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23nodeOverlapsAllowed">Online Documentation</a>
 */
open var nodeOverlapsAllowed: Boolean
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] that modifies the orientation of the layout is activated.
 * 
 * Default value - `true`. The orientation [ILayoutStage][yfiles.layout.ILayoutStage] is activated.
 * @see [MultiStageLayout.orientationLayoutEnabled]
 * @see [MultiStageLayout.orientationLayout]
 * @see [MultiStageLayout.layoutOrientation]
 * @see [OrientationLayout][yfiles.layout.OrientationLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23orientationLayoutEnabled">Online Documentation</a>
 */
override var orientationLayoutEnabled: Boolean
/**
 * Gets or sets the area restriction for the result of the layout algorithm.
 * 
 * Default value - [OutputRestriction.NONE]
 * @throws ArgumentError if the given restriction is `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23outputRestriction">Online Documentation</a>
 */
open var outputRestriction: OutputRestriction
/**
 * Gets or sets the minimum size (number of nodes) a parallel structure needs to have to be detected and handled as a parallel substructure.
 * 
 * Default value - `3`
 * @throws ArgumentError if the given minimum size is less than `2`
 * @see [parallelSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23parallelSubstructureSize">Online Documentation</a>
 */
open var parallelSubstructureSize: Int
/**
 * Gets or sets the style specifier for parallel substructures.
 * 
 * Default value - [ParallelSubstructureStyle.NONE]
 * @throws ArgumentError if the given style is unknown
 * @see [parallelSubstructureSize]
 * @see [scope]
 * @see [EDGE_DIRECTEDNESS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23parallelSubstructureStyle">Online Documentation</a>
 */
open var parallelSubstructureStyle: ParallelSubstructureStyle
/**
 * Gets or sets whether parallel substructures should be separated by the node type.
 * 
 * Default value - `true`. Parallel substructures are strictly separated by node type.
 * @see [parallelSubstructureStyle]
 * @see [LayoutKeys.NODE_TYPE_DP_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23parallelSubstructureTypeSeparation">Online Documentation</a>
 */
open var parallelSubstructureTypeSeparation: Boolean
/**
 * Gets or sets the default preferred edge length.
 * 
 * Default value - `40`
 * @throws ArgumentError if the specified edge length is negative
 * @see [PREFERRED_EDGE_LENGTH_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23preferredEdgeLength">Online Documentation</a>
 */
open var preferredEdgeLength: Double
/**
 * Gets or sets the minimum preferred distance between nodes and edges when node-edge overlaps are not allowed.
 * 
 * Default value - `40`
 * @throws ArgumentError if the specified distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23preferredMinimumNodeToEdgeDistance">Online Documentation</a>
 */
open var preferredMinimumNodeToEdgeDistance: Double
/**
 * Gets or sets the ratio of layout quality versus running time.
 * 
 * Default value - `0.6`
 * @throws ArgumentError if the specified ratio is outside the interval `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23qualityTimeRatio">Online Documentation</a>
 */
open var qualityTimeRatio: Double
/**
 * Gets or sets the scope that determines which nodes are placed by this algorithm.
 * 
 * Default value - [Scope.ALL]
 * @throws ArgumentError if the given scope is unknown
 * @see [AFFECTED_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23scope">Online Documentation</a>
 */
open var scope: Scope
/**
 * Gets or sets whether or not this instance should configure the [ComponentLayout] to respect subsets of nodes.
 * 
 * Default value - `false`. Smart component layout is disabled.
 * @see [MultiStageLayout.componentLayoutEnabled]
 * @see [MultiStageLayout.componentLayout]
 * @see [scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23smartComponentLayout">Online Documentation</a>
 */
open var smartComponentLayout: Boolean
/**
 * Gets or sets the minimum size (number of nodes including the root) a star needs to have to be detected and handled as a star substructure.
 * 
 * Default value - `4`
 * @throws ArgumentError if the given minimum size is less than `3`
 * @see [starSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23starSubstructureSize">Online Documentation</a>
 */
open var starSubstructureSize: Int
/**
 * Gets or sets the style specifier for star substructures.
 * 
 * Default value - [OrganicLayoutStarSubstructureStyle.NONE]
 * @throws ArgumentError if the given style is unknown
 * @see [starSubstructureSize]
 * @see [starSubstructureTypeSeparation]
 * @see [scope]
 * @see [EDGE_DIRECTEDNESS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23starSubstructureStyle">Online Documentation</a>
 */
open var starSubstructureStyle: OrganicLayoutStarSubstructureStyle
/**
 * Gets or sets whether star substructures should be separated by the node type.
 * 
 * Default value - `true`. Star substructures are strictly separated by node type.
 * @see [starSubstructureStyle]
 * @see [LayoutKeys.NODE_TYPE_DP_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23starSubstructureTypeSeparation">Online Documentation</a>
 */
open var starSubstructureTypeSeparation: Boolean
/**
 * Gets or sets the minimum size (number of nodes) a tree needs to have to be detected and handled as a tree substructure.
 * 
 * Default value - `4`
 * @throws ArgumentError if the given minimum size is less than `3`
 * @see [treeSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23treeSubstructureSize">Online Documentation</a>
 */
open var treeSubstructureSize: Int
/**
 * Gets or sets the style specifier for tree substructures.
 * 
 * Default value - [OrganicLayoutTreeSubstructureStyle.NONE]
 * @throws ArgumentError if the given style is unknown
 * @see [treeSubstructureSize]
 * @see [scope]
 * @see [EDGE_DIRECTEDNESS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23treeSubstructureStyle">Online Documentation</a>
 */
open var treeSubstructureStyle: OrganicLayoutTreeSubstructureStyle
/**
 * Calculates an organic arrangement of the graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23OrganicLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Calculates an organic arrangement of the graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23OrganicLayout-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )
/**
 * Configures the given [ComponentLayout] to take fixed nodes in components into account.
 * @param [graph] the input graph
 * @param [layouter] the [ComponentLayout] instance to reconfigure
 * @see [smartComponentLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23OrganicLayout-method-configureComponentLayout">Online Documentation</a>
 */
 open protected   fun configureComponentLayout( graph: LayoutGraph ,
 layouter: ComponentLayout )
/**
 * Creates and returns a [OrganicLayoutConstraintFactory] instance that can be used for specifying additional constraints on the layout.
 * @return a [OrganicLayoutConstraintFactory] instance that can be used for specifying additional constraints on the layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23OrganicLayout-method-createConstraintFactory">Online Documentation</a>
 */
 open   fun createConstraintFactory( graph: Graph ):OrganicLayoutConstraintFactory
/**
 * Disposes of the [ComponentLayout] instance.
 * @param [graph] the input graph
 * @param [layouter] the [ComponentLayout] to reset
 * @see [smartComponentLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23OrganicLayout-method-disposeComponentLayout">Online Documentation</a>
 */
 open protected   fun disposeComponentLayout( graph: LayoutGraph ,
 layouter: ComponentLayout )

companion object : ClassMetadata<OrganicLayout> {
/**
 * A data provider key for marking the nodes that are part of the relevant subset.
 * @see [scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23AFFECTED_NODES_DP_KEY">Online Documentation</a>
 */
 val AFFECTED_NODES_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for specifying user-defined node clusters.
 * @see [clusteringPolicy]
 * @see [OrganicLayoutClusteringPolicy.USER_DEFINED]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23CLUSTER_ID_DP_KEY">Online Documentation</a>
 */
 val CLUSTER_ID_DP_KEY: NodeDpKey<Id>
/**
 * A data provider key for specifying the constraints of the nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23CONSTRAINTS_DP_KEY">Online Documentation</a>
 */
 val CONSTRAINTS_DP_KEY: GraphDpKey<Any>
/**
 * A data provider key for specifying the directedness of edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23EDGE_DIRECTEDNESS_DP_KEY">Online Documentation</a>
 */
 val EDGE_DIRECTEDNESS_DP_KEY: EdgeDpKey<EdgeDirectedness>
/**
 * A data provider key for specifying the orientation of edges in the layout.
 * @see [MultiStageLayout.layoutOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23EDGE_ORIENTATION_DP_KEY">Online Documentation</a>
 */
 val EDGE_ORIENTATION_DP_KEY: EdgeDpKey<Double>
/**
 * A data provider key for assigning individual modes for all group nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23GROUP_NODE_MODE_DP_KEY">Online Documentation</a>
 */
 val GROUP_NODE_MODE_DP_KEY: NodeDpKey<GroupNodeMode>
/**
 * A data provider key for specifying the minimum length of edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23MINIMUM_EDGE_LENGTH_DP_KEY">Online Documentation</a>
 */
 val MINIMUM_EDGE_LENGTH_DP_KEY: EdgeDpKey<Double>
/**
 * A data provider key for specifying the inertia of nodes.
 * @see [NODE_STRESS_DP_KEY]
 * @see [scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23NODE_INERTIA_DP_KEY">Online Documentation</a>
 */
 val NODE_INERTIA_DP_KEY: NodeDpKey<Double>
/**
 * A data provider key for specifying the stress of nodes.
 * @see [NODE_INERTIA_DP_KEY]
 * @see [scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23NODE_STRESS_DP_KEY">Online Documentation</a>
 */
 val NODE_STRESS_DP_KEY: NodeDpKey<Double>
/**
 * A data provider key for marking nodes that are allowed to overlap other nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23OVERLAPPING_NODES_DP_KEY">Online Documentation</a>
 */
 val OVERLAPPING_NODES_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for defining an individual preferred length for each edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23PREFERRED_EDGE_LENGTH_DP_KEY">Online Documentation</a>
 */
 val PREFERRED_EDGE_LENGTH_DP_KEY: EdgeDpKey<Double>
/**
 * A data acceptor key for publishing the z-coordinate for all non-group nodes in the graph.
 * @see [create3DLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23Z_COORDINATE_DP_KEY">Online Documentation</a>
 */
 val Z_COORDINATE_DP_KEY: NodeDpKey<Double>
}
}

inline fun OrganicLayout(
    block: OrganicLayout.() -> Unit
): OrganicLayout {
    return OrganicLayout()
        .apply(block)
}
