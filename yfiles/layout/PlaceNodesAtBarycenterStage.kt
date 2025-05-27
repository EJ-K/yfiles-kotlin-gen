// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.geometry.ISize
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * [PlaceNodesAtBarycenterStage] temporarily hides the [affectedNodes][PlaceNodesAtBarycenterStageData], applies the specified core layout algorithm (if any) to the resulting graph and, finally, reinserts the hidden nodes by placing them on the barycenter of their neighbors using the specified [node sizes][PlaceNodesAtBarycenterStageData].
 * @see [GivenCoordinatesLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage">Online Documentation</a>
 * 
 * @constructor Creates a new [PlaceNodesAtBarycenterStage] instance using the given [coreLayout][LayoutStageBase].
 * @param [coreLayout] the core layout routine
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23PlaceNodesAtBarycenterStage-constructor-PlaceNodesAtBarycenterStage">Online Documentation</a>
 */
open external class PlaceNodesAtBarycenterStage (
  coreLayout: ILayoutAlgorithm?  = definedExternally,
) : LayoutStageBase {
  /**
   * Gets or sets whether or not the grouping structure should be considered.
   * 
   * Default value - `true`. The grouping structure is considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23considerGrouping">Online Documentation</a>
   */
  final var considerGrouping: Boolean
  
  /**
   * Gets or sets whether or not bends of edges incident to [affectedNodes][PlaceNodesAtBarycenterStageData] should be removed.
   * 
   * Default value - `true`. Bends should be removed.
   * @see [resetPorts]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23removeBends">Online Documentation</a>
   */
  final var removeBends: Boolean
  
  /**
   * Gets or sets whether or not ports of edges incident to [affectedNodes][PlaceNodesAtBarycenterStageData] should be set to the center of the corresponding nodes.
   * 
   * Default value - `false`. Ports are not set to the center.
   * @see [removeBends]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23resetPorts">Online Documentation</a>
   */
  final var resetPorts: Boolean
  
  /**
   * Starts the layout.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23PlaceNodesAtBarycenterStage-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData] that can be used to perform item-specific configurations for the [PlaceNodesAtBarycenterStage].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][LayoutData] that can be used to perform item-specific configurations for the given [PlaceNodesAtBarycenterStage].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23PlaceNodesAtBarycenterStage-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): PlaceNodesAtBarycenterStageData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData] that can be used to perform item-specific configurations for the [PlaceNodesAtBarycenterStage].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][LayoutData] that can be used to perform item-specific configurations for the given [PlaceNodesAtBarycenterStage].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23PlaceNodesAtBarycenterStage-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): PlaceNodesAtBarycenterStageData<INode, IEdge, ILabel, ILabel>
  
  companion object : ClassMetadata<PlaceNodesAtBarycenterStage> {
    /**
     * A [data key][NodeDataKey] for determining which nodes should be placed by this stage.
     * @see [PlaceNodesAtBarycenterStageData.affectedNodes]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23AFFECTED_NODES_DATA_KEY">Online Documentation</a>
     */
     val AFFECTED_NODES_DATA_KEY: NodeDataKey<Boolean>
    
    /**
     * A [data key][NodeDataKey] for specifying the size of affected nodes.
     * @see [PlaceNodesAtBarycenterStageData.affectedNodesSizes]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23AFFECTED_NODES_SIZE_DATA_KEY">Online Documentation</a>
     */
     val AFFECTED_NODES_SIZE_DATA_KEY: NodeDataKey<ISize>
  }
}

inline fun PlaceNodesAtBarycenterStage(
    block: PlaceNodesAtBarycenterStage.() -> Unit
): PlaceNodesAtBarycenterStage {
    return PlaceNodesAtBarycenterStage()
        .apply(block)
}
