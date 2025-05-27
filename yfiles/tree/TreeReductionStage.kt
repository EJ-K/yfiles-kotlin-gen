// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.collections.IMapper
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.labeling.GenericLabeling
import yfiles.lang.ClassMetadata
import yfiles.layout.EdgeBundling
import yfiles.layout.EdgeDataKey
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutEdgeLabel
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode
import yfiles.layout.LayoutNodeLabel
import yfiles.layout.LayoutStageBase

/**
 * The [TreeReductionStage] temporarily reduces general graphs to trees.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage">Online Documentation</a>
 * 
 * @constructor Creates a new [TreeReductionStage] instance with the given core layout algorithm and default settings.
 * @param [coreLayout] the core layout algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23TreeReductionStage-constructor-TreeReductionStage">Online Documentation</a>
 */
open external class TreeReductionStage (
  coreLayout: ILayoutAlgorithm?  = definedExternally,
) : LayoutStageBase {
  /**
   * Gets or sets whether or not multi-parent structures (structures of multiple nodes that share the same predecessors as well as the same successors) are allowed.
   * 
   * Default value - `false`. The reduced graph is a normal tree.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23allowMultiParent">Online Documentation</a>
   */
  final var allowMultiParent: Boolean
  
  /**
   * Gets the [EdgeBundling] instance that defines the settings of the edge bundling feature.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23edgeBundling">Online Documentation</a>
   */
  final val edgeBundling: EdgeBundling
  
  /**
   * Gets or sets the labeling algorithm that is applied to all edge labels that belong to non-tree edges.
   * 
   * Default value - `null`. Edge labels of non-tree edges are not placed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23nonTreeEdgeLabeling">Online Documentation</a>
   */
  final var nonTreeEdgeLabeling: GenericLabeling?
  
  /**
   * Gets or sets the edge routing algorithm that is applied to all non-tree edges.
   * 
   * Default value - `null`. Non-tree edges are not routed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23nonTreeEdgeRouter">Online Documentation</a>
   */
  final var nonTreeEdgeRouter: ILayoutAlgorithm?
  
  /**
   * Determines a spanning tree of the graph and passes it to the [coreLayout][LayoutStageBase].
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23TreeReductionStage-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [TreeReductionStage].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [TreeReductionStage].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23TreeReductionStage-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): TreeReductionStageData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [TreeReductionStage].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [TreeReductionStage].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23TreeReductionStage-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): TreeReductionStageData<INode, IEdge, ILabel, ILabel>
  
  /**
   * Routes all edges that do not belong to the chosen spanning tree.
   * @param [graph] the graph containing tree and non-tree edges
   * @param [nonTreeEdgeMap] the [IMapper] that marks an edge with `true` if the edge is a non-tree edge, or `false` otherwise
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23TreeReductionStage-method-routeNonTreeEdges">Online Documentation</a>
   */
  protected open fun routeNonTreeEdges(
    graph: LayoutGraph,
    nonTreeEdgeMap: IMapper<LayoutEdge, Boolean>,
  )
  
  companion object : ClassMetadata<TreeReductionStage> {
    /**
     * A [data key][EdgeDataKey] for explicitly marking (some) edges that should not be considered for the tree.
     * @see [TreeReductionStageData.nonTreeEdges]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23NON_TREE_EDGES_DATA_KEY">Online Documentation</a>
     */
     val NON_TREE_EDGES_DATA_KEY: EdgeDataKey<Boolean>
    
    /**
     * A [data key][EdgeDataKey] for publishing the non-tree edges that this stage actually selected.
     * @see [nonTreeEdgeRouter]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStage%23NON_TREE_EDGES_RESULT_DATA_KEY">Online Documentation</a>
     */
     val NON_TREE_EDGES_RESULT_DATA_KEY: EdgeDataKey<Boolean>
  }
}

inline fun TreeReductionStage(
    block: TreeReductionStage.() -> Unit
): TreeReductionStage {
    return TreeReductionStage()
        .apply(block)
}
