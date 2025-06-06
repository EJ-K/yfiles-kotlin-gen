// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.lang.ClassMetadata
import yfiles.lang.Predicate

/**
 * This class adds folding support to [IGraph] implementations.
 * @see [IFoldingView]
 * @see [createFoldingView]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager">Online Documentation</a>
 * 
 * @constructor Creates a manager instance for the given [masterGraph][FoldingManager] to create views on top of it that support folding operations.
 * @param [masterGraph] The graph to use as the [masterGraph][FoldingManager].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23FoldingManager-constructor-FoldingManager(IGraph)">Online Documentation</a>
 * 
 * @property masterGraph
 * Gets the master [IGraph] instance that holds the complete model in expanded group node state.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23masterGraph">Online Documentation</a>
 */
external class FoldingManager (
final val masterGraph: IGraph = definedExternally)  {
  /**
   * Gets or sets the [IFolderNodeConverter] implementation that is used to create/convert and modify the folder nodes inside the view instances.
   * @see [FolderNodeConverter]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23folderNodeConverter">Online Documentation</a>
   */
  final var folderNodeConverter: IFolderNodeConverter
  
  /**
   * Gets or sets the [IFoldingEdgeConverter] implementation that is used to create/convert and modify the [folding edges][FoldingEdgeStateId] inside the view instances.
   * @throws ArgumentError `value` is null.
   * @see [FoldingEdgeConverter]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23foldingEdgeConverter">Online Documentation</a>
   */
  final var foldingEdgeConverter: IFoldingEdgeConverter
  
  /**
   * Gets all currently known [view instances][FoldingManager] that are managed by this instance.
   * @see [IFoldingView.graph]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23views">Online Documentation</a>
   */
  final val views: IEnumerable<IFoldingView>
  
  /**
   * Creates a separate view instance of the [masterGraph][FoldingManager] which is a synchronized copy of a subset of the items from the master graph.
   * @param [root] A group node or the root of the [masterGraph][FoldingManager] whose contents will be displayed in the view.
   * @param [isExpanded] A predicate that can be provided to the view that will be used as a callback to determine the initial [expansion state][IFoldingView] in the view when a [group node is created on the master graph][IGraph]. If the group is created on the graph of a [IFoldingView], e.g., the one that is typically shown in a [GraphComponent][yfiles.view.GraphComponent], a group is created regardless of this predicate.
   * @return A new graph instance that represents a synchronized view on the [masterGraph][FoldingManager].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23FoldingManager-method-createFoldingView">Online Documentation</a>
   */
  fun createFoldingView(
    root: INode?  = definedExternally,
    isExpanded: Predicate<INode>  = definedExternally,
  ): IFoldingView
  
  /**
   * Disposes of this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23FoldingManager-method-dispose">Online Documentation</a>
   */
  fun dispose()
  
  /**
   * Returns the [FoldingEdgeStateId]s of all edges whose folding state would change if the `groupNode` would be collapsed.
   * @param [view] The folding view that is used to determine the expansion state of group nodes.
   * @param [groupNode] The group node that should be considered as collapsed.
   * @return The FoldingEdgeStateIds of all edges whose folding state would change if the groupNode would be collapsed.
   * @see [FoldingEdgeState]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23FoldingManager-method-getEdgesChangedAfterCollapse">Online Documentation</a>
   */
  fun getEdgesChangedAfterCollapse(
    view: IFoldingView,
    groupNode: INode,
  ): IEnumerable<FoldingEdgeStateId>
  
  /**
   * Returns the [FoldingEdgeStateId]s of all edges whose folding state would change if the `groupNode` would be expanded.
   * @param [view] The folding view that is used to determine the expansion state of group nodes.
   * @param [groupNode] The group node that should be considered as expanded.
   * @return The FoldingEdgeStateIds of all edges whose folding state would change if the groupNode would be expanded.
   * @see [FoldingEdgeState]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23FoldingManager-method-getEdgesChangedAfterExpand">Online Documentation</a>
   */
  fun getEdgesChangedAfterExpand(
    view: IFoldingView,
    groupNode: INode,
  ): IEnumerable<FoldingEdgeStateId>
  
  /**
   * Provides access to the folder node state of a node.
   * @param [masterNode] The node in the [masterGraph][FoldingManager] for which the state should be returned.
   * @return A state holder implementation of a node, which is not part of any graph.
   * @throws ArgumentError The master node does not belong to the managed graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23FoldingManager-method-getFolderNodeState">Online Documentation</a>
   */
  fun getFolderNodeState(
    masterNode: INode,
  ): FolderNodeState
  
  /**
   * Return a data container implementation that is not part of any actual [IGraph] that describes the state of the edge for the given [FoldingEdgeStateId].
   * @param [id] The ID of the folding edge for which the folding state should be returned.
   * @return A [FoldingEdgeState] that can be used to query and change the properties of the edge.
   * @throws ArgumentError if the `id` doesn't represent a dummy edge state which is managed by this manager.
   * @see [getFolderNodeState]
   * @see [FoldingEdgeStateId]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23FoldingManager-method-getFoldingEdgeState">Online Documentation</a>
   */
  fun getFoldingEdgeState(
    id: FoldingEdgeStateId,
  ): FoldingEdgeState
  
  /**
   * Returns the [master nodes][IFoldingView] of the descendants of the `groupNode` that would be represented in the `view` if the `groupNode` would be expanded.
   * @param [view] The folding view that is used to determine the expansion state of group nodes.
   * @param [groupNode] The group node that should be considered as expanded.
   * @return The master nodes of the descendants of the group node that would be represented in the view if the group node would be expanded.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23FoldingManager-method-getNodesRevealedAfterExpand">Online Documentation</a>
   */
  fun getNodesRevealedAfterExpand(
    view: IFoldingView,
    groupNode: INode,
  ): IEnumerable<INode>
  
  /**
   * Determines whether for the given `masterNode` this manager has stored associated folder node state.
   * @param [masterNode] The master node for which the state is requested.
   * @return Whether [getFolderNodeState][FoldingManager] would return existing state information.
   * @see [getFolderNodeState]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23FoldingManager-method-hasFolderNodeState">Online Documentation</a>
   */
  fun hasFolderNodeState(
    masterNode: INode,
  ): Boolean
  
  /**
   * Determines whether for the given [FoldingEdgeStateId] this manager has stored associated view local state.
   * @param [id] The id for which state is requested.
   * @return Whether [getFoldingEdgeState][FoldingManager] would return existing state information.
   * @see [getFoldingEdgeState]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23FoldingManager-method-hasFoldingEdgeState">Online Documentation</a>
   */
  fun hasFoldingEdgeState(
    id: FoldingEdgeStateId,
  ): Boolean
  
  /**
   * Triggers a call to [updateFolderNodeState][IFolderNodeConverter] for all view nodes that [represent][IFoldingView] the given `masterNode` in its collapsed state.
   * @param [masterNode] The master node that belongs to the [masterGraph][FoldingManager].
   * @throws ArgumentError If the provided master node does not belong to the master graph.
   * @see [updateFoldingEdgeStates]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23FoldingManager-method-updateFolderNodeState">Online Documentation</a>
   */
  fun updateFolderNodeState(
    masterNode: INode,
  )
  
  /**
   * Triggers a call to [updateFoldingEdgeState][IFoldingEdgeConverter] for all folder edges that [represent][IFoldingView] the given `masterEdge`.
   * @param [masterEdge] The master edge that belongs to the [masterGraph][FoldingManager].
   * @throws ArgumentError If the provided master edge does not belong to the master graph.
   * @see [updateFolderNodeState]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingManager%23FoldingManager-method-updateFoldingEdgeStates">Online Documentation</a>
   */
  fun updateFoldingEdgeStates(
    masterEdge: IEdge,
  )
  
  companion object : ClassMetadata<FoldingManager> {
  }
}

inline fun FoldingManager(
    block: FoldingManager.() -> Unit
): FoldingManager {
    return FoldingManager()
        .apply(block)
}
