// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
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
 * This layout algorithm arranges graphs with a tree structure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [TreeLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-constructor-TreeLayout">Online Documentation</a>
 */
open external class TreeLayout () : ILayoutAlgorithm {
  /**
   * Gets or sets whether or not multi-parent structures are allowed for this tree layout.
   * 
   * Default value - `false`. Multi-parent structures are not allowed.
   * @see [TreeLayoutData.multiParentDescriptors]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23allowMultiParent">Online Documentation</a>
   */
  final var allowMultiParent: Boolean
  
  /**
   * Gets the [ComponentLayout] from the [layoutStages][TreeLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][TreeLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23componentLayout">Online Documentation</a>
   */
  final val componentLayout: ComponentLayout
  
  /**
   * Gets or sets the default [ITreeLayoutPortAssigner] used for those nodes that do not have an [individual port assigner][TreeLayoutData] specified.
   * 
   * Default value - [TreeLayoutPortAssigner]
   * @throws ArgumentError if the default [ITreeLayoutPortAssigner] is set to `null`
   * @see [TreeLayoutData.portAssigners]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23defaultPortAssigner">Online Documentation</a>
   */
  final var defaultPortAssigner: ITreeLayoutPortAssigner
  
  /**
   * Gets or sets the default [ISubtreePlacer] instance that arranges all subtrees of local roots that do not have an [individual subtree placer][TreeLayoutData] assigned.
   * 
   * Default value - [SingleLayerSubtreePlacer]
   * @throws ArgumentError if the default [ISubtreePlacer] is set to `null`
   * @see [TreeLayoutData.subtreePlacers]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23defaultSubtreePlacer">Online Documentation</a>
   */
  final var defaultSubtreePlacer: ISubtreePlacer
  
  /**
   * Gets or sets how the layout handles the position of edge labels.
   * 
   * Default value - [EdgeLabelPlacement.INTEGRATED]. Edge labels are placed by the layout algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23edgeLabelPlacement">Online Documentation</a>
   */
  final var edgeLabelPlacement: EdgeLabelPlacement
  
  /**
   * Gets or sets whether or not to consider the initial coordinates of the graph elements.
   * 
   * Default value - `false`. The existing drawing is not used as a sketch.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23fromSketchMode">Online Documentation</a>
   */
  final var fromSketchMode: Boolean
  
  /**
   * Gets or sets the [layoutOrientation][TreeLayout] of this layout algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23layoutOrientation">Online Documentation</a>
   */
  final var layoutOrientation: LayoutOrientation
  
  /**
   * Gets the mutable stack of [ILayoutStage][yfiles.layout.ILayoutStage] that will be applied to this layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23layoutStages">Online Documentation</a>
   */
  final val layoutStages: LayoutStageStack
  
  /**
   * Gets or sets how the layout handles the position of node labels.
   * 
   * Default value - [NodeLabelPlacement.CONSIDER]. Node labels are considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23nodeLabelPlacement">Online Documentation</a>
   */
  final var nodeLabelPlacement: NodeLabelPlacement
  
  /**
   * Gets the [ParallelEdgeRouter] from the [layoutStages][TreeLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][TreeLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23parallelEdgeRouter">Online Documentation</a>
   */
  final val parallelEdgeRouter: ParallelEdgeRouter
  
  /**
   * Gets the [SelfLoopRouter] from the [layoutStages][TreeLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][TreeLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23selfLoopRouter">Online Documentation</a>
   */
  final val selfLoopRouter: SelfLoopRouter
  
  /**
   * Gets the [TreeReductionStage] from the [layoutStages][TreeLayout] of this instance.
   * @throws InvalidOperationError If there is no instance of the respective type in the [layoutStages][TreeLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23treeReductionStage">Online Documentation</a>
   */
  final val treeReductionStage: TreeReductionStage
  
  /**
   * Calculates a tree layout of the graph.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-applyLayout">Online Documentation</a>
   */
  override fun applyLayout(
    graph: LayoutGraph,
  )
  
  /**
   * Arranges the given graph as a tree.
   * @param [graph] The input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-applyLayoutCore">Online Documentation</a>
   */
  protected fun applyLayoutCore(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [TreeLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [TreeLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): TreeLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [TreeLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [TreeLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): TreeLayoutData<INode, IEdge, ILabel, ILabel>
  
  /**
   * Returns the [ITreeLayoutPortAssigner] instance that places the ports of the connecting edges of the given node.
   * @param [localRoot] the root of the local subtree
   * @return the [ITreeLayoutPortAssigner] instance that assigns the ports of the edges at the given node
   * @see [TreeLayoutData.portAssigners]
   * @see [defaultPortAssigner]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-getPortAssigner">Online Documentation</a>
   */
  protected fun getPortAssigner(
    localRoot: LayoutNode,
  ): ITreeLayoutPortAssigner
  
  /**
   * Returns the [ISubtreePlacer] instance that is used for the placement of the local root node and the [SubtreeShape]s.
   * @param [localRoot] the root of the local subtree
   * @return the [ISubtreePlacer] instance that places the subtree below the given local root node
   * @see [TreeLayoutData.subtreePlacers]
   * @see [defaultSubtreePlacer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-getSubtreePlacer">Online Documentation</a>
   */
  protected fun getSubtreePlacer(
    localRoot: LayoutNode,
  ): ISubtreePlacer
  
  /**
   * Provides access to the [SubtreeShape] for the given node.
   * @param [localRoot] the root of the subtree
   * @return the [SubtreeShape] instance if it has already been calculated, `null` otherwise
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-getSubtreeShape">Online Documentation</a>
   */
  protected fun getSubtreeShape(
    localRoot: LayoutNode,
  ): SubtreeShape?
  
  /**
   * Calculates the layout for the given root node and its subtrees.
   * @param [graph] the input graph the tree layout algorithm is working on
   * @param [localRoot] the root of the subtree whose layout is calculated
   * @return the combined [SubtreeShape] of the local root node and all of its children and connecting edges
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-layoutRoot">Online Documentation</a>
   */
  protected open fun layoutRoot(
    graph: LayoutGraph,
    localRoot: LayoutNode,
  ): SubtreeShape
  
  /**
   * Modifies the calculated [SubtreeShape] for the given node that consists only of the bounds of this particular node.
   * @param [node] the given node
   * @param [subtreeShape] the calculated subtree shape for the given node
   * @return the [SubtreeShape] that describes the node's shape for the remaining layout calculations.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-modifyNodeShape">Online Documentation</a>
   */
  protected open fun modifyNodeShape(
    node: LayoutNode,
    subtreeShape: SubtreeShape,
  ): SubtreeShape
  
  companion object : ClassMetadata<TreeLayout> {
    /**
     * A [data key][EdgeDataKey] for defining the priority of critical edges.
     * @see [TreeLayoutData.criticalEdgePriorities]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23CRITICAL_EDGE_DATA_KEY">Online Documentation</a>
     */
     val CRITICAL_EDGE_DATA_KEY: EdgeDataKey<Number>
    
    /**
     * A [data key][NodeDataKey] for retrieving descriptors for nodes in multi-parent structures.
     * @see [allowMultiParent]
     * @see [TreeLayoutData.multiParentDescriptors]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23MULTI_PARENT_DESCRIPTOR_DATA_KEY">Online Documentation</a>
     */
     val MULTI_PARENT_DESCRIPTOR_DATA_KEY: NodeDataKey<MultiParentDescriptor>
    
    /**
     * A [data key][NodeDataKey] for specifying the comparer for the outgoing edges.
     * @see [TreeLayoutData.childOrder]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23OUT_EDGE_COMPARATOR_DATA_KEY">Online Documentation</a>
     */
     val OUT_EDGE_COMPARATOR_DATA_KEY: NodeDataKey<Comparison1<LayoutEdge>>
    
    /**
     * A [data key][NodeDataKey] for assigning ports to nodes.
     * @see [TreeLayoutData.portAssigners]
     * @see [defaultPortAssigner]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23PORT_ASSIGNER_DATA_KEY">Online Documentation</a>
     */
     val PORT_ASSIGNER_DATA_KEY: NodeDataKey<ITreeLayoutPortAssigner>
    
    /**
     * A [data key][NodeDataKey] for marking the node that will be used as root node of the tree.
     * @see [TreeLayoutData.treeRoot]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23SELECTED_ROOT_DATA_KEY">Online Documentation</a>
     */
     val SELECTED_ROOT_DATA_KEY: NodeDataKey<Boolean>
    
    /**
     * A [data key][NodeDataKey] for specifying a child subtree placer for each node.
     * @see [TreeLayoutData.subtreePlacers]
     * @see [defaultSubtreePlacer]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23SUBTREE_PLACER_DATA_KEY">Online Documentation</a>
     */
     val SUBTREE_PLACER_DATA_KEY: NodeDataKey<ISubtreePlacer>
  }
}

inline fun TreeLayout(
    block: TreeLayout.() -> Unit
): TreeLayout {
    return TreeLayout()
        .apply(block)
}
