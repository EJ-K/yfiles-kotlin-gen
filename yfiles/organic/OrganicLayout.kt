// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.labeling.GenericLabeling
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan
import yfiles.layout.ComponentLayout
import yfiles.layout.EdgeDataKey
import yfiles.layout.EdgeLabelPlacement
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.ILayoutGroupBoundsCalculator
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutEdgeLabel
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode
import yfiles.layout.LayoutNodeLabel
import yfiles.layout.LayoutOrientation
import yfiles.layout.LayoutStageStack
import yfiles.layout.NodeDataKey
import yfiles.layout.NodeLabelPlacement
import yfiles.router.ParallelEdgeRouter
import yfiles.router.SelfLoopRouter

/**
 * This layout algorithm arranges graphs in an organic fashion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [OrganicLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23OrganicLayout-constructor-OrganicLayout">Online Documentation</a>
 */
open external class OrganicLayout () : ILayoutAlgorithm {
  /**
   * Gets or sets whether or not detected clusters are taken into account as group substructures.
   * 
   * Default value - `false`
   * @see [clusteringPolicy]
   * @see [groupSubstructureScope]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23allowClusterAsGroupSubstructure">Online Documentation</a>
   */
  final var allowClusterAsGroupSubstructure: Boolean
  
  /**
   * Gets or sets whether or not overlaps between nodes are allowed.
   * 
   * Default value - `false`. Node overlaps are not allowed.
   * @see [defaultMinimumNodeDistance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23allowNodeOverlaps">Online Documentation</a>
   */
  final var allowNodeOverlaps: Boolean
  
  /**
   * Gets or sets whether or not group nodes are compacted automatically.
   * 
   * Default value - `true`. Automatic group node compaction is enabled.
   * @see [groupNodeCompactness]
   * @see [compactnessFactor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23automaticGroupNodeCompaction">Online Documentation</a>
   */
  final var automaticGroupNodeCompaction: Boolean
  
  /**
   * Gets or sets whether or not the layout algorithm tries to avoid node/edge overlaps.
   * 
   * Default value - `false`. Overlaps between nodes and edges are not avoided.
   * @see [allowNodeOverlaps]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23avoidNodeEdgeOverlap">Online Documentation</a>
   */
  final var avoidNodeEdgeOverlap: Boolean
  
  /**
   * Gets or sets whether or not the layout algorithm tries to straighten paths of degree-2 nodes.
   * 
   * Default value - `false`. Chains are not automatically recognized and straightened.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23chainRecognition">Online Documentation</a>
   */
  final var chainRecognition: Boolean
  
  /**
   * Gets or sets the minimum size (number of nodes) a chain needs to have to be detected and handled as a chain substructure.
   * 
   * Default value - `4`
   * @throws ArgumentError if the given minimum size is less than `2`
   * @see [chainSubstructureStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23chainSubstructureSize">Online Documentation</a>
   */
  final var chainSubstructureSize: Int
  
  /**
   * Gets or sets the style specifier for chain substructures.
   * 
   * Default value - [OrganicLayoutChainSubstructureStyle.NONE]
   * @see [chainSubstructureSize]
   * @see [OrganicLayoutData.edgeDirectedness]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23chainSubstructureStyle">Online Documentation</a>
   */
  final var chainSubstructureStyle: OrganicLayoutChainSubstructureStyle
  
  /**
   * Gets or sets whether or not the layout algorithm tries to force nodes of cycles on geometric circles.
   * 
   * Default value - `false`. Cycles are not automatically recognized and forced on geometric circles.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23circleRecognition">Online Documentation</a>
   */
  final var circleRecognition: Boolean
  
  /**
   * Gets or sets the clustering policy that is applied to the input graph and before executing the arrangement algorithm.
   * 
   * Default value - [OrganicLayoutClusteringPolicy.NONE]. Automatic clustering is disabled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23clusteringPolicy">Online Documentation</a>
   */
  final var clusteringPolicy: OrganicLayoutClusteringPolicy
  
  /**
   * Gets or sets the compactness factor for the layout algorithm.
   * 
   * Default value - `0.5`
   * @throws ArgumentError if the specified value is outside the interval `[0,1]`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23compactnessFactor">Online Documentation</a>
   */
  final var compactnessFactor: Double
  
  /**
   * Gets the [ComponentLayout] from the [layoutStages][OrganicLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][OrganicLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23componentLayout">Online Documentation</a>
   */
  final val componentLayout: ComponentLayout
  
  /**
   * Gets or sets whether or not the layout algorithm should create a 3D result.
   * 
   * Default value - `false`. The layout algorithm doesn't produce a 3D result.
   * @see [OrganicLayoutData.zCoordinatesResult]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23create3DLayout">Online Documentation</a>
   */
  final var create3DLayout: Boolean
  
  /**
   * Gets or sets the minimum size (number of nodes) a cycle needs to have to be detected and handled as a cycle substructure.
   * 
   * Default value - `4`
   * @throws ArgumentError if the given minimum size is less than `3`
   * @see [cycleSubstructureStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23cycleSubstructureSize">Online Documentation</a>
   */
  final var cycleSubstructureSize: Int
  
  /**
   * Gets or sets the style specifier for cycle substructures.
   * 
   * Default value - [OrganicLayoutCycleSubstructureStyle.NONE]
   * @see [cycleSubstructureSize]
   * @see [OrganicLayoutData.edgeDirectedness]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23cycleSubstructureStyle">Online Documentation</a>
   */
  final var cycleSubstructureStyle: OrganicLayoutCycleSubstructureStyle
  
  /**
   * Gets or sets the minimum node distance that this algorithm should enforce between all pairs of nodes.
   * 
   * Default value - `0`
   * @throws ArgumentError if the specified minimum node distance is negative
   * @see [allowNodeOverlaps]
   * @see [OrganicLayoutData.minimumNodeDistances]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23defaultMinimumNodeDistance">Online Documentation</a>
   */
  final var defaultMinimumNodeDistance: Double
  
  /**
   * Gets or sets the default preferred edge length.
   * 
   * Default value - `40`
   * @throws ArgumentError if the specified edge length is negative
   * @see [OrganicLayoutData.preferredEdgeLengths]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23defaultPreferredEdgeLength">Online Documentation</a>
   */
  final var defaultPreferredEdgeLength: Double
  
  /**
   * Gets or sets whether or not the deterministic mode of this algorithm is enabled.
   * 
   * Default value - `true`. The layout algorithm is deterministic.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23deterministic">Online Documentation</a>
   */
  final var deterministic: Boolean
  
  /**
   * Gets or sets how the layout handles the position of edge labels.
   * 
   * Default value - [EdgeLabelPlacement.GENERIC]. Edge labels are placed by an independent labeling algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23edgeLabelPlacement">Online Documentation</a>
   */
  final var edgeLabelPlacement: EdgeLabelPlacement
  
  /**
   * Gets the [GenericLabeling] from the [layoutStages][OrganicLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][OrganicLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23genericLabeling">Online Documentation</a>
   */
  final val genericLabeling: GenericLabeling
  
  /**
   * Gets or sets the [ILayoutGroupBoundsCalculator] instance used for calculating the size of group nodes.
   * 
   * Default value - [GroupBoundsCalculator][yfiles.layout.GroupBoundsCalculator]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23groupBoundsCalculator">Online Documentation</a>
   */
  final var groupBoundsCalculator: ILayoutGroupBoundsCalculator
  
  /**
   * Gets or sets the compactness of group nodes.
   * 
   * Default value - `0.4`
   * @throws ArgumentError if specified compactness value is outside the interval `[0,1]`
   * @see [automaticGroupNodeCompaction]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23groupNodeCompactness">Online Documentation</a>
   */
  final var groupNodeCompactness: Double
  
  /**
   * Gets or sets the scope specifier for group substructures.
   * 
   * Default value - [OrganicLayoutGroupSubstructureScope.NO_GROUPS]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23groupSubstructureScope">Online Documentation</a>
   */
  final var groupSubstructureScope: OrganicLayoutGroupSubstructureScope
  
  /**
   * Gets or sets the minimum size (number of nodes) a group needs to have to be detected and handled as a group substructure.
   * 
   * Default value - `4`
   * @throws ArgumentError if the given minimum size is less than `2`
   * @see [groupSubstructureScope]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23groupSubstructureSize">Online Documentation</a>
   */
  final var groupSubstructureSize: Int
  
  /**
   * Gets or sets the style specifier for group substructures.
   * 
   * Default value - [GroupSubstructureStyle.COMPACT_DISK]
   * @see [groupSubstructureScope]
   * @see [groupSubstructureSize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23groupSubstructureStyle">Online Documentation</a>
   */
  final var groupSubstructureStyle: GroupSubstructureStyle
  
  /**
   * Gets or sets the [layoutOrientation][OrganicLayout] of the [OrientationStage][yfiles.layout.OrientationStage].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23layoutOrientation">Online Documentation</a>
   */
  final var layoutOrientation: LayoutOrientation
  
  /**
   * Gets the mutable stack of [ILayoutStage][yfiles.layout.ILayoutStage] that will be applied to this layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23layoutStages">Online Documentation</a>
   */
  final val layoutStages: LayoutStageStack
  
  /**
   * Gets or sets how the layout handles the position of node labels.
   * 
   * Default value - [NodeLabelPlacement.CONSIDER]. Node labels are considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23nodeLabelPlacement">Online Documentation</a>
   */
  final var nodeLabelPlacement: NodeLabelPlacement
  
  /**
   * Gets the [ParallelEdgeRouter] from the [layoutStages][OrganicLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][OrganicLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23parallelEdgeRouter">Online Documentation</a>
   */
  final val parallelEdgeRouter: ParallelEdgeRouter
  
  /**
   * Gets or sets the minimum size (number of nodes) a parallel structure needs to have to be detected and handled as a parallel substructure.
   * 
   * Default value - `3`
   * @throws ArgumentError if the given minimum size is less than `2`
   * @see [parallelSubstructureStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23parallelSubstructureSize">Online Documentation</a>
   */
  final var parallelSubstructureSize: Int
  
  /**
   * Gets or sets the style specifier for parallel substructures.
   * 
   * Default value - [OrganicLayoutParallelSubstructureStyle.NONE]
   * @see [parallelSubstructureSize]
   * @see [OrganicLayoutData.edgeDirectedness]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23parallelSubstructureStyle">Online Documentation</a>
   */
  final var parallelSubstructureStyle: OrganicLayoutParallelSubstructureStyle
  
  /**
   * Gets or sets whether parallel substructures should be separated by the node type.
   * 
   * Default value - `true`. Parallel substructures are strictly separated by node type.
   * @see [parallelSubstructureStyle]
   * @see [OrganicLayoutData.nodeTypes]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23parallelSubstructureTypeSeparation">Online Documentation</a>
   */
  final var parallelSubstructureTypeSeparation: Boolean
  
  /**
   * Gets or sets the minimum preferred distance between nodes and edges when node-edge overlaps are not allowed.
   * 
   * Default value - `40`
   * @throws ArgumentError if the specified distance is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23preferredMinimumNodeToEdgeDistance">Online Documentation</a>
   */
  final var preferredMinimumNodeToEdgeDistance: Double
  
  /**
   * Gets or sets the ratio of layout quality versus running time.
   * 
   * Default value - `0.6`
   * @throws ArgumentError if the specified ratio is outside the interval `[0,1]`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23qualityTimeRatio">Online Documentation</a>
   */
  final var qualityTimeRatio: Double
  
  /**
   * Gets the [SelfLoopRouter] from the [layoutStages][OrganicLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][OrganicLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23selfLoopRouter">Online Documentation</a>
   */
  final val selfLoopRouter: SelfLoopRouter
  
  /**
   * Gets or sets the shape constraint for the result of the layout algorithm.
   * 
   * Default value - [ShapeConstraint.NONE]
   * @throws ArgumentError if the given restriction is `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23shapeConstraint">Online Documentation</a>
   */
  final var shapeConstraint: ShapeConstraint
  
  /**
   * Gets or sets the minimum size (number of nodes including the root) a star needs to have to be detected and handled as a star substructure.
   * 
   * Default value - `4`
   * @throws ArgumentError if the given minimum size is less than `3`
   * @see [starSubstructureStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23starSubstructureSize">Online Documentation</a>
   */
  final var starSubstructureSize: Int
  
  /**
   * Gets or sets the style specifier for star substructures.
   * 
   * Default value - [OrganicLayoutStarSubstructureStyle.NONE]
   * @see [starSubstructureSize]
   * @see [starSubstructureTypeSeparation]
   * @see [OrganicLayoutData.edgeDirectedness]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23starSubstructureStyle">Online Documentation</a>
   */
  final var starSubstructureStyle: OrganicLayoutStarSubstructureStyle
  
  /**
   * Gets or sets whether star substructures should be separated by the node type.
   * 
   * Default value - `true`. Star substructures are strictly separated by node type.
   * @see [starSubstructureStyle]
   * @see [OrganicLayoutData.nodeTypes]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23starSubstructureTypeSeparation">Online Documentation</a>
   */
  final var starSubstructureTypeSeparation: Boolean
  
  /**
   * Gets or sets the duration that this layout algorithm is allowed to run before stopping gracefully.
   * 
   * Default value - `30s`. A [TimeSpan] of 30 seconds
   * @throws ArgumentError if the specified duration has a negative value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23stopDuration">Online Documentation</a>
   */
  final var stopDuration: TimeSpan
  
  /**
   * Gets or sets the minimum size (number of nodes) a tree needs to have to be detected and handled as a tree substructure.
   * 
   * Default value - `4`
   * @throws ArgumentError if the given minimum size is less than `3`
   * @see [treeSubstructureStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23treeSubstructureSize">Online Documentation</a>
   */
  final var treeSubstructureSize: Int
  
  /**
   * Gets or sets the style specifier for tree substructures.
   * 
   * Default value - [OrganicLayoutTreeSubstructureStyle.NONE]
   * @see [treeSubstructureSize]
   * @see [OrganicLayoutData.edgeDirectedness]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23treeSubstructureStyle">Online Documentation</a>
   */
  final var treeSubstructureStyle: OrganicLayoutTreeSubstructureStyle
  
  /**
   * Calculates an organic arrangement of the graph.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23OrganicLayout-method-applyLayout">Online Documentation</a>
   */
  override fun applyLayout(
    graph: LayoutGraph,
  )
  
  /**
   * Calculates an organic arrangement of the graph.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23OrganicLayout-method-applyLayoutCore">Online Documentation</a>
   */
  protected fun applyLayoutCore(
    graph: LayoutGraph,
  )
  
  /**
   * Calculates an initial placement of nodes, before the main organic (force-directed) optimization loop starts.
   * @param [graph] the graph for which the initial placement is calculated
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23OrganicLayout-method-calculateInitialPlacement">Online Documentation</a>
   */
  protected fun calculateInitialPlacement(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [OrganicLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [OrganicLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23OrganicLayout-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): OrganicLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [OrganicLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [OrganicLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23OrganicLayout-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph  = definedExternally,
  ): OrganicLayoutData<INode, IEdge, ILabel, ILabel>
  
  companion object : ClassMetadata<OrganicLayout> {
    /**
     * A [data key][NodeDataKey] for specifying user-defined node clusters.
     * @see [OrganicLayoutData.clusterIds]
     * @see [clusteringPolicy]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23CLUSTER_ID_DATA_KEY">Online Documentation</a>
     */
     val CLUSTER_ID_DATA_KEY: NodeDataKey<Any>
    
    /**
     * A [data key][EdgeDataKey] for specifying the orientation of edges in the layout.
     * @see [OrganicLayoutData.edgeOrientation]
     * @see [layoutOrientation]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23EDGE_ORIENTATION_DATA_KEY">Online Documentation</a>
     */
     val EDGE_ORIENTATION_DATA_KEY: EdgeDataKey<Number>
    
    /**
     * A [data key][NodeDataKey] for assigning individual policies for all group nodes.
     * @see [OrganicScopeData.groupNodeHandlingPolicies]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23GROUP_NODE_HANDLING_POLICY_DATA_KEY">Online Documentation</a>
     */
     val GROUP_NODE_HANDLING_POLICY_DATA_KEY: NodeDataKey<GroupNodeHandlingPolicy>
    
    /**
     * A [data key][EdgeDataKey] for specifying the minimum length of edges.
     * @see [OrganicLayoutData.minimumEdgeLengths]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23MINIMUM_EDGE_LENGTH_DATA_KEY">Online Documentation</a>
     */
     val MINIMUM_EDGE_LENGTH_DATA_KEY: EdgeDataKey<Number>
    
    /**
     * A [data key][NodeDataKey] for specifying the inertia of nodes.
     * @see [OrganicLayoutData.nodeInertia]
     * @see [NODE_STRESS_DATA_KEY]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23NODE_INERTIA_DATA_KEY">Online Documentation</a>
     */
     val NODE_INERTIA_DATA_KEY: NodeDataKey<Number>
    
    /**
     * A [data key][NodeDataKey] for specifying the stress of nodes.
     * @see [OrganicLayoutData.nodeStress]
     * @see [NODE_INERTIA_DATA_KEY]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23NODE_STRESS_DATA_KEY">Online Documentation</a>
     */
     val NODE_STRESS_DATA_KEY: NodeDataKey<Number>
    
    /**
     * A [data key][NodeDataKey] for marking nodes that are allowed to overlap other nodes.
     * @see [OrganicLayoutData.overlappingNodes]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23OVERLAPPING_NODES_DATA_KEY">Online Documentation</a>
     */
     val OVERLAPPING_NODES_DATA_KEY: NodeDataKey<Boolean>
    
    /**
     * A [data key][EdgeDataKey] for defining an individual preferred length for each edge.
     * @see [OrganicLayoutData.preferredEdgeLengths]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23PREFERRED_EDGE_LENGTH_DATA_KEY">Online Documentation</a>
     */
     val PREFERRED_EDGE_LENGTH_DATA_KEY: EdgeDataKey<Number>
    
    /**
     * A [data key][NodeDataKey] for marking the nodes that are part of the relevant subset.
     * @see [OrganicLayoutData.scope]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23SCOPE_DATA_KEY">Online Documentation</a>
     */
     val SCOPE_DATA_KEY: NodeDataKey<OrganicScope>
    
    /**
     * A [data key][EdgeDataKey] for assigning source edge group information for edges.
     * @see [OrganicLayoutData.substructureSourceGroupIds]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23SUBSTRUCTURE_SOURCE_GROUP_ID_DATA_KEY">Online Documentation</a>
     */
     val SUBSTRUCTURE_SOURCE_GROUP_ID_DATA_KEY: EdgeDataKey<Any>
    
    /**
     * A [data key][EdgeDataKey] for assigning target edge group information for edges.
     * @see [OrganicLayoutData.substructureTargetGroupIds]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23SUBSTRUCTURE_TARGET_GROUP_ID_DATA_KEY">Online Documentation</a>
     */
     val SUBSTRUCTURE_TARGET_GROUP_ID_DATA_KEY: EdgeDataKey<Any>
    
    /**
     * A [data key][NodeDataKey] for publishing the z-coordinate for all non-group nodes in the graph.
     * @see [OrganicLayoutData.zCoordinatesResult]
     * @see [create3DLayout]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayout%23Z_COORDINATE_RESULT_DATA_KEY">Online Documentation</a>
     */
     val Z_COORDINATE_RESULT_DATA_KEY: NodeDataKey<Number>
  }
}

inline fun OrganicLayout(
    block: OrganicLayout.() -> Unit
): OrganicLayout {
    return OrganicLayout()
        .apply(block)
}
