// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.multipage

import yfiles.geometry.Size
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.labeling.GenericLabeling
import yfiles.lang.Action1
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan
import yfiles.layout.EdgeDataKey
import yfiles.layout.EdgeLabelDataKey
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutEdgeLabel
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode
import yfiles.layout.LayoutNodeLabel
import yfiles.layout.LayoutStageBase
import yfiles.layout.NodeDataKey
import yfiles.layout.NodeLabelDataKey

/**
 * This layout algorithm subdivides the input graph into several [LayoutGraph]s (called page graphs) such that the layout (calculated by the specified [coreLayout][LayoutStageBase]) of each graph fits the [maximumPageSize][MultiPageLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [MultiPageLayout] instance.
 * @param [coreLayout] the layout algorithm used for a single page
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23MultiPageLayout-constructor-MultiPageLayout">Online Documentation</a>
 */
open external class MultiPageLayout (
  coreLayout: ILayoutAlgorithm?  = definedExternally,
) : LayoutStageBase {
  /**
   * Gets or sets the number of additional tree parent [proxies][MultiPageNodeType] that the algorithm tries to place on a page.
   * 
   * Default value - `0`. No additional parent proxies are placed on a page.
   * @throws ArgumentError if the given additional parent count is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23additionalParentCount">Online Documentation</a>
   */
  final var additionalParentCount: Int
  
  /**
   * Gets or sets the [element factory][MultiPageElementFactory] for creating special nodes and edges during the layout process.
   * 
   * Default value - [MultiPageElementFactory]
   * @see [MultiPageElementFactory]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23elementFactory">Online Documentation</a>
   */
  final var elementFactory: MultiPageElementFactory
  
  /**
   * Gets the labeling algorithm that places the labels of the input graph.
   * 
   * Default value - [GenericLabeling]. A disabled instance with [stopDuration][GenericLabeling] set to [ZERO][TimeSpan].
   * @see [GenericLabeling]
   * @see [LayoutStageBase.enabled]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23genericLabeling">Online Documentation</a>
   */
  final val genericLabeling: GenericLabeling
  
  /**
   * Gets or sets how to handle special nodes (like connector and proxy nodes) with respect to groups.
   * 
   * Default value - [MultiPageGroupingPolicy.ALL_NODES]. Special nodes are also assigned to the associated groups.
   * @see [MultiPageNodeType.CONNECTOR]
   * @see [MultiPageNodeType.PROXY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23groupingPolicy">Online Documentation</a>
   */
  final var groupingPolicy: MultiPageGroupingPolicy
  
  /**
   * Gets or sets a callback that is notified upon completion of multi-page layout calculation.
   * 
   * Default value - `null`. No layout callback is set.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23layoutCallback">Online Documentation</a>
   */
  final var layoutCallback: Action1<MultiPageLayoutResult>?
  
  /**
   * Gets or sets the maximum size of a single page.
   * 
   * Default value - `1000x1000`. The width and height of the page are set to `1000`.
   * @throws ArgumentError if the specified width or height is not positive
   * @see [stopDuration]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23maximumPageSize">Online Documentation</a>
   */
  final var maximumPageSize: Size
  
  /**
   * Gets or sets the policy for defining which multi-edges may share a connector node.
   * 
   * Default value - `MultiEdgeConnectorPolicy.Share`. All split multi-edges use the same connector nodes.
   * @see [MultiPageNodeType.CONNECTOR]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23multiEdgeConnectorPolicy">Online Documentation</a>
   */
  final var multiEdgeConnectorPolicy: MultiEdgeConnectorPolicy
  
  /**
   * Gets or sets whether or not different connected components may be placed on a single page.
   * 
   * Default value - `true`. Different components may be placed on a single page.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23multipleComponentsOnSinglePage">Online Documentation</a>
   */
  final var multipleComponentsOnSinglePage: Boolean
  
  /**
   * Gets or sets the preferred time limit for the layout algorithm.
   * 
   * Default value - [TimeSpan.MAX_VALUE]. The layout algorithm runs unrestricted.
   * @throws ArgumentError if the preferred time limit is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23stopDuration">Online Documentation</a>
   */
  final var stopDuration: TimeSpan
  
  /**
   * Gets or sets whether or not the algorithm should separate nodes with different [cluster IDs][MultiPageLayoutData].
   * 
   * Default value - `false`. Nodes with different cluster IDs may be placed on the same page.
   * @see [MultiPageLayoutData.nodeClusterIds]
   * @see [NODE_CLUSTER_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23strictClusterSeparation">Online Documentation</a>
   */
  final var strictClusterSeparation: Boolean
  
  /**
   * Gets or sets whether or not the algorithm should create [PROXY_REFERENCE][MultiPageNodeType] nodes.
   * 
   * Default value - `true`. The algorithm creates proxy reference nodes.
   * @see [MultiPageNodeType.PROXY_REFERENCE]
   * @see [MultiPageNodeType.PROXY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23useProxyReferenceNodes">Online Documentation</a>
   */
  final var useProxyReferenceNodes: Boolean
  
  /**
   * Calculates a new multi-page layout for the specified graph.
   * @param [graph] the input graph
   * @throws ArgumentError if no unique ids are defined with [NODE_ID_DATA_KEY][MultiPageLayout], [EDGE_ID_DATA_KEY][MultiPageLayout], [NODE_LABEL_ID_DATA_KEY][MultiPageLayout], or [EDGE_LABEL_ID_DATA_KEY][MultiPageLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23MultiPageLayout-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [MultiPageLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [MultiPageLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23MultiPageLayout-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): MultiPageLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [MultiPageLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [MultiPageLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23MultiPageLayout-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph  = definedExternally,
  ): MultiPageLayoutData<INode, IEdge, ILabel, ILabel>
  
  companion object : ClassMetadata<MultiPageLayout> {
    /**
     * A [data key][EdgeDataKey] for mapping each edge of the input graph to a unique ID.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23EDGE_ID_DATA_KEY">Online Documentation</a>
     */
     val EDGE_ID_DATA_KEY: EdgeDataKey<Any>
    
    /**
     * A [data key][EdgeLabelDataKey] for mapping each edge label of the input graph to a unique ID.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23EDGE_LABEL_ID_DATA_KEY">Online Documentation</a>
     */
     val EDGE_LABEL_ID_DATA_KEY: EdgeLabelDataKey<Any>
    
    /**
     * A [data key][EdgeDataKey] for specifying which multi-edges may share a connector node.
     * @see [MultiPageLayoutData.multiEdgeConnectorIds]
     * @see [multiEdgeConnectorPolicy]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23MULTI_EDGE_CONNECTOR_ID_DATA_KEY">Online Documentation</a>
     */
     val MULTI_EDGE_CONNECTOR_ID_DATA_KEY: EdgeDataKey<Any>
    
    /**
     * A [data key][NodeDataKey] for assigning a cluster ID to common (non-group) nodes.
     * @see [MultiPageLayoutData.nodeClusterIds]
     * @see [strictClusterSeparation]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23NODE_CLUSTER_ID_DATA_KEY">Online Documentation</a>
     */
     val NODE_CLUSTER_ID_DATA_KEY: NodeDataKey<Any>
    
    /**
     * A [data key][NodeDataKey] for mapping each node of the input graph to a unique ID.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23NODE_ID_DATA_KEY">Online Documentation</a>
     */
     val NODE_ID_DATA_KEY: NodeDataKey<Any>
    
    /**
     * A [data key][NodeLabelDataKey] for mapping each node label of the input graph to a unique ID.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23NODE_LABEL_ID_DATA_KEY">Online Documentation</a>
     */
     val NODE_LABEL_ID_DATA_KEY: NodeLabelDataKey<Any>
  }
}

inline fun MultiPageLayout(
    block: MultiPageLayout.() -> Unit
): MultiPageLayout {
    return MultiPageLayout()
        .apply(block)
}
