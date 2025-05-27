// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IListEnumerable
import yfiles.lang.InterfaceMetadata

/**
 * Interface used by [FoldingManager] and [IFoldingView] which is responsible for managing edges between folder nodes.
 * @see [FoldingEdgeConverter]
 * @see [FoldingManager.foldingEdgeConverter]
 * @see [FoldingEdgeStateId]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingEdgeConverter">Online Documentation</a>
 */
external interface IFoldingEdgeConverter  {
  /**
   * This method gets called by the [IFoldingView] implementation to determine whether a given edge in the [masterGraph][FoldingManager] should be represented by a folding edge in the given view.
   * @param [converterContext] The [IFoldingEdgeConverterContext] implementation that needs to be called in order to communicate the results of this query.
   * @param [foldingView] The instance into which the folding edge is going to be inserted.
   * @param [masterEdge] The edge from the [masterGraph][FoldingManager] that needs to be represented by a folding edge. Note that you may not return this instance.
   * @param [source] The source node that belongs to the [IFoldingView] graph that will act as the local view node of the actual source node.
   * @param [sourceIsCollapsed] Determines whether the `source` is currently a folder node.
   * @param [target] The target node that belongs to the [IFoldingView] graph that will act as the local view node of the actual target node.
   * @param [targetIsCollapsed] Determines whether the `target` is currently a folder node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingEdgeConverter%23IFoldingEdgeConverter-method-addFoldingEdge">Online Documentation</a>
   */
  fun addFoldingEdge(
    converterContext: IFoldingEdgeConverterContext,
    foldingView: IFoldingView,
    masterEdge: IEdge,
    source: INode,
    sourceIsCollapsed: Boolean,
    target: INode,
    targetIsCollapsed: Boolean,
  )
  
  /**
   * Triggered by the [view][IFoldingView] to initially create the appearance of a folding edge.
   * @param [state] The [FoldingEdgeState] of the edge to change.
   * @param [foldingView] The graph to which the folding edge belongs.
   * @param [foldingEdge] The folding edge for which the appearance shall be determined.
   * @param [masterEdges] The list of [master edges][IFoldingView], that the folding edge initially represents.
   * @see [updateFoldingEdgeState]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingEdgeConverter%23IFoldingEdgeConverter-method-initializeFoldingEdgeState">Online Documentation</a>
   */
  fun initializeFoldingEdgeState(
    state: FoldingEdgeState,
    foldingView: IFoldingView,
    foldingEdge: IEdge,
    masterEdges: IListEnumerable<IEdge>,
  )
  
  /**
   * Triggered by the [view][IFoldingView] to adjust the appearance of a folding edge.
   * @param [state] The [FoldingEdgeState] of the edge to change.
   * @param [foldingView] The graph to which the folding edge belongs.
   * @param [foldingEdge] The folding edge for which the appearance might need an update.
   * @param [masterEdges] The list of [master edges][IFoldingView], that the folding edge currently represents.
   * @see [initializeFoldingEdgeState]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingEdgeConverter%23IFoldingEdgeConverter-method-updateFoldingEdgeState">Online Documentation</a>
   */
  fun updateFoldingEdgeState(
    state: FoldingEdgeState,
    foldingView: IFoldingView,
    foldingEdge: IEdge,
    masterEdges: IListEnumerable<IEdge>,
  )
  
  /**
   * Callback to optionally back propagate state changes on a folding edge's [state][FoldingEdgeState] to the `masterEdges`.
   * @param [state] The state to synchronize with the master edges.
   * @param [foldingView] The graph to which the folding edge belongs.
   * @param [masterEdges] The edges in the [masterGraph][FoldingManager] to update.
   * @see [IFoldingView.updateMasterEdges]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingEdgeConverter%23IFoldingEdgeConverter-method-updateMasterEdges">Online Documentation</a>
   */
  fun updateMasterEdges(
    state: FoldingEdgeState,
    foldingView: IFoldingView,
    masterEdges: IListEnumerable<IEdge>,
  )

  
  companion object : InterfaceMetadata<IFoldingEdgeConverter> {
  }
}
