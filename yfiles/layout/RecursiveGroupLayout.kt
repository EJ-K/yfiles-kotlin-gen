// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.IEnumerable
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * This layout algorithm recursively traverses a hierarchically organized graph in a bottom-up fashion and applies a specified layout algorithm to the contents (direct children) of each group node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [RecursiveGroupLayout].
 * @param [coreLayout] The layout algorithm that is applied in each step of the recursion. The default value is `null`.
 * @param [groupBoundsCalculator] An optional [ILayoutGroupBoundsCalculator] for calculating group sizes. The default value is [GroupBoundsCalculator].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23RecursiveGroupLayout-constructor-RecursiveGroupLayout">Online Documentation</a>
 */
open external class RecursiveGroupLayout (
  coreLayout: ILayoutAlgorithm?  = definedExternally,
  groupBoundsCalculator: ILayoutGroupBoundsCalculator  = definedExternally,
) : LayoutStageBase {
  /**
   * Gets or sets whether or not temporary [LayoutPortCandidate]s are inserted to improve the routing of inter-edges.
   * 
   * Default value - `false`. No temporary [LayoutPortCandidate]s are added.
   * @see [routeInterEdges]
   * @see [interEdgeRouter]
   * @see [LayoutPortCandidate]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23autoAssignPortCandidates">Online Documentation</a>
   */
  final var autoAssignPortCandidates: Boolean
  
  /**
   * Gets or sets whether empty group nodes are handled like group nodes with content or like normal nodes.
   * 
   * Default value - `false`. Empty group nodes are not resized.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23considerEmptyGroups">Online Documentation</a>
   */
  final var considerEmptyGroups: Boolean
  
  /**
   * Gets or sets whether or not to consider the initial coordinates of the graph elements.
   * 
   * Default value - `false`. The initial coordinates of the nodes are not taken into account.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23fromSketchMode">Online Documentation</a>
   */
  final var fromSketchMode: Boolean
  
  /**
   * Gets or sets a [ILayoutGroupBoundsCalculator] which computes the sizes of all group nodes.
   * 
   * Default value - [GroupBoundsCalculator]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23groupBoundsCalculator">Online Documentation</a>
   */
  final var groupBoundsCalculator: ILayoutGroupBoundsCalculator?
  
  /**
   * Gets or sets the current edge routing algorithm for handling inter-edges.
   * 
   * Default value - `null`. Edges are routed as straight lines from source to target.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23interEdgeRouter">Online Documentation</a>
   */
  final var interEdgeRouter: ILayoutAlgorithm?
  
  /**
   * Invokes a recursive traversal through the grouping hierarchy of the given graph during which the specified [layout algorithms][RecursiveGroupLayoutData] are applied to the content of the groups.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23RecursiveGroupLayout-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData] that can be used to perform item-specific configurations for the [RecursiveGroupLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][LayoutData] that can be used to perform item-specific configurations for the given [RecursiveGroupLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23RecursiveGroupLayout-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): RecursiveGroupLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData] that can be used to perform item-specific configurations for the [RecursiveGroupLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][LayoutData] that can be used to perform item-specific configurations for the given [RecursiveGroupLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23RecursiveGroupLayout-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): RecursiveGroupLayoutData<INode, IEdge, ILabel, ILabel>
  
  /**
   * Reroutes the given inter-edges using the current [edge routing algorithm][RecursiveGroupLayout].
   * @param [graph] the input graph
   * @param [interEdges] the edges which traverse the boundary of a group node
   * @see [autoAssignPortCandidates]
   * @see [interEdgeRouter]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23RecursiveGroupLayout-method-routeInterEdges">Online Documentation</a>
   */
  protected open fun routeInterEdges(
    graph: LayoutGraph,
    interEdges: IEnumerable<LayoutEdge>,
  )
  
  companion object : ClassMetadata<RecursiveGroupLayout> {
    /**
     * A constant that represents a [ILayoutAlgorithm] implementation that does nothing.
     * @see [RecursiveGroupLayoutData.groupNodeLayouts]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23FIX_CONTENT_LAYOUT">Online Documentation</a>
     */
     val FIX_CONTENT_LAYOUT: ILayoutAlgorithm
    
    /**
     * A constant that represents a [ILayoutAlgorithm] implementation that does nothing.
     * @see [RecursiveGroupLayoutData.groupNodeLayouts]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23FIX_GROUP_LAYOUT">Online Documentation</a>
     */
     val FIX_GROUP_LAYOUT: ILayoutAlgorithm
    
    /**
     * A [data key][NodeDataKey] for arranging the content of each group node with an individual layout algorithm.
     * @see [FIX_CONTENT_LAYOUT]
     * @see [FIX_GROUP_LAYOUT]
     * @see [NON_RECURSIVE_LAYOUT]
     * @see [RecursiveGroupLayoutData.groupNodeLayouts]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23GROUP_NODE_LAYOUT_DATA_KEY">Online Documentation</a>
     */
     val GROUP_NODE_LAYOUT_DATA_KEY: NodeDataKey<ILayoutAlgorithm>
    
    /**
     * A constant that represents a [ILayoutAlgorithm] implementation that delegates to the [coreLayout][ILayoutStage].
     * @see [RecursiveGroupLayoutData.groupNodeLayouts]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23NON_RECURSIVE_LAYOUT">Online Documentation</a>
     */
     val NON_RECURSIVE_LAYOUT: ILayoutAlgorithm
    
    /**
     * A [data key][EdgeDataKey] for assigning source split ids to edges connecting to group nodes.
     * @see [TARGET_SPLIT_ID_DATA_KEY]
     * @see [HierarchicalLayout][yfiles.hierarchic.HierarchicalLayout]
     * @see [HierarchicalLayoutEdgeDescriptor.directGroupContentEdgeRouting][yfiles.hierarchic.HierarchicalLayoutEdgeDescriptor.directGroupContentEdgeRouting]
     * @see [RecursiveGroupLayoutData.sourceSplitIds]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23SOURCE_SPLIT_ID_DATA_KEY">Online Documentation</a>
     */
     val SOURCE_SPLIT_ID_DATA_KEY: EdgeDataKey<Any>
    
    /**
     * A [data key][EdgeDataKey] for assigning target split ids to edges connecting to group nodes.
     * @see [SOURCE_SPLIT_ID_DATA_KEY]
     * @see [HierarchicalLayout][yfiles.hierarchic.HierarchicalLayout]
     * @see [HierarchicalLayoutEdgeDescriptor.directGroupContentEdgeRouting][yfiles.hierarchic.HierarchicalLayoutEdgeDescriptor.directGroupContentEdgeRouting]
     * @see [RecursiveGroupLayoutData.targetSplitIds]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayout%23TARGET_SPLIT_ID_DATA_KEY">Online Documentation</a>
     */
     val TARGET_SPLIT_ID_DATA_KEY: EdgeDataKey<Any>
  }
}

inline fun RecursiveGroupLayout(
    block: RecursiveGroupLayout.() -> Unit
): RecursiveGroupLayout {
    return RecursiveGroupLayout()
        .apply(block)
}
