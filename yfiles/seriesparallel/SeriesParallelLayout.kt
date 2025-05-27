// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.seriesparallel

import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.labeling.GenericLabeling
import yfiles.lang.ClassMetadata
import yfiles.lang.Comparison1
import yfiles.layout.ComponentLayout
import yfiles.layout.EdgeDataKey
import yfiles.layout.EdgeLabelPlacement
import yfiles.layout.ILayoutAlgorithm
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
 * This layout algorithm arranges series-parallel graphs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [SeriesParallelLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23SeriesParallelLayout-constructor-SeriesParallelLayout">Online Documentation</a>
 */
open external class SeriesParallelLayout () : ILayoutAlgorithm {
  /**
   * Gets the [ComponentLayout] from the [layoutStages][SeriesParallelLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][SeriesParallelLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23componentLayout">Online Documentation</a>
   */
  final val componentLayout: ComponentLayout
  
  /**
   * Gets or sets the [SeriesParallelLayoutEdgeDescriptor] instance used for all those edges that do not have a [specific descriptor][SeriesParallelLayoutData] assigned.
   * 
   * Default value - [SeriesParallelLayoutEdgeDescriptor]
   * @see [SeriesParallelLayoutData.edgeDescriptors]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23defaultEdgeDescriptor">Online Documentation</a>
   */
  final var defaultEdgeDescriptor: SeriesParallelLayoutEdgeDescriptor
  
  /**
   * Gets or sets the default [ISeriesParallelLayoutPortAssigner] used for those nodes that do not have an [individual port assigner][SeriesParallelLayoutData] specified.
   * 
   * Default value - [SeriesParallelLayoutPortAssigner]. All ports are [DISTRIBUTED][SeriesParallelLayoutPortAssignmentMode] on the borders of the nodes.
   * @throws ArgumentError if `null` is specified
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23defaultPortAssigner">Online Documentation</a>
   */
  final var defaultPortAssigner: ISeriesParallelLayoutPortAssigner
  
  /**
   * Gets or sets how the layout handles the position of edge labels.
   * 
   * Default value - [EdgeLabelPlacement.INTEGRATED]. Edge labels are placed by the layout algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23edgeLabelPlacement">Online Documentation</a>
   */
  final var edgeLabelPlacement: EdgeLabelPlacement
  
  /**
   * Gets or sets the routing style for edges.
   * 
   * Default value - [SeriesParallelLayoutRoutingStyle.ORTHOGONAL]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23edgeRoutingStyle">Online Documentation</a>
   */
  final var edgeRoutingStyle: SeriesParallelLayoutRoutingStyle
  
  /**
   * Gets or sets whether or not to take the coordinates of the input diagram into account when arranging the nodes.
   * 
   * Default value - `false`. The initial coordinates of the nodes are not considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23fromSketchMode">Online Documentation</a>
   */
  final var fromSketchMode: Boolean
  
  /**
   * Gets or sets the [layoutOrientation][SeriesParallelLayout] of this layout algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23layoutOrientation">Online Documentation</a>
   */
  final var layoutOrientation: LayoutOrientation
  
  /**
   * Gets the mutable stack of [ILayoutStage][yfiles.layout.ILayoutStage] that will be applied to this layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23layoutStages">Online Documentation</a>
   */
  final val layoutStages: LayoutStageStack
  
  /**
   * Gets or sets the minimum distance between edges.
   * 
   * Default value - `5`
   * @throws ArgumentError if the specified distance is smaller than `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23minimumEdgeDistance">Online Documentation</a>
   */
  final var minimumEdgeDistance: Double
  
  /**
   * Gets or sets the minimum distance between nodes.
   * 
   * Default value - `10`
   * @throws ArgumentError if the specified distance is smaller than `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23minimumNodeDistance">Online Documentation</a>
   */
  final var minimumNodeDistance: Double
  
  /**
   * Gets or sets the minimum distance between nodes and edges.
   * 
   * Default value - `10`
   * @throws ArgumentError if the specified distance is smaller than `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23minimumNodeToEdgeDistance">Online Documentation</a>
   */
  final var minimumNodeToEdgeDistance: Double
  
  /**
   * Gets or sets the minimum vertical distance of the edge segments that are not orthogonal.
   * 
   * Default value - `30`
   * @throws ArgumentError if the specified length is smaller than `0`
   * @see [minimumSlope]
   * @see [edgeRoutingStyle]
   * @see [SeriesParallelLayoutRoutingStyle.POLYLINE]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23minimumPolylineSegmentLength">Online Documentation</a>
   */
  final var minimumPolylineSegmentLength: Double
  
  /**
   * Gets or sets the minimum slope which a non-orthogonal edge segment should have.
   * 
   * Default value - `0.25`
   * @throws ArgumentError if the specified slope is smaller than `0`
   * @see [minimumPolylineSegmentLength]
   * @see [edgeRoutingStyle]
   * @see [SeriesParallelLayoutRoutingStyle.POLYLINE]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23minimumSlope">Online Documentation</a>
   */
  final var minimumSlope: Double
  
  /**
   * Gets or sets how the layout handles the position of node labels.
   * 
   * Default value - [NodeLabelPlacement.CONSIDER]. Node labels are considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23nodeLabelPlacement">Online Documentation</a>
   */
  final var nodeLabelPlacement: NodeLabelPlacement
  
  /**
   * Gets or sets the labeling algorithm that is applied to all edge labels that belong to non-series-parallel edges.
   * 
   * Default value - [GenericLabeling]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23nonSeriesParallelEdgeLabeling">Online Documentation</a>
   */
  final var nonSeriesParallelEdgeLabeling: GenericLabeling?
  
  /**
   * Gets or sets the edge routing algorithm used for the edges of a general graph that are not part of the series-parallel subgraph whose layout is calculated.
   * 
   * Default value - [EdgeRouter][yfiles.router.EdgeRouter]
   * @throws ArgumentError if `null` is specified
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23nonSeriesParallelEdgeRouter">Online Documentation</a>
   */
  final var nonSeriesParallelEdgeRouter: ILayoutAlgorithm
  
  /**
   * Gets the [ParallelEdgeRouter] from the [layoutStages][SeriesParallelLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][SeriesParallelLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23parallelEdgeRouter">Online Documentation</a>
   */
  final val parallelEdgeRouter: ParallelEdgeRouter
  
  /**
   * Gets or sets the alignment of parallel subgraphs.
   * 
   * Default value - `0.5`. Subgraphs are center aligned.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23parallelSubgraphAlignment">Online Documentation</a>
   */
  final var parallelSubgraphAlignment: Double
  
  /**
   * Gets or sets the preferred length for non-orthogonal segments in octilinear edge routes.
   * 
   * Default value - `10`
   * @throws ArgumentError if the specified length is smaller than `0`
   * @see [edgeRoutingStyle]
   * @see [SeriesParallelLayoutRoutingStyle.OCTILINEAR]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23preferredOctilinearSegmentLength">Online Documentation</a>
   */
  final var preferredOctilinearSegmentLength: Double
  
  /**
   * Gets the [SelfLoopRouter] from the [layoutStages][SeriesParallelLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][SeriesParallelLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23selfLoopRouter">Online Documentation</a>
   */
  final val selfLoopRouter: SelfLoopRouter
  
  /**
   * Calculates a series-parallel layout of the graph.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23SeriesParallelLayout-method-applyLayout">Online Documentation</a>
   */
  override fun applyLayout(
    graph: LayoutGraph,
  )
  
  /**
   * Calculates a series-parallel layout for the given graph.
   * @param [graph] the input graph
   * @throws ArgumentError if the graph is not series-parallel
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23SeriesParallelLayout-method-applyLayoutCore">Online Documentation</a>
   */
  protected fun applyLayoutCore(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [SeriesParallelLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [SeriesParallelLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23SeriesParallelLayout-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): SeriesParallelLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [SeriesParallelLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [SeriesParallelLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23SeriesParallelLayout-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): SeriesParallelLayoutData<INode, IEdge, ILabel, ILabel>
  
  companion object : ClassMetadata<SeriesParallelLayout> {
    /**
     * A [data key][EdgeDataKey] for storing individual settings for edges.
     * @see [SeriesParallelLayoutData.edgeDescriptors]
     * @see [defaultEdgeDescriptor]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23EDGE_DESCRIPTOR_DATA_KEY">Online Documentation</a>
     */
     val EDGE_DESCRIPTOR_DATA_KEY: EdgeDataKey<SeriesParallelLayoutEdgeDescriptor>
    
    /**
     * A [data key][NodeDataKey] for assigning different orderings for outgoing edges of the nodes.
     * @see [SeriesParallelLayoutData.childOrder]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23OUT_EDGE_COMPARATOR_DATA_KEY">Online Documentation</a>
     */
     val OUT_EDGE_COMPARATOR_DATA_KEY: NodeDataKey<Comparison1<LayoutEdge>>
    
    /**
     * A [data key][NodeDataKey] for providing an individual port distribution at nodes.
     * @see [SeriesParallelLayoutData.portAssigners]
     * @see [defaultPortAssigner]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23PORT_ASSIGNER_DATA_KEY">Online Documentation</a>
     */
     val PORT_ASSIGNER_DATA_KEY: NodeDataKey<ISeriesParallelLayoutPortAssigner>
    
    /**
     * Determines whether or not the given graph has a series-parallel structure.
     * @receiver the input graph
     * @return `true` if the given graph is series-parallel, `false` otherwise
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayout%23SeriesParallelLayout-method-isSeriesParallelGraph">Online Documentation</a>
     */
    fun LayoutGraph.isSeriesParallelGraph(): Boolean
  }
}

inline fun SeriesParallelLayout(
    block: SeriesParallelLayout.() -> Unit
): SeriesParallelLayout {
    return SeriesParallelLayout()
        .apply(block)
}
